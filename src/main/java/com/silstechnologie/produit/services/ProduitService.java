package com.silstechnologie.produit.services;

import com.silstechnologie.produit.entities.Produit;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    // void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();
}
