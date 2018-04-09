package fr.univavignon.rodeo;



import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {
	
	IEnvironmentProvider IEnvProvider ; 
	@Test
	public void getIEnvironmentProviderInstance() {
		//I should create a mock for IAnimal 
		IEnvProvider = Mockito.mock(IEnvironmentProvider.class);
		
	}
	
	@Test 
	public void getAvailableEnvironmentsTest() {
		getIEnvironmentProviderInstance();
		List<String> list = new ArrayList<String>(2);
		list.add("Environnment1");
		list.add("Environnment2");
		
		Mockito.when(IEnvProvider.getAvailableEnvironments()).thenReturn(list);
		assertEquals(IEnvProvider.getAvailableEnvironments(), list);
		
	}
	
	@Test 
	public void testGetEnvironment() {
		
		getIEnvironmentProviderInstance();
		Mockito.when(IEnvProvider.getEnvironment("")).thenReturn(null);
		assertEquals(IEnvProvider.getEnvironment(""), null);
		
		IEnvironment IEnvironment = IEnvironmentTest.getIEnvironmentInstance();
		Mockito.when(IEnvProvider.getEnvironment("environment 1")).thenReturn(IEnvironment);
		assertEquals(IEnvProvider.getEnvironment("environment 1"), IEnvironment);
		
	}

}
