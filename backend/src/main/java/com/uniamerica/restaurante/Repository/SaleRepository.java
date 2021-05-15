package com.uniamerica.restaurante.Repository;

import com.uniamerica.restaurante.DTO.SaleSomaDto;
import com.uniamerica.restaurante.DTO.SaleSucessDto;
import org.springframework.data.jpa.repository.JpaRepository;
import com.uniamerica.restaurante.Entity.Sale;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.uniamerica.restaurante.DTO.SaleSomaDto(obj.seller, SUM(obj.amount)) " +
            " FROM Sale As obj GROUP BY obj.seller")
    List<SaleSomaDto> amountGroupedBySeller();

    @Query("SELECT new com.uniamerica.restaurante.DTO.SaleSucessDto(obj.seller, SUM(obj.visited), SUM(obj.deals))" +
            "FROM Sale As obj GROUP BY obj.seller")
    List<SaleSucessDto> sucessGroupBySeller();
}
