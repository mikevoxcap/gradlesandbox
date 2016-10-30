package com.michaelhoffmantech.gradlecomplexbuildcore; 

public class Runner {
	
	public static void main(String[] args) {
		Runner runner = new Runner(); 
		runner.run();
	}
	
	public void run() {
		System.out.println(getHelloWorldString()); 
	}
	
	protected String getHelloWorldString() {
		return "Hello World";		
	}
}