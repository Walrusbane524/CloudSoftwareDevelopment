package com.DesenvolvimentoNuvem.atividade1.service;

import com.DesenvolvimentoNuvem.atividade1.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(int id);

    Product save(Product product);

    void deleteById(int id);
}
