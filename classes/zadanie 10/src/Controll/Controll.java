package Controll;

import Airline.Airline;
import Airline.Builser;
import Airline.Nums_plane;
import Logic.Logic;
import Outer.Outer;

public class Controll {

    public void control(){

        Builser builder = new Builser();
        Nums_plane nums = builder.build();
        Airline[] airlines = {nums.getPlane1(),nums.getPlane2(),nums.getPlane3()};
        Outer.show(nums.toString());
        Outer.show("-----------------------------------------------------------------------------------------------------------------");
        Logic.find_for_punkt(airlines);
        Outer.show("-----------------------------------------------------------------------------------------------------------------");
        Logic.find_for_day(airlines);
        Outer.show("-----------------------------------------------------------------------------------------------------------------");
        Logic.find_for_days_time(airlines);
    }
}
