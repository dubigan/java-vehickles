package oak.spring.vehickles.repo;

import oak.spring.vehickles.models.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
