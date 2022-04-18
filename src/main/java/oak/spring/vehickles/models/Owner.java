package oak.spring.vehickles.models;

import javax.persistence.*;
import java.util.List;

@Entity
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

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getLast_name() {
    return last_name;
  }

  public void setLast_name(String last_name) {
    this.last_name = last_name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Owner() {
  }
}
