package org.codeseoul.java.LearningJavaWithTests.variables;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MainTest {
	
	private static PrintStream systemOut;
	private final static ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@BeforeAll
	static public void before() {
		systemOut = System.out;
		System.setOut(new PrintStream(outContent));
	}
	
	@AfterAll
	static public void after() {
		System.setOut(systemOut);
	}
	
	@Test
	public void testSuccessVariableOutput() {
		Main.main(null);
		assertEquals("Hello World!" + System.lineSeparator(), outContent.toString());
	}
}
