package main.java.com.example.builder;

public interface Builder {
    void reset();
    void setSeats(Integer number);
    void setEngine(Engine engine);
    void setTripComputer(boolean tripComputer);
    void setGPS(boolean gps);
}
