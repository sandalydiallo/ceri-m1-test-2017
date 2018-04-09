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
	public static IAnimal getIAnimalInstance() {
		//I should create a mock for IAnimal 
		return Mockito.mock(IAnimal.class);
		
	}

	//Then create a testMethod for every IAnimal's method. 
	
	@Test
	public void testGetXP(){
		IAnimal Ianimal = getIAnimalInstance();
		Mockito.when(animal.getXP()).thenReturn(2);
		assertEquals(animal.getXP(), 2);
	}
	
	@Test
	public void testIsSecret(){
		IAnimal Ianimal = getIAnimalInstance();
		Mockito.when(animal.isSecret()).thenReturn(true);
		assertEquals(animal.isSecret(), true);
	}
	
	@Test
	public void testIsEndangered(){
		IAnimal Ianimal = getIAnimalInstance();
		Mockito.when(animal.isEndangered()).thenReturn(false);
		assertEquals(animal.isEndangered(), false);
	}
	
	@Test
	public void testIsBoss(){
		IAnimal Ianimal = getIAnimalInstance();
		Mockito.when(animal.isBoss()).thenReturn(true);
		assertEquals(animal.isBoss(), true);
	}
	

}
