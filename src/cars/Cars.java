package cars;

public abstract class Cars {
    protected String body;
    protected int maxSpeed;
    protected String mark;
    protected String engine;
    protected int volumeOfGasoline;
    protected int gasolineConsumption;

    public Cars() {
    }

    public Cars(String body, int maxSpeed, String mark, String engine, int volumeOfGasoline, int gasolineConsumption) {
        this.body = body;
        this.maxSpeed = maxSpeed;
        this.mark = mark;
        this.engine = engine;
        this.volumeOfGasoline = volumeOfGasoline;
        this.gasolineConsumption = gasolineConsumption;
    }

    public void signal(){
        System.out.println("BIP-BIP");
    }
    public void move(){
        System.out.println(mark + "  is moving at maximum speed : " + maxSpeed);
        System.out.println("Остаток хода! " + volumeOfGasoline/gasolineConsumption*100 + " km");

    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getVolumeOfGasoline() {
        return volumeOfGasoline;
    }

    public void setVolumeOfGasoline(int volumeOfGasoline) {
        this.volumeOfGasoline = volumeOfGasoline;
    }

    public int getGasolineConsumption() {
        return gasolineConsumption;
    }

    public void setGasolineConsumption(int gasolineConsumption) {
        this.gasolineConsumption = gasolineConsumption;
    }
}
