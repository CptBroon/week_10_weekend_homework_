import org.junit.Before;
import things.Plane;

public class PlaneEnumTest {
    Plane plane;

    public PlaneEnumTest(Plane _plane){
        this.plane = _plane;
    }

    public void showInfo() {
        switch (plane) {
            case BOEING747:
                System.out.println(String.format("The capacity is %s and the weight is %s",
                        Plane.BOEING747.getCapacity(),
                        Plane.BOEING747.getWeight()));
                break;
            case OTHERPLANE:
                System.out.println(String.format("The capacity is %s and the weight is %s",
                        Plane.OTHERPLANE.getCapacity(),
                        Plane.OTHERPLANE.getWeight()));
                break;
        }
    }

}
