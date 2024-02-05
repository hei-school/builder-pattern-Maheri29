import main.java.com.example.builder.Car;
import main.java.com.example.builder.CarBuilder;
import main.java.com.example.builder.Engine;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarBuilderTest {

    @Test
    public void testCarBuilder() {
        CarBuilder carBuilder = new CarBuilder();


        carBuilder.reset();
        carBuilder.setSeats(2);
        carBuilder.setEngine(new Engine("Test", 150));
        carBuilder.setTripComputer(true);
        carBuilder.setGPS(true);

        Car car = carBuilder.getProduct();

        
        assertEquals(2, car.getSeats());
        assertEquals("Test", car.getEngine().getType());
        assertTrue(car.hasTripComputer());
        assertTrue(car.hasGPS());
    }
}
