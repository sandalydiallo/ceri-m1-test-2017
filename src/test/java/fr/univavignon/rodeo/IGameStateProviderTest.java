package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;



public class IGameStateProviderTest {

	public static IGameStateProvider getIGameStateProviderInstance() {
		//I should create a mock for IAnimal 
		
		return Mockito.mock(IGameStateProvider.class);
	}
	
	@Test(expected = IllegalArgumentException.class) 
	public void testGet() {
		
		IGameStateProvider IGameStateProvider = getIGameStateProviderInstance();
		Mockito.doThrow(new IllegalArgumentException("The argument is null"))
        .when(IGameStateProvider).get(null);
		IGameStateProvider.get(null);
		
		IGameState iGameState = IGameStateTest.getIGameStateInstance();
		Mockito.when(IGameStateProvider.get("gameState1")).thenReturn(iGameState);
		assertEquals(IGameStateProvider.get("gameState1"), iGameState);
	}

}
