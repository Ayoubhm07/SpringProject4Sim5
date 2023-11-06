package tn.esprit.springproject.Repisotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Bloc;

import java.util.Optional;

@Repository
public interface blocRepository extends JpaRepository<Bloc,Long> {
    Optional<Bloc> findBlocByIdEtudiant(long id);
}
