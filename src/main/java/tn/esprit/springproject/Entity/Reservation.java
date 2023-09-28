package tn.esprit.springproject.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reservation{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idReservation;

    private Boolean estValide;
    private Date anneeUni ;

}
