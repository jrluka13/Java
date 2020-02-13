package Airline;

public class Airline {

    private String punkt;
    private int numOfFlight;
    private String type_plane;
    private String time_out;
    private String days_week;

    public Airline(String punkt, int numOfFlight, String type_plane, String time_out, String days_week) {
        this.punkt = punkt;
        this.numOfFlight = numOfFlight;
        this.type_plane = type_plane;
        this.time_out = time_out;
        this.days_week = days_week;
    }

    public String getPunkt() {
        return punkt;
    }

    public void setPunkt(String punkt) {
        this.punkt = punkt;
    }

    public int getNumOfFlight() {
        return numOfFlight;
    }

    public void setNumOfFlight(int numOfFlight) {
        this.numOfFlight = numOfFlight;
    }

    public String getType_plane() {
        return type_plane;
    }

    public void setType_plane(String type_plane) {
        this.type_plane = type_plane;
    }

    public String getTime_out() {
        return time_out;
    }

    public void setTime_out(String time_out) {
        this.time_out = time_out;
    }

    public String getDays_week() {
        return days_week;
    }

    public void setDays_week(String days_week) {
        this.days_week = days_week;
    }

    @Override
    public String toString() {
        return
                "punkt='" + punkt + '\'' +
                ", numOfFlight=" + numOfFlight +
                ", type_plane='" + type_plane + '\'' +
                ", time_out='" + time_out + '\'' +
                ", days_week='" + days_week + '\'' + "\n";
    }
}
