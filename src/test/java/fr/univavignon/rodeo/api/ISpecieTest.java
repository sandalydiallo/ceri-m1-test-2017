package fr.univavignon.rodeo.api;


import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ISpecieTest {
	
public ISpecie iSpecie;
	
	@Before
	public void setup(){
		iSpecie = getISpecieTest();
	}
	
	public static ISpecie getISpecieTest(){
		ISpecie iSpecie = mock(ISpecie.class);
		return iSpecie;
	}
	
	@Test
	public void testgetArea(){
		when(iSpecie.getArea()).thenReturn(1);
		assertEquals(1, iSpecie.getArea());
	}
	
	@Test
	public void testgetAnimals(){
		List<IAnimal> listISpecie = new ArrayList<IAnimal>(2);
		when(iSpecie.getAnimals()).thenReturn(listISpecie);
		assertEquals(listISpecie, iSpecie.getAnimals());
	}
}
