package com.milkneko.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milkneko.example.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
