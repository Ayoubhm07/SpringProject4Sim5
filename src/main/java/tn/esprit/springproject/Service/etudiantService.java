package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Etudiant;
import tn.esprit.springproject.Repisotory.etudiantRepository;

import java.util.List;

@Service
public class etudiantService {
    @Autowired
    private final etudiantRepository e_rep;

    public etudiantService(etudiantRepository e_rep) {
        this.e_rep = e_rep;
    }

    public Etudiant saveEtudiant(Etudiant e){
        return e_rep.save(e);
    }

    public Etudiant findByIdEtudiant(long id){
        return e_rep.findById(id).orElse(null);
    }

    public List<Etudiant> findAllEtudiant(){
        return e_rep.findAll();
    }

    public String deleteEtudiant(long id){
        e_rep.deleteById(id);
        return "Etudiant Removed!";
    }

    public Etudiant findEtudiantByIdBlocWhereEstValideEqTrueAndTypeCEqDouble(long id){
        return e_rep.findEtudiantByIdBlocWhereEstValideEqTrueAndTypeCEqDouble(id);
    }
}
