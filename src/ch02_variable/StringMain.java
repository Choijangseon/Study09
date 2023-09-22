package ch02_variable;

public class StringMain {

    public static void main(String[] args) {
        // 문자열 (String)
        // 문자열을 처리할 수 있는 String 클래스를 보유
        // 문자열을 다룰 수있는 다양한 메소드들이 존재
        // 문자열은 쌍따옴표("") 안에 있는 문자들이다.
        // char 타입의 '기' 는 String 타입의 "가" 와
        // 서로 타입이 다르다.
        String fruit = "Apple, Banana, Cherry";
        System.out.println(fruit);

        // .length()
        // 문자열의 길이를 리턴
        System.out.println(fruit.length());
        System.out.println("Apple, Banana, Cherry".length());
        System.out.println("\n=======================================\n");
        // .charAt(인덱스)
        // 인덱스는 배열에서 해당 요소의 순번에 해당
        // 인덱스는 0부터 시작
        // 해당 인덱스의 문자를 리턴 (char 타입)
        char p = fruit.charAt(2); // 'p'
        System.out.println(p);
        System.out.println(fruit.charAt(5));

        // .indexOf(문자열)
        // 해당 문자열에서 괄호 안에 있는 문자열의 인덱스(위치)를 리턴
        System.out.println(fruit.indexOf("Banana"));

        // 괄호 안 문자열을 포함하지 않는다면 -1 리턴
        System.out.println(fruit.indexOf("Melon"));
        // contains는 괄호 안 문자열을 포함하면 true, 포함하지 않으면 false가 나온다
        System.out.println(fruit.contains("Melon"));
        // 대소문자를 구별하며, 가장 앞에 있는 문자의 인덱스만 리
        System.out.println(fruit.indexOf("a"));

        // .substring(시작 인덱스, 끝 인덱스)
        // 해당 문자열을 시작 인덱스에서 끝 인덱스 전까지 자른 값을 리턴
        System.out.println(fruit.substring(7,13));
        // 해당 문자열이 변하지는 않는다.
        System.out.println(fruit);
        // 시작 인덱스에서 끝까지 자른 값을 리턴
        System.out.println(fruit.substring(15));
        System.out.println(fruit.substring(7));
        // 유효하지 않은 인덱스 입력시 에러가 발생한다.
        // System.out.println(fruit.substring(20,30));
        // .replace(바뀔 문자열, 바꾸고 싶은 문자열)
        // 해당 문자열에서 특정 문자열을 바꾸고 싶은 문자열로 교체한 값을 리턴
        System.out.println(fruit.replace("Cherry", "Banana"));
        System.out.println(fruit);

        // 원본에 적용하기
        fruit = fruit.replace("Cherry", "Banana");
        System.out.println(fruit);

        // .trim()
        // 해당 문자열의 양끝에 존재하는 모든 공백문자를 제거해준다.
        // 외부에서 가져온 데이터 다듬을 때 사용
        String world = "  The New World !!      ";
        // replace를 이용하여 공백제거
        System.out.println(world.replace(" ","")); // <- 모든 공백이 없어진다.
        System.out.println(world.trim()); // <- 앞 뒤의 공백만 없어진다

        // .toUpperCase() << 대문자로 리턴
        //.toLowerCase()  << 소문자로 리턴
        // 해당 문자열에 존재하는 알파벳들을 전무 대문자/소문자로 바꾼값을 리턴
        System.out.println(fruit.toUpperCase());
        System.out.println(fruit.toLowerCase());

        // 대소문자를 구별하지 않는 검색 기능을 구현할 때 유용
        System.out.println(fruit);
        System.out.println(fruit.contains("banana"));
        System.out.println(fruit.toLowerCase().contains(("banana")));

        // .concat(문자열)
        // 해당 문자열 뒤에 괄호 안에 문자열을 이어붙인 결과 리턴
        System.out.println(fruit.concat(", Cherry"));
        // 문자열 이어붙이기는 + 기호로도 구현가능
        System.out.println(fruit +  ", Melon");

        fruit = fruit + ", Cherry";
        System.out.println(fruit);

        fruit = "과일목록: " + fruit;
        System.out.println(fruit);

        System.out.println("\n=======================================\n");

        // 빈 문자열 (Empty) 라고 부른다.
        String nothing = "";
        System.out.println(nothing);
        System.out.println(nothing.length());

        // 기본타입 변수는 null값을 가질 수 없다. >> ex) int
        String nullthing =  null;
        // String은 참조타입이므로 null값을 가질 수 있다.
        // 참조타입인 변수를 객체(instance)라고 부른다.
        System.out.println(nullthing);
        //System.out.println(nullthing.length()); // 에러발생!!

        // 둘 다 값이 없는 것으로 보이지만
        // 본체가 없는 null과 빈 문자열 empty는 엄연히 다르다.









    }







}
