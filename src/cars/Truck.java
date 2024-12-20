package cars;

public class Truck extends Cars{
    private double weight;


    public Truck(String body, int maxSpeed, String mark, String engine, int volumeOfGasoline, int gasolineConsumption, double weight) {
        super(body, maxSpeed, mark, engine, volumeOfGasoline, gasolineConsumption);
        this.weight = weight;
    }
}
