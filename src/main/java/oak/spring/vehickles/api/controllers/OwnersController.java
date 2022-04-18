package oak.spring.vehickles.api.controllers;

import oak.spring.vehickles.api.restservice.Owners;
import oak.spring.vehickles.models.Owner;
import oak.spring.vehickles.repo.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnersController {
  @Autowired
  private OwnerRepository repo;

  @GetMapping("/api/owners")
  public Owners owners(Model model) {
    Iterable<Owner> owners = repo.findAll();
    return new Owners(owners);
  }
}
