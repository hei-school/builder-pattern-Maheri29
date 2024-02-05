package main.java.com.example.builder;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine(new Engine("Sports", 300));
        builder.setTripComputer(true);
        builder.setGPS(true);
    }
}
