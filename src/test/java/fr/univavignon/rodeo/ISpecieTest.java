package fr.univavignon.rodeo;



import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.* ; 
import org.mockito.Mockito;
import org.mockito.Mock ;

import fr.univavignon.rodeo.api.*;



public class ISpecieTest {
	
	@Mock
	ISpecie Ispecie ; 
	
	@Test
	public static ISpecie getISpecieInstance() {
		//I should create a mock for IAnimal 
		return Mockito.mock(ISpecie.class);
	}
	
	@Test 
	public void test() {
		
		assertEquals("", "");
	}

}
