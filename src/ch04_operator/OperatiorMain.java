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
        System.out.printf("anyskdjfa");


    }












































}
