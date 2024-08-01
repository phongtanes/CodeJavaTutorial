import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args) {
        int num1, num2, num3;
        double average;
        String input;
        char repeat;
        Scanner in = new Scanner(System.in);
        System.out.print("This Program calculates the average of three number");
        do{
            System.out.print("Enter the number #1: ");
            num1 = in.nextInt();
            System.out.print("Enter the number #2: ");
            num2 = in.nextInt();
            System.out.print("Enter the number #3: ");
            num3 = in.nextInt();
            average = (num1 + num2 + num3) / 3.0;
            System.out.println("The average of the three numbers is: " + average);
            System.out.println("Would you like to test again?");            
            System.out.print("Enter Y for Yes N for No :");    
            in.nextLine();
            input = in.nextLine();        
            repeat = input.charAt(0);
        } while(repeat == 'Y' || repeat == 'y');
    }
}
