package com.example.msarticle.article.repositories;

import com.example.msarticle.article.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
