import java.util.Scanner;

public class Zamka {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int lowerbound = kb.nextInt();
        int upperbound = kb.nextInt();
        int ans = kb.nextInt();
        int sum = 0;
        int lowAns = -1;
        int upAns = -1;

        for (int i = lowerbound; i <= upperbound; i++) {
            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++){
                sum += Integer.parseInt(String.valueOf(num.charAt(j)));
            }

            if (ans == sum) {
                lowAns = i;
                break;
            }
            sum = 0;
        }

        for (int i = upperbound; i >= lowerbound; i--) {
            sum = 0;

            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++){
                sum += Integer.parseInt(String.valueOf(num.charAt(j)));
            }

            if (ans == sum) {
                upAns = i;
                break;
            }
        }
        System.out.println(lowAns);
        System.out.println(upAns);
    }
}
