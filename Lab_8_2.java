public class Lab_8_2 {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int[] arr = new int[a];

            for (int i = 0; i < a; i++) {
                arr[i] = Integer.parseInt(args[i + 1]);
                if (arr[i] < 0) {
                    throw new Exception(arr[i] + " must be positive");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide integers only.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not enough arguments provided.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
