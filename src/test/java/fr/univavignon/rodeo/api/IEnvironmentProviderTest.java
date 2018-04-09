package fr.univavignon.rodeo.api;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class IEnvironmentProviderTest {

	public IEnvironmentProvider iEnvironmentProvider;
	
	@Before
	public void setup(){
		iEnvironmentProvider = getIEnvironmentProvider();
	}
	
	public IEnvironmentProvider getIEnvironmentProvider(){
		IEnvironmentProvider iEnvironmentProvider = mock(IEnvironmentProvider.class);
		Mockito.doThrow(new IllegalArgumentException()).when(iEnvironmentProvider).getEnvironment(null);
		return iEnvironmentProvider;
	}
	
	@Test
	public void testGetAvailableEnvironments(){
		List<String> list = Arrays.asList("test2","test1");
		when(iEnvironmentProvider.getAvailableEnvironments()).thenReturn(list);
		assertEquals(list.size(), iEnvironmentProvider.getAvailableEnvironments().size());
	}
	
	@Test
	public void testGetEnvironment(){
		IEnvironment iEnvironment =IEnvironmentTest.getIEnvironment();
		when(iEnvironmentProvider.getEnvironment("test")).thenReturn(iEnvironment);
		assertEquals(iEnvironment, iEnvironmentProvider.getEnvironment("test"));
		
	}
	@Test(expected=IllegalArgumentException.class)
	public void testGetEnvironment2(){
	 iEnvironmentProvider.getEnvironment(null);
	}
}
