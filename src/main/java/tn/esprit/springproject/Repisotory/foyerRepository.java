package tn.esprit.springproject.Repisotory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springproject.Entity.Foyer;

@Repository
public interface foyerRepository extends JpaRepository<Foyer,Long> {
}
