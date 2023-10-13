package jangseon.submit08;

import java.util.*;

import static java.util.Collections.addAll;

public class Submit_08 {
    public static void main(String[] args) {

//        Q. 01
//
//        makeLotto를 ArrayList와 HashSet을 이용해서 만들어보세요
//
//
//                Hint
//        먼저 빈 HashSet을 하나 만들고, while문 내에서 빈 HashSet에 랜덤 로또 번호를 HashSet의 사이즈가 6개가 될 때까지 넣는다.
//        이후 HashSet을 ArrayList로 변환한 다음, 오름차순으로 ArrayList를 정렬하여 리턴한다.
        ArrayList<Integer> myLotto = makeLotto();
        System.out.println(myLotto);
//        실행결과 [11, 14, 18, 26, 28, 43]

        // 과연 몇장을 사야 로또가 당첨이 될까
        // 로또 시뮬레이션
        int[] winLotto = {11, 21, 22, 30, 39, 44};

        long num = 0;
        while (true){
            num++;
            // 로또 한장 구매
            ArrayList<Integer> lotto = makeLotto();
            int count = 0;
            // winLotto와 lotto의 숫자 6개가 일치하는지 확인
            // winLotto와 lotto의 각 인덱스 자리의 숫자가 일치하는 개수 카운트
            for (int i = 0; i < lotto.size(); i++){
                if (winLotto[i] == lotto.get(i)){
                    count++;
                }
            }
            // 카운팅한 숫자 6개라면
            // 당첨!
            if (count == 6){
                System.out.println("당첨!!");
                System.out.println(num + "회 구매");
                System.out.println((num*1000l) + "원 씀");
                break;
            }else{
                System.out.println(count + "개 맞춤. 현재" + num + "회 구매");
            }

        }


//        Q. 02
//
//        infoMap의 Key는 사용자의 아이디, Value는 사용자의 비밀번호라고 했을 때 아래와 같이 데이터를 추가해주세요.
//
//        HashMap<String, String> infoMap = new HashMap<>();
//
//        infoMap.put("a001", "1234a");
//        infoMap.put("b001", "1234b");
//        infoMap.put("c001", "1234c");
//        infoMap.put("d001", "1234d");
//        infoMap.put("e001", "1234e");
//
//
//        사용자가 아이디와 비밀번호를 입력했을때,
//        infoMap의 Key(아이디)와 Value(비밀번호)와 비교하여
//
//        아이디와 비밀번호가 infoMap 내에 존재하는 데이터와 일치하면 로그인 성공 출력
//        아이디가 존재하지 않으면, 존재하지 않는 아이디입니다. 출력
//        아이디는 존재하지만 비밀번호가 일치하지 않으면 비밀번호가 틀렸습니다. 출력

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> infoMap = new HashMap<>();


        infoMap.put("a001", "1234a");
        infoMap.put("b001", "1234b");
        infoMap.put("c001", "1234c");
        infoMap.put("d001", "1234d");
        infoMap.put("e001", "1234e");


            while(true) {
                System.out.println("아이디를 입력해 주세요");
                System.out.println(">>> ");
                String id = scan.nextLine();
                System.out.println("비밀번호를 입력해 주세요");
                System.out.println(">>> ");
                String pw = scan.nextLine();
                // TODO 로그인성공
                if (infoMap.containsKey(id)) {
                    if (infoMap.get(id).equals(pw) ) {
                        System.out.println("로그인 성공");
                        break;
                        // TODO 아이디가 존재하지 않습니다.
                    } else {
                        System.out.println("비밀번호가 틀렸습니다");

                    }
                    }else{
                    System.out.println("아이디가 존재하지 않습니다");
                }
                // TODO 다른종류의 풀
//                if (pw.equals(infoMap.get(id))){
//                    System.out.println("로그인 성공");
//                    break;
//                }else {
//                    System.out.println("아이디 혹은 비밀번호가 틀립니다.");
//                }
            }

                     //TODO 비밀번호가 틀렸습니다.






    }// main 끝

    public static ArrayList<Integer> makeLotto() {
        HashSet<Integer> lotto = new HashSet<>();

        // 몇번 반복해서 집어넣기? >> 애매하다 >> while문을 쓴다
        while (true) {  // if문을 없애고 >> while(lotto.size() < 6) 이렇게 쓴다.
            lotto.add((int) (Math.random() * 45) + 1);
            if (lotto.size() == 6) {
                System.out.println(lotto);
                break;
            }

        }

        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.addAll(lotto);
        Collections.sort(tempList);
//        향상된 for문 사용
//        for (int num : lotto){
//            tempList.add(num);
//        }


        return tempList;
    }



}





