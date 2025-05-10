package com.example.PetStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PetStore.Entity.PetsStore;

@Repository
public interface PetRepo extends JpaRepository<PetsStore, Integer>{

	
}
