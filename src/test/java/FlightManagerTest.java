import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import things.Plane;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private Flight flight1;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private CabinCrewMember john;
    private CabinCrewMember natalie;
    private CabinCrewMember sarah;
    private ArrayList<Passenger> passengers;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private FlightManager flightManager;

    @Before
    public void before() {
        pilot = new Pilot("Simon", "Captain", "00001");

        john = new CabinCrewMember("John", "Flight Attendant");
        natalie = new CabinCrewMember("Natalie", "Flight Attendant");
        sarah = new CabinCrewMember("Sarah", "Flight Attendant");
        crewMembers = new ArrayList<>();
        crewMembers.add(john);
        crewMembers.add(natalie);
        crewMembers.add(sarah);

        passenger1 = new Passenger("James", 2);
        passenger2 = new Passenger("Jade", 1);
        passenger3 = new Passenger("Brogan", 2);
        passengers = new ArrayList<>();
        passengers.add(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);

        plane = Plane.BOEING747;

        flightNumber = "BA1272";

        destination = "LAX";

        departureAirport = "GLA";

        departureTime = "1300";

        flight1 = new Flight(pilot, crewMembers, passengers, plane, flightNumber, destination, departureAirport, departureTime);

        flightManager = new FlightManager(flight1);
    }

    @Test
    public void canCalculateReservedWeightForBaggage() {
        assertEquals(15000 ,flightManager.calculateReservedWeightForBaggage(), 0);
    }

    @Test
    public void canCalculateReservedWeightForBaggagePerPassenger() {
        assertEquals(50, flightManager.calculateReservedWeightForBaggagePerPassenger(), 0);
    }

    @Test
    public void canCalculateBookedPassengersBaggageWeight() {
        assertEquals(250, flightManager.calculateBookedPassengersBaggageWeight(), 0);
    }

    @Test
    public void canCalculateRemainingBaggageWeightAvailable() {
        assertEquals(14750, flightManager.calculateRemainingBaggageWeightAvailable(), 0);
    }
}
