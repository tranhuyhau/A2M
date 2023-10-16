import java.util.Scanner;

public class Descartes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 10 diem: ");
        double[][] input = new double[10][2];

        for(int i=0; i<input.length; i++){
            for(int j=0; j<input[0].length; j++){
                System.out.printf("input[%d][%d]= ", i, j);
                input[i][j] = sc.nextFloat();
            }
            System.out.println();
        } 

        for(int i=0; i<input.length; i++){
            System.out.print("(");
            for(int j=0; j<input[0].length; j++){
                System.out.printf("%10.2f", input[i][j]);
            }
            System.out.println(" )");
        }
        double min = 999, max = 0;

        for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				double khoangCach = Math.sqrt(Math.pow(input[j][0] - input[i][0], 2) + Math.pow(input[j][1] - input[i][1], 2));
				if (khoangCach > max)
					max = khoangCach;
				if (khoangCach < min)
					min = khoangCach;
			}
		}

        for (int i = 0; i < input.length - 1; i++) {
			for (int j = i + 1; j < input.length; j++) {
				double khoangCach = Math.sqrt(Math.pow(input[j][0] - input[i][0], 2) + Math.pow(input[j][1] - input[i][1], 2));
				if (khoangCach == max)
					System.out.printf("Toa do (%.2f;%f) va (%.2f;%.2f) co khoang cach dai nhat la: %f\n", input[i][0], input[i][1], input[j][0], input[j][1], max);
				if (khoangCach == min)
					System.out.printf("Toa do (%.2f;%f) va (%.2f;%.2f) co khoang cach ngan nhat la: %f\n", input[i][0], input[i][1], input[j][0], input[j][1], min);
			}
		}
    }
// d = sqrt((x2 - x1)^2 + (y2 - y1)^2)
}