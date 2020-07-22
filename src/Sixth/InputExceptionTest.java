package Sixth;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionTest {
    public static void main(String[] args) {
        int i = 0;
        Scanner scan = new Scanner((System.in));
        System.out.println("나이를 입력하세요");

        try {
            i = scan.nextInt();
        }catch(InputMismatchException e) {
            System.out.println("정수를 입려하세요!");
        }
        System.out.println("왓더 ");
    }

}
// 뭐냐! 치면 오류가 났는데
// try catch 미스매치가 이상한게  들어왔다 알려주고
// 정수 입력하라고 나옴
