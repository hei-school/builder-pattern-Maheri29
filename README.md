# Builder Project

This project demonstrates the use of the Builder design pattern for building cars and associated manuals.

## Project Structure

The project is structured as follows:

- `src/main/java/com/example/builder`: Contains the main classes of the project.
  - `Car.java`: The class representing a car.
  - `Manual.java`: The class representing a car manual.
  - `Engine.java`: The class representing an engine.
  - `Builder.java`: The builder interface used for constructing products.
  - `CarBuilder.java`: Concrete implementation of the Builder interface for building cars.
  - `CarManualBuilder.java`: Concrete implementation of the Builder interface for building car manuals.
  - `Director.java`: The Director class responsible for guiding the construction process.
  - `CarBuilderTest.java`: Tests for the CarBuilder class.

- `build.gradle`: The Gradle configuration file for the project.

## Running Tests

To run the project tests, use the following command:

```bash
./gradlew test
