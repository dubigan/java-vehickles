package oak.spring.vehickles.repo;

import oak.spring.vehickles.models.Owner;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>, JpaSpecificationExecutor<Owner> {
}
