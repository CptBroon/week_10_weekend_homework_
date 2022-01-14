import people.Passenger;

public class FlightManager {

    private Flight flight;

    public FlightManager (Flight _flight){
        this.flight = _flight;
    }

    public double calculateReservedWeightForBaggage() {
        return flight.getPlane().getWeight() / 2;
    }

    public double calculateReservedWeightForBaggagePerPassenger() {
        return this.calculateReservedWeightForBaggage() / flight.getPlane().getCapacity();
    }

    public double calculateBookedPassengersBaggageWeight() {
        double totalWeightBooked = 0;
        for(Passenger passenger: flight.getPassengers()) {
            double passengerBaggageWeight;
            passengerBaggageWeight = passenger.getNumberOfBags() * calculateReservedWeightForBaggagePerPassenger();
            totalWeightBooked += passengerBaggageWeight;
        }
        return totalWeightBooked;
    }

    public double calculateRemainingBaggageWeightAvailable() {
        return this.calculateReservedWeightForBaggage() - this.calculateBookedPassengersBaggageWeight();
    }
}
