package tn.esprit.springproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springproject.Entity.Reservation;
import tn.esprit.springproject.Service.reservationService;

import java.util.List;

@RestController
public class reservationController {
    @Autowired
    private reservationService service;
    @PostMapping("/saveReservation")
    public Reservation saveReservation(@RequestBody Reservation r){
        return service.saveReservation(r);
    }
    @GetMapping("/reservation/{id}")
    public Reservation getReservation(@PathVariable long id){
        return service.findByIdReservation(id);
    }
    @GetMapping("/reservations")
    public List<Reservation> getAllReservation(){
        return service.findAllReservation();
    }
    @DeleteMapping("/removeReservation/{id}")
    public String deleteReservation(@PathVariable long id){
        return service.deleteReservation(id);
    }
}
