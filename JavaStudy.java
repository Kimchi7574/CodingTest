import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String lastFourWords = code.substring(code.length() - 4);

        if (lastFourWords.equals("_eye")) {
            System.out.println("Ophthalmology");
        } else if (lastFourWords.equals("head")) {
            System.out.println("Neurosurgery");
        } else if (lastFourWords.equals("infl")) {
            System.out.println("Orthopedics");
        } else if (lastFourWords.equals("skin")) {
            System.out.println("Dermatology");
        } else {
            System.out.println("direct recommendation");
        }
    }
}
