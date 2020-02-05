package Time;

public class Time {

    private int hours;
    private int min;
    private int sec;

    public Time(int hours,int min,int sec){
        this.hours = hours;
        this.min = min;
        this.sec = sec;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if(sec>59 || sec <0){
            System.out.println("Error with seconds");
            this.sec = 0;
        }else
            this.sec = sec;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        if(min>59 || min <0){
            System.out.println("Error with minutes");
            this.min = 0;
        }else
            this.min = min;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>23 || hours <0){
            System.out.println("Error with hours");
            this.hours = 0;
        }else
            this.hours = hours;
    }

    @Override
    public String toString(){
        return hours + ":" + min + ":" + sec;
    }
}
