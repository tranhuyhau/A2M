import java.util.Scanner;

public class _4b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double length = scanner.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double width = scanner.nextDouble();
        scanner.close();
        double area = length * width;

        System.out.println("Dien tich la: " + area);
    }
}

