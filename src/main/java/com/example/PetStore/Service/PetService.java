package com.example.PetStore.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.PetStore.Entity.PetsStore;
import com.example.PetStore.Repository.PetRepo;

import jakarta.validation.Valid;

@Service
public class PetService {
	
	@Autowired
	private PetRepo repo;


	public List<PetsStore> viewAll() {
		
		return repo.findAll();
	}


	public String AddPets(PetsStore p) {
		repo.save(p);
		return "New Pets Added Successfully";
	}


	public PetsStore FindPet(int id) {
		
		return repo.findById(id).orElse(null); 
	}


	public String DeleteId(int id) {
		repo.deleteById(id);
		return "Record Deleted";
	}


	public PetsStore UpdateId(int id, PetsStore p) {
		Optional<PetsStore> ps = repo.findById(id);
		if(ps.isPresent()) {
			PetsStore  n= ps.get();
			n.setBreed(p.getBreed());
			n.setColor(p.getColor());
			n.setDescription(p.getDescription());
			n.setName(p.getName());
			n.setPrice(p.getPrice());
			n.setSpecies(p.getSpecies());
			n.setStatus(p.getStatus());
			repo.save(n);
			return n;
		}
		return null;
	}


	public PetsStore Update(int id, @Valid PetsStore pp) {
		Optional<PetsStore> p = repo.findById(id);
		if(p.isPresent()) {
			PetsStore test= p.get();
			if (pp.getName()!=null) test.setName(pp.getName());
			if (pp.getColor()!=null) test.setColor(pp.getColor());
			if (pp.getDescription()!=null) test.setDescription(pp.getDescription());
			if (pp.getPrice()!=0.0) test.setPrice(pp.getPrice());
			if (pp.getSpecies()!=null) test.setSpecies(pp.getSpecies());
			if (pp.getStatus()!=null) test.setStatus(pp.getStatus());
			repo.save(test);
			return test;
			
		}
		return null;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
