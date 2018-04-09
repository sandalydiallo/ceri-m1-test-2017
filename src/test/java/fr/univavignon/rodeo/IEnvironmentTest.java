package fr.univavignon.rodeo;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.*;



public class IEnvironmentTest {
	
	public static IEnvironment getIEnvironmentInstance() {
		//I should create a mock for IAnimal 
		return Mockito.mock(IEnvironment.class);
		
	}
	
	@Test 
	public void testGetAreas() {
		IEnvironment IEnvironment =  getIEnvironmentInstance(); 
		Mockito.when(IEnvironment.getAreas()).thenReturn(2);
		assertEquals(IEnvironment.getAreas(), 2);
	}

	@Test 
	public void getAvailableEnvironmentsTest() {
		IEnvironment IEnvironment = getIEnvironmentInstance();
		List<ISpecie> ispecies = new ArrayList<ISpecie>(2);
		ispecies.add(ISpecieTest.getISpecieInstance());
		ispecies.add(ISpecieTest.getISpecieInstance());
		
		Mockito.when(IEnvironment.getSpecies()).thenReturn(ispecies);
		assertEquals(IEnvironment.getSpecies(), ispecies);
	}
}
