import java.util.Scanner;

abstract class Vegetable {
    String color;

    public Vegetable(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vegetable: " + this.getClass().getSimpleName() + ", Color: " + color;
    }
}

class Potato extends Vegetable {
    public Potato(String color) {
        super(color);
    }
}

class Brinjal extends Vegetable {
    public Brinjal(String color) {
        super(color);
    }
}

class Tomato extends Vegetable {
    public Tomato(String color) {
        super(color);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the color of Potato: ");
        String potatoColor = scanner.nextLine();
        Potato potato = new Potato(potatoColor);

        System.out.print("Enter the color of Brinjal: ");
        String brinjalColor = scanner.nextLine();
        Brinjal brinjal = new Brinjal(brinjalColor);

        System.out.print("Enter the color of Tomato: ");
        String tomatoColor = scanner.nextLine();
        Tomato tomato = new Tomato(tomatoColor);

        System.out.println("Potato: " + potato.color);
        System.out.println("Brinjal: " + brinjal.color);
        System.out.println("Tomato: " + tomato.color);

        scanner.close();
    }
}
