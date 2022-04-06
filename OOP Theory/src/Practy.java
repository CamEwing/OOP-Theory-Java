// Title: OOP Simplified
// Created Name: Cameron Ewing
// Date: April 6, 2022

public class Practy {
	public static void main(String[] args) {
		
	//Encapsulation
		//Creating object of class C
		Encapsulation objectC = new Encapsulation();
		
		//Setting privateString in class C
		objectC.setString("This is the string i'd like to store in Encapsulation");
		
		//retrieving privateString in class C
		System.out.println(objectC.getString());
		
		
		
	//Abstraction and Inheritance
		//Creating object of class B, which inherits abstract class A
		AbstractInheritance objectB = new AbstractInheritance();
		
		//calling abstractMethod
		objectB.abstractMethod();
		
		//Calling class A regular method from class B
		objectB.regularMethod();
		
	//Polymorphism and Inheritance
		Alphabet theAlphabet = new Alphabet();
		Alphabet letterD = new D();
		Alphabet letterE = new E();
		
		
		//calls letterAlphabet from Alphabet
		theAlphabet.letterAlphabet();
		//letterD is in the Alphabet, calls letterAlphabet from letterD
		letterD.letterAlphabet();
		//letterE is in the Alphabet, calls letterAlphabet from letterE
		letterE.letterAlphabet();

		
	//Interface
		//creates object of InterfaceImplemented
		InterfaceImplemented interfaceObj = new InterfaceImplemented();
		//Calls interfaceMethod
		interfaceObj.interfaceMethod();
	}



}