import java.util.Scanner;

public class TrimName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter FullName: ");
        String fullName = sc.nextLine();
        String fisrtName = fullName.substring(fullName.trim().lastIndexOf(" ") + 1);
        String lastName = fullName.substring(0, fullName.trim().lastIndexOf(" "));
        System.out.println("Fisrtname: " + fisrtName);
        System.out.println("Lastname: " + lastName);
    }
}