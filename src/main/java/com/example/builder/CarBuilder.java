package main.java.com.example.builder;

public class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(Integer seats) {
        this.car.setSeats(seats);
    }

    public void setEngine(Engine engine) {
        this.car.setEngine(engine);
    }

    public void setTripComputer(boolean tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    public void setGPS(boolean gps) {
        this.car.setGPS(gps);
    }

    public void setColor(String color) {
        this.car.setColor(color);
    }

    public void setModel(String model) {
        this.car.setModel(model);
    }


    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}