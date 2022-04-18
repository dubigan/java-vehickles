package oak.spring.vehickles.api.controllers;

import oak.spring.vehickles.api.restservice.Cars;
import oak.spring.vehickles.models.Car;
import oak.spring.vehickles.repo.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarsController {

  @Autowired
  private CarRepository repo;
  public static Specification<Car> getOwnerCars(final long ownerId) {
    return (r, cq, cb) -> cb.equal(r.get("owner").get("id"), ownerId);
  }

  @GetMapping("/api/cars")
  public Cars cars(@RequestParam(value = "owner", defaultValue = "-1") long owner, Model model) {
    System.out.println(owner);
    Iterable<Car> cars = repo.findAll(getOwnerCars(owner));
    return new Cars(cars);
  }
}