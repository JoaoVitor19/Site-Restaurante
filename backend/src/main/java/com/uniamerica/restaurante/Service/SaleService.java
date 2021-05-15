package com.uniamerica.restaurante.Service;

import com.uniamerica.restaurante.DTO.SaleDto;
import com.uniamerica.restaurante.DTO.SaleSomaDto;
import com.uniamerica.restaurante.DTO.SaleSucessDto;
import com.uniamerica.restaurante.Entity.Sale;
import com.uniamerica.restaurante.Repository.SaleRepository;
import com.uniamerica.restaurante.Repository.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDto(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSomaDto> amountGroupedBySeller() {
        return repository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSucessDto> sucessGroupedBySeller() {
        return repository.sucessGroupBySeller();
    }

}
