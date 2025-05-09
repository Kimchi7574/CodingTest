//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String code = sc.next();
//        String lastFourWords = code.substring(code.length() - 4);
//
//        if (lastFourWords.equals("_eye")) {
//            System.out.println("Ophthalmology");
//        } else if (lastFourWords.equals("head")) {
//            System.out.println("Neurosurgery");
//        } else if (lastFourWords.equals("infl")) {
//            System.out.println("Orthopedics");
//        } else if (lastFourWords.equals("skin")) {
//            System.out.println("Dermatology");
//        } else {
//            System.out.println("direct recommendation");
//        }
//    }
//}
//
//프로그래머스 피타고라스
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int c = sc.nextInt();
//        a=a*a;c=c*c;
//        int b_square = c - a;
//
//        System.out.println(b_square);
//    }
//}

//프로그래머스
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        String age_type = sc.next();
//        int answer = 0;
//
//        if (age_type.equals(
//                "Korea"
//        )) {
//            answer =
//                    2030-year+1
//            ;
//        }
//        else if (age_type.equals("Year")) {
//
//            answer = 2030 - year
//            ;
//        }
//
//        System.out.println(answer);
//    }
//}
class Solution {
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':

                    north--;
                    break;
                case 'E':

                    east++;
                    break;
                case 'W':

                    east--;

                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}

