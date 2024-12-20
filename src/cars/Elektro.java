package cars;

public class Elektro extends Cars {
    public Elektro(String body, int maxSpeed, String mark, String engine) {
        super(body, maxSpeed, mark, engine);
    }

    @Override
    public void move() {
        System.out.println(mark + "  is moving at maximum speed : " + maxSpeed);
        System.out.println("Остаток хода! постоянный до следующей розетки около 300 км");
    }
}
