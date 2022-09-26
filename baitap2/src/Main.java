import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd, vnd;
        System.out.println("Nhập vào USD cần chuyển đổi");
        usd = scanner.nextDouble();
        vnd = usd * 23000;
        System.out.println("Chuyen duoc so tien la : " + vnd);
    }
}