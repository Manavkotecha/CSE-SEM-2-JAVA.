import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    int[] subject_code;
    int[] subject_credits;
    char[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, int[] subject_code, int[] subject_credits,
            char[] grade_obtained) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = 0.0;
    }

    public void calculate_spi() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < no_of_subjects_registered; i++) {
            totalCredits += subject_credits[i];
            totalGradePoints += getGradePoint(grade_obtained[i]) * subject_credits[i];
        }

        spi = totalGradePoints / totalCredits;
    }

    double getGradePoint(char grade) {
        switch (grade) {
            case 'A':
                return 10.0;
            case 'B':
                return 8.0;
            case 'C':
                return 6.0;
            case 'D':
                return 4.0;
            case 'E':
                return 2.0;
            default:
                return 0.0;
        }
    }
}

public class Lab_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter ID number for student " + (i + 1) + ": ");
            int id_no = scanner.nextInt();

            System.out.print("Enter number of subjects registered for student " + (i + 1) + ": ");
            int no_of_subjects_registered = scanner.nextInt();

            int[] subject_code = new int[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            char[] grade_obtained = new char[no_of_subjects_registered];

            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.print("Enter subject code for subject " + (j + 1) + ": ");
                subject_code[j] = scanner.nextInt();

                System.out.print("Enter credits for subject " + (j + 1) + ": ");
                subject_credits[j] = scanner.nextInt();

                System.out.print("Enter grade obtained for subject " + (j + 1) + ": ");
                grade_obtained[j] = scanner.next().charAt(0);
            }

            students[i] = new Student(id_no, no_of_subjects_registered, subject_code, subject_credits, grade_obtained);
            students[i].calculate_spi();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " - ID: " + students[i].id_no + ", SPI: " + students[i].spi);
        }

        scanner.close();
    }
}