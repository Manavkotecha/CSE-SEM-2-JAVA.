class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {

            System.out.println("Good Morning");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

                e.printStackTrace();
            }
            setPriority(10);
        }
    }
}

class MyThread2 extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {

            System.out.println("Good Afternon");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {

                e.printStackTrace();
            }
            setPriority(5);

        }

    }
}

public class Lab_9_1 {
    public static void main(String[] args) {
        MyThread myt1 = new MyThread();
        MyThread2 myt2 = new MyThread2();

        myt1.start();
        myt2.start();

    }
}