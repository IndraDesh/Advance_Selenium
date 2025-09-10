package TestNGconcept;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class practiceTest {

	@Test
	public void createAccountTest() {
		
		System.out.println("create account");
		assertEquals("Pune", "Hadapsar");
	}
	
	@Test(dependsOnMethods = "createAccountTest")
	public void deleteAccountTest() {
		
		System.out.println("delete account");
	}
	
	@Test
	public void modifyTest() {
		
		System.out.println("modify account");
	}
}
