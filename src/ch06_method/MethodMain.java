package ch06_method;

import java.util.Scanner;

public class MethodMain {
    public static void main(String[] args) {
        // 메소드 = method = 함수 = function
        // 굳이 나누자면
        // 메소드는 클래스에 종속된 함수를 말하며,
        // 함수는 클래스에 독립적인 함수를 말한다. (신경쓰지 않아도 된다)

        // 1부터 100까지 다 더하면 결과는?
        int plus = 0;
        for (int i = 1; i < 100; i++) {
            plus += i;
        }
        System.out.println("1부터 100까지 더한 결과: " + plus);

        // 30부터 60까지 다 더하면 결과는?
        int sum = 0;
        for (int i = 30; i <= 60; i++) {
            sum += i;
        }
        System.out.println("30부터 60까지 더한 결과: " + sum);

        // 25뷰터 50까지 다 더하면 결과는?
        sum = 0;
        for (int i = 25; i <= 50; i++) {
            sum += i;
        }
        System.out.println("25부터 50까지 더한 결과: " + sum);

        System.out.println("\n=============================================\n");
        // 위 작업을 메소드로 만들기
        // a부터 b까지 더한 결과는?

        // 함수의 실행 >> 함수명();
        System.out.println("printSum 실행 전");
        printSum(10, 20); // 파라미터에 들어갈 값을 넣어준다
        System.out.println("printSum 실행 후");

        printSum(70, 90);
        printSum(5, 20);

        // 함수를 쓰면 좋은점
        // 실행부의 코드가 간결해진다(= 가독성이 좋아진다)
        // 중복된 코드를 한 곳에서 관리할 수 있으므로
        // 수정할 때 용이하다!!!

        // 리턴값이 존재하는 함수?
        String fruit = "Apple";
        System.out.println(fruit.substring(1, 3));

        // 리턴값이 존재하는 함수 만들기


        System.out.println("\n===================================================\n");

        // LoopWhile 에서 포켓몬 했던거를 메소드로 묶어서 실행

        playPokemon();

        System.out.println("\n===================================================\n");

        // 팩토리얼을 메소드화
        // 어라? 팩토리얼을 이전에 했었는데... 어떤 파일에서 했더라???
        // [Crtl + Shift + F]

        System.out.println(factorial(5));

        // 재귀함수
        // 메소드 내에서 해당 메소드를 실행하는 케이스

        // 콘솔창에 1부터 n까지 출력하는 메소드
        printNum(5);

        // 재귀함수 방식
        recPrintNum(10);

        System.out.println(recFactorial(5));


        recFactorial(5);
    } // main 메소드 끝

    public static long recFactorial(int num) {
        // 재귀 함수로 팩터리얼 메소드 구현하기
        System.out.println(num);
        if (num == 1 ){
            return 1;
        }
        // num에 5가 들어오면
        return num * recFactorial(num-1);
        // return 5 * recFactorial(4)
        // return 5 * 4 * recFactorial(3)
        // return 5 * 4 * 3 * recFactorial(2)
        // return 5 * 4 * 3 * 2 * recFactorial(1)
        // return 5 * 4 * 3 * 2 * 1
    }
    public static void recPrintNum(int num){
        System.out.println(num);  // 10
        // 자기 자신을 호출 (= 재귀함수)
        // 무한 반복 실행을 주의
        if(num == 1){
            // 더이상 실행 안함
            return; // 메소드 즉시 종료
        }

        recPrintNum(num - 1);  // 파라미터에 9

    }
    public static void printNum(int num){
        for(int i = 1; i<= num; i++){
            System.out.println(i);
        }
    }

    public static long factorial(int n) {
        long num = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            num *= i;
        }
        return num;
    }



        public static void playPokemon(){
        Scanner scan = new Scanner(System.in);
        // 포켓몬스터
        int hp = 100;
        outer: while(true){  // >> 이 while문의 이름이  outer가 됨.
            System.out.println("야생의 피카츄를 만났습니다.");
            System.out.println("행동을 선택해주세요");
            System.out.println("1. 공격 | 2. 도망");
            System.out.print(">>> ");

            int command = Integer.parseInt(scan.nextLine());

            if (command == 1){
                // TODO 공격
                while(true){
                    System.out.println("공격 방법 선택");
                    System.out.println("1. 몸통박치기 | 2. 하이드로펌프 | 3. 취소");
                    System.out.println(">>> ");

                    int attack = Integer.parseInt(scan.nextLine());

                    if(attack == 1){
                        System.out.println("몸통박치기 시전");
                        hp -= 20;
                    }else if (attack == 2){
                        System.out.println("하이드로펌프 시전");
                        hp -= 40;
                    }else if (attack == 3){
                        // 취소
                        // 가까운 반복문 1개를 즉시 종료
                        // 내부 while문만 종료
                        break;
                    }

                    if (hp <= 0 ){
                        System.out.println("피카츄를 잡았다~!!");
                        // 외부 while문을 종료 시키려면??
                        // System.exit(0); //  >> 프로그램 종료
                        // 외부 while문에 네임태그 설정
                        // break outer; // >> outer라는 이름을 가진 while문이 종료
                        // 리턴타입이 void 이더라도 return은 사용이 가능하다.
                        // 메소드 내에서 return이 실행괴면 해당 메소드는 즉시 종료된다.
                        return;
                    }

                }

            }else if(command == 2){

                System.out.println("메다닥 도망갔습니다.");
                break;
            }else{
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }

    // 메소드의 선언
    // public : 접근 제어자
    // static : 정적 메소드 선언
    // void : 함수의 리턴값이 없음을 의미 (리턴값이 있으면 이 자리에 리턴값의 타입을 적어준다)
    // printSum은 함수명을 의미 (선언한 메소드를 실행시 함수명을 이용)
    // 소괄호() 안에는 입력받을 파라미터를 선언
    public static void printSum(int startNumber, int endNumber){
        int sum = 0;
        // 메소드가 실행이 될 때 a, b 값을 받아야 한다. => 파라미터에 기입
        sum = 0;
        for (int i =  startNumber; i <=  endNumber; i++){
            sum += i;
        }
        System.out.println(startNumber  + "부터 " + endNumber  + "까지 더한 결과:" + sum);

    }
}
