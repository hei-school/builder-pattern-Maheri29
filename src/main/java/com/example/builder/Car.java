package main.java.com.example.builder;

public class Car {
    private int seats;
    private Engine engine;
    private boolean tripComputer;
    private boolean gps;
    private String color;  // Ajout de la propriété color
    private String model;  // Ajout de la propriété model

    public Car() {
        // Laisser les valeurs par défaut (0, null, false, etc.)
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean hasTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(boolean tripComputer) {
        this.tripComputer = tripComputer;
    }

    public boolean hasGPS() {
        return gps;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine=" + engine +
                ", tripComputer=" + tripComputer +
                ", gps=" + gps +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
