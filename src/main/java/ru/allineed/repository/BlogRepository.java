package ru.allineed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.allineed.entity.Blog;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
