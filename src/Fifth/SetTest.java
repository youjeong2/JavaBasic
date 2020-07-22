package Fifth;

import java.util.HashSet;

public class SetTest {
    public static void main(String[] args) {
        String[] arr = {
                "milk", "bread", "cheese", "butter",
                "ham", "egg", "meat", "beef"
        };
        HashSet<String> set = new HashSet<String>();
        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
    }
}
// 정렬이 되어있지 않음
// vector은 insertset, 나머지는 add
