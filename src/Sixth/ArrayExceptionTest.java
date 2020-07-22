package Sixth;

    public class ArrayExceptionTest {
        // 배열의 법위를 벗어났습니다를 핸들링해주는 녀석
        // 9가지니까 11하면 오류나야하는데 어레이 인덱스가 범위 벗어났으니까 잘 맞춰라고 나옴
        // 다른 값 처리하게 하려면 와일 값, 흘러가고 끝나는것이 아니라 기존 값을 다시 넣어야 하는 경우면
        public static void main(String[] args) {
            int[] arr = new int[10];

            try {
                arr[-1] = 100;
                // 배열의 할당된 크기 이상의 작업을 수행하려고 할 때 발생한다.
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("범위 벗어났으니까 잘 맞춰라.");
            }

            System.out.println("왓 더");
        }
    }