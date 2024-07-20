package com.example.msarticle.article.service;


import com.example.msarticle.article.entities.ArticleDTO;

import java.util.List;

public interface IArticleService {
    ArticleDTO getArticleById(Long articleId);
    ArticleDTO save(ArticleDTO articleDTO);
    List<ArticleDTO> findAll();
    void deleteById(Long articleId);
}

