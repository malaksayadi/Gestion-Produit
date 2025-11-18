package com.example.isitcom.gestionProduitsSB.repository;

import com.example.isitcom.gestionProduitsSB.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

    //public List<Produit> findByNomContains(String mc);

    @Query("select p from Produit p where p.nom like :x")
    public List<Produit> rechercherParMotCle(@Param("x")  String mc);
}
