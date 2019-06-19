package cse360assign2;

public class AddingMachine {

	//Vars 
	private int total;
	private String history="0";
	
	
	public AddingMachine () 
	{
		total = 0;  // not needed - included for clarity
	}

	
	//function to get the total 
	public int getTotal ()
	{
		return total;
	}

	//function to get the input from the user to add to the total 
	public void add (int user_value) 
	{
		
		total+=user_value;
		
		history+=" + "+user_value;
		
	}

	//function to substract a value from the user to the total 
	public void subtract (int user_value) 
	{
		total-=user_value;
		history+=" - "+user_value;
	}

	
	public String toString () {
		return history+ "";
	}

	
	public void clear(){}
}//end of code
