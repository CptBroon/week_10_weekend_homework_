import org.junit.Before;
import org.junit.Test;
import people.Passenger;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;

    @Before
    public void before() {
        passenger1 = new Passenger("Amanda", 2);
    }

    @Test
    public void hasName() {
        assertEquals("Amanda", passenger1.getName());
    }

    @Test
    public void hasNumberOfBags() {
        assertEquals(2, passenger1.getNumberOfBags());
    }
}
