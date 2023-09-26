import java.util.Scanner;

public class _4e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap luong tieu thu cua xe xe (lit/100km): ");
        double tieuThuXang = scanner.nextDouble();

        System.out.print("Nhap Khong cach quang duong (km): ");
        double khoangCach = scanner.nextDouble();

        System.out.print("Nhap gia xang (gia/lit): ");
        double giaXang = scanner.nextDouble();

        scanner.close();

        double chiPhiPhaiTra = (khoangCach / 100) * tieuThuXang * giaXang;

        System.out.println("So tien can phai tra: " + chiPhiPhaiTra + " dong.");
    }
}
