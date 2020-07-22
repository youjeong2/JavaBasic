package Sixth;

class Bank {
    // Critical Section(크리티컬 섹션)
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    // 3000 * 1000 = 300 0000
    public void saveMoney(int save) {
        for(int i = 0; i < 1000; i++) {
            int m = this.getMoney();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.money = m + save;
            System.out.println("현재금액(save): " + this.money);
        }
    }

    // 1000 * 1000 = -100 0000
    public void useMoney(int minus) {
        for(int i = 0; i < 1000; i++) {
            int m = this.getMoney();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.money = m - minus;
            System.out.println("현재금액(use): " + this.money);
        }
    }

    public void changeMoney(int i) {
    }
}

class A extends Thread {
    public void run() {
        NoSyncTest.myPrivateBank.saveMoney(3000);
        System.out.println("saveMoney(3000): " +
                NoSyncTest.myPrivateBank.getMoney());
    }
}

class B extends Thread {
    public void run() {
        NoSyncTest.myPrivateBank.useMoney(1000);
        System.out.println("useMoney(1000): " +
                NoSyncTest.myPrivateBank.getMoney());
    }
}

public class NoSyncTest {
    public static Bank myPrivateBank = new Bank();

    public static void main(String[] args) {
        System.out.println("원금: " +
                myPrivateBank.getMoney());

        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}



//package Sixth;
//
//class Bank{
//    private
//    public
//}
//
//public void
//int
//try{
//        }catch
//        // 프라이빗이라서 내부에서 사용할 수 있음
//        this.money
//public void useMoney
//    int m = this.getMoney();
//try{
//    Thread.sleep(200);
//}catch(InterruptedException e){
//        e.printStackTrace();
//        }
//this.money = m - minus;
//// 뱅크객체 만들었으니 이녀석들을 사용할 스레드들 구성하기
//// 돈 넣는 곳
//class A extends Thread {
//    public void run() {
//
//    }
//}
//// 돈 빼내는 것
//class B extends Thread {
//    public void run() {
//
//    }
//}
//// 출력
//public class NoSync {
//    publc static Bank myPrivateBank = new Bank()
//}
//
//public class NoSyncTest {
//}
//// 무한루프 돌면서 경합 -> 데이터 꼬임
//// save
//// use
//// 크리티컬 문제
//// money -> 동기화 문제가 생김 -> 제거해보자!
