public class Circle {

    //private Point center;
    private int radius;

    public Circle( int radius) {
        //this.center = center;
        this.radius = radius;
    }
/*
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
*/
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0){
            this.radius = 0;
            System.out.println("Radius can't be negative");
        }else {
            this.radius = radius;

        }
    }

    @Override
    public String toString() {
        return "Circle{" +

                "location"+this.getRadius()+
                ", radius=" + radius +
                '}';
    }
    public double area(){
        System.out.println("shape class area");
        return Math.PI * this.radius * this.radius;
    }
    public double perimeter(){
        System.out.println("shape class perimeter method");
        return 2 * Math.PI * this.radius;
    }
}
