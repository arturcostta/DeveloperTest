package com.example.teste.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCommandsTest {

	@Test
	public void testMorning() {
		MyCommands myCommands = new MyCommands();
		String time = "morning";
		int[] array = {1,2,3}; 
		assertEquals("eggs toast coffee ", myCommands.dishes(time,array ));
	}
	
	@Test
	public void testMorningQuantity() {
		MyCommands myCommands = new MyCommands();
		String time = "morning";
		int[] array = {1,1,1,2}; 
		assertEquals("eggs toast ", myCommands.dishes(time,array ));
	}
	
	@Test
	public void testMorningError() {
		MyCommands myCommands = new MyCommands();
		String time = "morning";
		int[] array = {1,2,3,4}; 
		assertEquals("eggs toast coffee error ", myCommands.dishes(time,array ));
	}
	
	@Test
	public void testNigh() {
		MyCommands myCommands = new MyCommands();
		String time = "night";
		int[] array = {1,2,3,4}; 
		assertEquals("steak potato wine cake ", myCommands.dishes(time,array ));
	}
	
	@Test
	public void testNighQuantity() {
		MyCommands myCommands = new MyCommands();
		String time = "night";
		int[] array = {1,1,3,4}; 
		assertEquals("steak wine cake ", myCommands.dishes(time,array ));
	}

}
