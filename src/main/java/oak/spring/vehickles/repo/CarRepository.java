package oak.spring.vehickles.repo;

import oak.spring.vehickles.models.Car;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long>, JpaSpecificationExecutor<Car> {
}
