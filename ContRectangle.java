public class ContRectangle {
    private double length;
    private double width;

    public ContRectangle(){
        length = 1.0;
        width = 1.0;
    }
    public ContRectangle(double len, double w) {
        length = len;
        width = w;
    }
    public double getLenght(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return length * width;
    }
}
