package people;

public class Passenger extends AbstractPerson{

    private int numberOfBags;

    public Passenger(String _name, int numberOfBags) {
        super(_name);
        this.numberOfBags = numberOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
