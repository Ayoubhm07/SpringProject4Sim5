package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Chambre;
import tn.esprit.springproject.Service.chambreService;

import java.util.List;

@RestController
public class chambreController {
    @Autowired
    private chambreService service;

    @PostMapping("/saveChambre")
    public Chambre saveChambre(@RequestBody Chambre c){return service.saveChambre(c);}


    @GetMapping("/chambres")
    public List<Chambre> Chambres(){return service.findAllChambre();}


    @GetMapping("/chambre/{id}")
    public Chambre getChambre(@PathVariable long id){return service.findByIdChambre(id);}

    @DeleteMapping("/deleteChambre/{id}")
    public String deleteChambre(@PathVariable long id){return service.deleteChambre(id);}


}
