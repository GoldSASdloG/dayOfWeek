package cars;

public class Truck extends Cars{
    protected double weight;


    public Truck(String body, int maxSpeed, String mark, String engine, int volumeOfGasoline, int gasolineConsumption, double weight) {
        super(body, maxSpeed, mark, engine, volumeOfGasoline, gasolineConsumption);
        this.weight = weight;
    }
    @Override
    public void move(){
        System.out.println(mark + "  is moving at maximum speed : " + maxSpeed);
        System.out.println("Остаток хода! " + volumeOfGasoline/gasolineConsumption*100 + " km");
    }
}
