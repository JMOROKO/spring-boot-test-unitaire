package com.silstechnologie.produit;

import com.silstechnologie.produit.entities.Produit;
import com.silstechnologie.produit.repositories.ProduitRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitApplicationTests {

    @Autowired
    private ProduitRepository produitRepository;



    @Test
    public void testCreateProduit() {
        //GIVEN
        String nom = "COCA COLA";
        Double prix = 1000.00;
        Date dateCreation = new Date();

        // WHEN
        Produit produit = new Produit(nom, prix, dateCreation);
        produitRepository.save(produit);

        //THEN
        Produit restProduit = produitRepository.findById(1L).get();
        Assertions.assertThat(restProduit.getNomProduit()).isEqualTo(nom);
        Assertions.assertThat(restProduit.getPrixProduit()).isEqualTo(prix);
        //Assertions.assertThat(restProduit.getDateCreation()).isEqualTo(dateCreation);
    }

    @Test
    public void testUpdateProduit(){
        //GIVE
        Double prix = 900.00;

        //WHEN
        Produit p = produitRepository.findById(1L).get();
        p.setPrixProduit(prix);
        produitRepository.save(p);

        //WHEN
        Assertions.assertThat(p.getPrixProduit()).isEqualTo(prix);
    }

    @Test
    public void testDeleteProduit(){
        produitRepository.deleteById(1L);
    }

    @Test
    public void testListerTousProduits(){
        List<Produit> prods = produitRepository.findAll();

        for(Produit p : prods){
            System.out.println(p);
        }
    }
}
