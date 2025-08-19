package me.jungtaemin.springbootdeveloper.repository;

import me.jungtaemin.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
