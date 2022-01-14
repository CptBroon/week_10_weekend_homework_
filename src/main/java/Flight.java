import people.CabinCrewMember;
import people.Passenger;
import people.Pilot;
import things.Plane;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot,
                  ArrayList<CabinCrewMember> crewMembers,
                  ArrayList<Passenger> passengers,
                  Plane plane,
                  String flightNumber,
                  String destination,
                  String departureAirport,
                  String departureTime) {
        this.pilot = pilot;
        this.crewMembers = crewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCrewMembers() {
        return crewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getAvailableSeats() {
        int space;
        space = plane.getCapacity() - passengers.size();
        return space;
    }

    public boolean spaceForPassenger() {
        if (passengers.size() < plane.getCapacity()) {
            return true;
        }
        return false;
    }

    public String bookPassenger(Passenger _passenger) {
        if(this.spaceForPassenger() == true) {
            passengers.add(_passenger);
            return "Passenger booked";
        }
        return "No space for passenger, booking declined.";

    }
}
