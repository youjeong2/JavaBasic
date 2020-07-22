package Sixth;

public class DBZExceptionTest {
    public static void main(String[] args) {
        int x = 1;
        int y = 0;
        // 그래서 try 추가
        try {
            // 오류가 발생하는 원인은 아래 코드 때문이다!
            // 어떤 숫자를 0으로 나눌 수 없음
            // try를 사용하는 녀석들은 잠재적 오류를 내포한 녀석들
            // 이 녀석이 오류를 유발할 수도 있겠는데 ?
            // 하는 경우 try에 넣으면 된다.

            // 정상동작할 수 있는데 오류를 낼 수 도 있겠다
            // ==y값이 들어오다가 0이 들어오면 치명적
            // 그런경우 계산하다 멈추면 프로그램이 꺼짐-> 망
            // 그러면 catch가 캐치해서 처리해줌 !
            // -> 고수는 try, catch를 잘 다룸
            int result = x/ y;
            // 실제 divide by zero 오류는 CPU에서감지하는 HW오류다.
            // 운영체제의 동작 메커니즘 상
            // 이것은 원래 kernel이라는 OS가 처리한다.
            // 하지만 catch 구문을 사용해서 내가 대신 처리할 게 라고
            // OS에게 요청을 하여 실질적으로 해당 오류가 발생하면
            // 운영체제가 처리 작업을 catch쪽으로 위임하게 된다.
           } catch(ArithmeticException e) {
                System.out.println("0으로 나누지 좀 마!");
            }

        System.out.println("왓 더");
    }
}

