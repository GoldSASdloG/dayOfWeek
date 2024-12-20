package cars;

public class MainCar {
    public static void main(String[] args) {
        Cars mers = new SedanCar(
                "sedan",
                238,
                "mersedes",
                "disel",
                65,
                7);

        Cars volvo = new Truck(
                "tiagach",
                110,
                "volvo",
                "gaz propan",
                800,
                25,
                8920);

        Cars tesla = new Elektro(
                "CUPE",
                330,
                "tesla",
                null);

        mers.move();
        mers.signal();

        volvo.move();
        volvo.signal();

        tesla.move();
        tesla.signal();
    }
}
