package ru.allineed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.allineed.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
