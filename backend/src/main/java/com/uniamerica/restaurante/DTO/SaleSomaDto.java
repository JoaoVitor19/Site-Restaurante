package com.uniamerica.restaurante.DTO;

import com.uniamerica.restaurante.Entity.Seller;

import java.io.Serializable;

public class SaleSomaDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double soma;

    public SaleSomaDto(){}

    public SaleSomaDto(Seller seller, Double soma) {
        sellerName = seller.getName();
        this.soma = soma;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getSoma() {
        return soma;
    }

    public void setSoma(Double soma) {
        this.soma = soma;
    }
}
