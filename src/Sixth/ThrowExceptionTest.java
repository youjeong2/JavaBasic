package Sixth;

// 산술 연산에 대한 예외를 처리할 위임 클래스
class DBZException extends ArithmeticException {
    public DBZException() {
        super("0으로 나누면 안돼!");
    }
}

public class ThrowExceptionTest {
    public static double quo(int n, int d)
        // 사전에 위의 위임 클래스가 예외를 처리할 것임을 알려줌
            throws DBZException {
        if(d == 0) {
            // throw를 사용하는 것은 예외처리를 수행할 수 있는
            // Exception 계열들을 배치하는 것이 좋다.
            throw new DBZException();
        }

        System.out.println("How ?");
        return (double) n / d;
    }
    public static void main(String[] args) {
        double result;

        try {
            result = quo(1, 0);
            // 실제로 DBZException 객체가 생성
        } catch (DBZException e) {
            System.out.println(e.toString());
        }

        System.out.println("Finish it!");
    }
}

//    class DEZException extends ArithmeticException{
//        public DBZException() {
//            super("0")
//        }
//    }
//public class ThrowExceptionTest {
//        // 아래 녀석을 서포트해줄 , throw
//    //여기서 처리
//    // 하우 나오게 하면 위로보내서 안나옴
//    // throw를 사용하는 것은 예외처리를 수행할 수 있는
//    // Excepton 계열들
//    //예ㄹ외가 발생하면 스로우로 보내겠다
//    // 아래의 케치의 디비가 받
//     public static double
//
//    // 문제가 없으면 리턴해
//    return
//    public static void main(String[] args) {
//        double reult;
//
//        //d=0 으로 나누면 나누면안되 나옴음
//        // 객체가 생성이 되면 위의 super로 가게됨
//        // 스로우랑 캐치
//        // 디비익셉션이 만들어지는 것은 throw new
//        // catch가 tosring으로 보냄??
//        //
//        try {
//            result =
//        }catch (DBZException e)
//    }
//}

//// 디비는 숫자연산했을 때 0으로 나누면 안되는 정보를 핸들링
//// 수퍼가 상위의 아르티메틱에게 알려줘 아르티메틱이 예외를 핸들링
