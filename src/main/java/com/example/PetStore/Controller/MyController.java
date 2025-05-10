package com.example.PetStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.example.PetStore.Entity.PetsStore;
import com.example.PetStore.Service.PetService;

import jakarta.validation.Valid;

import com.example.PetStore.Entity.PetsStore;

@RestController
@RequestMapping("/Pets")
public class MyController {

	@Autowired
	private PetService ps;
	
//	@GetMapping("/test")
//	public String test()
//	{
//		return "Welcome to springboot";
//	}
	
	
	@GetMapping("/all")
	public List<PetsStore> viewAll()
	{
		return ps.viewAll();
	}
	
	@PostMapping("/add")
	public String AddPets(@Valid @RequestBody PetsStore p)
	{
		return ps.AddPets(p);
	}
	
	@GetMapping("/find")
	public PetsStore FindPet(@RequestParam("id") int param)
	{
		return ps.FindPet(param);
	}
	
	
	@DeleteMapping("/delete")
	public String DeleteId(@RequestParam("id") int param)
	{
		return ps.DeleteId(param);
	}
	
	@PutMapping("/put/{id}")
	public PetsStore UpdateId(@PathVariable int id,@Valid @RequestBody PetsStore p)
	{
		return ps.UpdateId(id,p);
	}
	
	
	@PatchExchange("/patch/{id}")
	public PetsStore Update(@PathVariable int id,@Valid @RequestBody PetsStore pp)
	{
		return ps.Update(id,pp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
