package Controller;

import Logic.Logic;
import Outer.Outer;
import Train.Train;

public class Controller {

    public void control(){

        Train train1 = new Train("Gomelik",4,"13:35");
        Train train2 = new Train("Minsk",3,"19:35");
        Train train3 = new Train("Gomel",9,"12:45");
        Train train4 = new Train("Grodno",10,"16:35");
        Train train5 = new Train("Bukaveli",5,"12:35");

        Train[] trains = {train1,train2,train3,train4,train5};

        //Outer.show(Logic.sort_num(trains));
        Outer.show(Logic.sort_punkt(trains));
        //Outer.show(Logic.show_train(trains));


    }
}
