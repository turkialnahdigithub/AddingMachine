/**
 *	Turki Alnahdi 
 *	CSE360
 *	Assignment 2: This program adds and subtract input number and display the whole process 
 */
package cse360assign2;
import java.util.*;
public class AddingMachine {

	//declare private var named total 
	private int total;
	private ArrayList<String> list;
	/**
	 * Class constructor
	 */
	public AddingMachine() {
		total = 0;
		list.add("0 ");
	}
	
	/**
	 * This method gets the total of the numbers added/subtracted 
	 * @return total 
	 */
	public int getTotal() {
		return total;
	}
	
	/**
	 * this method adds a given number to the total 
	 * @param value
	 */
	public void add (int value) {
		total += value;
		list.add("+ " + value + " ");
		
	}
	/**
	 * This method subtract a given number from the total 
	 * @param value
	 */
	public void subtract(int value) {
		total -= value;
		list.add("- " + value + " ");
	}
	
	/**
	 * toString method 
	 */
	public String toString() {
		String str = "";
		for(int i = 0; i < list.size(); i++)
		{
			str += list.get(i);
		}
		return str;
	}
	/**
	 * clear method
	 */
	public void clear() {
		
	}

}
