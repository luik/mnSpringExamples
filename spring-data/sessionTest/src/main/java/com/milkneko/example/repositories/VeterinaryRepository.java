package com.milkneko.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milkneko.example.model.Veterinary;

public interface VeterinaryRepository extends JpaRepository<Veterinary, Long> {

}
