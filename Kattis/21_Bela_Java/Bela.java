import java.util.HashMap;
import java.util.Scanner;

public class Bela {

    public static void main(String[] args) {
        HashMap<String, Integer> dom = new HashMap<String, Integer>();
        HashMap<String, Integer> ndom = new HashMap<String, Integer>();
        int points = 0;

        dom.put("A", 11);
        dom.put("K", 4);
        dom.put("Q", 3);
        dom.put("J", 20);
        dom.put("T", 10);
        dom.put("9", 14);
        dom.put("8", 0);
        dom.put("7", 0);

        ndom.put("J", 2);
        ndom.put("9", 0);

        Scanner kb = new Scanner(System.in);
        String[] in = kb.nextLine().split(" ");
        int hands = Integer.parseInt(in[0]);
        char dominant = in[1].charAt(0);

        String dat;
        for (int i = 0 ; i < hands*4; i++){
            dat = kb.nextLine();
            if (dominant != dat.charAt(1) && (dat.charAt(0) == 'J' || dat.charAt(0) == '9')){
                points += ndom.get(String.valueOf(dat.charAt(0)));
            } else {
                points += dom.get(String.valueOf(dat.charAt(0)));
            }
        }
        System.out.println(points);
    }
}