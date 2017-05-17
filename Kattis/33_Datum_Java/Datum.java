import java.util.Scanner;

public class Datum {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String[] in = kb.nextLine().split(" ");
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int day = Integer.parseInt(in[0]) + 2;
        int month = Integer.parseInt(in[1]);

        for (int i = 0; i < month -1; i++)
            day += months[i];

        System.out.println(days[day%7]);
    }

}

