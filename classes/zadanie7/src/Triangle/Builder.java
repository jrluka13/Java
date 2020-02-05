package Triangle;

import java.util.Random;

public class Builder {

    public Triangle create(){
        Random random = new Random();
        Point p1 = new Point(random.nextDouble()*10, random.nextDouble()*10);
        Point p2 = new Point(random.nextDouble()*10, random.nextDouble()*10);
        Point p3 = new Point(random.nextDouble()*10, random.nextDouble()*10);

        Triangle t = new Triangle(p1,p2,p3);
        return t;
    }

}
