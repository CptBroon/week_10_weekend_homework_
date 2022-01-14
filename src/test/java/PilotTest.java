import org.junit.Before;
import org.junit.Test;
import people.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Peter", "Captain", "00001");
    }

    @Test
    public void hasName() {
        assertEquals("Peter", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals("Captain", pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("00001", pilot.getLicenceNumber());
    }

    public void canFlyPlane() {
        assertEquals("Successfully flown plane", pilot.flyPlane());
    }
}
