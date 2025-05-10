package com.example.PetStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;

@Entity
public class PetsStore {
	
	

	@Override
	public String toString() {
		return "PetsStore [id=" + id + ", Name=" + Name + ", Species=" + Species + ", Breed=" + Breed + ", Color="
				+ Color + ", Description=" + Description + ", Status=" + Status + ", Price=" + Price + "]";
	}
	
	@Id   // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)   // autoincrement
	int id;
//	@Min(value=2, message = "Pet Name cannot be less than 2 char")
//	@Max(value = 10, message = "Pet Name cannot be more than 10 char")
	String Name,Species,Breed,Color,Description,Status;
	double Price;
	
	
	
	public PetsStore(int id, String name, String species, String breed, String color, String description, String status,
			double price) {
		super();
		this.id = id;
		Name = name;
		Species = species;
		Breed = breed;
		Color = color;
		Description = description;
		Status = status;
		Price = price;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getSpecies() {
		return Species;
	}



	public void setSpecies(String species) {
		Species = species;
	}



	public String getBreed() {
		return Breed;
	}



	public void setBreed(String breed) {
		Breed = breed;
	}



	public String getColor() {
		return Color;
	}



	public void setColor(String color) {
		Color = color;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}



	public PetsStore() {
	
	}
	

	
	
}
