public class Main {
    public static void main(String[] args) {
        Car car= new Car();
        Car.Engine engine=  new Car().new Engine();
        car.setMake("Porsche");
        car.setType("luxury");

        engine.setEngine(car.getType());
        car.setEngine(engine);
        System.out.println(car);
    }
}