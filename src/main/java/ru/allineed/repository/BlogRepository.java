package ru.allineed.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.allineed.entity.Blog;
import ru.allineed.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {

	List<Blog> findByUser(User user);
}
