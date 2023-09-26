import java.util.Scanner;

public class _4a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap centimet: ");
        
        double cmValue = scanner.nextDouble();

        scanner.close();
	
	final float QUY_DOI = 2.54f;
        double inchValue = cmValue / QUY_DOI;

        System.out.println(cmValue + " centimet bang " + inchValue + " inch.");
    }
}
