package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Chambre;
import tn.esprit.springproject.Repisotory.chambreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class chambreService {
    @Autowired
    private final chambreRepository c_rep;

    public chambreService(chambreRepository c_rep) {
        this.c_rep = c_rep;
    }

    public Chambre saveChambre(Chambre c){
        return c_rep.save(c);
    }

    public Chambre findByIdChambre(long id){
        return c_rep.findById(id).orElse(null);
    }

    public List<Chambre> findAllChambre(){
        return c_rep.findAll();
    }

    public String deleteChambre (long id){
        c_rep.deleteById(id);
        return "Chambre Removed!!";
    }
    public String deleteChambreWhereNomUniInEspritTekupSesame(String nom){
        c_rep.deleteChambreWhereNomUniInEspritTekupSesame(nom);
        return "Chambre Removed!";
    }
}

