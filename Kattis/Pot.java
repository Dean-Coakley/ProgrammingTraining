import java.util.Scanner;

public class Pot {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String slice = new String("");
        int len = Integer.parseInt(kb.nextLine());
        int nums[] = new int[len];
        int pows[] = new int[len];
        int inLen;
        int sum = 0;

        for (int i = 0; i < len; i++){
            slice = kb.nextLine();
            inLen = slice.length();
            nums[i] = Integer.parseInt(slice.substring(0, inLen-1));
            pows[i] = Integer.parseInt(slice.substring(inLen-1, inLen));

            sum += Math.pow(nums[i], pows[i]);
        }
        System.out.println(sum);

    }
}
