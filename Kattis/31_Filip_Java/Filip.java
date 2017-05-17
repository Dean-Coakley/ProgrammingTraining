import java.util.Scanner;

public class Filip {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] in = kb.nextLine().split(" ");
        int num1 = Integer.parseInt(new StringBuffer(in[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuffer(in[1]).reverse().toString());

        System.out.println(num1 > num2 ? num1 : num2);
    }
}
