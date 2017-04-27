import java.util.Scanner;

public class DiceCup {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] input = kb.nextLine().split(" ");
        int dice1 = Integer.parseInt(input[0]);
        int dice2 = Integer.parseInt(input[1]);

        if (dice1 > dice2) {
            int max = dice1;
            dice1 = dice2;
            dice2 = max;
        }
        for (int i = dice1+1; i < dice2+2; i++)
            System.out.println(i);
    }
}
