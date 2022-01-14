import org.junit.Before;
import org.junit.Test;
import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import things.Plane;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

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
    }

    @Test
    public void hasPilot() {
        assertEquals(Pilot.class, flight1.getPilot().getClass());
    }

    @Test
    public void hasCrew() {
        assertEquals(3, flight1.getCrewMembers().size());
    }

    @Test
    public void hasPassengers() {
        assertEquals(3, flight1.getPassengers().size());
    }

    @Test
    public void hasPlane() {
        assertEquals(Plane.BOEING747, flight1.getPlane());
    }

    @Test
    public void hasFlightNumber() {
        assertEquals("BA1272", flight1.getFlightNumber());
    }

    @Test
    public void hasDestination() {
        assertEquals("LAX", flight1.getDestination());
    }

    @Test
    public void hasDepartureAirport () {
        assertEquals("GLA", flight1.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime() {
        assertEquals("1300", flight1.getDepartureTime());
    }

    @Test
    public void canGetSpaceAvailable() {
        assertEquals(1, flight1.getAvailableSeats());
    }

    @Test
    public void canBookPassengerIfSpaceAvailable() {
        assertEquals("Passenger booked", flight1.bookPassenger(passenger1));
    }

    @Test
    public void cannotBookPassengerIfAtCapacity() {
        flight1.bookPassenger(passenger2);
        assertEquals("No space for passenger, booking declined.", flight1.bookPassenger(passenger1));
    }
}
