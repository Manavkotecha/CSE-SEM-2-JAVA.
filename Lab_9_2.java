class Even extends Thread {

    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                if (i % 2 == 0) {
                    System.out.println("The number " + i + " is even ");
                    Thread.sleep(1000);
                } else {

                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.err.println(getId());
        }
    }
}

class Odd extends Thread {

    public void run() {
        for (int i = 0; i <= 20; i++) {
            try {
                if (i % 2 != 0) {
                    System.out.println("The number " + i + " is odd ");
                    Thread.sleep(1000);
                } else {

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

public class Lab_9_2 {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();

    }

}