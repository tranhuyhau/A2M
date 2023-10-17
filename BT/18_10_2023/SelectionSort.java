
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Phan tu " + (i + 1) + " : ");
			a[i] = sc.nextInt();
		}
		sort(a, 0);
		for (int i = 0; i < n; i++) {
			System.out.printf("%3s", a[i]);
		}
	}

	public static void sort(int[] arr, int vitri) {
		if (vitri < arr.length) {
			int min = arr[vitri];
			int vitri2 = vitri;
			for (int i = vitri + 1; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					vitri2 = i;
				}
			}
			arr[vitri2] = arr[vitri];
			arr[vitri] = min;
			sort(arr, ++vitri);
		}
	}
}
