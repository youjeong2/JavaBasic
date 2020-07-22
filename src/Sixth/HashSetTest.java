package Sixth;

import java.util.HashSet;
import java.util.Set;

// 2. 합집합, 교집합
// 벡엔드에서 데이터 분류할 때 유용 -> 중복된것은 받아들이지 않음
public class HashSetTest {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("A");

        Set<String> union = new HashSet<String>(s1);
        union.addAll((s2));

        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll((s2));

        System.out.println("합집합:" +union);
        System.out.println(("교집합:" + intersection));

    }
}
