package ru.vlapin.demo.springrestdemo.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.demo.springrestdemo.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
