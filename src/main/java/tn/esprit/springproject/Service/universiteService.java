package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Universite;
import tn.esprit.springproject.Repisotory.universiteRepository;

import java.util.List;

@Service
public class universiteService {
    @Autowired
    private final universiteRepository u_rep;

    public universiteService(universiteRepository u_rep) {
        this.u_rep = u_rep;
    }

    public Universite saveUniversite(Universite u){
        return u_rep.save(u);
    }

    public Universite findByIdUniversite(long id){
        return u_rep.findById(id).orElse(null);
    }

    public List<Universite> findAllUniversite(){
        return u_rep.findAll();
    }

    public String deleteUniversite(long id){
        u_rep.deleteById(id);
        return "Universite Deleted!";
    }


}
