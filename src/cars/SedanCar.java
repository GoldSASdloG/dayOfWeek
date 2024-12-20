package cars;

public class SedanCar extends Cars {

    public SedanCar(String body, int maxSpeed, String mark, String engine, int volumeOfGasoline, int gasolineConsumption) {
        super(body, maxSpeed, mark, engine, volumeOfGasoline, gasolineConsumption);
    }
    @Override
    public void move(){
        System.out.println(mark + "  is moving at maximum speed : " + maxSpeed);
        System.out.println("Остаток хода! " + volumeOfGasoline/gasolineConsumption*100 + " km");
    }
}
