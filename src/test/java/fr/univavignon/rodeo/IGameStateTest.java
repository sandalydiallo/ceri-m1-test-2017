package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;



public class IGameStateTest {
	
	@Test
	public static IGameState getISpecieInstance() {
		//I should create a mock for IAnimal 
		
		return Mockito.mock(IGameState.class);
	}
	
	
	
	@Test(expected = IllegalStateException.class)
	public void testExploreArea() {
		IGameState IGameState = getISpecieInstance();
		Mockito.doThrow(new IllegalStateException("The area cannot be explored"))
        .when(IGameState).exploreArea();
		IGameState.exploreArea();
	}
	
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimal() {
		
		IGameState IGameState = getISpecieInstance();
		Mockito.doThrow(new IllegalArgumentException("The argument is cannot be explored"))
        .when(IGameState).exploreArea();
		IGameState.exploreArea();
	}

}
