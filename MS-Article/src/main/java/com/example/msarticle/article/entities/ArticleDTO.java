package com.example.msarticle.article.entities;

import com.example.msarticle.article.controller.StockDTO;
import lombok.Builder;

@Builder
public record ArticleDTO(Long articleId,String name, Float quantity, String stockId, StockDTO stockDTO) {


}
