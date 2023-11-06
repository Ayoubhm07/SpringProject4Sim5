package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Bloc;
import tn.esprit.springproject.Service.blocService;

import java.util.List;

@RestController
public class blocController {
    @Autowired
    private blocService service;

    @PostMapping("/saveBloc")
    public Bloc saveBloc(@RequestBody Bloc b){
        return service.saveBloc(b);
    }


    @GetMapping("/Blocs")
    public List<Bloc> findAllBlocs(){
        return service.getBlocs();
    }

    @GetMapping("/bloc/{id}")
    public Bloc findBlocById(@PathVariable long id){
        return service.getBlocById(id);
    }

    @DeleteMapping("/removeBloc/{id}")
    public String deleteBloc(@PathVariable long id){
        return service.deleteBloc(id);
    }



}
