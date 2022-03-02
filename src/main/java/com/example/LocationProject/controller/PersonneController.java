package com.example.LocationProject.controller;


import com.example.LocationProject.model.Personne;
import com.example.LocationProject.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personnes")
public class PersonneController {


    PersonneService personneService;

    @Autowired
    public PersonneController(PersonneService personneService) {
        this.personneService = personneService;
    }

    @GetMapping
    public List<Personne> list(){
    return personneService.listAllPersonne();
}
    @PostMapping("/create")
    public String add(@RequestBody Personne personne) {
       personneService.savePersonne(personne);
       return "Une nouvelle personne ajoutée";
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id){
        personneService.deletePersonne(id);
        return "Personne supprimée avec succès!!" + id;
    }

}
