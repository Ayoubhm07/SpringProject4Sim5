package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Universite;
import tn.esprit.springproject.Service.universiteService;

import java.util.List;

@RestController
public class universiteController {
    @Autowired
    private universiteService service;
    @PostMapping("/saveUniversite")
    public Universite saveUniversite(@RequestBody Universite u){
        return service.saveUniversite(u);
    }
    @GetMapping("/universite/{id}")
    public Universite getUniversite(@PathVariable long id){
        return service.findByIdUniversite(id);
    }
    @GetMapping("/universites")
    public List<Universite> getAllUniversite(){
        return service.findAllUniversite();
    }
    @DeleteMapping("/removeUniversite/{id}")
    public String deleteUniversite(@PathVariable long id){
        return service.deleteUniversite(id);
    }
}
