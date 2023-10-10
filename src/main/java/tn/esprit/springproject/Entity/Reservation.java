package tn.esprit.springproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "reservation")
public class Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_res")
    private String idReservation;
    @Column(name = "validite")
    private Boolean estValide;
    @Column(name = "annee")
    private Date anneeUni ;
    @ManyToMany (mappedBy = "reservations")
    private Set<Etudiant> etudiants;
}
