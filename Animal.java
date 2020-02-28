import java.util.*;

public class Animal{
    String name;
    int numLegs;

    public Animal(String name, int numLegs){
	this.name = name;
	this.numLegs = numLegs;
    }
    public String toString() {
    	return "Name: " + name +", Number of Legs: " + numLegs;
    }
    public String getName() {
	return this.name;
    }
	
    public int getLegs() {
	return numLegs;
    }
}
    

