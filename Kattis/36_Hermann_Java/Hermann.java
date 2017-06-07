import java.util.Scanner;

public class Hermann {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r = kb.nextInt();

        System.out.printf("%.6f\n", r*r*Math.PI);
        System.out.printf("%.6f\n", r*r*2.0);
    }
}
