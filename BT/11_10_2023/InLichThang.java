import java.util.Scanner;

public class InLichThang{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thang(1-12): ");
        int month = sc.nextInt();
        System.out.print("Nhap so nam(>=1800): ");
        int year = sc.nextInt();
        InLichThang(month, year);
    }

    public static void InLichThang(int month, int year){
        int day = 1;
        int thuTrongTuan = xacDinhThu(month, year);
        if(thuTrongTuan == -1)
            System.out.println("Sai thong tin!");
        else{
            int soNgayTrongThang = soNgayTrongThang(month, year);
            System.out.println("Thang " + month + " Nam " + year);
            System.out.println("----------------------------");
            System.out.println("CN\tT1\tT3\tT4\tT5\tT6\tT7");
            for(int i=0; i<7; i++){
                if(i<thuTrongTuan)
                    System.out.print("\t");
                else
                    System.out.print(day++ + "\t");
            }
            System.out.println("");
            while(day<=soNgayTrongThang){
                for(int i=0; i<7; i++){
                    if(day<=soNgayTrongThang)
                        System.out.print(day++ + "\t");
                }
                System.out.println("");
            }
        }
    }

    public static int xacDinhThu(int month, int year){
        int doomsday_end_2_1800 = 5;
        if(year > 1800){
            for(int i = 1801; i<=year; i++){
                if(doomsday_end_2_1800 == 6){
                    doomsday_end_2_1800 = -1;
                }
                if(isLeapYear(i))
                    if(doomsday_end_2_1800 == 5)
                        doomsday_end_2_1800 = 0;
                    else
                        doomsday_end_2_1800 += 2;
                else
                    doomsday_end_2_1800 +=1;
            }
        }
        if(year < 1800)
            return -1;
        int start_month;
        switch(month){
            case 1:
                if(isLeapYear(year)){
                    if(doomsday_end_2_1800 == 0)
                        start_month = 4;
                    else if(doomsday_end_2_1800 == 1)
                        start_month = 5;
                    else if(doomsday_end_2_1800 == 2)
                        start_month = 6;
                    else
                        start_month = doomsday_end_2_1800 - 3;
                }
                else{
                    if(doomsday_end_2_1800 == 0)
                        start_month = 5;
                    else if(doomsday_end_2_1800 == 1)
                        start_month = 6;
                    else
                        start_month = doomsday_end_2_1800 - 2;
                }
                break;
            case 2:
                if(isLeapYear(year))
                    start_month = doomsday_end_2_1800;
                else if(doomsday_end_2_1800 == 6)
                    start_month = 0;
                else
                    start_month = doomsday_end_2_1800 + 1;
                break;
            case 3:
            case 11:
                if(doomsday_end_2_1800 == 6)
                    start_month = 0;
                else
                    start_month = doomsday_end_2_1800 + 1;
                break;
            case 4:
            case 7:
                if(doomsday_end_2_1800 == 3)
                    start_month = 0;
                else if(doomsday_end_2_1800 == 4)
                    start_month = 1;
                else if(doomsday_end_2_1800 == 5)
                    start_month = 2;
                else if(doomsday_end_2_1800 == 6)
                    start_month = 3;
                else
                    start_month = doomsday_end_2_1800 + 4;
                break;
            case 5:
                if(doomsday_end_2_1800 == 0)
                    start_month = 6;
                else
                    start_month = doomsday_end_2_1800 - 1;
                break;
            case 6:
                if(doomsday_end_2_1800 == 6)
                    start_month = 1;
                else if(doomsday_end_2_1800 == 5)
                    start_month = 0;
                else
                    start_month = doomsday_end_2_1800 + 2;
                break;
            case 8:
                start_month = doomsday_end_2_1800;
                break;
            case 9:
            case 12:
                if(doomsday_end_2_1800 == 6)
                    start_month = 2;
                else if(doomsday_end_2_1800 == 5)
                    start_month = 1;
                else if(doomsday_end_2_1800 == 4)
                    start_month = 0;
                else
                    start_month = doomsday_end_2_1800 + 3;
                break;
            case 10:
                if(doomsday_end_2_1800 == 0)
                    start_month = 2;
                else if(doomsday_end_2_1800 == 1)
                    start_month = 6;
                else
                    start_month = doomsday_end_2_1800 - 2;
                break;
            default:
                start_month = -1;
        }
        return start_month;
    }

    public static int soNgayTrongThang(int month, int year){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        else if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else
            return isLeapYear(year) ? 29 : 28;
    }

    public static boolean isLeapYear(int year){
        if(year%4 == 0 && year%100 != 0)
            return true;
        else if(year%400 == 0)
            return true;
        else
            return false;
    }
}