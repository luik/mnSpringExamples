package com.milkneko.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milkneko.example.model.Medic;

public interface MedicRepository extends JpaRepository<Medic, Long> {

}
