package oak.spring.vehickles.models;

import javax.persistence.*;

@Entity
public class Car {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /**
   * @ORM\Column(type="string", length=50, nullable=true)
   */
  private String model;

  /**
   * @ORM\Column(type="string", length=20, nullable=true)
   */
  private String color;

  /**
   * @ORM\Column(type="string", length=50, nullable=true)
   */
  private String production;

  /**
   * @ORM\Column(type="integer", nullable=true)
   */
  private int power;

  /**
   * @ORM\Column(type="string", length=50, nullable=true)
   */
  private String manufacturer;

  /**
   * @ORM\ManyToOne(targetEntity=Owner::class, inversedBy="cars")
   */
  @ManyToOne
  @JoinColumn(name = "ownerId")
  private Owner owner;

  /**
   * @ORM\Column(type="string", length=200, nullable=true)
   */
  private String comment;

  /**
   * @ORM\Column(type="bigint", nullable=true)
   */
  private Long mileage;

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getProduction() {
    return production;
  }

  public void setProduction(String production) {
    this.production = production;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Long getMileage() {
    return mileage;
  }

  public void setMileage(Long mileage) {
    this.mileage = mileage;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Car() {
  }
}
