package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Foyer;
import tn.esprit.springproject.Repisotory.foyerRepository;

import java.util.List;

@Service
public class foyerService {
    @Autowired
    private final foyerRepository f_rep;

    public foyerService(foyerRepository f_rep) {
        this.f_rep = f_rep;
    }

    public Foyer savefoyer(Foyer f){
        return f_rep.save(f);
    }

    public Foyer findByIdFoyer(long id){
        return f_rep.findById(id).orElse(null);
    }

    public List<Foyer> findAllFoyer(){
        return f_rep.findAll();
    }

    public String deleteFoyer(long id){
        f_rep.deleteById(id);
        return "Foyer Removed!";
    }



}
