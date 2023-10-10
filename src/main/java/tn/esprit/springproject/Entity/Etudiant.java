package tn.esprit.springproject.Entity;
import lombok.*;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "etudiant")
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etu")
    private Long idEtudiant;
    @Column(name = "nom_et")
    private String nomEtudiant;
    @Column(name = "prenom_et")
    private String prenomEtudiant;
    @Column(name = "cin_et")
    private Long cin ;
    @Column(name = "ecole_et")
    private String ecole;
    @Column(name = "dn_et")
    private Date dateNaissance;

    @ManyToMany(mappedBy = "reservations",cascade = CascadeType.ALL)
    private Set<Reservation> reservations;

}
