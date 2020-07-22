package Sixth;

class Bank3 {
    // Critical Section(크리티컬 섹션)
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    // 3000 * 1000 = 300 0000
    public void saveMoney(int save) {
        int m = this.getMoney();

        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.money = m + save;
    }

    // 1000 * 1000 = -100 0000
    public void useMoney(int minus) {
        int m = this.getMoney();
        try {
            Thread.sleep(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.money = m - minus;
    }
}

// for문 밖에 synchro를 걸 경우 데이터의 보호가 불완전할 수 있다.
// 그러므로 실질적인 연산을 수행하는 경우에 대해서
// 건 바이 건으로 대응하도록 lock을 걸어 문제를 해결하도록 한다.
class X extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++) {
            // 이 연산만 락을 함 -> 특정연산만 보호를 하겠다
            // 로그인이 들어오면 할 수 있음
            // syncronized할 때 적재적소에만 지정하기
            // 엎치락 뒤치락 하면서 다른 연산도 같이
            synchronized (RealSync.myPrivateBank) {
                RealSync.myPrivateBank.saveMoney(3000);
            }
            System.out.println("saveMoney(3000): " +
                    RealSync.myPrivateBank.getMoney());
        }
    }
}

class Y extends Thread {
    public void run() {
        for(int i = 0; i < 1000; i++) {
            synchronized (RealSync.myPrivateBank) {
                RealSync.myPrivateBank.useMoney(3000);
            }
            System.out.println("saveMoney(3000): " +
                    RealSync.myPrivateBank.getMoney());
        }
    }
}

public class RealSync {
    public static Bank3 myPrivateBank = new Bank3();

    public static void main(String[] args) {
        System.out.println("원금: " +
                myPrivateBank.getMoney());

        X x = new X();
        Y y = new Y();

        x.start();
        y.start();
    }
}

// 자바 씹어먹기 숙제 ( 조건, 클래스를 작성하자 !)
// 0. 복습...
// 1. 자바로 y = exp(x) 정적분을 구현해보자~
// 2. Thread를 사용해서  y = exp(x) 정적분을 구현해보자 ~



// package Sixth;


// X. Y에 sync 걸기
// for(;;)

// for문 밖에 synchro를 걸 경우 데이터의 보호가 불완전할 수 있다.
// 그러므로 실질적인 연산을 수행하는 경우에 대해서
// 건바이 건으로 대응하도록 lock을 걸어 문제를 해결하도록 한다.

// public class RealSync {
