import things.Plane;

public class EnumTest {

    public static void main(String[] args) {
        PlaneEnumTest boeing = new PlaneEnumTest(Plane.BOEING747);
        boeing.showInfo();
        PlaneEnumTest otherplane = new PlaneEnumTest(Plane.OTHERPLANE);
        otherplane.showInfo();
    }
}
