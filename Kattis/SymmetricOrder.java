import java.util.Scanner;

public class SymmetricOrder {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int setNo = 1;
        int numNames = Integer.parseInt(kb.nextLine());
        String[] names = null;

        while (numNames > 0) {
            names = new String[numNames];
            for (int i = 0; i < numNames; i++) {
                String name = kb.nextLine();

                if (i % 2 == 1) {
                    names[numNames - ((i + 1) / 2)] = name;
                } else {
                    names[i/2] = name;
                }
            }

            System.out.println("SET " + setNo++);
            for(String n : names) {
                System.out.println(n);
            }
            numNames = Integer.parseInt(kb.nextLine());
        }
    }
}
