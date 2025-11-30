package com.example.isitcom.gestionProduitsSB.apirest;

import com.example.isitcom.gestionProduitsSB.entities.Produit;
import com.example.isitcom.gestionProduitsSB.service.IServiceProduit;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ProductRestController {
    private IServiceProduit iServiceProduit;

    @GetMapping("/all")
    public List<Produit> getAll(){
        return iServiceProduit.getAllProduits();
    }
    @GetMapping("product/{id}")
    public Produit getById(@PathVariable Long id){
        return iServiceProduit.getProduitById(id);
    }
    @PostMapping("/save")
    public Produit save(@RequestBody Produit p){
        return iServiceProduit.saveProduit(p);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        iServiceProduit.deleteProduit(id);
    }
    @PutMapping("/update")
    public void add(@RequestBody Produit p){
        iServiceProduit.saveProduit(p);
    }
}
