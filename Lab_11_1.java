import java.io.*;

public class Lab_11_1 {

    public static void main(String[] args) {
        String filename = "xyzz.txt";
        try {
            
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));

            bw.write("Anjali,19,A2-A3\n");
            bw.write("Yashvi,19,A2-A3\n");
            bw.write("Jagruti,18,A2-A3\n");
            bw.close();
            System.out.println("file made");

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String name_age[] = line.split(",");
                String name = name_age[0];
                String age_batch[] = line.split(",");
                String batch = age_batch[2];
                int age = Integer.parseInt(name_age[1]);
                Student_12 st = new Student_12(name, age, batch);
                System.out.println(st);
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

class Student_12 {
    String name;
    int age;
    String batch;

    Student_12(String name, int age, String batch) {
        this.name = name;
        this.age = age;
        this.batch = batch;
    }

    public String toString() {
        return "Name : " + name + " , Age : " + age + ", batch : " + batch;
    }
}