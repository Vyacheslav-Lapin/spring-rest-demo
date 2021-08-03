package ru.vlapin.demo.springrestdemo.service.jsonplaceholder;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.vlapin.demo.springrestdemo.model.jsonplaceholder.Address;
import ru.vlapin.demo.springrestdemo.model.jsonplaceholder.Geo;
import ru.vlapin.demo.springrestdemo.model.jsonplaceholder.User;

@SpringBootTest
@RequiredArgsConstructor(onConstructor_ = @Autowired)
class UserServiceTest {

  UserService userService;

  @Test
  @SneakyThrows
  @DisplayName("all method works correctly")
  void allMethodWorksCorrectlyTest() {
    assertThat(userService.all()).isNotNull()
        .hasSize(10);
  }

  @Test
  @SneakyThrows
  @DisplayName("find by id method works correctly")
  void findByIdMethodWorksCorrectlyTest() {
    assertThat(userService.findById(7L)).isNotNull()
        .extracting(User::getAddress)
        .extracting(Address::getGeo)
        .extracting(Geo::getLatitude, Geo::getLongitude)
        .contains(24.8918, 21.8984);
  }
}
