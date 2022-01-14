package people;

public class Pilot extends CabinCrewMember{

    private String licenceNumber;

    public Pilot(String _name, String rank, String licenceNumber) {
        super(_name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String flyPlane() {
        return "Successfully flown plane";
    }
}
