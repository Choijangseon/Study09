package ch05_controll;

public class LoopFor {

    public static void main(String[] args) {
        // 반복문
        // for문

        // 콘솔창에 1부터 10까지 출력
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        int one = 1;
        System.out.println(one++);  // >> 10개 복붙하기 해도 된다
        System.out.println(one++);
        System.out.println(one++);
        System.out.println("\n==============================\n");
        // 반복문 사용
        // ; 를 기준으로
        // for(초기화식 ; 조건식 ; 증감식)
        // 초기화식에는 for문의 반복횟수를 결정해주는 변수 선언
        // 증감식에는 for문이 반복될때마다 변수의 증가량 지정
        // 조건식에는 for문이 반복되는 기준을 정한다.
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // for문 내부 변수 i는 for문 내에서 선언되고, for문 종료시 제거된다.
        // = 변수의 스코프
//        System.out.println(i); >> for문이 끝난 후여서 i는 존재하지 않는다

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }

        // 1부터 40까지 중에 짝수끼리만 더한

        // for문 내부 변수 i는 for문의 반복횟수를 조정하기 위함이
        // 주 목적이므로 꼭 i를 for문 내에서 쓸 필요는 없다.
        // i는 단순 변수명일뿐이므로, i가 아닌 다른 단어를 사용해도 된다.
        one = 1;
        // 10번 반복하는 for문
        for (int number = 0; number < 10; number += 1) {
            System.out.println(one++);
        }
        // 정말 많이 쓰게 될 for문 형식

        for (int i = 0; i < 10; i++) {
            // 반복횟수는        ^ 숫자를 바꾸면 된다
        }

        // 1부터 20까지 더한 값?
        // 변수의 스코프를 이용한 for문
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println(sum);

        // 1부터 40까지 중에 짝수끼리만 더한 값
        sum = 0;
        for (int i = 1; i <= 40; i++) {
            // 짝수일때만(조건) sum에 i를 더한다.
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        // 위에와 아래는 실행결과는 같은데 for문의 실행 횟수는 더 적다.
        // (프로그램 실행 속도 증가 = 성능 증가)
        sum = 0;
        for (int i = 0; i <= 40; i += 2) {
            // i = 0 >> i = 2 >> i = 4 ...
            sum += i;
        }
        System.out.println(sum);

        // 0부터 2까지 0.2마다 출력
        // 소수인 double, float 타입의 연산은 정학하지 않으므로 비추천한다.
        sum = 0;
        for (double i = 0; i <= 2; i += 0.2) {
            System.out.println(i);
        }

        // 0부터 2까지 0.2마다출력
        for (int i = 0; i <= 20; i += 2) {
            System.out.println((double) i / 10);
        }

        System.out.println("\n==============================\n");

        // 구구단 2단
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6 ....
        // 2 x 9 = 18
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 x " + i + " = " + (i * 2));
        }

        System.out.println("\n==============================\n");

//        System.out.println("*");
//        System.out.println("**");
//        System.out.println("***");
//        System.out.println("****");
//        System.out.println("*****");
        String star = "";
        for (int i = 0; i < 5; i++) {
            star += "*";
            System.out.println(star);
        }

        // 나머지 연산자(%) 의 사용 예시
        // for문 내에서 순환하는 숫자에 대해 사용하면 좋다.

        // 국수공장에서 면을 20cm 뽑고있다.
        for (int i = 0; i < 20; i++) {
            System.out.println("||||||||");

            // i가 4, 9, 14 일때 절단 시키기
            if (i == 4 || i == 9 || i == 14) {
                System.out.println("--------");
            }

            // 4, 9, 14, 19, 24, ... 는
            // 전부 5로 나누었을때의 나머지가 4인 숫자들
            if (i % 5 == 4) {
                System.out.println("--------");
            }
        }

        System.out.println("\n=======================================\n");

        // 라면 공장에서 면을 30cm 뽑고 있는데
        // 6cm 마다 잘라주어야 한다.
        // ////////
        // \\\\\\\\
        // ////////
        // \\\\\\\\     >> 모양대로 한다
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                System.out.println("////////");
            } else if (i % 2 == 1) {
                System.out.println("\\\\\\\\\\\\\\\\");
            }
            if (i % 6 == 5) {
                System.out.println("--------");
            }
        }
        // 조건을 체크하는 목적이 다른 if문은 서로 분리해야 한


        System.out.println("\n=======================================\n");
        // 10부터 1까지 출력
