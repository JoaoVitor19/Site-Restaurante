package com.uniamerica.restaurante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.uniamerica.restaurante.Entity.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
