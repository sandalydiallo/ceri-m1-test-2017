package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import org.junit.* ; 
import org.mockito.Mock;
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IAnimal;



public class IAnimalTest {
	
	
	
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */

	public static IAnimal getIAnimalInstance() {
		//I should create a mock for IAnimal 
		return Mockito.mock(IAnimal.class);
		
	}

	//Then create a testMethod for every IAnimal's method. 
	
	@Test
	public void testGetXP(){
		IAnimal iAnimal = getIAnimalInstance();
		Mockito.when(iAnimal.getXP()).thenReturn(2);
		assertEquals(iAnimal.getXP(), 2);
	}
	
	@Test
	public void testIsSecret(){
		IAnimal iAnimal = getIAnimalInstance();
		Mockito.when(iAnimal.isSecret()).thenReturn(true);
		assertEquals(iAnimal.isSecret(), true);
	}
	
	@Test
	public void testIsEndangered(){
		IAnimal iAnimal = getIAnimalInstance();
		Mockito.when(iAnimal.isEndangered()).thenReturn(false);
		assertEquals(iAnimal.isEndangered(), false);
	}
	
	@Test
	public void testIsBoss(){
		IAnimal iAnimal = getIAnimalInstance();
		Mockito.when(iAnimal.isBoss()).thenReturn(true);
		assertEquals(iAnimal.isBoss(), true);
	}
	

}
