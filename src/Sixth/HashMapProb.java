package Sixth;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapProb {
    public static void main(String[] args) {
        //인터저 샘플 많이 넣기 이해서 랜덤.200개 세팅
        final int START = 0;
        final int MAX = 200;
        final int RANGE = 51;
        final int BIAS = 10;

        Random rand = new Random();
        // 둘 다 정수임, 어떤 숫자가 몇번 반복되었기 때문에
        Map<Integer, Integer> m =
                new HashMap<Integer, Integer>();
        // 인티저 샘플 만들기, 클래스
        Integer[] samples = new Integer[MAX];

        // 샘플에 값밖기
        for(int i = START; i < MAX; i++) {
            samples[i] = rand.nextInt(RANGE) + BIAS;
        }// 여기까지 초기값 설정, 생성자로 들어가고 final은 클래스의 내부로(상수값이기 떄문)

        // 실제 빈도수 알려주는 것은 이 코드 4줄
        for(Integer sample: samples) {
            Integer freq = m.get(sample);
            m.put(sample, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + "개의 샘플이 있다.");
        System.out.println(m.containsKey(17));
        System.out.println(m.isEmpty());
        System.out.println(m);
    }
}
// 이런식으로 해시맵 활용
// 숫자들의 빈도수 보여주고 있음
// 빈도수 쓰는 건 해시맵이 최고,,,
// 벡터 쓰면 숫자쓰고, 갱신하고,,,

