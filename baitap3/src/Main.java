import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vap so bat ky (0-999)");
        int number = scanner.nextInt();
        int tram = number/100;
        number = number%100;
        int chuc = number/10;
        int donVi = number%10;
        switch (tram){
            case 1:
                System.out.print("Một trăm ");
                break;
            case 2:
                System.out.print("Hai trăm ");
                break;
            case 3:
                System.out.print( "Ba trăm ");
                break;
            case 4:
                System.out.print("Bốn trăm ");
                break;
            case 5:
                System.out.print("Năm Trăm ");
                break;
            case 6:
                System.out.print("Sáu Trăm ");
                break;
            case 7:

                System.out.print("Bảy trăm ");
                break;
            case 8:

                System.out.print("Tám trăm");
                break;
            case 9:
                System.out.print("Chín trăm");
                break;
            default:
                System.out.print("Chờ học bài sau đã");
                break;
        }
        switch (chuc){
            case 0:
                System.out.print(" linh ");
                break;
            case 1:
                System.out.print("mười ");
                break;
            case 2:
                System.out.print("hai mươi ");
                break;
            case 3:
                System.out.print("ba mươi ");
                break;
            case 4:
                System.out.print("bốn mươi ");
                break;
            case 5:
                System.out.print("năm mươi ");
                break;
            case 6:
                System.out.print("sáu mươi ");
                break;
            case 7:
                System.out.print("bảy mươi ");
                break;
            case 8:
                System.out.print("tam mươi ");
                break;
            case 9:
                System.out.print("chín mươi ");
                break;
        }
        switch (donVi){
            case 1:
                System.out.print("một ");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 4:
                System.out.print("bốn ");
                break;
            case 5:
                System.out.print("năm ");
                break;
            case 6:
                System.out.print("sáu ");
                break;
            case 7:
                System.out.print("bảy ");
                break;
            case 8:
                System.out.print("tám ");
                break;
            case 9:
                System.out.print("chín ");
                break;
        }
    }
}