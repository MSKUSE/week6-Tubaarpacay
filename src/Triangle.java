public class Triangle extends Shape{
    private int sideA, sideB,sideC;
    private Point location;

    public Triangle(Point location, int sideA, int sideB) {
        super(location);
        this.sideA = sideA;
        this.sideB = sideB;

    }


    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
    public double perimeter(){
        return sideA+sideB+sideC;
    }
    public double area(){
        return (sideA*sideB)/2 ;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", location=" + location +
                '}';
    }
}
