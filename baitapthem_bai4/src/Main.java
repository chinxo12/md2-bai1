import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String studentId = "SV001", studentName = "Nguyen Van A", email = "chinxo12@gmail.com", address = "tang 7 thap A toa nha song da";
//        int age = 22;
//        boolean
        Scanner scanner = new Scanner(System.in);
        System.out.println("student id: ");
        String studentId = scanner.nextLine();
        System.out.println("student name");
        String studentName = scanner.nextLine();
        System.out.println("Age: ");
        int age =  scanner.nextInt();
        scanner.nextLine();
        System.out.println("gender (Male/Female)");
        String gender = scanner.nextLine();
        System.out.println("Email:");
        String email = scanner.nextLine();
        System.out.println("phone");
        String phone = scanner.nextLine();
        System.out.println("Address");
        String address = scanner.nextLine();
        System.out.println("*******************STUDENT INFOMATION*********************");
        System.out.printf("%12s%6s %13s%12s %6s%3d \n", "Student ID: ",studentId, "Student Name: " , studentName, "Age: ", age);
        System.out.printf("%12s%6s %13s%12s %6s%10s \n", "Gender:     ",gender,    "Email: ", email,         "Phone: ", phone );
        System.out.printf("%12s%50s",  "Address:    " , address);
    }
}