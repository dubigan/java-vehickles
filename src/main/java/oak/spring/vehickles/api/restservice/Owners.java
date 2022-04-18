package oak.spring.vehickles.api.restservice;

import oak.spring.vehickles.models.Owner;

public class Owners {

  private Iterable<Owner> owners;

  public Owners(Iterable<Owner> owners) {
    this.owners = owners;
  }

  public Iterable<Owner> getOwners() {
    return this.owners;
  }
}
