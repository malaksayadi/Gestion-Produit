package com.example.isitcom.gestionProduitsSB.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCat;
    private String nomCat;
    @OneToMany(mappedBy = "categorie", cascade = CascadeType.ALL)
    @JsonIgnore //Pour ne pas entrer dans une boucle (dans api)
    private List<Produit> produits;

}
