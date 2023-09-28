package tn.esprit.springproject.Entity;
import lombok.*;
import jakarta.persistence.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomEtudiant;
    private String prenomEtudiant;
    private Long cin ;
    private String ecole;
    private Date dateNaissance;

}