//            int numA = 10;
//            System.out.println(numA--);

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }


        // for문으로 String을 가지고 놀기

        // 숫자형 문자열의 각 자리수를 더한 결과 얻기
        // submit02에서 햇던걸 for문을 이용하여 해결

        String example = "12345678";
        int result = 0;
        for (int i = 0; i < 8; i++) {
            //         ^ i < example.length()
            System.out.println(example.substring(i, i + 1));
            result += Integer.parseInt(example.substring(i, i + 1));
        }
        System.out.println(result);

        // 슈의 갯수는?
        String syusyu = "슛슈슛슈ㅠ슈슈슛ㅅ슈슈슈슛";

        // syusyu 에서 "슈"가 몇글자 들어가있는지 세어보기
        // (눈으로 세어보기: 5개 있음)

        // syusyu애소 한글자씩 잘라서
        // "슈"와 일치하는지 체크
        String syu = "슈";
        int A = 0;
        for (int i = 0; i < syusyu.length(); i++) {
            System.out.println(syusyu.substring(i, i + 1));
            if (syusyu.substring(i, i + 1).equals("슈")) {
                A++;
            }
        }
        System.out.println("슈의 갯수: " + A);

        // break 문
        // 반복문을 종료시키는데 사용
        // 반복횟수를 줄여서 실행속도를 향상시키는데 사용

        // 내 이름을 유니코드로 표현한다면?
        // 유니코드 0 ~ 70000 중
        char word = 0;
        for (int i = 0; i < 70000; i++) {
            if (word == '선') {  // 52572 , 51109 , 49440
                System.out.println(i);
                System.out.println(word);
                break;  //  >> break문이 실행되면 가까운 반복문(for, while) 하나를 즉시 종료한다.
            }
            word++;
        }

        System.out.println("\n============================================\n");

        // countinue 문

        // 구구단을 출력하는 중에, 너무 쉬운 1,2 (if (i < num))는 출력 안한다. (if문 num에 입력한 숫자)
        for (int i = 1; i <= 9; i++) {
            if (i < 3) {
                // 반복분 내에서 continue가 실행되면
                // 바로 다음 반복문으로 넘어간다.
                // (continue 아래 코드는 실행되지 않음
                // )
                continue;
            }
            System.out.println("8 x " + i + " = " + (8 * i));
        }

        System.out.println("\n=======================================\n");

        // 찐 구구단 출력
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 9 = 18
        // 3 x 2 = 6
        // 3 x 3 = 9
        // 3 x 9 = 27
        // 9 x 2 = 18
        // 9 x 3 = 27
        // 9 x 9 = 81

        // 이중 for문 사용

        for (int l = 1; l <= 9; l++) {
            for (int r = 1; r <= 9; r++) {
                System.out.println(l + " x " + r + " = " + (l * r));
            }
        }

        /*
          디버깅 모드

         코드라인 좌측(라인 숫자 적혀있는 부분)을 마우스 좌클릭하면
         breakpoint가 생성된다

         생성된 breakpoint는 다시 클릭하면 제거된다.

         breakpoint를 생성한 후 디버깅모드 실행시
         (상단 벌레모양 버튼 클릭 또는 [Shift + F9])
         컴퓨터가 코드들이 위에서부터 실행되다가 breakpoint가 있는 지점에
         멈춰서 대기를 한다.

         이후 하단 Debug 탭의 Step Over [F8] 를 실행하면
         한단계씩 실행이 이루어진다.

         코드를 한줄한줄 실행해보며 컴퓨터가 정확히 어디를 실행하고
         그때마다 변수에 어떤 값이 담기고 있는지 확인할 때 사용

         디버깅 모드 종료하려면 중지버튼 (Terminate)  >> [Crtl + F2]


         */

        System.out.println("\n============================\n");

        // 트리
        //     *
        //    **
        //   ***
        //  ****
        // *****


        for (int i = 0; i < 5; i++) {
            // i=0 일 때, 공백 4칸 + * 1개
            // i=1 일 때, 공백 3칸 + * 2개
            // i=2 일 때, 공백 2칸 + * 3개
            String blank = "";
            for (int k = 0; k < 4 - i; k++) {
                blank += " ";
            }


            String stars = "";
            for (int k = 0; k < i + 1; k++) {
                stars += "*";
            }
            System.out.println(blank + stars);  //      *

        }

        System.out.println("\n=====================================\n");

        // 트리
        //    *
        //   ***
        //  *****
        // *******
        //*********
        // i=0 일 때, 공백 4칸 + * 1개 + 공백 3칸
        // i=1 일 때, 공백 3칸 + * 3개 + 공백 2칸
        // i=2 일 때, 공백 2칸 + * 5개 + 공백 1칸

        for (int i = 0; i < 6; i++) {

            String b = "";
            for (int q = 0; q < 5 - i; q++) {
                b += " ";
            }

            String s = "";
            for (int w = 0; w < 1 + i; w++) {
                s += "*";

            }

            String ss = "";
            for (int w = 1; w < 1 + i; w++) {
                ss += "*";
            }



            System.out.println(b + s + ss);
        }

        for(int i = 0; i< 5; i++){
            String blank = "";
            for (int k = 0; k < 4-i; k++){
                blank += " ";
            }
            String stars = "";
            for (int k = 0; k < (i*2)+1; k++){
                stars += "*";
            }
            System.out.println(blank + stars);
        }

        // 트리
        //     *
        //    * *
        //   *   *
        //  *     *
        // *********

//            i = 0 공백 4 별1 공백0 별0
//            i = 1 공백 3 별1 공백1 별1
//            i = 2 공백 2 별1 공백3 별1
//            i = 3 공백 1 별1 공백5 별1
//            i = 4 공백 0 별9 공백0 별0






        // 트리
        // ***********
        // ***
        // *****
        // *******
        // *********
        // ***********


































    }

}













