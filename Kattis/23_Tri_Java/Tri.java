import java.util.Scanner;

public class Tri {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] input = kb.nextLine().split(" ");
        int num1 = Integer.parseInt(input[0]);
        int num2 = Integer.parseInt(input[1]);
        int num3 = Integer.parseInt(input[2]);

        if (num1 == num2 + num3) {
            System.out.printf("%d=%d+%d\n", num1, num2, num3);
        } else if (num1 == num2 - num3) {
            System.out.printf("%d=%d-%d\n", num1, num2, num3);
        } else if (num1 == num2 / num3) {
            System.out.printf("%d=%d/%d\n", num1, num2, num3);
        } else if (num1 + num2 == num3) {
            System.out.printf("%d+%d=%d\n", num1, num2, num3);
        } else if (num1 - num2 == num3) {
            System.out.printf("%d-%d=%d", num1, num2, num3);
        } else if (num1 * num2 == num3) {
            System.out.printf("%d*%d=%d", num1, num2, num3);
        } else if (num1 / num2 == num3) {
            System.out.printf("%d/%d=%d", num1, num2, num3);
        }

    }
}
