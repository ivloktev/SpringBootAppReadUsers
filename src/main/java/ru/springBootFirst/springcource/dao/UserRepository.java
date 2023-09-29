package ru.springBootFirst.springcource.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.springBootFirst.springcource.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
}
