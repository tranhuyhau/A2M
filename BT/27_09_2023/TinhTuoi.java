import java.util.Scanner;

public class TinhTuoi {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int year = input.nextInt();
    int c = (year%12);
    if(year<0 && c!=0)
         c = (year%12)+12;
    switch (c) {
        case 0:
            System.out.println("Than");
            break;
        case 1:
            System.out.println("Dau");
            break;
        case 2:
            System.out.println("Tuat");
            break;
        case 3:
            System.out.println("Hoi");
            break;
        case 4:
            System.out.println("Ti");
            break;
        case 5:
            System.out.println("Suu");
            break;
        case 6:
            System.out.println("Dan");
            break;
        case 7:
            System.out.println("Mao");
            break;
        case 8:
            System.out.println("Thin");
            break;
        case 9:
            System.out.println("Ti");
            break;
        case 10:
            System.out.println("Ngo");
            break;
        case 11:
            System.out.println("Mui");
            break;
    }
     System.out.println("Program end");
  }
}