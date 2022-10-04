package com.multiplemain;

public class MultipleMain {
public static void main(String[] args) {
	System.out.println("main method");
	MultipleMain.main(null, null);
}
public static void main(String[] args,String[] args1) {
System.out.println("Overloaded main method");	
}
/*
 * public static int main(String[] args) 
 * { 
 * return 10; 
 * }
 */
}
