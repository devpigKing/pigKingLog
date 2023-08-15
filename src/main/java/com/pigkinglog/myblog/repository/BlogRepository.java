package com.pigkinglog.myblog.repository;

import com.pigkinglog.myblog.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
