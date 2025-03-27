public class Rectangle extends Shape{
    private Point topLeft;
    private int sideA , sideB;
    private Point location;

    public Rectangle(Point location,int sideA,int sideB){
        super(location);
        setSideA(sideA);
        setSideB(sideB);
    }

/*
    private Point topLeft;
    private int sideA , sideB;

    public static int counter=0;
    public int counterforobject=0;
    public static String class_name="Rectangle";
    public Rectangle(Point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterforobject++;
    }

    public Rectangle(Point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
        counter++;
        counterforobject++;
    }
*/
    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA < 0){
            throw new IllegalArgumentException("side A can't  be negative");

        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            throw new IllegalArgumentException("Side B can't be negative");
        } else {
            this.sideB = sideB;
        }
    }
    public double perimeter(){
        return 2 * (sideA + sideB);
    }
    public double area(){
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "location"+this.getLocation()+
                "topLeft=" + topLeft +
                ", sideA=" + sideA +
                ", sideB=" + sideB +
                ", counterforobject=" +
                '}';
    }


}
