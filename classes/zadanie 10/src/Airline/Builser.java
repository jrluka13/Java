package Airline;

import Inputer.Inputer;

public class Builser {

    public Nums_plane build(){

        Airline plane1 = new Airline(Inputer.inputLine(),Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine());
        Airline plane2 = new Airline(Inputer.inputLine(),Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine());
        Airline plane3 = new Airline(Inputer.inputLine(),Inputer.inputInt(),Inputer.inputLine(),Inputer.inputLine(),Inputer.inputLine());

        Nums_plane nums = new Nums_plane(plane1,plane2,plane3);

        return nums;

    }
}
