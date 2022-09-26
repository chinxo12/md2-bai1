import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang muon kiem tra (1-12)");
        Byte month = scanner.nextByte();
        System.out.println("Nhap Nam muon kiem tra");
        int year = scanner.nextInt();
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        switch (month){
            case 2:
                if (isLeapYear){
                    System.out.println("Thang 2 co: 29 ngay");
                    break;
                }else {
                    System.out.println("Thang 2 " + "Nam " + year +  " co: 28 ngay");
                    break;
                }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang " + month + "Nam " +year+ " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + month + "Nam " +year+  " Có 30 ngày");
                break;
            default:
                System.out.println("This month doesn't exist!");
        }
    }
}