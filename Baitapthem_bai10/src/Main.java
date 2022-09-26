import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so tien dien cu");
        int oldNumber = scanner.nextInt();
        System.out.println("Nhap so tien dien moi");
        int newNumber = scanner.nextInt();
        int chiSo = newNumber - oldNumber;
        int tienDien;
        if (chiSo<=50){
            tienDien = 10000 + chiSo*700;
            System.out.println("So tien can phai tra la: " + tienDien);
        }else if (chiSo<=100){
            tienDien = 10000 + 35000 + (chiSo-50)*900;
            System.out.println("So tien can phai tra la: " + tienDien);
        }else if (chiSo<=150){
            tienDien = 10000 + 35000 + 45000 + (chiSo-100)*1100;
            System.out.println("So tien can phai tra la: " + tienDien);
        }else {
            tienDien = 10000 + 35000 + 45000 + 55000 + (chiSo-150)*1300;
            System.out.println("So tien can phai tra la: " + tienDien);
        }
    }
}