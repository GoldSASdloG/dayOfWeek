package cars;

public class MainCar {
    public static void main(String[] args) {
        SedanCar mers = new SedanCar(
                "sedan",
                238,
                "E220",
                "disel",
                65,
                7);

        mers.move();
        mers.signal();
    }
}
