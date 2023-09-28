package tn.esprit.springproject.Entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idChambre;
    private int numeroChambre;

    @Enumerated(EnumType.STRING)
    private TypeChambre typeC;
}