package ch3_system;

import java.util.Scanner; // >> 외워야 하는 문장
// java폴더 안에 util이라는 폴더가 있다

public class SystemMain {

    public static void main(String[] args) {

        // 콘솔창에 값, 문구 출력
        // pintln() 은 괄호안 내용을 콘솔창에 출력 후
        // 줄바꿈을 자동으로 해준다.
        System.out.println("상단");
        System.out.println("중단");
        System.out.println("");
        System.out.println("하단");

        // print() 는 괄호안 값만을 출력
        // 콘솔창 줄바꿈이 없다.
        System.out.print("프린트");
        System.out.print("줄바꿈없음");
        // 괄호안에 아무것도 없다면 에러 발생
        // System.out.print();

        // 콘솔창의 용도
        // 프로젝트 내에 사용 중인 변수와 객체의
        // 저장된 값을 확인하는데 사용
        // 프로젝트 검진하는 청진기의 역할 (중요하다, 자주 이용!!)

        System.out.println("\n===================================\n");

        // 제어문자 >> "\n=====\n"
        // 문자열 내에 역슬래스(\)를 이용하여
        // 특정 기능을 넣을 수 있다.

        // \n 줄바꿈
        System.out.print("오늘은 목요일\n");
        System.out.println();
        System.out.print("\n"); // println() = print("\n")

        // \t >> 탭이된다.
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("\t\t\t\t\t1\t2");
        System.out.println("3\t4\t5\t6\t7\t8\t9");
        System.out.println("10\t11\t12\t13\t14\t15\t16");
        // >>> 달력 만들기

        // 기능을 가지는 문자(\, ", ')를 콘솔창에 출력하고 싶다면
        // 해당 문자 앞에 \를 붙여준다. >> 기능을 없애고 싶다면 앞에 \ 를 붙여준다.
        System.out.println("쌍따옴표는 \"다");
        System.out.println("역슬래시는 \\다");

        // 특수문자도 잘 출력된다
        System.out.println("☆");
        System.out.println("\uD83D\uDE04");

        System.out.println("\n=====================================\n");

        // printf() 은 포맷 문자열(format string)과 함께 사용
        System.out.printf("안녕 printf야?\n");
        System.out.printf("%d명이 수업을 듣고 있습니다.\n", 9);
        System.out.printf("%d명이 수업을 %d일째 듣고 있습니다.\n", 9, 4);
        System.out.printf("%d명이 %s을 %d일째 듣고 있습니다.\n", 9, "수업", 4);

        // 예시
        System.out.printf("ch%03d_표준입출력\n", 3);
        // ch%03d >> ch >> 숫자 앞에 ch가 써진다 3 = 자릿수 0 >> 한자리 수면 앞에 0을 붙이겠다.
        System.out.printf("%.3f\n", 3.141592);
        System.out.printf("%.03f\n", 3.1);
        // 0.3f >> 소숫점 3번째 자리까지 나타낸다.  .03f >> 소숫점 3번재 자리까지 나타낸다(없으면 0으로 나온다)
        System.out.printf("통장 잔고는 %,d원입니다.\n" , 10000);
        // ,d >> , 를 붙이면 1000단위로 , 가 찍힌다.

        System.out.println("\n===========================================\n");

        // 표준 입력
        // 객체는 참조타입을 담는 변수를 의미
        // Scanner 를 쳐서 import 받아내기 >> java안에 있는 프로그램을 쓰겠다 허락 받기
        Scanner scan = new Scanner(System.in); // >> 외워야 하는 문장
        // scan 대신 아무 단어로 쓸 수 있다.
        String str = new String("오늘 비오나?");
        System.out.println(str);
        System.out.println(scan);

        System.out.println("이름을 입력해주세요");
        System.out.print(">>> ");
        String name =scan.nextLine();

        System.out.println(name + "님 환영합니다.");

        System.out.println("나이를 입력해주세요");
        System.out.print(">>> ");
        // nextLine()은 문자열 타입으로 리턴
        // 30 입력시 "30"으로 가져온다. >> 숫자가 아닌 문자 30으로 가져온다.
        // 숫자도 Int가 아닌 String 을 쓴다.
        // String age = scan.nextLine();

        // "30" -> 30 타입 변환
        int intAge = Integer.parseInt("20");
        // 나이에서 -1을 하고 싶다면 위의 수식을 해야한다.
        System.out.println("입력하신 나이는 " + (intAge -1) + "입니다.");

        System.out.println("주소를 입력해주세요");
        System.out.print(">>> ");
        String address = scan.nextLine();
        System.out.println("주소확인: " + address);






































    }
}
