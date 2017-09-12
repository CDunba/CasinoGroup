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
	
	static int getBet(){
		int bet;
		System.out.println("Enter a bet between 0 and 100.");
		bet = user_input.nextInt(); // Get user input on the amount they want to bet.
		while(bet<0 || bet >100){   //Use a while loop to make sure the amount is right. 
			System.out.println("Enter a bet between 0 and 100.");
			bet = user_input.nextInt();	
		}
		  return bet;
	}
	
	static TripleString pull(){
		TripleString t = new TripleString();
		/*
		 * 
		 */
		return t;
	}
	
	static String randString(){
	  int trigger = (int) (Math.random()*1000); //Use Math.random to generate random numbers that will be used to pick the three strings. 
	  String rand;
	  String output[] = new String[4];  //Define a array to store bar, cherries, space and 7.
	  
	  output[0]="BAR";
	  output[1]="cherries";
      output[0]="space";
	  output[0]="7";
	  
	  if(trigger<501){
		  rand=output[0];
	  } 
	  if (trigger>500 && trigger<751){
		  rand=output[1];
	  }
	  if(trigger>750 && trigger<875 ){
		  rand=output[2];
	  }
	  else{
		  rand=output[3];
	  }
		
	  return rand;
	}
	
   public static void main(String[] args) {
	  TripleString t = new TripleString(); 
      String a = "a"; 
	  t.setString1(a); //test 
	  getBet();
	 
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
