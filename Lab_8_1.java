
public class Lab_8_1 {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int res = 1;
            for (int i = 0; i <= b; i++) {
                res = res * a;
            }
            System.out.println("The ANS is " + res);
            int c = a / b;
            System.out.println("The ANS is " + c);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}