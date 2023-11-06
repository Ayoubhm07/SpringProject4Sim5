package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Etudiant;
import tn.esprit.springproject.Service.etudiantService;

import java.util.List;

@RestController
public class etudiantController {
    @Autowired
    private etudiantService service;

    @PostMapping("/saveEtudiant")
    public Etudiant saveEtudiant(@RequestBody Etudiant e){
        return service.saveEtudiant(e);
    }

    @GetMapping("/etudiant/{id}")
    public Etudiant getEtudiant(@PathVariable long id){
        return service.findByIdEtudiant(id);
    }
    @GetMapping("/etudiants")
    public List<Etudiant> getAllEtudiant(){
        return service.findAllEtudiant();
    }
    @DeleteMapping("/supprimerEtudiant/{id}")
    public String deleteEtudiant(@PathVariable long id){
        return service.deleteEtudiant(id);
    }
}
