import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] words = kb.nextLine().split("-");

        for(String w : words) {
            System.out.print(w.charAt(0));
        }
    }
}
