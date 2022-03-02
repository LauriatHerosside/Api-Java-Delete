package com.example.LocationProject.repository;

import com.example.LocationProject.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends JpaRepository<Personne , Long> {

}
