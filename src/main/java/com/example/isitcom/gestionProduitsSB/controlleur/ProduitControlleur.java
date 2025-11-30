package com.example.isitcom.gestionProduitsSB.controlleur;

import com.example.isitcom.gestionProduitsSB.entities.Categorie;
import com.example.isitcom.gestionProduitsSB.entities.Produit;
import com.example.isitcom.gestionProduitsSB.repository.CategorieRepository;
import com.example.isitcom.gestionProduitsSB.service.ServiceProduit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProduitControlleur {
    private ServiceProduit serviceProduit;
    private CategorieRepository categorieRepository;

    @GetMapping("/all")
    public String allProduit(Model m, @RequestParam(name = "mc", defaultValue = "") String mc) {
        List<Produit> produits;

        if (mc.isEmpty()) {
            produits = serviceProduit.getAllProduits();
        } else {
            produits = serviceProduit.getProduitByMC(mc);
        }

        m.addAttribute("products", produits);
        m.addAttribute("mc", mc);

        return "accueil";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduit(@PathVariable Long id) {
        serviceProduit.deleteProduit(id);
        return "redirect:/all";
    }

    @GetMapping("/add")
    public String showAddForm(Model m) {
        m.addAttribute("produit", new Produit());
        m.addAttribute("categorie", categorieRepository.findAll());
        return "ajouterProduit";
    }

    @PostMapping("/save")
    public String saveProduit(@ModelAttribute Produit produit) {
        serviceProduit.saveProduit(produit);
        return "redirect:/all";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model m) {
        Produit p = serviceProduit.getProduitById(id);
        m.addAttribute("produit", p);
        m.addAttribute("categorie", categorieRepository.findAll());
        return "modifierProduit";
    }
}