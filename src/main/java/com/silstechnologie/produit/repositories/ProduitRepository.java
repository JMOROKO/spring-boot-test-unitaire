package com.silstechnologie.produit.repositories;

import com.silstechnologie.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    Produit getProduitById(Long id);
}
