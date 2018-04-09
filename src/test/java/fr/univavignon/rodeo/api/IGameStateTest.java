package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IGameStateTest {
	
	public IGameState iGameState ;
	public static IAnimal iAnimal = IAnimalTest.getIAnimalTest();
	
	@Before
	public void setup(){
		iGameState = getIGameState();
	}
	
	public static IGameState getIGameState(){
		IGameState iGameState = mock(IGameState.class);
		Mockito.doThrow(new IllegalStateException()).when(iGameState).exploreArea();
		
		Mockito.doThrow(new IllegalArgumentException()).when(iGameState).catchAnimal(null);
		Mockito.doThrow(new IllegalStateException()).when(iGameState).catchAnimal(iAnimal);
		return iGameState;
	}
	
	@Test(expected=IllegalStateException.class)
	public void testexploreArea(){
	iGameState.exploreArea();
	
	}
	
	@Test(expected=IllegalStateException.class)
	public void testcatchAnimal(){
		iGameState.catchAnimal(iAnimal);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testcatchAnimal2(){
		iGameState.catchAnimal(null);
	}
	
	@Test
	public void testSpecialLevel(){
		ISpecie iSpecie = ISpecieTest.getISpecieTest();
		when(iGameState.getSpecieLevel(iSpecie)).thenReturn(SpecieLevel.CHAMPION);
		assertEquals(SpecieLevel.CHAMPION, iGameState.getSpecieLevel(iSpecie));
	}
	
	@Test
	public void testgetProgession(){
		
		when(iGameState.getProgression()).thenReturn(1);
		assertEquals(1, iGameState.getProgression());
	}
}
