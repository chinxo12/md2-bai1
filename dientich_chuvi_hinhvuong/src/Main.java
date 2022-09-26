import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh hinh vuong");
        double a = scanner.nextDouble();
        double area = a*a;
        System.out.println("dien tich: " + area);
        double perimeter = a*4;
        System.out.println("chu vi: " +perimeter);


    }
}