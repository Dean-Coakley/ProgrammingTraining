import java.util.Scanner;

public class Apaxians {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String name = kb.nextLine();

        name = name.replaceAll("([a-z])\\1+", "$1");
        System.out.println(name);
    }
}
