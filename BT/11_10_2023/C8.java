import java.util.Scanner;

public class C8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input;
        String numbers = "";
        int max = 0, dem = 0;
        System.out.println("Nhap so nguyen: ");
        do{
            input = sc.nextInt();
            numbers += input + " ";
            max = soNguyenLonNhat(input, max);
            if(input >= max){
                if(input>max)
                    dem = 0;
                dem++;
            }
        }while(input != 0);
        System.out.println("Cac so nguyen da nhap: " + numbers);
        System.out.println("Cac so nguyen lon nhat la: " + max + " va so lan xuat hien cua " +  max + " la " + (dem-1));
    }

    public static int soNguyenLonNhat(int input, int max){
        if(input >= max){
            max = input;
        }
        return max;
    }
}