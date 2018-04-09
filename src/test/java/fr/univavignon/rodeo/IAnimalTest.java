package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import org.junit.* ; 
import org.mockito.Mock;
import org.mockito.Mockito;


import fr.univavignon.rodeo.api.IAnimal;



public class IAnimalTest {
	
	@Mock
	IAnimal animal ; 
	
	
	/**
	 * this method provides a mock instance of IAnimal and it will
	 * be used in every method to create an IAnimal instance 
	 */
	@Test
	public void getIAnimalTestInstance() {
		//I should create a mock for IAnimal 
		animal = Mockito.mock(IAnimal.class);
		
	}

	//Then create a testMethod for every IAnimal's method. 
	
	@Test
	public void testGetXP(){
		getIAnimalTestInstance();
		Mockito.when(animal.getXP()).thenReturn(2);
		assertEquals(animal.getXP(), 2);
	}
	
	@Test
	public void testIsSecret(){
		getIAnimalTestInstance();
		Mockito.when(animal.isSecret()).thenReturn(true);
		assertEquals(animal.isSecret(), true);
	}
	
	@Test
	public void testIsEndangered(){
		getIAnimalTestInstance();
		Mockito.when(animal.isEndangered()).thenReturn(false);
		assertEquals(animal.isEndangered(), false);
	}
	
	@Test
	public void testIsBoss(){
		getIAnimalTestInstance();
		Mockito.when(animal.isBoss()).thenReturn(true);
		assertEquals(animal.isBoss(), true);
	}
	

}
