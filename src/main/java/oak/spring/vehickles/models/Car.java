package oak.spring.vehickles.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
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

}
