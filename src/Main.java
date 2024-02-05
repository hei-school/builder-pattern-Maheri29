import main.java.com.example.builder.*;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder sportsCarBuilder = new CarBuilder();
        director.constructSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.getProduct();

        System.out.println("Sports Car Details:");
        System.out.println(sportsCar);

        CarManualBuilder sportsCarManualBuilder = new CarManualBuilder();
        director.constructSportsCar(sportsCarManualBuilder);
        Manual sportsCarManual = sportsCarManualBuilder.getProduct();

        System.out.println("\nSports Car Manual Details:");
        System.out.println(sportsCarManual);
    }
}