// Write a program that illustrates interface inheritance. Interface
// A is extended by A1 and A2. Interface A12 inherits from both P1
// and P2.Each interface declares one constant and one method. Class
// B implements A12.Instantiate B and invoke each of its methods.
// Each method displays one of the constants
interface P {
    final int p = 5;

    void dispP();
}

interface P1 extends P {
    final int p1 = 10;

    void dispP1();
}

interface P2 extends P {
    final int p2 = 20;

    void dispP2();
}

interface P12 extends P1, P2 {
    final int p12 = 12;

    void dispP12();
}

class Q implements P12 {
    public void dispP() {
        System.out.println("dispP: " + p1);
    }

    public void dispP1() {
        System.out.println("dispP1: " + p2);
    }

    public void dispP2() {
        System.out.println("dispP2: " + p12);
    }

    public void dispP12() {
        System.out.println("dispP12: " + p);
    }
}

public class Lab_7_2 {
    public static void main(String[] args) {
        Q q = new Q();
        q.dispP();
        q.dispP1();
        q.dispP2();
        q.dispP12();
    }
}
