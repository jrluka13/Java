package Airline;

public class Nums_plane {

    private Airline plane1;
    private Airline plane2;
    private Airline plane3;

    public Nums_plane(Airline plane1, Airline plane2, Airline plane3) {
        this.plane1 = plane1;
        this.plane2 = plane2;
        this.plane3 = plane3;
    }

    public Airline getPlane1() {
        return plane1;
    }

    public void setPlane1(Airline plane1) {
        this.plane1 = plane1;
    }

    public Airline getPlane2() {
        return plane2;
    }

    public void setPlane2(Airline plane2) {
        this.plane2 = plane2;
    }

    public Airline getPlane3() {
        return plane3;
    }

    public void setPlane3(Airline plane3) {
        this.plane3 = plane3;
    }

    @Override
    public String toString() {
        return
                "plane1: " + plane1 +
                "plane2: " + plane2 +
                "plane3: " + plane3 ;
    }
}
