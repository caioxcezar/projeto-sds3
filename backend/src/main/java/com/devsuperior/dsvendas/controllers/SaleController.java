package com.devsuperior.dsvendas.controllers;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import com.devsuperior.dsvendas.service.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sales")
public class SaleController {
    private final SaleService service;
    private final SellerRepository sellerRepository;

    public SaleController(SaleService service, SellerRepository sellerRepository) {
        this.service = service;
        this.sellerRepository = sellerRepository;
    }

    @GetMapping
    @Transactional(readOnly = true)
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        sellerRepository.findAll();
        return ResponseEntity.ok(service.findAll(pageable));
    }
}
