package fr.univavignon.rodeo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.INamedObject;

public class INamedObjectTest {
	
	public static INamedObject getINamedObjectInstance() {
		//I should create a mock for IAnimal 
		
		return Mockito.mock(INamedObject.class);
	}
	
	@Test
	public void testGetName(){
		INamedObject iNamedObject = getINamedObjectInstance();
		Mockito.when(iNamedObject.getName()).thenReturn("name1");
		assertEquals(iNamedObject.getName(), "name1");
	}

}
