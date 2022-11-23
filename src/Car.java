public class Car {
    private String make;
    private String type;

    private Engine engine;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine{
        private String engine;

        @Override
        public String toString() {
            return "Engine{" +
                    "engine='" + engine + '\'' +
                    '}';
        }

        public void setEngine(String carType) {
            switch(carType){
                case "economy":
                    engine="diesel";
                    break;
                case  "luxury":
                    engine="electric";
                    break;
                default:
                    engine="petrol";
                    break;
            }

        }

    }
}