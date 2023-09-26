import java.util.Scanner;

public class _4d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so giay: ");
        int tongSoGiay = scanner.nextInt();

        scanner.close();

        int gio = tongSoGiay / 3600; 
        int giayConLai = tongSoGiay % 3600;
        int phut = giayConLai / 60;
        int giay = giayConLai % 60;

        System.out.println( gio + " Gio " + phut + " phut " + giay + " giay.");
    }
}
