package Sixth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        // 확률 분포중 균일 분포를 따름
        // (즉 모든 값이 나올 확률이 골고루 있음)
        Collections.shuffle(list);
        System.out.println(list);
    }
}
    // 셔플 하기 전 후 비교
    // 확률 분포 중 균일 분포를 따름
    // (즉 모든 값이 나올 확률이 골고루 있음)
    // 컬렉션에 재미있는 기능들~

    // 데이터를 탐색하는 것 중 가장 빠른 것?
    // 해쉬는 찾는게 있을 때 바로 매칭
    // 해쉬는 상대방이 무엇을 찾고 싶은지 알고 있을 때

    // 모든 데이터를 빠르게 순회해야할 때는?
    // 상대방이 무엇을 찾고 싶은지 모를 때는?
    // 트리의 구성
    // 2^32 42억개의 데이터를 검색하는데 32번으로 할 수 있음

    // 2진수 32^-1
    //

