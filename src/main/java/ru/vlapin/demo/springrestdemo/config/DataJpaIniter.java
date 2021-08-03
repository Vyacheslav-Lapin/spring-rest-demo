package ru.vlapin.demo.springrestdemo.config;

import static ru.vlapin.demo.springrestdemo.common.Loggable.LogLevel.INFO;

import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.vlapin.demo.springrestdemo.common.Loggable;
import ru.vlapin.demo.springrestdemo.dao.CatRepository;
import ru.vlapin.demo.springrestdemo.model.Cat;

@Component
@Loggable(INFO)
@RequiredArgsConstructor
public class DataJpaIniter implements ApplicationRunner {

  CatRepository catRepository;

  @Override
  public void run(ApplicationArguments __) {
    Stream.of("Мурзик, Барсик, Матроскин".split(", "))
        .map(Cat::new)
        .forEach(catRepository::save);
  }
}
