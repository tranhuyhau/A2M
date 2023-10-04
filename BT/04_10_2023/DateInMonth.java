import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateInMonth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a month: ");
        String monthStr = sc.nextLine();

        if(monthStr.length() == 3 && Character.isUpperCase(monthStr.charAt(0))){
            int monthInt;
            switch (monthStr) {
                case "Jan":
                    monthInt = 1;
                    break;
                case "Feb":
                    monthInt = 2;
                    break;
                case "Mar":
                    monthInt = 3;
                    break;
                case "Apr":
                    monthInt = 4;
                    break;
                case "May":
                    monthInt = 5;
                    break;
                case "Jun":
                    monthInt = 6;
                    break;
                case "Jul":
                    monthInt = 7;
                    break;
                case "Aug":
                    monthInt = 8;
                    break;
                case "Sep":
                    monthInt = 9;
                    break;
                case "Oct":
                    monthInt = 10;
                    break;
                case "Nov":
                    monthInt = 11;
                    break;
                case "Dec":
                    monthInt = 12;
                    break;
                default:
                    monthInt = -1;
            }
            if(monthInt != -1){
                YearMonth yearMonth = YearMonth.of(year, monthInt);
                int daysInMonth = yearMonth.lengthOfMonth();
                System.out.print(monthStr + " " + year + " has " + daysInMonth + " days");
            }else{
                System.out.print("\"" + monthStr + "\"" + "is not a correct month name");
            }
        }else{
            System.out.print("\"" + monthStr + "\"" + "is not a correct month name");
        }
    }
}