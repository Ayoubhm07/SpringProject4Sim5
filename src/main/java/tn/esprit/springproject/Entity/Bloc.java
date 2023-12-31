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
@Table(name = "bloc")
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bloc")
    private Long idBloc;
    @Column(name = "nom_bloc")
    private String nomBloc;
    @Column(name = "cap_bloc")
    private Long capaciteBloc;

    @ManyToOne
    private Foyer foyer;
    @OneToMany(mappedBy = "bloc",cascade = CascadeType.ALL)
    private Set<Chambre> chambres;

}
