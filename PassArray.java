import java.util.*;
public class PassArray {
    public static void main(String[] args) {
        final int ARRAY_SIZE = 4;
        int[] numbers = new int[ARRAY_SIZE];
        getValues(numbers);
    }
    private static void  getValues(int[] array){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aseries of " +array.length+ "numbers");
        for(int index = 0; index < array.length; index++){
            System.out.print("Enter number " +(index + 1) + " : ");
            array[index] = in.nextInt();
        }
    }
    private static void showArray(int[] array){
        for(int index = 0; index < array.length; index++){
            System.out.print(array[index] + " ");
        }
    }
    
}
