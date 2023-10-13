package jangseon.submit03;

import java.util.Scanner;

public class Submit03 {

    public static void main(String[] args) {

        //팩토리얼


//        팩토리얼 다들 기억하시나요?
//                수학기호로 4! 는 4 팩토리얼을 의미하며,
//        그 값은 4x3x2x1 = 24 입니다.

//        for문을 사용해서 10팩토리얼의 값을 출력해주세요.
//
//                Hint
//        LoopFor 에서 실습해본 1부터 n까지 더하는 코드를 응용해보세요

//        결과: 3628800

//        @ 15 팩토리얼의 값을 출력해주세요.
//                결과: 1307674368000


        int fac = 10;

        for (int i = 10; i >=1; i--){
            System.out.println(i);
            fac *= i;
        }
        System.out.println(fac);


        long tor = 15;

        for (int i = 14; i >= 1; i--){
            System.out.println(i);
            tor *= i;
        }
        System.out.println(tor);

        System.out.println("\n=====================================\n");

//  월리를 찾아라!!
//  아래의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.
//
//  String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";

//        Hint
//        수업시간에 해보았던 "슈"는 문자열을 한글자씩 잘라서 "슈"가 맞는지 비교하였다면,
//                이번에는 두글자씩 잘라서 "월리"가 맞는지 비교하시면 됩니다.
        // 결과: 5


        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
        String wall =  "월리";
        System.out.println(findWally.length());
        System.out.println(findWally.substring(0,findWally.length()-1));

        int w = 0;
        for (int i = 0; i < findWally.substring(0,findWally.length()-1).length() ; i++){
            System.out.println(findWally.substring(i, i+2));
            if (findWally.substring(i , i+2).equals("월리")){
                w ++;
            }
        }
        System.out.println("결과: " + w);




        System.out.println("\n=====================================\n");


//        String stars = "*****";
//        for문을 5번 반복하면서 stars를 아래와 같이 나오도록 잘라서 출력해보세요

//        Hint
//        for문 내에서 .substring() 사용
//
//
//        실행 결과
//


    // *****
    //  ****
    // 1,5
//        System.out.println(stars.substring(0,5));
//        System.out.println(stars.substring(1,5));
//        System.out.println(stars.substring(2,5));
//        System.out.println(stars.substring(3,5));
//        System.out.println(stars.substring(4,5));
//        System.out.println(stars.substring(5,5));
        String stars ="*****";
        int stop = 5;
    for (int i = 5; i <= 10 ; i++ ){
        System.out.println(stars.substring(i-5,stop));

    }



    //    System.out.println(stars.substring(i+1,i));


//        Q. 04
//
//        로꾸꺼 로꾸꺼
//
//        사용자에게 문자열을 입력받으시고, 입력받은 문자열의 순서를 뒤집어서 출력해보세요.
//
//
//        Hint
//        for문 바깥에 문자열 변수 선언
//        for문 내부가 반복될때마다 입력받은 문자열을 한글자씩 잘라 문자열 변수에 더한다.
//
//
//


       String inputText = "내일부터 추석이당~";
       // >> ~당이석추 터부일내 로 바꾸기
//        ~ >> inputText.substring(9, 10) i가 0일때 10
//       당 >> inputText.substring(8, 9) i가 1일때 9
//       이 >> inputText.substring(7, 8) i가 2일때 8
//       내 >> inputText.substring(0, 1) i가 3일때 7
//                                      i가 4일때 6   >>> 10 - i
        System.out.println(inputText.length());  // > 10글자
        String reverse = "";

        for (int i = inputText.length(); i >0; i--) { // i는 10 부터 1

            reverse += inputText.substring(i-1, i );
            System.out.println(w + ":" + reverse);
        }

        reverse = "";
        for (int i = 0; i <  inputText.length(); i++){
            reverse += inputText.substring(9-i,10-i);
            System.out.println(i + ": " + reverse);
        }






        Scanner scan = new Scanner(System.in);
        System.out.println(">>>> ");
        String A = scan.nextLine();







        for (int i = A.length(); i >= 1 ; i--){
            System.out.print( A.substring(i-1,i)) ;

        }





        // 로꾸꺼 로꾸꺼
        //6,7 / 5,6 / 4,5





//        for (int i = 0; i <=10; i++ ){
//            System.out.println(i);
//        }
//        for(int i = 10; i<=0; i--){
//            System.out.println(i);
//        }







    }





    }

