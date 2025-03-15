package com.silstechnologie.produit.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomProduit;
    private Double prixProduit;
    private Date dateCreation;
    @ManyToOne
    private Categorie categorie;

    public Produit(String nomProduit, Double prixProduit, Date dateCreation) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
        this.dateCreation = dateCreation;
    }
}
