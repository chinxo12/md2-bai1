import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so giay");
        int number = scanner.nextInt();
        int hour = number/3600;
         number = number%3600;
         int minute = number/60;
        int second = number%60;
        System.out.println("Ban da nhap vao " + hour + " gio " + minute + " phut: " + second + " Giay: ");
    }
}