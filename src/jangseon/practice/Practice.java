package jangseon.practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("\n=================== 첫번째 문제 =====================\n");
//        Q. 01
//
//        다음은 홍길동의 정보를 나타낸 것이다.
//
//                이름
//                홍길동
//        나이
//        26
//        키
//        177.9
//        연락처
//        01073987332
//        이메일
//        akow283@gmail.com
//
//
//
//        홍길동의 이름과 나이, 키, 연락처, 이메일을 각각 타입에 맞는 변수에 저장한 후 아래와 같이 콘솔창에 출력해주세요.
//
//
//        변수명: name, age, height, phone, email 사용


        String name = "홍길동";
        int age = 26;
        double height = 177.9;
        String phone = "01073987332";
        String email = "akow283@gmail.com";
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("연락처: " + phone);
        System.out.println("이메일: " + email);

        System.out.println("\n=================== 두번째 문제 =====================\n");

//        문자열 변수
//        String enigma = "너오구늘리뭐너먹구지리";
//        에서 너, 구, 리를 제거해서 출력해보세요.
//
//        Hint
//        replace를 “너”, “구”, “리” 에 대해 각각 적용한다(총 3회 적용).
//
//        실행 결과
//        오구늘리뭐먹구지리
//        오늘리뭐먹지리
//        오늘뭐먹지
//        해독완료!! -> 오늘뭐먹지
//        오늘뭐먹지

        String enigma = "너오구늘리뭐너먹구지리";
        System.out.println(enigma.replace("너", ""));
        enigma = enigma.replace("너", "");
        System.out.println(enigma.replace("구", ""));
        enigma = enigma.replace("구", "");
        System.out.println(enigma.replace("리", ""));
        enigma = enigma.replace("리", "");
        System.out.println(enigma);

        System.out.println("\n=========================================\n");

        String littlePrince = "나는 그때 아무것도 이해하지 못했어. 꽃의 말이 아닌 행동을 보고 판단했어야 했어." +
                " 내게 향기를 전해주고 즐거움을 주었는데, 그 꽃을 떠나지 말았어야 했어." +
                " 그 허영심 뒤에 가려진 따뜻한 마음을 보았어야 했는데, 그때 난 꽃을 제대로 사랑하기에는 아직 어렸던 거야.";
//
        String target = "허영심 뒤에 가려진 따뜻한 마음";
//
//        문자열 변수 littlePrince 로부터 substring을 이용하여 "허영심 뒤에 가려진 따뜻한 마음" 문자열만 잘라서 출력하시오.

        System.out.println(littlePrince.indexOf(target));
        System.out.println(littlePrince.length());
        System.out.println(target.length());
        System.out.println(littlePrince.substring(90, 107));

        System.out.println("\n=========================================\n");

        for (int i = 0; i < littlePrince.length() - 1; i++) {
            // 꽃   <<< - index 번호를 알고 싶다.

            // 1. 조건
            // 어린왕자 문자열에서 1글자씩 잘랐는데 그 글자가 꽃이랑 같냐 같으면
            // 콘솔창에 그 i를 찍어라
            if (littlePrince.substring(i, i + 1).equals("꽃")) {
                System.out.println(i);
            }
        }
        System.out.println("\n=========================================\n");


//        이름을 입력해 주세요.
//        >>> 개똥이
//        국어 점수를 입력해 주세요.
//        >>> 74
//        영어 점수를 입력해 주세요.
//        >>> 67
//        수학 점수를 입력해 주세요.
//        >>> 70
//        이름: 개똥이
//        국어: 74
//        영어: 67
//        수학: 70
//        평균: 70.3333333333333
//        @ 평균이 소수 두번째자리까지만 출력될 수 있도록 코드를 작성해주세요.
//


//        Scanner scan = new Scanner(System.in);
//        System.out.println("이름을 입력해 주세요.");
//        System.out.println(">>> ");
//        String Name = scan.next();
//        System.out.println("국어 점수를 입력해 주세요.");
//        System.out.println(">>> ");
//        String korea = scan.next();
//        System.out.println("영어 점수를 입력해 주세요.");
//        System.out.println(">>> ");
//        String english = scan.next();
//        System.out.println("수학 점수를 입력해 주세요.");
//        System.out.println(">>> ");
//        String math = scan.next();
//
//        System.out.println("이름: " + Name);
//        System.out.println("국어: " + korea);
//        System.out.println("수학: " + english);
//        System.out.println("수학: " + math);
//        int numA = Integer.parseInt(korea);
//        int numB = Integer.parseInt(english);
//        int numC = Integer.parseInt(math);
//        double numD = (double)(numA + numB + numC) / 3 ;
//        System.out.println(numD);
//        System.out.printf("평균: " + "%.2f\n",numD);


        System.out.println("\n=================== 세번째 문제 =====================\n");


//        팩토리얼 다들 기억하시나요?
//                수학기호로 4! 는 4 팩토리얼을 의미하며,
//        그 값은 4x3x2x1 = 24 입니다.
//
//
//                for문을 사용해서 10팩토리얼의 값을 출력해주세요.
//
//                Hint
//        LoopFor 에서 실습해본 1부터 n까지 더하는 코드를 응용해보세요
//
//
//        결과: 3628800
//
//
//
//        @ 15 팩토리얼의 값을 출력해주세요.
//                결과: 1307674368000

        int factory = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            factory *= i;
        }
        System.out.println("결과: " + factory);

        long fac = 15;
        for (int i = 1; i <= 14; i++) {
            System.out.println(i);
            fac *= i;
        }
        System.out.println(fac);


//        월리를 찾아라!!
//
//                아래의 문자열 변수 findWally 중에 월리가 몇개 들어있는지 콘솔에 출력해주세요.
//
        String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
        int wally = 0;
        for (int i = 0; i < findWally.length() - 1; i++) {
                   System.out.println(findWally.substring(i, i + 2));
            if (findWally.substring(i, i + 2).equals("월리")) {
                wally++;
            }
        }
        System.out.println(wally);

    }
}