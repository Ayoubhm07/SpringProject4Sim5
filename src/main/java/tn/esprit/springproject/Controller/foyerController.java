package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Service.foyerService;

import java.util.List;

@RestController
public class foyerController {
    @Autowired
    private foyerService service;
    @PostMapping("/saveFoyer")
    public Foyer saveFoyer(@RequestBody Foyer f){
        return service.savefoyer(f);
    }

    @GetMapping("/foyer/{id}")
    public Foyer getFoyer(@PathVariable long id){
        return service.findByIdFoyer(id);
    }
    @GetMapping("/foyers")
    public List<Foyer> getAllFoyers(){
        return service.findAllFoyer();
    }
    @DeleteMapping("/removeFoyer/{id}")
    public String deleteFoyer(@PathVariable long id){
        return service.deleteFoyer(id);
    }
}
