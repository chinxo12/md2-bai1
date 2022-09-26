import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ketQua;
        System.out.println("nhập vào số thứ nhất: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vao so thu hai: ");
        double b = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("nhap vao phep toan (+,-.*,/)");
        char math = scanner.nextLine().charAt(0);
        switch (math){
            case '+' :
                ketQua = a + b;
                System.out.println("ket qua la: " + ketQua);
                break;
            case '-':
                ketQua = a - b;
                System.out.println("ket qua la: " + ketQua);
                break;
            case  '*':
                ketQua = a * b;
                System.out.println("ket qua la: " + ketQua);
                break;
            case '/':
                ketQua = a / b;
                System.out.println("ket qua la: " + ketQua);
                break;
        }
    }
}