package com.intiformation.sonar.demo;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatriceTest extends TestCase {

	@Test
	public void testAdd() {
		Calculatrice calculatrice = new Calculatrice();
		assertEquals("Est-ce que l'addition est correcte", 10, calculatrice.add(5, 5));
	}

	@Test
	public void testMul() {
		Calculatrice calculatrice = new Calculatrice();
		assertEquals("Est-ce que la multiplication est correcte", 25, calculatrice.mul(5, 5));
	}

}
