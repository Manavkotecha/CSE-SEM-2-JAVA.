import java.util.Scanner;

public class Bank_Account {
     int accountNo;
     String userName;
     String email;
     String accountType;
     double accountBalance;

    public Bank_Account(int accountNo, String userName, String email, String accountType, double accountBalance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.email = email;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void getAccountDetails() {
        System.out.println("Account Number: " + accountNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("--------------");
        getAccountDetails();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNo = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter User Name: ");
        String userName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Account Type: ");
        String accountType = scanner.nextLine();

        System.out.print("Enter Account Balance: ");
        double accountBalance = scanner.nextDouble();

        Bank_Account account = new Bank_Account(accountNo, userName, email, accountType, accountBalance);
        account.displayAccountDetails();

        scanner.close();
    }
}
