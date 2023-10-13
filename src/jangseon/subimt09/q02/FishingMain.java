package jangseon.subimt09.q02;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class FishingMain {
    public static void main(String[] args) {


        ArrayList<Fish> fishList = new ArrayList<>();

        fishList.add(new Fish("고등어", 5000));
        fishList.add(new Fish("광어", 25000));
        fishList.add(new Fish("우럭", 27000));
        fishList.add(new Fish("참돔", 30000));
        fishList.add(new Fish("돌돔", 35000));
        fishList.add(new Fish("능성어", 70000));
        fishList.add(new Fish("다금바리", 120000));


        Scanner scan = new Scanner(System.in);
        int fish = (int)(Math.random() * fishList.size());
        System.out.println();
// 잡은 물고기를 담을 가방
        ArrayList<Fish> fishBag = new ArrayList<>();

        while(true) {
            System.out.println("행동을 선택해주세요.");
            System.out.println("1. 낚시하기 | 2. 잡은 물고기 목록 | 3. 떠나기");
            System.out.print(">>> ");
            int select = Integer.parseInt(scan.nextLine());
            if(select == 1) {
                // TODO 낚시하기
//                System.out.println( + "을 잡았다!!");
            }else if(select == 2) {
                // TODO 잡은 물고기 목록 보기
            }else if(select == 3) {
                // TODO 종료
                break;
            }
            System.out.println();
        }























    }
}
