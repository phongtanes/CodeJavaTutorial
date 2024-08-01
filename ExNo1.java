public class ExNo1 {
    public static void main(String[] args) {
        int start = 1;
        int end = 50;
        System.out.println("Even numbers in the range from " + start + " to " + end + ":");
        
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
