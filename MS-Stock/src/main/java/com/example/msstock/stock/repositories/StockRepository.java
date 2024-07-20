package com.example.msstock.stock.repositories;

import com.example.msstock.stock.entities.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface StockRepository extends MongoRepository<Stock, String> {
}
