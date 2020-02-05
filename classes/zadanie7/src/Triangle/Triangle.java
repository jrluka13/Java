package Triangle;

public class Triangle {
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1,Point p2,Point p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }

    @Override
    public String toString(){
        return "Triangle :" + "\n p1 x: " + getP1().getX() + " p1 y: " + getP1().getY()
                + "\n p2 x: " + getP2().getX() + " p2 y: " + getP2().getY()
                + "\n p3 x: " + getP3().getX() + " p3 y: " + getP3().getY();
    }
}
