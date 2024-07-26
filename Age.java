import java.util.Scanner;
    public class Age {
    public static void main(String[] args) {
        final int AGE = 20;
        int inputAge;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        inputAge = scan.nextInt();
        System.out.println("You Entered :" +inputAge);
        if (inputAge < 20) {
            System.out.println("You are still young");
        }

    }
}
