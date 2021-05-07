package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import com.devsuperior.dsvendas.service.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleController {
    private final SaleService service;
    private final SellerRepository sellerRepository;

    public SaleController(SaleService service, SellerRepository sellerRepository) {
        this.service = service;
        this.sellerRepository = sellerRepository;
    }

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        sellerRepository.findAll();
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping("/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        return ResponseEntity.ok(service.amountGroupedBySeller());
    }

    @GetMapping("/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        return ResponseEntity.ok(service.successGroupedBySeller());
    }
}
