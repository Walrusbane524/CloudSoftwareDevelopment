package com.DesenvolvimentoNuvem.atividade1.repository;

import com.DesenvolvimentoNuvem.atividade1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
