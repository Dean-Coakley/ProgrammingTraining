import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cups {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int k = Integer.parseInt(kb.nextLine());
        ArrayList<Cup> cups = new ArrayList<Cup>();

        while (k > 0){
            String[] in = kb.nextLine().split(" ");
            boolean rad = false;
            int radius;

            try {
                radius = Integer.parseInt(in[0]);
                radius = radius / 2;
                cups.add(new Cup(in[1], radius));
            } catch (NumberFormatException e) {
                radius = Integer.parseInt(in[1]);
                cups.add(new Cup(in[0], radius));
            }
            k--;
        }
        Collections.sort(cups);

        for (Cup c : cups) {
            System.out.println(c.getCol());
        }

    }

    public static class Cup implements Comparable<Cup> {

        private String color;
        private int rad;

        public Cup(String col, int size) {
            color = col;
            rad = size;
        }

        public String getCol(){
            return color;
        }

        public int getRad() {
            return rad;
        }

        public int compareTo(Cup c) {
            if (c.getRad() == this.getRad()) {
                return 0;
            } else if (c.getRad() > this.getRad()){
                return -1;
            } else {
                return 1;
            }
        }
    }
}
