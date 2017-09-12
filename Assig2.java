/***********************************************
 * Courtney Dunbar, Talanda Williams, Tejus Nandha
 * CST 338-30 FA 17 Homework 2
 * Casino Group Project Assignment
 ***********************************************/

import java.util.*; //Import all java utilities
import java.lang.Math; //Import java nath library  
import java.io.File; //Import java IO file 

//notes - get mutators and accessors into Assig2 class, turn tabs into spaces

public class Assig2 { //Create the main class and name it Assig2.
	static Scanner user_input = new Scanner( System.in ); //Get user input by calling scanner class.
	
    public static void main(String[] args) {
		  int selectedBet = getBet();
		  //String selectedString = randString();		 
		}
	  
	public static int getBet(){ //Requests bet, confirms amount
		int bet;
		System.out.print("Enter a bet between 0 and 100: ");
		bet = user_input.nextInt(); // Get user input on the amount they want to bet.
		
		if(bet==0){ //end game
			System.out.println("Thanks for playing!");
		}
		while(bet<0 || bet >100){   //Use a while loop to make sure the amount is right. 
			System.out.print("Enter a bet between 0 and 100: ");
			bet = user_input.nextInt();	
		}			
		System.out.println("Your betting amount is: " + bet);

	return bet;
	}
	
}

class TripleString{
	private String string1;
	private String string2;
	private String string3;
	
	public static final int MAX_LEN = 20; //Declare a final static int variable called MAX_LEN.
	
	static final int MAX_PULLS=40;  //Declare a final static int variable called MAX_PULLS. 
	static int pullWinnings[] = new int[MAX_PULLS];
	static int numPulls;
	
	TripleString(){
		
	}	
	
	public String toString(){
		return string1 + " " + string2 + " " + string3;			
    }
	
	boolean saveWinnings(int winnings){
		for(int i=0;i<=MAX_PULLS;i++){
			pullWinnings[i]=winnings;
		}
		return true;
	}
	
	public String displayWinnings(){
		String display = "Display: ";
		for(int i=0;i<=MAX_PULLS;i++){
			display= display + pullWinnings[i];
		}
		return display;
	}
	
	boolean validString( String str ){
	  if (str instanceof String) {
		System.out.println("true");
	    return true;
	  }
   	  return false;
	}
	
	public void setString1(String string1)
    {      
	  this.string1=string1;
	  validString(string1);
	}
	public void setString2(String string2)
	{
	  this.string2=string2;
      validString(string2);
    }
    public void setString3(String string3)
    {
      this.string3=string3;
      validString(string3);
    }
    //accessors
    public String setString1()
    {
      return string1;
    }
    public String setString2()
    {
      return string2;
    }
    public String setString3()
    {
      return string3;
    }
}

/*
	public static String randString(){
	  int trigger = (int) (Math.random()*1000); //Use Math.random to generate random numbers that will be used to pick the three strings. 
	  System.out.println("Trigger is " + trigger);
	  String rand = "";
	  
	  String[] output = {"BAR", "cherries", "space", "7"}; //Define a array to store bar, cherries, space and 7.

	  
	  if(trigger <= 500){
		  rand = String.join("", output[0]); //BAR is 50% likely to occur

	  } 
	  if (trigger >= 501 && trigger <= 750){
		  rand = rand + output[1]; // Cherries is 25% likely to occur
	  }
	  if (trigger >= 751 && trigger <= 875){
		  rand = rand + output[2]; // Space is 12.5% likely to occur
	  }
	  else{
		  rand = rand + output[3]; // 7 is 12.5% likely to occur
	  }
		
	  System.out.println("Random string is  + rand");
	  return rand;
	}
*/