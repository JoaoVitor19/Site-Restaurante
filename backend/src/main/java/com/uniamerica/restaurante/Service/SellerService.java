package com.uniamerica.restaurante.Service;

import com.uniamerica.restaurante.DTO.SellerDto;
import com.uniamerica.restaurante.Entity.Seller;
import com.uniamerica.restaurante.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    @Autowired
    private SellerRepository repository;

    public List<SellerDto> findAll(){
         List<Seller> result = repository.findAll();
         return result.stream().map(x -> new SellerDto(x)).collect(Collectors.toList());
    }
}
