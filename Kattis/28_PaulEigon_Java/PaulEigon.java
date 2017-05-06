import java.util.Scanner;

public class PaulEigon {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] in = kb.nextLine().split(" ");
        int N = Integer.parseInt(in[0]);
        int P = Integer.parseInt(in[1]);
        int Q = Integer.parseInt(in[2]);

        if (( (P + Q) / N) % 2 == 0) {
            System.out.println("paul");
        } else {
            System.out.println("opponent");
        }
    }
}
