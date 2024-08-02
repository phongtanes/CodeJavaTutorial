public class DemoArg {
    public static void main(String[] args) {
        System.out.println("start in main.");
        int tesetNum = 10;
        int total;
        displayValue(num:5);
        displayValue(tesetNum);
        displayValue(tesetNum * 5);
        total = showSum(x:3, y:4);
        System.out.println("total = " + total);
    }
    public static void displayValue(int num){
        System.out.println("Value is " + num);
    }
    public static int showSum(int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }
    }
