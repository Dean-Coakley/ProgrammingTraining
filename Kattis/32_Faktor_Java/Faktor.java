import java.util.Scanner;

public class Faktor {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] in = kb.nextLine().split(" ");
        int num1 = Integer.parseInt(in[0]);
        int num2 = Integer.parseInt(in[1]);

        System.out.println((num1 * num2) - num1 + 1);
    }
}
