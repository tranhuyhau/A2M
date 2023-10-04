import java.util.Scanner;

public class CalculateWages{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee\'s name: ");
        String name = sc.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        float hoursInWeek = sc.nextFloat();
        System.out.print("Enter hourly pay rate: ");
        float hourlyPay  = sc.nextFloat();
        System.out.print("Enter federal tax withholding rate: ");
        float federalTax = sc.nextFloat();
        System.out.print("Enter state tax withholding rate: ");
        float stateTax = sc.nextFloat();
        float grossPay = hoursInWeek*hourlyPay;
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursInWeek);
        System.out.println("Pay Rate: $" + hourlyPay);
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println(" Federal Withholding (20.0%): $" + grossPay*federalTax);
        System.out.println(" State Withholding (9.0%): $" + grossPay*stateTax);
        System.out.println(" Total Deduction: $" + ((grossPay*federalTax)+(grossPay*stateTax)));
        System.out.println("Net Pay: $" + (grossPay-((grossPay*federalTax)+(grossPay*stateTax))));
    }
}