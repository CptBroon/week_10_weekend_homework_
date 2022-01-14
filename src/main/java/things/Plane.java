package things;

public enum Plane {
    BOEING747(300, 30000),
    OTHERPLANE(100, 12000);

    private final int capacity;
    private final double weight;
    Plane(int _capacity, double _weight) {
        this.capacity = _capacity;
        this.weight = _weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getWeight() {
        return weight;
    }

    public String getInfo() {
        return String.format("The capacity of this aircraft is %s and the total weight is %s kg.",
                this.weight,
                this.capacity);
    }
}
