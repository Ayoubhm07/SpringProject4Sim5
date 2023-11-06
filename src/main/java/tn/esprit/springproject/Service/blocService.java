package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Bloc;
import tn.esprit.springproject.Repisotory.blocRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class blocService {
    @Autowired
    private final blocRepository rep;


    public blocService(blocRepository rep) {
        this.rep = rep;
    }

    public Bloc saveBloc(Bloc b) {
        return rep.save(b);
    }

    public Bloc getBlocById(long id) {
        return rep.findById(id).orElse(null);
    }

    public List<Bloc> getBlocs() {
        return rep.findAll();
    }

    public String deleteBloc(long id) {
        rep.deleteById(id);
        return "Bloc Removed!";
    }

    public Optional<Bloc> findBlocByIdEtudiant(long id){
        return rep.getBlocByIdEtudiant(id);
    }

}
