package com.example.msstock.stock.mapper;

import com.example.msstock.stock.entities.Stock;
import com.example.msstock.stock.entities.StockDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface StockMapper {
    StockMapper INSTANCE = Mappers.getMapper(StockMapper.class);
    @Mapping(target = "stockId", source = "id")
    StockDTO toDto(Stock stock);
    @Mapping(target = "id", source = "stockId")
    Stock toEntity(StockDTO stockDTO);
}
