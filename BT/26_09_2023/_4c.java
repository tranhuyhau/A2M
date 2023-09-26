import java.util.Scanner;

public class _4c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap gia nhap hang: ");
        double giaNhap = scanner.nextDouble();

        System.out.print("Nhap thue suat VAT (%): ");
        double vat = scanner.nextDouble();

        scanner.close();
        double tongGiaTien = giaNhap + (giaNhap * vat / 100);

        System.out.println("Gia tien phai tra sau thue VAT la: " + tongGiaTien);
    }
}
