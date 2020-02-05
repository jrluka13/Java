package Train;

public class Train {
    private String punkt;
    private int numOfTrain;
    private String time;

    public Train(String punkt,int numOfTrain,String time){
        this.numOfTrain = numOfTrain;
        this.punkt = punkt;
        this.time = time;
    }

    public String getPunkt() {
        return punkt;
    }

    public void setPunkt(String punkt) {
        this.punkt = punkt;
    }

    public int getNumOfTrain() {
        return numOfTrain;
    }

    public void setNumOfTrain(int numOfTrain) {
        this.numOfTrain = numOfTrain;
    }

    public String  getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString(){
                 return "Train: " + numOfTrain + "\nPunkt: " + punkt + "\nTime: " + time + "\n";
    }
    
}
