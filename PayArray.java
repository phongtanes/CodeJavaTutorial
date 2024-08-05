import java.util.*;
public class PayArray {
    public static void main(String[] args) {
        final int Employees = 5;
        double payRatege;
        double grossPay;
        int [] hours = new int[Employees];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the hours of work by " +Employees+ "employees who all earn. ");
        for (int index = 0; index < Employees; index++){
            System.out.print("Employees # "+(index + 1 )+ " : ");
            hours[index] = in.nextInt();
        }
        System.out.print("Enter the hoursly pay rate for each Employees : ");
        payRatege = in.nextDouble();
        for (int index = 0; index < Employees; index++){
            grossPay = hours[index] + payRatege;
            System.out.println("Employees # "+(index + 1 )+ " : $ " +grossPay);
        }
    }
}