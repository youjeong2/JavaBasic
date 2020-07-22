package Sixth;

class Bank2 {
    // Critical Section(크리티컬 섹션)
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public synchronized void changeMoney(int money) {
        for(int i = 0; i < 1000; i++) {
            int m = this.getMoney();

            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            this.money = m + money;
            System.out.println("현재금액(save): " + this.money);
        }
    }

    // 3000 * 1000 = 300 0000
    public synchronized void saveMoney(int save) {
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
    // 이 메서드가 끝나기 전까지 들어오지 마능
    // 로그인 들어오면 락이 끝나야 들어올 수 있음
    // 한 연산 끝나기 전까지 다른 연산 못함
    public synchronized void useMoney(int minus) {
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
}

class C extends Thread {
    public void run() {
        //
//        NoSyncTest.myPrivateBank.saveMoney(1000);
        SyncTest.myPrivateBank.changeMoney(1000);
        System.out.println("saveMoney(1000): " +
                SyncTest.myPrivateBank.getMoney());
    }
}

class D extends Thread {
    public void run() {
//        NoSyncTest.myPrivateBank.useMoney(1000);
        SyncTest.myPrivateBank.changeMoney(-1000);
        System.out.println("useMoney(1000): " +
                SyncTest.myPrivateBank.getMoney());
    }
}

public class SyncTest {
    public static Bank2 myPrivateBank = new Bank2();

    public static void main(String[] args) {
        System.out.println("원금: " +
                myPrivateBank.getMoney());

        C c = new C();
        D d = new D();

        c.start();
        d.start();

        try{
            c.join();
            d.join();
        }catch (Exception e){

        }

        System.out.println("end money : " + SyncTest.myPrivateBank.getMoney());
    }
}


//package Sixth;
///
//public class SyncTest {
//}
// 실질적으로 수정해야할 부분
// synchronized로 동기화
// synchronized  파이썬에서 가져오는건 상관없는데
// 락이 전체 구간에 걸려있음
// 쓰레드가 돌면 락이 걸려있는상태로 for 문이 돌게됨
// 보호를 못함;;
// 메서드 자체에 싱크 거니까 포문이 보호가 안되었음(포문밖
// no는 루프안에서 도니까 싱크가 고정이 됨 만원이 유지가 됨(포문안)