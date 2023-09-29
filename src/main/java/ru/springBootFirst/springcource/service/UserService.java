package ru.springBootFirst.springcource.service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.springBootFirst.springcource.dao.UserRepository;
import ru.springBootFirst.springcource.model.Users;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public List<Users> readAll(){
      return userRepository.findAll();
  }
}
