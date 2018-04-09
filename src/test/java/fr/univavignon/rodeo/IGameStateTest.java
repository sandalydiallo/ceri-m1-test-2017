package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;



public class IGameStateTest {
	

	public static IGameState getIGameStateInstance() {
		//I should create a mock for IAnimal 
		
		return Mockito.mock(IGameState.class);
	}
	
	
	
	@Test(expected = IllegalStateException.class)
	public void testExploreArea() {
		IGameState IGameState = getIGameStateInstance();
		Mockito.doThrow(new IllegalStateException("The area cannot be explored"))
        .when(IGameState).exploreArea();
		IGameState.exploreArea();
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimal() {
		
		IGameState IGameState = getIGameStateInstance();
		Mockito.doThrow(new IllegalArgumentException("The argument is null"))
        .when(IGameState).catchAnimal(null);
		IGameState.catchAnimal(null);
		
		IAnimal animal = IAnimalTest.getIAnimalInstance();
		Mockito.doThrow(new IllegalStateException("animal can not be found in current areas"))
        .when(IGameState).catchAnimal(animal);
		IGameState.catchAnimal(animal);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevel() {
		
		IGameState IGameState = getIGameStateInstance();
		Mockito.doThrow(new IllegalArgumentException("The argument is null"))
        .when(IGameState).catchAnimal(null);
		IGameState.getSpecieLevel(null);
		
	}
	
	@Test
	public void testgetProgression(){
		IGameState igame = getIGameStateInstance();
		Mockito.when(igame.getProgression()).thenReturn(2);
		assertEquals(igame.getProgression(), 2);
	}
	
	
	

}
