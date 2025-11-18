package com.example.isitcom.gestionProduitsSB.service;

import com.example.isitcom.gestionProduitsSB.entities.Produit;
import com.example.isitcom.gestionProduitsSB.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class ServiceProduit implements IServiceProduit{
    //@Autowired
    private ProduitRepository produitRepository;

    /*public ServiceProduit(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }*/

    @Override
    public void saveProduit(Produit p) {
        produitRepository.save(p);
    }

    @Override
    public Produit getProduitById(Long id) {
        return produitRepository.findById(id).get();
    }

    @Override
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> getProduitByMC(String mc) {
        return produitRepository.rechercherParMotCle(mc + "%");
    }
}
