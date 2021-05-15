package com.uniamerica.restaurante.Controllers;

import com.uniamerica.restaurante.DTO.SaleDto;
import com.uniamerica.restaurante.Service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

}
