package com.silstechnologie.produit.controller;


import com.silstechnologie.produit.entities.Produit;
import com.silstechnologie.produit.services.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
// @CrossOrigin
public class ProduitController {

    ProduitService produitService;

    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Produit> getAllProduits(){
        return produitService.getAllProduits();
    }

    @GetMapping(path = "/{idProduit}")
    public Produit getProduitById(@PathVariable("idProduit") Long id){
        return produitService.getProduit(id);
    }

    @PostMapping
    public Produit createProduit(@RequestBody Produit produit){
        return produitService.saveProduit(produit);
    }

    @PutMapping
    public Produit updateProduit(@RequestBody Produit produit){
        return produitService.updateProduit(produit);
    }

    @DeleteMapping(path = "/{idProduit}")
    public void deleteProduit(@PathVariable("idProduit") Long id){
        produitService.deleteProduitById(id);
    }


    @GetMapping(path = "/produitCat/{idCategorie}")
    public List<Produit> getProduitByCategorieId(@PathVariable("idCategorie") Long idCategorie){
        return produitService.findByCategorieIdCat(idCategorie);
    }
}
