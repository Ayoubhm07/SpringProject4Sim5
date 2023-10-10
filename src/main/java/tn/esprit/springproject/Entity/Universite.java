package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="universite")
public class Universite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_uni")
    private Long idUni;
    @Column(name = "nom_uni")
    private String nomUni;
    @Column(name = "adr_uni")
    private String adresse;
    @OneToOne(mappedBy = "universite")
    private Foyer foyer;
}
