package ch04_operator;

public class OperatiorMain {

    public static void main(String[] args) {

        // 산술 연산자(Operator)
        int numA = 10;
        int numB = 3;

        // numA 에 1 더하기
        numA = numA + 1;
        System.out.println(numA);
        // numA 에 20 더하기
        numA = numA + 20;
        System.out.println(numA);

        // numA 에 21 빼기
        numA =  numA - 21;
        System.out.println(numA); // numA = 10

        // "더하기" 로 인해 numA와 numB가 숫자가 아닌 문자로 인식된다.
        System.out.println("더하기 " + numA + numB);
        // ()를 함으로써 "더하기" 보다 ()를 먼저 계산하개 된다.
        System.out.println("더하기 " + (numA + numB));
        System.out.println("빼기 " + (numA - numB));
        System.out.println("곱하기 " + (numA * numB));
        System.out.println("나누기 " + (numA / numB));
        // numA / numB 의 나머지 값 구하기 >> %
        System.out.println("나누기 " + (numA % numB));

        System.out.println("\n=========================================\n");


        // 증감 연산자
        numA++; // ++ >> 1증가 (딱 1만 증가)
        System.out.println(numA);

        numA--; // -- >> 1감소 (딱 1만 감소)
        System.out.println(numA);

        ++numA; // 앞에 ++ >> 1증가
        System.out.println(numA); // >>여기까지 numA = 11

        // ++ 의 위치에 따라 실행 순서가 달라진다.
        System.out.println(numA++); // ++를 했음에도 numA = 11 >> numA의 값 출력 후 ++
        System.out.println(numA); // >> numA = 12로 출력

        System.out.println(++numA); // >> ++ 후 numA의 값 출력

        System.out.println("\n=======================================\n");

        // 대입 연산자
        numA = numA + 20; // 산술방법 >> 1이 아닌 아무 숫자나 가능
        numA++; // 증감방법 >> 1씩만 증가/감소
        numA += 20; // 대입방법 >> 1이 아닌 아무 숫자나 가능 (간략함)

        System.out.println(numA);

        numA -= 30;
        System.out.println(numA);

        numA *= 3;
        System.out.println(numA);

        // 72 / 5 = 14 (나머지는 안나옴)
        numA /= 5;
        System.out.println(numA);

        // 14 % 5 = 4 (나머지 값)
        numA %= 5;
        System.out.println(numA);

        System.out.println("\n=======================================\n");

        // 문자열 더하기
        String subway = "반석역";

        subway = subway + " 지족역";
        System.out.println(subway);

        // 대입연산자 사용 가능 (대입연산자는 뒤에만 추가가 된다.)
        subway += " 노은역";
        System.out.println(subway);

        subway = "대전지하철 " + subway + " 월드컵경기장역";
        System.out.println(subway);

        System.out.println("\n=======================================\n");

        // 형(Type) 변환 - Casting
        // 형변환이 가능한 경우에 대해 형변환을 통해 상항에 맞게 적절히 사용할 수 있다.
        int intNum = 15;
        double doubleNum = 1.23;

        System.out.println(intNum * doubleNum); // 18.45

        // int 곱하기, 나누기 double은 double 타입이 된다 (자동 형변환)
        double milResit = intNum * doubleNum;

        // int 곱하기, 나누기 float은 float 타입이 된다
        float floatMil = intNum * 2.34f;

        // 정수와 소수를 곱하거나 나누면 결과는 소수가 나온다.
        // 같은 정수타입, 같은 소수타입의 경우 메모리 크기만 허용된다면
        // 형변환이 가능하다
        long longNum = 4356L; // >> long 타입에 4356을 담을 수 있기에 변환가능
        // int castLong = 4356L; // >> 메모리 크기가 더 큰 long 에서 int로는 자동 형변환 x
        int castLong = (int)3560000000L; // (int(타입))값을 이용하여 강제 형변환이 가능하다.
        System.out.println(castLong); // 크기가 넘어가는 경우 제대로 된 값이 담기지 않는다.

        // 숫자와 문자열을 더하면
        // 숫자가 문자열로 자동형변환이 되어 문자열 이어붙이기가 된다.
        String month = "이번달 " + 9;
        System.out.println(month);


        // 강제 형변환
        int intCast = (int)3.976;
        System.out.println(intCast); // >> double타입을 int타입으로 강제 형변환을 했기 때문에 정수 부분만 나온다.

        // 10 * 3.333 = 33.33
        // 정수인 33만 intMul에 담기
        int intMul = (int)(10 * 3.333); // >> (10 * 3.333) 괄호를 침으로 써 먼저 계산하게 한다. 그 후 (int)타입 변환
        System.out.println(intMul);

        // 가장 많이 하는 실수
        System.out.println(10/3);
        // 10 / 3 -> 3.333333
        // 연산 값이 소수일지라도, 정수 타입(10 , 3을 정수로 씀)이 유지되므로 정수만 출력

        double result = (double) 10 / 3;
        System.out.println(result); // >>

        // 프로그래밍에서 소수 연산의 정확도는 떨어진다.
        // 하지만 대부분 소수 둘째, 셋째자리까지 사용을 하기 때문에 상관하지 않아도 된다.
        // 정확한 소수 연산이 꼭 필요하다면 다른 사람들이 만들어놓은 라이브러리를 가져다 쓰면 된다.

        // 숫자형 문자열을 정수로 형변환
        String strNum = "123";
        System.out.println(strNum + 2 ); // >> strNum가 숫자가 아닌 문자이기 때문에
                                         // >> strNum + 2 = 125가 아닌 2가 뒤에 붙어서 "1232"가 된다

        int num = Integer.parseInt(strNum); // >> 문자열인 strNum을 숫자열로 변환
        System.out.println(num + 2 );

        // 소수형 문자열을 소수 타입으로 형변환
        strNum = "23.45";
        double dnum = Double.parseDouble(strNum); // >> 소수점이기 때문에 double 타입으로 변환
        System.out.println(dnum + 1.23);

        System.out.println("\n============================================\n");


        // 나머지 연산자(%) 사용 예시

        // 홀수, 짝수 판별
        int anyNum = 7;
        // 2로 나눈 나머지가 0이먄 짝수, 1이면 홀수
        System.out.println(anyNum % 2);

        // 게시판 페이징 구현
        int totalCountGul = 33; // 게시판에 글이 총 33개 있다.
        int showCountPage = 10; // 한 페이지에서 보여줄 글의 수가 10개

        // 총 페이지 수 -> 4
        // 33 / 10 = 3.3 -> 올림처리 = 4
        int totalPage = (int)Math.ceil((double)totalCountGul / showCountPage);
        // Math.ceil >> double형식으로 나오게 만들어져 있어서 앞에 (int)를 붙여 줌으로써 소숫점을 없앤다.
        System.out.println(totalPage);

        // 마지막 4페이지에 있는 글의 개수?
        // 33 % 10 = 3
        // 33을 10으로 나눈 나머지 = 3
        int countLastPage = totalCountGul % showCountPage;
        System.out.println(countLastPage);

        System.out.println("\n===============================================\n");

        // 비교 연산자
        int numFive = 5;
        double pi = 3.14;
        int numOne = 1;

        // 비교 결과에 따라 true/false가 리턴된다. = boolean 타입과 같다.
        System.out.println(numFive < numOne);
        System.out.println(numFive > numOne);
        // 결과가 true/false라서 boolean 타입 변수에 담을 수 있다.
        boolean boolRst = numFive > numOne;

        //타입이 다른 숫자도 서로 비교 가능 >> double과 int 비교 가능하다.
        System.out.println(numFive < pi);

        // == 는 왼쪽과 오른쪽이 같은지 비교
        // 같다면 true, 다르면 false 리턴
        System.out.println(numOne == numFive);
        System.out.println(numOne == numOne);

        // != 는 왼쪽고 오른쪽이 다른지 비교
        // 같다면 true, 다르면 false 리턴
        System.out.println(numOne != numFive);
        System.out.println(numOne != 1);

        // 문자(char)도 비교연산자를 통해 이름순 정렬에 사용할 수 있다.
        System.out.println('가' < '나'); // 유니코드상 '가'가 '나'보다 먼저 위치(= '나'가 더 큰 숫자)

        String cat = "고양이";
        String dog = "강아지";

        System.out.println(dog.charAt(0) < cat.charAt(0));

        // 문자열이 같은지 비교
        String ship = "배";
        String pear = "배";
        String stomach = new String("배");
        System.out.println(ship);
        System.out.println(pear);
        System.out.println(stomach);
        // ship과 pear는 같은 영역의 "배"를 뜻하기 때문에 true가 나온다.
        System.out.println(ship == pear);
        // stomach는 ship, pear의 "배" 와는 다른 영역의 "배"를 만들었기 때문에 false가 나온다.
        System.out.println(ship == stomach);

        // 빈 문자열(empty) 체크
        //String inputData = "";
        //System.out.println(inputData.equals);
        System.out.println("\n=================================\n");

        // 삼항 연산자
        String inputId = "akow283";

        // inputId의 글자수가 7글자 이상이면 통과, 7글자 미만이면 탈락
        // 첫번째 항에는 조건이 들어간다. (boolean타입)
        // 조건이 true면 두번째 항의 값을 리턴
        // 조건이 false면 세번째 항의 값을 리턴
        String check = (inputId.length() >=7) ? ("통과") : ("탈락"); // >> 값이 "통과" or "탈락"으로 나오기 때문에 String을 쓴다
        // inputId의 글자수가 7글자 이상이기 때문에 "통과" 가 나온다
        System.out.println(check);
        int checkInt =inputId.length() >= 7 ? 1 : 0; // >> 값이 "1" or "0" 으로 나오기 때문에 int를 쓴다
        System.out.println(checkInt);

        int score = 75;
        // score가 90점 이상이면 "A", 90점 미만이면 "B"가 grade에 담기도록
        String grade = score >= 90 ? ("A") : ("B");
        System.out.println(grade);

        // 이중 삼향연산자
        // score가 90점 이상이면 "A", 80점 이상이면 "B", 그 외 "C"
        grade = (score >= 90) ? ("A") : ( (score >=80) ? ("B"): ("C") );
        System.out.println(grade);

        System.out.println("\n========================================\n");

        // 논리 연산자
        // 조건 체크를 여러번 하지 않고 한번에 끝낼 수 있도록 도와준다.

        // 회원가입시
        // 이름은 한글자 이상
        // 나이는 14세 이상
        // 휴대폰번호는 11자리 또는 10자리
        String inputName = "찬웅";
        int inputAge = 20;
        String inputPhone = "01073987332";
        System.out.println(inputName.length() >= 1);
        System.out.println(inputAge >= 14);

        // 논리 연산자 AND
        // &&
        // && 좌측 조건과 우측 조건 모두 true일때만 true 리턴
        // 둘 중 하나라도 false면 false 리턴
        System.out.println(inputName.length() >= 1 && inputAge >= 14);
        System.out.println(inputPhone.length() == 10);
        System.out.println(inputPhone.length() == 11);

        // 논리연산자 OR
        // ||
        // || 좌측 조건과 우측 조건 중 하나라도 true이면 true 리턴
        // 둘다 false일 때만 false 리턴

        // 휴대폰 번호는 10자리 또는 11자리 여야 한다.
        // x == 10 || x == 11
        System.out.println(inputPhone.length() == 10 || inputPhone.length() == 11);
        // 10 <= x <= 11
        // 10 <= x && x <= 11
        System.out.println(10 <= inputPhone.length() && inputPhone.length() <= 11);

        // !
        // !를 boolean 타입 앞에 붙여주면 (trube/false) 값을 뒤집는다.
        // 이름은  1글자 이상 = 이름은 empty가 아니어야 한다.
        // name이 empty일 때 true 리턴
        // !inputName.isEmpty() = name이 empty가 아니라면 true


        System.out.println(!inputName.isEmpty()
                && inputAge >=14
        && (inputPhone.length() == 11 || inputPhone.length() == 10));

        // 비트 연산자
        // 2진수
        int bitTen = 10; // 1010
        int bitNine = 9; // 1001
                         // 1000 >> AND 연산
                         // 1011 >>  OR 연산
                         // 0011 >> XOR 연산
        // 비트연산자 AND
        // &
        // 2진수의 각 자리수를 비교해서 같은 자리의 숫자가 둘 다 1이면
        // 그 자리에 1이 남고, 둘 중 하나라도 1이 아니면 그 자리에 0이 남음
        System.out.println(bitTen & bitNine); // 8 >> 1000

        // 비트연산자 OR
        // |
        // 각 자리수를 비교해서 둘 중 하나라도 1이면 그 자리에 1이 남음
        System.out.println(bitTen | bitNine); // 11 >> 1011

        // 비트연산자 XOR
        // ^
        // 각 자리수를 비교해서 서로 다른 경우에만 그 자리에 1이 남음
        System.out.println(bitTen ^ bitNine); // 3 >> 11

        // 2진수 예시
        // 4가지 취미를 나타내기 위해 숫자로 저장
        // 0 0 0 1 : 축구를 좋아함
        // 0 0 1 0 : 야구를 좋아함
        // 0 1 0 0 : 농구를 좋아함
        // 1 0 0 0 : 배구를 좋아함
        // 강연 : 0011 >> 3
        int gyLIke = 3;
        // 동우 : 0110 >> 6
        int dwLIke = 6;

        System.out.println(gyLIke & dwLIke); // 2 >> 10(2진수)

        // 리눅스에서 파일, 폴더의 권한을 설정하는 명령어 chmod

        // 십진수 303과 147에 대해 비트연산자 &를 직접 해보
        System.out.println(303 & 147);

        // 16진수 12f와 147에 대해 비트연산자 & 결과?
        // 2진수든, 16진수든 String으로 표현
        String sixteenNum = "12f";
        // 16진수를 (String)를 10진수(int)로 변환
        // "30" >> 30 기본적으로 10진수인 문자열을 10진수 int로 변환
        // 16진수면 파라미터에 16을 추가
       int tenNum= Integer.parseInt("12f", 16);
//        //   >>                          12f를  16진수로 바꾸어라
       System.out.println(tenNum);
//
//        // 10진수(int)를 2진수(String)로 변환
       String bunaryNum = Integer.toBinaryString(303);
       System.out.println(bunaryNum);
       // 10진수(int)를 16진수(String)로 변환
        String hexNum= Integer.toHexString(303);
        System.out.println(hexNum);

       // 2진수는 영어로 바이너리(Binary)
        // 16진수는 영어로 헥스(Hex)라 부른다




        }


    }












































}
