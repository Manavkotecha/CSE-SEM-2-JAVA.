import java.util.*;

class Time {
  int h;
  int m;
  int s;

  public void add(Time t1, Time t2) {
    h = t1.h + t2.h;
    m = t1.m + t2.m;
    s = t1.s + t2.s;

  }
}

public class Lab_5_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Time t1 = new Time();
    System.err.println("Enter Hour-1:");
    t1.h = sc.nextInt();
    System.err.println("Enter Minutes-1:");
    t1.m = sc.nextInt();
    System.err.println("Enter Second-1:");
    t1.s = sc.nextInt();

    Time t2 = new Time();
    System.err.println("Enter Hour-2:");
    t2.h = sc.nextInt();
    System.err.println("Enter Minutes-2:");
    t2.m = sc.nextInt();
    System.err.println("Enter Second-2:");
    t2.s = sc.nextInt();

    Time t3 = new Time();
    t3.add(t1, t2);
    System.err.println("Hour: " + t3.h);
    System.err.println("Minutes: " + t3.m);
    System.err.println("Second:  " + t3.s);
    sc.close();
  }
}
