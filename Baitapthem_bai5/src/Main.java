import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap canh thu nhat");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh thu hai");
        double b = scanner.nextDouble();
        System.out.println("Nhap canh thu ba");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a){
            if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b){
                if (a==b || a==c|| b==c){
                    System.out.println("Day la 3 canh tam giac vuong can");
                }else {
                    System.out.println("Day la 3 canh cua tam giac vuong");
                }
            }
            else if (a==b && a==c){
                System.out.println("Day la 3 canh tam giac deu");
            }
            else if (a==b || a==c || b==c){
                System.out.println("Day la 3 canh cua tam giac can");
            }else {
                System.out.println("Day la 3 canh tam giac thuong");
            }
        }else {
            System.out.println("Day khong phai 3 canh cua tam giac");
        }
    }
}