package com.silstechnologie.produit.services.impl;

import com.silstechnologie.produit.entities.Produit;
import com.silstechnologie.produit.repositories.ProduitRepository;
import com.silstechnologie.produit.services.ProduitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    private ProduitRepository repository;

    public ProduitServiceImpl(ProduitRepository repository) {
        this.repository = repository;
    }

    @Override
    public Produit saveProduit(Produit p) {
        return repository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return repository.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
        repository.delete(p);
    }

    @Override
    public Produit getProduit(Long id) {
        return repository.getProduitById(id);
    }

    @Override
    public List<Produit> getAllProduits() {
        return repository.findAll();
    }
}
