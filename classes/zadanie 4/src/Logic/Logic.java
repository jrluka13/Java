package Logic;

import Outer.Outer;
import Train.Train;
import Inputer.Inner;

public class Logic {

    public static Train[] sort_num(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].getNumOfTrain() > trains[j].getNumOfTrain()) {
                    int temp = trains[j].getNumOfTrain();
                    trains[j].setNumOfTrain(trains[i].getNumOfTrain());
                    trains[i].setNumOfTrain(temp);

                }
            }
        }
        return trains;

    }

    public static Train[] sort_punkt(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[i].getPunkt().compareTo(trains[j].getPunkt()) == 0) {
                    if (trains[i].getTime().compareTo(trains[j].getTime()) > 0) {
                        Train train = trains[j];
                        trains[j] = trains[i];
                        trains[i] = train;
                    } else if (trains[i].getPunkt().compareTo(trains[j].getPunkt()) > 0) {
                        Train train = trains[j];
                        trains[j] = trains[i];
                        trains[i] = train;
                    }

                }
            }
        }
        return trains;

    }


    public static String show_train(Train[] trains) {
        Outer.show("Enter num of train");
        int num = Inner.input();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getNumOfTrain() == num) {
                return trains[i].toString();
            }
        }
        return "Error";
    }


}
