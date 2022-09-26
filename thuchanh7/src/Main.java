import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Nhap can nang cua ban (Don vi: Kg): ");
        weight = scanner.nextDouble();
        System.out.println("Nhap vao chieu cao ca ban (Don vi: m): ");
        height = scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        if (bmi<18){
            System.out.println("Gay");
        }else if (bmi < 25){
            System.out.println("binh thuong");
        }else if (bmi<30){
            System.out.println("beo");
        }else {
            System.out.println("beo phi");
        }
    }
}