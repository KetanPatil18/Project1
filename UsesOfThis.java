package com.usesofthis;

public class UsesOfThis {
int a=10;
public UsesOfThis() {
System.out.println("default--Const");
}
public UsesOfThis(UsesOfThis u) {
System.out.println("UsesOfThis--const");
}
public UsesOfThis(int i,int j) {
	System.out.println("int,int--const");
	UsesOfThis uot1=new UsesOfThis(this);
}
public void m1(UsesOfThis u)
{
	System.out.println("m1()");
}
public void m2()
{
	m1(this);
}
public UsesOfThis m3()
{
	return this;
	
}
public static void main(String[] args) {
	UsesOfThis uot=new UsesOfThis();
	uot.m2();
	
	UsesOfThis uot1=new UsesOfThis(10,20);
	
	UsesOfThis uot2=uot1.m3();
	System.out.println(uot2.a);
}
}
