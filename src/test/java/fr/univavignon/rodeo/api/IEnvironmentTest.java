package fr.univavignon.rodeo.api;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IEnvironmentTest {
	
	IEnvironment iEnvironment ;
	@Before
	public void setup(){
		iEnvironment = getIEnvironment();
	}
	
	public static IEnvironment getIEnvironment(){
		IEnvironment iEnvironment = mock(IEnvironment.class);
		when(iEnvironment.getAreas()).thenReturn(1);
		return iEnvironment;
	}
	
	@Test
	public void testgetAreas(){
		assertEquals(1, iEnvironment.getAreas());
	}
	
	@Test
	public void testgetSpecies(){
		List<ISpecie> listISpecie = Arrays.asList(ISpecieTest.getISpecieTest(),ISpecieTest.getISpecieTest());
		when(iEnvironment.getSpecies()).thenReturn(listISpecie);
		assertEquals(listISpecie.size(), iEnvironment.getSpecies().size());
		
	}

}
