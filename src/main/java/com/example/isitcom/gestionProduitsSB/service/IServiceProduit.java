package com.example.isitcom.gestionProduitsSB.service;

import com.example.isitcom.gestionProduitsSB.entities.Produit;

import java.util.List;

public interface IServiceProduit {
    public Produit saveProduit(Produit p);
    public Produit getProduitById(Long id);
    public void deleteProduit(Long id);
    public List<Produit> getAllProduits();
    public List<Produit> getProduitByMC(String mc);

}
