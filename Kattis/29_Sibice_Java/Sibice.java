import java.util.Scanner;

public class Sibice {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] in = kb.nextLine().split(" ");

        int N = Integer.parseInt(in[0]);
        int W = Integer.parseInt(in[1]);
        int H = Integer.parseInt(in[2]);

        for (int i = 0; i < N; i++) {
            int k = Integer.parseInt(kb.nextLine());
            if ((k < W || k < H) || (k <= Math.sqrt(Math.pow(W, 2) + Math.pow(H, 2)) )){
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}