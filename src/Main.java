import main.java.com.example.builder.*;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        // Construire une voiture de sport
        CarBuilder sportsCarBuilder = new CarBuilder();
        director.constructSportsCar(sportsCarBuilder);
        Car sportsCar = sportsCarBuilder.getProduct();

        // Afficher les détails de la voiture de sport
        System.out.println("Sports Car Details:");
        System.out.println(sportsCar);

        // Construire un manuel pour la voiture de sport
        CarManualBuilder sportsCarManualBuilder = new CarManualBuilder();
        director.constructSportsCar(sportsCarManualBuilder);
        Manual sportsCarManual = sportsCarManualBuilder.getProduct();

        // Afficher les détails du manuel de la voiture de sport
        System.out.println("\nSports Car Manual Details:");
        System.out.println(sportsCarManual);
    }
}