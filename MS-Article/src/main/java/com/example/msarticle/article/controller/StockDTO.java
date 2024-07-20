package com.example.msarticle.article.controller;

import lombok.Builder;

@Builder
public record StockDTO(String stockId, String zone) {
}
