package ru.allineed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.allineed.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
