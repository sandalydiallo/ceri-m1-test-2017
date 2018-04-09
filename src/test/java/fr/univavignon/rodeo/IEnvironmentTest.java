package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;



public class IEnvironmentTest {
	
	IEnvironment IEnvProvider ; 
	@Test
	public void getIEnvironmentProviderInstance() {
		//I should create a mock for IAnimal 
		IEnvProvider = Mockito.mock(IEnvironment.class);
		
	}
	
	@Test 
	public void test() {
		assertEquals("", "");
	}

}
