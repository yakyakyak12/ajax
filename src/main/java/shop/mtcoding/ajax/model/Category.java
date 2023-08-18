package shop.mtcoding.ajax.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor // DB 조회하면 PC에 Category 객체 생성 -> 빈생성자를 호출 영속화가 되려면 꼭 적어줘야 함
@Getter
@Setter
@Table(name = "category_tb")
@Entity // 하이버네이트가 관리한다.
public class Category {

  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  private Integer id;

  private String name; // 백엔드, 프론트앤드, DBA

  @Builder
  public Category(Integer id, String name) {
    this.id = id;
    this.name = name;
  }
}
