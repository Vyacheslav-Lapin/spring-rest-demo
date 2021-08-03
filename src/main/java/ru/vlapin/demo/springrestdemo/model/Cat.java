package ru.vlapin.demo.springrestdemo.model;

import static lombok.AccessLevel.PRIVATE;
import static lombok.AccessLevel.PROTECTED;

import java.util.Objects;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Version;
import lombok.EqualsAndHashCode.Include;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.Hibernate;

@Entity
@Getter
@ToString
@Setter(PRIVATE)
@NoArgsConstructor(access = PROTECTED)
//@NoArgsConstructor(access = PRIVATE)
@RequiredArgsConstructor//(access = PRIVATE)
public class Cat {

  //region id and version
  @Id
  @Include
  @GeneratedValue
  @Column(updatable = false, nullable = false)
  UUID id;

  @Version
  int version;
  //endregion

  @NonNull
  @Column(nullable = false)
  String name;

  //region equals and hashCode
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
    Cat cat = (Cat) o;

    return Objects.equals(id, cat.id);
  }

  @Override
  public int hashCode() {
    return 2134426647;
  }
  //endregion
}
