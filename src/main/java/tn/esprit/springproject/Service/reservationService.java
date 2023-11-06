package tn.esprit.springproject.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springproject.Entity.Reservation;
import tn.esprit.springproject.Repisotory.reservationRepository;

import java.util.List;

@Service
public class reservationService {
    @Autowired
    private final reservationRepository r_rep;

    public reservationService(reservationRepository r_rep) {
        this.r_rep = r_rep;
    }

    public Reservation saveReservation(Reservation r){
        return r_rep.save(r);
    }

    public Reservation findByIdReservation(long id){
        return r_rep.findById(id).orElse(null);
    }

    public List<Reservation> findAllReservation(){
        return r_rep.findAll();
    }

    public String deleteReservation(long id){
        r_rep.deleteById(id);
        return "Reservation Deleted!";
    }
}
