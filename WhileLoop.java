public class WhileLoop {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println("result in forLoop : "+i);
        }

        int iWhile = 1;
        while (iWhile <= 10) {
            System.out.println("result in whileLoop : "+iWhile);
            iWhile += 2 ;
        }
    }
}