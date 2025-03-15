package com.silstechnologie.produit.repositories;

import com.silstechnologie.produit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Long> {
    Produit getProduitById(Long id);

    List<Produit> findByNomProduit(String nom);

    List<Produit> findByNomProduitContains(String nom);

    @Query("select p from Produit p where p.nomProduit like ?2 and p.prixProduit > ?1")
    List<Produit> findByNomPrix(Double prix, String nom);

    @Query("select p from Produit p where p.nomProduit like :nom and p.prixProduit > :prix")
    List<Produit> findByNomPrix(String nom, Double prix);



}
