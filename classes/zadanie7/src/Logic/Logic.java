package Logic;

import Triangle.Triangle;

public class Logic {

    public static double trS(Triangle t){
        return ((t.getP1().getX()-t.getP3().getX())*(t.getP2().getY()-
                t.getP3().getY())-(t.getP1().getY()-t.getP3().getY())*
                (t.getP2().getX()-t.getP3().getX()))/2;
    }

    public static double trP(Triangle t) {

        double ab = Math.sqrt(Math.pow(t.getP2().getX()-t.getP1().getX(), 2)+
                Math.pow(t.getP2().getY()-t.getP1().getY(), 2));

        double ac = Math.sqrt(Math.pow(t.getP3().getX()-t.getP1().getX(), 2)+
                Math.pow(t.getP3().getY()-t.getP1().getY(), 2));

        double bc = Math.sqrt(Math.pow(t.getP3().getX()-t.getP2().getX(), 2)+
                Math.pow(t.getP3().getY()-t.getP2().getY(), 2));

        return ab+ac+bc;

    }

    public static double findMedianX(Triangle t) {

        return (t.getP1().getX()+t.getP2().getX()+t.getP3().getX())/3;

    }

    public static double findMedianY(Triangle t) {

        return (t.getP1().getY()+t.getP2().getY()+t.getP3().getY())/3;

    }

}
