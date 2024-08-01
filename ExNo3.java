public class ExNo3 {
    public static void main(String[] args) {
        int multiplier = 8;
        System.out.println("Multiplication table of the number " + multiplier + ":");
        
        for (int i = 1; i <= 12; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);
        }
    }
}
