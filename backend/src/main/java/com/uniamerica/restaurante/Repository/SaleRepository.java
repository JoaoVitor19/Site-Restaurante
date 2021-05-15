package com.uniamerica.restaurante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uniamerica.restaurante.Entity.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
