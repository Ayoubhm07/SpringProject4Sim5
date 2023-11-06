package tn.esprit.springproject.Repisotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Chambre;

@Repository
public interface chambreRepository extends JpaRepository<Chambre,Long> {
     String deleteChambreWhereNomUniInEspritTekupSesame(String nom);
}
