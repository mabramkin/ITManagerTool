package ru.allineed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.allineed.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
