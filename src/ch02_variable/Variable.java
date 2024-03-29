package ch02_variable;

public class Variable {

    // 개발할 때 명명법

    // 프로젝트명은 앞에 대분자를 쓴다.
    // 하나 이상의 단어가 포함된다면
    // 다음 단어의 앞글자는 대문자 (예: MyProject, JavaStudy 등...)

    // 패키지명은 전부 소문자로 쓴다.
    // 하나 이상의 단어가 포함된다면 단어 사이에 언더바(_)를 추가한다.

    // 클래스명은 프로젝트 명명법과 동일

    // 변수명 짓기
    // 카멜(Camel) 방식 상용 (95%)
    // 첫 단어는 소문자로 시작, 하나 이상의 단어가 포함된다면
    // 다음 단어는 대문자로 시작 (예: todayIsHappy : 중간 중간 대문자)

    // 헝가리안 방식
    // 변수명 앞에 변수타입을 적어 놓는 방식
    // 예: strName, intMoney (str: 문자 , int: 숫자를 쓴다.)

    // 변수일때는 변수명 앞에 v_ 를 붙임
    // 함수일때는 함수명 앞에 f_ 를 붙임
    // 파라미터에는 파라미터명 앞에 p_ 를 붙이는 방식
    // 명시적이기 때문에 코드를 이해하고 해석하는데 용이

    // 함수명 규칙은 변수명 규칙과 동일 (카멜식)

    // 변수명 주의사항
    // 이미 선언된 변수명은 또 선언이 불가능 (중복선언 불가)
    // 변수명에 공백 또는 특수문자는 사용 불가
    // 영어 대소문자를 구분한다. (변수 lol과 LOL은 다른 변수명으로 취급 / 대소문자 차이)
    // 숫자를 변수명에 사용할 수 있으나 변수명 앞에 숫자를 쓸 순 없다.
    // 변수명의 글자 수 제한은 없다. (변수명을 길게 지어도 된다)
    // 변수명을 길게 지을수록 의미를 명확히 할 수 있다.
    // 변수명에 예약어 사용 불가

    // 상수명 짓기
    // 단어 전부 대문자를 사용하며
    // 단어 사아에 언더바(_)를 붙여서 표기 (= 스네이크 방식)
    // 예: NEXT_IT_ADDRESS
}
