public class ConstructorDemo {
    public static void main(String[] args) {
    ContRectangle boxA = new ContRectangle(8.0, 12.0);
    ContRectangle boxB = new ContRectangle();
    
    System.out.println("the box's length is "+boxA.getLenght());
    System.out.println("the box's width is "+boxA.getWidth());
    System.out.println("the box's area is "+boxA.getArea());
    
    System.out.println("the box's length is "+boxB.getLenght());
    System.out.println("the box's width is "+boxB.getWidth());
    System.out.println("the box's area is "+boxB.getArea());
    }
}
