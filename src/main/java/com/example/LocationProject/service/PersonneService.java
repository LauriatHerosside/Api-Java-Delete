package com.example.LocationProject.service;

import com.example.LocationProject.repository.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.LocationProject.model.Personne;

import java.util.List;

@Service
public class PersonneService {

    private PersonneRepository personneRepository;

    @Autowired
    public PersonneService(PersonneRepository personneRepository) {
        this.personneRepository = personneRepository;
    }

    public List<Personne> listAllPersonne() {
        return personneRepository.findAll();
    }

    public void savePersonne(Personne personne) {
        personneRepository.save(personne);
    }


    public void deletePersonne(Long id) {
        personneRepository.deleteById(id);
    }
}
