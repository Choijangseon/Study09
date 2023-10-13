package jangseon.subimt09.q01;

import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {

//        하이마트에 놀러갔더니 전자제품들이 정말 많이 있군요.
//        전자제품들은 각각 제품명과 가격이 함께 전시되어있습니다.
//        이를 코드로 구현하기 위해,
//        필드 변수에 제품명과 가격을 포함하는 전자제품 클래스(Product)를 만들어보세요.
        //        Product 클래스를 이용하여
//
//        제품명: 냉장고, 가격: 2000000
//        제품명: TV, 가격: 1000000
//        제품명: 에어컨, 가격: 800000
//        제품명: 컴퓨터, 가격: 1300000
//        제품명: 선풍기, 가격: 100000
//
//        객체들을 만들어주세요.



        Product fresh = new Product("냉장고", 2000000);
        Product tv = new Product("tv", 1000000);
        Product air = new Product("에어컨", 800000);
        Product com = new Product("컴퓨터", 1300000);
        Product fan = new Product("선풍기", 100000);


        System.out.println(fresh);
        System.out.println(tv);
        System.out.println(air);
        System.out.println(com);
        System.out.println(fan);

        ArrayList<Product> things = new ArrayList<>();
        things.add(fresh);
        things.add(tv);
        things.add(air);
        things.add(com);
        things.add(fan);
        System.out.println("\n==================================================\n");
        for (int k = 0; k < things.size() -1 ; k++){
            for (int i = 0; i < things.size() -1 ; i++){
                if (things.get(i).price < things.get(i+1).price){
                    Product tmp = things.get(i);
                    things.set(i, things.get(i+1));
                    things.set(i+1 , tmp);

                }
            }
        }

        for (int i = 0; i <things.size(); i++){
            System.out.println(things.get(i));
        }


//        정렬이 완료된 리스트에서 TV가 몇번째 인덱스인지 찾아내어 출력하시오.
//        (ArrayList를 순회하면서 담겨져 있는 객체의 name이 TV인 경우 그때의 인덱스를 출력)










































    }
}
