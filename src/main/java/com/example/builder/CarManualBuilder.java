package main.java.com.example.builder;

public class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public void reset() {
        this.manual = new Manual();
    }

    public void setSeats(Integer numberOfSeats) {
        this.manual.append("Document car seat features: " + numberOfSeats + " seats");
    }

    public void setEngine(Engine engine) {
        this.manual.append("Add engine instructions: " + engine.toString());
    }

    public void setTripComputer(boolean tripComputer) {
        this.manual.append("Add trip computer instructions: " + (tripComputer ? "Installed" : "Not installed"));
    }

    public void setGPS(boolean gps) {
        this.manual.append("Add GPS instructions: " + (gps ? "Installed" : "Not installed"));
    }

    public Manual getProduct() {
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
