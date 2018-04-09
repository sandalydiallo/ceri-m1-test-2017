package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IGameStateProviderTest {
	
	IGameStateProvider iGameStateProvider;
	
	@Before
	public void setup(){
		iGameStateProvider = getIGameStateProvider();
	}
	
	public static IGameStateProvider getIGameStateProvider(){
		IGameStateProvider iGameStateProvider = mock(IGameStateProvider.class);
		Mockito.doThrow(new IllegalArgumentException()).when(iGameStateProvider).get(null);
		return iGameStateProvider;
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testget(){
		iGameStateProvider.get(null);
		
	}
	
	@Test
	public void testget2(){
		IGameState iGameState = IGameStateTest.getIGameState();
		when(iGameStateProvider.get("test")).thenReturn(iGameState);
		assertEquals(iGameState, iGameStateProvider.get("test"));
		
	}
	

}
