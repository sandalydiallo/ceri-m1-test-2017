package fr.univavignon.rodeo.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class IAnimalTest {
	
	public IAnimal ianimal;
	
	@Before
	public void setup(){
		ianimal = getIAnimalTest();
	}

	public static IAnimal getIAnimalTest(){
		
		IAnimal mockIAnimalTest = mock(IAnimal.class);
		return mockIAnimalTest;
	}
	
	@Test
	public void testgetXP(){
		when(ianimal.getXP()).thenReturn(1);
		assertEquals(1,ianimal.getXP());
	}
	
	@Test
	public void testisSecret(){
		when(ianimal.isSecret()).thenReturn(true);
		assertEquals(true,ianimal.isSecret());
	}
	
	@Test
	public void testisEndangered(){
		when(ianimal.isEndangered()).thenReturn(true);
		assertEquals(true,ianimal.isEndangered());
	}

	@Test
	public void testisBoss(){
		when(ianimal.isBoss()).thenReturn(true);
		assertEquals(true,ianimal.isBoss());
	}
}
