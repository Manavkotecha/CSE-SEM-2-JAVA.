public class ReverseStringBuilderMain {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("keham evol enimsaj");
        for (int i = 0; i < sb.length() / 2; i++) {

            int front = i;
            int back = sb.length() - i - 1;

            char firstChar = sb.charAt(front);
            char lastChar = sb.charAt(back);

            sb.setCharAt(front, lastChar);
            sb.setCharAt(back, firstChar);

        }
        System.out.print(sb);

    }
}