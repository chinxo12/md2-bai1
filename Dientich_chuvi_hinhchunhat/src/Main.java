import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai ");
        double height = scanner.nextDouble();
        System.out.println("Nhap vào chieu rộng");
        double width = scanner.nextDouble();
        double area = height*width;
        System.out.println("diện tích: " + area);
        double premeter = (height+width)*2;
        System.out.println("chu vi: " + premeter);
    }
}