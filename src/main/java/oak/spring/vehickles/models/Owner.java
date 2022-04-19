package oak.spring.vehickles.models;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Owner {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  /**
   * @ORM\Column(type="string", length=50)
   */
  private String name;

  /**
   * @ORM\Column(type="string", length=50, nullable=true)
   */
  private String patronymic;

  /**
   * @ORM\Column(type="string", length=50)
   */
  private String last_name;

  /**
   * @ORM\Column(type="integer")
   */
  private int age;

  /**
   * @ORM\Column(type="string", length=1)
   */
  private String gender;

  /**
   * @ORM\Column(type="string", length=200, nullable=true)
   */
  private String comment;

}
