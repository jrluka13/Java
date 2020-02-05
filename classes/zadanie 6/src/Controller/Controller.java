package Controller;

import Inputer.Inner;
import Outer.Outer;
import Time.Time;

public class Controller {

    public void control(){
        Time time = new Time(9,24,32);

        while (true){
            Outer.Show("What you want: " + "\n1. Change hours" + "\n2. Change minutes" + "\n3. Change seconds"
                    + "\n4. Show time" + "\n5. Exit");
            int k = Inner.input();
            switch (k){
                case 1:
                Outer.Show("Enter value\n");
                    time.setHours(Inner.input());
                break;
                case 2:
                    Outer.Show("Enter value\n");
                    time.setMin(Inner.input());
                    break;
                case 3:
                    Outer.Show("Enter value\n");
                    time.setSec(Inner.input());
                    break;
                case 4:
                    Outer.Show(time.toString());
                    break;
                case 5:
                    return;


            }
        }
    }

}
