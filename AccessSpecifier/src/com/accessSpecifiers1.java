//Class is having Default access modifier 
package com;
class defAccessSpecifier
{ 
void display() 
   { 
       System.out.println("You are using defalut access specifier"); 
   } 
} 

public class accessSpecifiers1 {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
      obj.display(); 

	}
}

