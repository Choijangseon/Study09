package jangseon.submit04;

import java.util.Scanner;

public class Submit04 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int elevatorA = 10;
        int elevatorB = 4;

        while(true){

            System.out.println("========= 희영빌딩 엘리베이터 =========");
            System.out.println("승강기 A의 현재 위치: " + elevatorA );
            System.out.println("승강기 B의 현재 위치:" + elevatorB);
            System.out.println("몇층에 계시나요?[종료하시라면 q또는 exit 입력]: ");
            String floor = scan.nextLine();
            int floors = Integer.parseInt(floor);
            System.out.println(floors +"층에서 엘리베이터를 호출합니다");

            if (elevatorA - floors < elevatorB) {
                System.out.println("승강기 A가 " + floors + "층으로 이동하였습니다.");
                elevatorA = floors;
            }else if (elevatorA - floors > elevatorB) {
                System.out.println("승강기 B가 " + floors + "층으로 이동하였습니다.");
                elevatorB = floors;
            }






        }



    }
}

//A 10 B 2   floors 7
//A - floors > B
//7   >  2   false
//
//A 2 B 8 floors 5
//A - floors > B
//-3 > B true
