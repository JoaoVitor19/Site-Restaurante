package com.uniamerica.restaurante.Controllers;

import com.uniamerica.restaurante.DTO.SaleDto;
import com.uniamerica.restaurante.DTO.SaleSomaDto;
import com.uniamerica.restaurante.DTO.SaleSucessDto;
import com.uniamerica.restaurante.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/sale")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        Page<SaleDto> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping(value = "/vendas-por-vendedor")
    public ResponseEntity<List<SaleSomaDto>> amountGroupedBySeller(){
        List<SaleSomaDto> list = service.amountGroupedBySeller();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/sucesso-por-vendedor")
    public ResponseEntity<List<SaleSucessDto>> sucessGroupedBySeller(){
        List<SaleSucessDto> lists = service.sucessGroupedBySeller();
        return ResponseEntity.ok(lists);
    }

}
