package tn.esprit.springproject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foyer")
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_foyer")
    private Long idFoyer;
    @Column(name = "nom_foyer")
    private String nomFoyer;
    @Column(name = "cap_foyer")
    private Long capaciteF;

    @OneToMany(mappedBy = "foyer",cascade = CascadeType.ALL)
    private Set<Bloc> blocs;
    @OneToOne
    private Universite universite;


}
