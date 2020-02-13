package Logic;

import Airline.Airline;
import Inputer.Inputer;
import Outer.Outer;

public class Logic {

    public static void find_for_punkt(Airline[] airlines) {

        Outer.show("Enter punkt: ");
        String str = Inputer.inputLine();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getPunkt().equals(str)) {
                Outer.show(airlines[i].getNumOfFlight());
            }
        }

    }

    public static void find_for_day(Airline[] airlines) {

        Outer.show("Enter day: ");
        String str = Inputer.inputLine();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getPunkt().equals(str)) {
                Outer.show(airlines[i].getNumOfFlight());
            }
        }

    }

    public static void find_for_days_time(Airline[] airlines) {

        Outer.show("Enter day: ");
        String str = Inputer.inputLine();
        Outer.show("Enter time_out: ");
        String time = Inputer.inputLine();
        for (int i = 0; i < airlines.length; i++) {
            if (airlines[i].getPunkt().equals(str)) {
                if(airlines[i].getTime_out().equals(time))
                Outer.show(airlines[i].getNumOfFlight());
            }
        }

    }


}
