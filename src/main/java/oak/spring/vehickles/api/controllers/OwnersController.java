package oak.spring.vehickles.api.controllers;

import oak.spring.vehickles.api.restservice.Owners;
import oak.spring.vehickles.models.Owner;
import oak.spring.vehickles.repo.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnersController {
  @Autowired
  private OwnerRepository repo;
  public static Specification<Owner> getOwner(final long ownerId) {
    return (r, cq, cb) -> cb.equal(r.get("id"), ownerId);
  }

  @GetMapping("/api/owners")
  public Owners owners(@RequestParam(value = "owner", defaultValue = "-1") long owner) {
    Iterable<Owner> owners;
    if ( owner >=0 ) owners = repo.findAll(getOwner(owner));
    else owners = repo.findAll();
    return new Owners(owners);
  }
}
