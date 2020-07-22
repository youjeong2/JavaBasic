package Sixth;

public class FinallyTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            arr[1] = 100;
            // 배열의 할당된 크기 이상의 작업을 수행하려고 할 때 발생한다.
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("범위 벗어났어.");
        } finally {
            System.out.println("finally");
            arr = null;
        }

        System.out.println("나온다");
    }
}



// 작성한 메서드에서 에러나는 경우가 많음
// 메인이 아닌 메서드에서
