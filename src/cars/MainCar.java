package cars;

public class MainCar {
    public static void main(String[] args) {
        SedanCar mers = new SedanCar(
                "sedan",
                238,
                "mersedes",
                "disel",
                65,
                7);

        Truck volvo = new Truck(
                "tiagach",
                110,
                "volvo",
                "gaz propan",
                800,
                25,
                8920);


        mers.move();
        mers.signal();
        volvo.move();
        volvo.signal();
    }
}
