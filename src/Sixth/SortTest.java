package Sixth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
    public static void main(String[] args) {
        String[] sample = {
                "I", "say", "you", "test"
        };
        // 배열을 리스트로 변경한 것이다.(asList)
        List<String> list = Arrays.asList(sample);
        // 자바 자료구조인 Collections에 있는
        // 소팅을 활용하여 정렬을 수행한다.
        // 컬렉션에 소트라는 메서드가 단순하게 작업할 수 있게 해
        Collections.sort(list);

        System.out.println(list);
    }
}


