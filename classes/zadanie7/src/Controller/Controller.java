package Controller;

import Logic.Logic;
import Outer.Outer;
import Triangle.Builder;
import Triangle.Triangle;

public class Controller {

    public  void control(){

        Builder builder= new Builder();
        Triangle t = builder.create();

        Outer.show(t.toString());

        if(Logic.trS(t) <=0){
            Outer.show("Error in creating");
        }
        else{
            Outer.show("S: " + Logic.trS(t));
            Outer.show("P: " + Logic.trP(t));
            Outer.show("Median \nX: " + Logic.findMedianX(t)
                    + "\nMedian \nY: " + Logic.findMedianY(t));

        }



    }
}
