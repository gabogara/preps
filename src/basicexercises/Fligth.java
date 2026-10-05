package basicexercises;

public class Fligth {
    private String name;
    private int passengers;
    private int seats;
    public Fligth(String name, int passengers, int seats) {}

    public boolean addPassengers(int passengers){
        if(passengers < this.seats){
            passengers = passengers + this.seats;
            return true;
        }
        return false;
    }
}
