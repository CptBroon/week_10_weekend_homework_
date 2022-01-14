package people;

public class CabinCrewMember extends AbstractPerson{

    protected String rank;

    public CabinCrewMember(String _name, String rank) {
        super(_name);
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public String relayMessage(String messageToRelay) {
        return "Message relayed";
    }
}
