package Fifth;


import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Milk");
        list.add("grape") ;
        list.add("apple");

        list.add(1, "butter");
        list.add(2, "strawberry");

        list.remove(3);

        for(int i = 0; i< list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private void add(String apple) {
    }
}

/* 문제 3.
* 10 
 */