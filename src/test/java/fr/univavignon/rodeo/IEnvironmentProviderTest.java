package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {
	
	IEnvironmentProvider IEnvProvider ; 
	@Test
	public void getIEnvironmentInstance() {
		//I should create a mock for IAnimal 
		IEnvProvider = Mockito.mock(IEnvironmentProvider.class);
		
	}
	@Test 
	public void testGetEnvironment() {
	
	}

}
