package oak.spring.vehickles.api.restservice;

import oak.spring.vehickles.models.Car;

public class Cars {
  private final Iterable<Car> cars;

  public Cars(Iterable<Car> cars) {
    this.cars = cars;
  }

  public Iterable<Car> getCars() {
    return this.cars;
  }
}