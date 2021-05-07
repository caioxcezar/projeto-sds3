package com.devsuperior.dsvendas.service;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {
    private final SellerRepository repository;

    public SellerService(SellerRepository repository) {
        this.repository = repository;
    }

    public List<SellerDTO> findAll() {
        return repository.findAll().stream().map(s -> new SellerDTO(s)).collect(Collectors.toList());
    }
}
