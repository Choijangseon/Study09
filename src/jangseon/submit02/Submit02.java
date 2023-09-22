package jangseon.submit02;

import java.util.Scanner;

public class Submit02 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



//
//        System.out.println("이름을 입력해 주세요.");
//        System.out.print(">>> ");
//        String q =scan.nextLine();
//
//        System.out.println("국어 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        String w =scan.nextLine();
//        int numb =Integer.parseInt(w);
//
//        System.out.println("영어 점수를 입력해주세요.");
//        System.out.print(">>> ");
//        String e =scan.nextLine();
//        int numc = Integer.parseInt(e);
//        System.out.println("수학 점수를 입력해 주세요");
//        System.out.print(">>> ");
//        String r =scan.nextLine();
//        int numd = Integer.parseInt(r);
//        System.out.println("이름: " + q);
//        System.out.println("국어: " + w);
//        System.out.println("영어: " + e);
//        System.out.println("수학: " + r);
//        double A = (double)(numb + numc + numd) / 3;
//        System.out.printf("평균: " + "%.2f\n",A);

        System.out.printf("\n====================================\n");

        int example = 278;
        String strA = "" + example;
        // 자동 형변환을 이용한 int -> String 변
        System.out.println(strA);

        System.out.println(strA.substring(0, 1));
        System.out.println(strA.substring(1,2));
        System.out.println(strA.substring(2,3));

        String b = strA.substring(0, 1);
        System.out.println(b);
        String c = strA.substring(1,2);
        System.out.println(c);
        int intB = Integer.parseInt(b);
        System.out.println(intB);
        int intC = Integer.parseInt(c);
        System.out.println(c);
        String d = strA.substring(2,3);
        System.out.println(d);
        int intD = Integer.parseInt(d);
        System.out.println(d);
        int result = intB + intC + intD;
        System.out.println("결과는: " + intB + intC + intD);














    }
}
