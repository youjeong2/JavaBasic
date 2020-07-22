package Fifth;

import java.util.Vector;

public class GenVectorTest {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<Object>();
        // 모든 정보 수용
        v.addElement(new Character('A'));
        v.addElement(new String("Hello"));
        v.addElement(new Integer(100));
        v.addElement(new Float(33.3f));

        System.out.println("size of Vector: " + v.size());
        v.insertElementAt(
                new Double(3.141592), 1);
        System.out.println("size of Vector: " + v.size());
        v.setElementAt("Hi", 3);
        System.out.println("size of Vector: " + v.size());

        System.out.println(
                "0번째: " + (Character)v.elementAt(0)
        );
        System.out.println(
                "1번째: " + (Double)v.elementAt(1)
        );
        System.out.println(
                "2번째: " + (String)v.elementAt(2)
        );
        System.out.println(
                "3번째: " + (String)v.elementAt(3)
        );
        System.out.println(
                "4번째: " + (Float)v.elementAt(4)
        );
    }
}
// ArrayList 뒤로 밀려남
// setElement 는 바꿔치기 
// 자바 자료구조 활용하기 
// 몇번째 바꿔 넣을 것인지