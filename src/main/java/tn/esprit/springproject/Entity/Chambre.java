package tn.esprit.springproject.Entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "chambre")
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_chbr")
    private int idChambre;
    @Column(name = "num_chbr")
    private int numeroChambre;
    @Column(name = "type_chbr")
    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    private Set<Reservation> reservations;

}