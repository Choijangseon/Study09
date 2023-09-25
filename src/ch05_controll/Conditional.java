package ch05_controll;

public class Conditional {

    static String today = "월요일";

    public static void main(String[] args) {

        // 조건문

        // if문
        int price = 30000;
        int myMoney = 10000;

        // myMoney가 price보다 작으면 "돈이 부족합니다" 문구 출력
        // 조건 안에는 boolean 타입의 결과가 들어간다.
        // 프로그래밍에서 괄호가 열렸으면 닫히는 부분이 있어야한다
        // if문의 소괄호 안 조건이 true면 중괄호 내부 코드 실행
        // false면 중괄호 내부 코드가 실행되지 않음.
        if(myMoney < price){
            System.out.println("돈이 부족합니다.");
        }

        // 괄호만 잘 지키면 한줄로 써도 된다.
        // 중괄호 뒤에는 ; 을 안붙인다.
        if(myMoney < price){System.out.println("돈이 부족합니다.");}

        // 중괄호 블록{} 안쪽 명령어가 한줄뿐이라면
        // 중괄호 블록을 생략할 수 있다.
        if(myMoney < price)
            System.out.println("돈이 부족합니다.");

        System.out.println("\n==========================================\n");

        // 변수의 사용범위(Scope)
        // 중괄호 블록{} 안에 선언된 변수는
        // 해당 중괄호 블록{} 밖에서는 사용할 수 없다.
        String review = "맛있어요~";
        if(review.length() < 10) {
            // warning이 메모리에 등록
            String warning = "리뷰는 10글자 이상 작성해주세요";
        } // 메모리에서 warning은 삭제

        // warning 의 존재를 모른다
        // System.out.println(warning); >> if문 {} 안에서 warning이 만들어졌기 때문에 {}밖에서는 못쓴다.

        // 전역 변수
        // class 중괄호 블록 안에 선언된 변수
        // 해당 클래스 내 어디서든 사용이 가능하다.
        System.out.println(today); // >> 맨 윗상단
        // 조건에 따른 변수 값 변화
        // 리뷰 길이가 10글자 이상이면 warning에는 "통과" 담기
        String warning = "통과";
        if(review. length() < 10){
            warning = "리뷰는 10글자 이상 작성해주세요.";
        }
        System.out.println(warning);

        // 삼항연산자는 조건에 따른 변수 값 변화시 사용하면 좋다.
        warning = (review.length() < 10) ? ("리뷰는 10글자 이상 작성해주세요") : ("통과");

        // else와 else if
        int numZero = 0;

        if(numZero < 0){
            System.out.println("numZero가 0보다 작다");
        }else{
            // 위 if문 조건이 false면 else 내부 코드가 실행
            System.out.println("numZero가 0보다 같거나 크다.");
        }

        // 주민번호 뒷자리의 첫번째 숫자가 홀수면 남성, 짝수면 여성
        int idBack = 4;  // >> 변수에 들어갈 숫자 만들기
        if(idBack % 2 == 1){  // >> 변수를 2로 나누었을 때 나머지가 1이면
            // 홀수
            System.out.println("남성"); // 나머지가 1이면 "남성" 출력
        }else{
            // 짝수
            System.out.println("여성"); // 나머지가 2이면 "여성" 출력
        }
        numZero = 0;
        if (numZero < 0){
            System.out.println("numZero가 0보다 작다");
        }else if(numZero == 0){
            System.out.println("numZero가 0이다");
        }else{
            System.out.println("numZero가 0보다 크다");
        }

        System.out.println("\n=====================================\n");

        // 세상 모든 가전제품에는 프로그래밍 코드가 들어가있다.
        // 리모콘은 전원 버튼 하나로 on/off가 가능하다.

        // isPowerOn은 전원이 켜져있으면 true, 꺼져있으면 false
        boolean isPowerOn = false;

        // 전원버튼 누르기
        if(isPowerOn == false){  // isPowerOn은 true/false 두가지 케이스뿐
             System.out.println("TV를 켭니다.");
             isPowerOn = true;
        }else if(isPowerOn == true){
            System.out.println("TV를 끕니다.");
            isPowerOn = false;
        }

        // 불리언 타입은 true/false 뿐이니 위에 예제를 밑에처럼 쓸 수 있다.
        if(!isPowerOn){  // isPowerOn은 true/false 두가지 케이스뿐
            System.out.println("TV를 켭니다.");
        }else{
            System.out.println("Tv를 끕니다.");
        }
        isPowerOn = !isPowerOn;

        // boolean 타입의 true/false 성질을 마치 스위치의 on//off처럼
        // 사용하는 변수를 토글(toggle) 혹은 플래그ㅏ(flag) 라고 부른다.

        System.out.println("\n==========================================\n");

        // 이중 삼항연산자로 점수에 따른 등급 표현 >> if문
        int score = 85;
        String grade = "";

        // if, else if, else 를 이용하여
        // score가 90점 이상이면 grade는 "A"
        // socre가 85점 이상이면 grade는 "B"
        // 나머지는 grade가 "c"
        if (score >= 90){
            grade = "A";
        }else if (score >= 85) {
            grade = "B";
        }else{
            grade = "C";
        }
        System.out.println(grade);

        // 코드라인 줄이기
        grade = "C"; // >> grade는 "C"라고 해놓고 score가 더 높다면 "A" , "B"가 나오게 하기
        if (score >= 90){
            grade = "A";
        }else if (score >= 85) {
            grade = "B";
        }
        System.out.println(grade);

        score = 92;
        if(score >= 80){ // >> if(score >= 80 && < 90) 으로 써야 grade = "A"가 나온다.
            grade = "B";   // >> 위에서 부터 순서대로 처리를 하기 때문에 grade = "B" 가 먼저 처리가 됨
        }else if (score >= 90){
            grade ="A"; // >> 위에서 "B"가 충족이 되어버리기 때문에 밑으로는 내려오지 않는다.
        }else{
            grade = "C";
        }
        System.out.println(grade); // >> B가 나와버림

        // 회원가입 조건체크
        // 이름은 한글자 이상
        // 나이는 14세 이상
        // 휴대폰 번호는 10자리 또는 11자리
        String name = "길똥이";
        int age = 20;
        String phone = "01073987332";

        if (name.length() > 0){
            // 이름 조건 통과
            if(age >= 14){
                // 나이 조건 통과
                if(phone.length() == 10 || phone.length() == 11){
                    // 휴대폰 조건 통과
                    System.out.println("회원가입 성공");
                }else{
                    // 휴대폰 조건 불통과
                    System.out.println("회원가입 불가");
                }
            }else{
                // 나이 조건 불통과
                System.out.println("회원가입 불가");
            }
        }else{
            // 이름 조건 불통과
            System.out.println("회원가입 불가");
        }

        // 논리연산자를 이용하여 개선
        if(name.length() > 0
                && (age >= 14)
                && (phone.length() == 10 || phone.length() == 11)){
            System.out.println("회원가입 성공");
        }else{
            System.out.println("회원가입 실패");
        }

        System.out.println("\n==================================\n");

        // switch문
        // 틀정 변수에 대한 값에 따라 다른 구문을 실행하는 경우 사용

        // 여러분들의 교육기간(단위: 월)
        int month = 2;

        if(month == 0){
            System.out.println("자바, DB 배우는 중");
        }else if(month ==1){
            System.out.println("자바, 화면구현 배우는 중");
        }else if(month ==2){
            System.out.println("자바FX 프로젝트(우웩)");
        }else if(month == 3){
            System.out.println("JSP-스프링, SPA 배우는 중");
        }else if(month == 4){
            System.out.println("팀 프로젝트 하는 중");
        }else
            System.out.println("취업, 수료");

        // 위에 if문을 switch문으로 변경
        // switch() 소괄호 안에 변수를 넣는다.
        switch(month){
            case 0:
                System.out.println("자바, DB 배우는 중");
                break; // >> 이후 나머지 case 내용이 실행되지 않도록 막아준다
            case 1:
                System.out.println("자바, 화면구현 배우는 중");
                break;
            case 2:
                System.out.println("자바FX 프로젝트(우웩)");
                break;
            case 3:
                System.out.println("JSP-스프링, SPA 배우는 중");
                break;
            case 4:
                System.out.println("팀 프로젝트 하는 중");
                break;
            default: // >> if문의 else에 해당
                System.out.println("취업, 수료");
        }

        // month에 대한 계절을 출력해주는 switch문 만들어 보기
        month = 2;

        switch(month){
            case 12 :
            case 1:
            case 2:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");


        }










    }
}
