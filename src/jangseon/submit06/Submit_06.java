package jangseon.submit06;

import java.util.Arrays;

import static ch07_array.ArrayMain.printArray;

public class Submit_06 {
    public static void main(String[] args) {

//        한국 배우들의 명단을 배열로 만들어보았습니다.
//                for문을 이용하여 "이"씨 성을 가진 사람이 몇명인지 출력해주세요.

//        Hint
//        for문으로 각각의 요소에 접근, 각 요소를 substring으로 맨 앞글자만 자른 뒤
//        자른 글자가 “이"와 같은지 비교하여 같다면 카운팅


        String[] nameList = {"이정재", "김혜수", "이병헌", "송중기", "유아인", "류준열", "공유", "마동석",
                "이종석", "황정민", "박소담", "이선균", "이성민", "최민식", "이동휘", "권상우", "소지섭", "공효진",
                "조정석", "허성태", "이하늬"};

//
//        System.out.println(nameList.length);
//
//        for (int i = 0; i < nameList.length; i++) {
//
//        }
//        for (int i = 0; i < nameList.length; i++) {
//            if (nameList[i].indexOf("이") != -1) ;
//            System.out.println(nameList);
//
//        }

        int A = 0;
        for (int i = 0; i < nameList.length; i++) {
            // System.out.println(nameList[i].substring(0, 1));
            String count = (nameList[i].substring(0, 1));
//            System.out.println(count);
            if (count.equals("이")) {
                A++;
            }
        }
        System.out.println("이씨 성을 가진 배우가 총 " + A + "명 있습니다.");


//        int name = 0;
//        for (int a = 0; a < nameList.length; a++){
//            if (nameList[a].substring(0,1). equals("이"))
//        }
//        name++;

        System.out.println("\n=======================================================\n");


//        최댓값, 최솟값 구하기
//

//
//        for문을 이용해 intArr의 최댓값과 최솟값을 출력해주세요.
//
//
//        Hint
//        for문 바깥에 int 변수 하나 선언해둔 뒤, for문을 돌리면서 각각의 요소가 int 변수보다 큰지 비교
//        크다면 int 변수에 해당 요소의 값 저장

        // 실행결과
        // 최댓값: 464
        // 최솟값: 1
        int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
        int max = intArr[0];
        int min = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
            if(min > intArr[i]){
                min = intArr[i];
            }
        }
        System.out.println("최댓값: " + max);
        System.out.println("최솟값: " + min);

        Arrays.sort(intArr);
        printArray(intArr);

        System.out.println("최댓값: " + intArr[intArr.length - 1]);
        System.out.println("최솟값: " + intArr[0]);



        System.out.println("\n=======================================================\n");




//        로또 번호 생성기
//
//        1~45 까지의 랜덤 숫자 6개를 배열에 중복되지 않도록 담고, 이를 정렬한 배열을 리턴하는 makeLotto() 함수를 만들어주세요.


        int[] myLotto = makeLotto();
        for (int i = 0; i < myLotto.length; i++) {
            System.out.println(myLotto[i] + " ");





        }

    }

    public static int[] makeLotto() {
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;

            for (int A = 0; A < i; A++) {
                if (lotto[i] == lotto[A]) {
                    i--;
                    break;
                }


            }
        }
        return lotto;

        }



//    int[] numArr = new int[6];
//    int idx = 0;
//            while(true){
//        // 랜덤 숫자 생성
//        int ran = (int)(Math.random() * 45) + 1 ;
//
//        // 랜덤 숫자가 현재 배열 내 존재하는지 체크
//        boolean isDuple = false;
//        for (int i = 0; i < numArr.length; i++){
//            if(numArr[i] == rand){
//                // 랜덤 숫자가 현재 배열에 존재함
//                isDuple = true;
//            }
//        }
//        // 위 for문이 끝날때까지 if문이 단 한번이라도 실행이 되었는지 체크
//        // isDuple이 false일때 rand를 배열에 담기
//        if(isDuple == false){
//            numArr[idx] = rand;
//            idx++;
//        }
//        if (idx == 6)
//            break;
//            }
//

    }
