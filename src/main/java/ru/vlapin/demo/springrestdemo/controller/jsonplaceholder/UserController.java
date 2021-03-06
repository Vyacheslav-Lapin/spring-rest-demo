package ru.vlapin.demo.springrestdemo.controller.jsonplaceholder;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vlapin.demo.springrestdemo.model.jsonplaceholder.User;
import ru.vlapin.demo.springrestdemo.service.jsonplaceholder.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {

  UserService userService;

  @NotNull
  @GetMapping
  public List<User> all() {
    return userService.all();
  }

  @GetMapping("{id}")
  public User byId(@PathVariable @NotNull Long id) {
    return userService.findById(id);
  }
}
