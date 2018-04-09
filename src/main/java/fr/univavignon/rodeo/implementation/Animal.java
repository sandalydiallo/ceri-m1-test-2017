package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal implements IAnimal {

	private String name ; 
	private int XP ; 
	private boolean secret ; 
	private boolean endangered ; 
	private boolean boss ;
	
	public Animal(String name){
		this.name = name ; 
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public int getXP() {
		// TODO Auto-generated method stub
		return this.XP;
	}

	public boolean isSecret() {
		// TODO Auto-generated method stub
		return this.secret;
	}

	public boolean isEndangered() {
		// TODO Auto-generated method stub
		return this.endangered;
	}

	public boolean isBoss() {
		// TODO Auto-generated method stub
		return this.boss;
	}

	
}
