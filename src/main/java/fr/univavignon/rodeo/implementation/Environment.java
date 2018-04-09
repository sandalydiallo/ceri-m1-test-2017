package fr.univavignon.rodeo.implementation;

import java.util.ArrayList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment implements IEnvironment {

	private String name ; 
	private int area ; 
	private List<ISpecie> species ; 
	
	public Environment(String name , int area ){
		this.name = name ; 
		this.area = area ; 
		this.species= new ArrayList<ISpecie>(10) ; 
	}
	
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public int getAreas() {
		// TODO Auto-generated method stub
		return this.area;
	}

	public List<ISpecie> getSpecies() {
		// TODO Auto-generated method stub
		return this.species;
	}

}
