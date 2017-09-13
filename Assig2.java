/***********************************************
 * Courtney Dunbar, Talanda Williams, Tejus Nandha
 * CST 338-30 FA 17 Homework 2
 * Casino Group Project Assignment
 ***********************************************/

import java.util.*; //Import all java utilities
import java.lang.Math; //Import java math library 

public class Assig2 { //Create the main class and name it Assig2.
	
    public static void main(String[] args) {
    	while(TripleString.numPulls < TripleString.MAX_PULLS){
  		  int selectedBet = TripleString.getBet();
  		  int win = 0;
  		  if(selectedBet != 0){ //otherwise game ends
  			  TripleString pullString = TripleString.pull();
  			  int amount = TripleString.getPayMultipler(pullString);
  			  win = selectedBet*amount;
  			  TripleString.display(pullString, win);
  		  }  		  
  		  boolean saved = TripleString.saveWinnings(win);
    	}
		 System.out.println("\nMax Pulls Reached!");
    	 System.out.println(TripleString.displayWinnings());  

}

static class TripleString{
	private String string1;
	private String string2;
	private String string3;
	
	public static final int MAX_LEN = 20; //Declare a final static int variable called MAX_LEN.
	static Scanner user_input = new Scanner( System.in ); //Get user input by calling scanner class.

	static final int MAX_PULLS=40;  //Declare a final static int variable called MAX_PULLS. 
	static int pullWinnings[] = new int[MAX_PULLS];
	static int numPulls = 0;
	
	public TripleString(){
		//empty constructor
	}
	
	public static int getBet(){ //Requests bet, confirms amount
		int bet;
		
		  //Use a do-while loop to make sure the amount is right. 
		do{
			System.out.print("Enter a bet between 0 and 100: ");
			bet = user_input.nextInt();	
		}while((bet<0 || bet >100) && bet !=0);		
		
		if(bet==0){ //end game			
			System.out.println("\nThanks for playing!");
			System.out.println(TripleString.displayWinnings()); 
			System.exit(0);
		}
		
		
	return bet;
	}
	
	private static String randString(){
		  int trigger = (int) (Math.random()*1000); //Use Math.random to generate random numbers that will be used to pick the three strings. 
		  String[] output = {"BAR", "cherries", "space", "7"}; //Define a array to store bar, cherries, space and 7.
		  String rand;
		  
		  if(trigger <= 500){
			  rand = output[0]; //BAR is 50% likely to occur

		  }else if (trigger >= 501 && trigger <= 750){
			  rand = output[1]; // Cherries is 25% likely to occur
		  }else if (trigger >= 751 && trigger <= 875){
			  rand = output[2]; // Space is 12.5% likely to occur
		  }else{
			  rand = output[3]; // 7 is 12.5% likely to occur
		  }
			
		return rand;
		}
	
	public static TripleString pull(){
		TripleString pullString = new TripleString();
		pullString.string1 = randString();
		pullString.string2 = randString();
		pullString.string3 = randString();

	    return pullString;
	}
	
	public static String toString(TripleString obj){ //convert from TripleString object to regular String
		return "Your Pull is: " + obj.string1 + " " + obj.string2 + " " + obj.string3;			
    }
	
	public static int getPayMultipler(TripleString thePull){
		String temp1 = thePull.string1;
		String temp2 = thePull.string2;
		String temp3 = thePull.string3;
		
		if(temp1 == "space"){ 
			return 0; //anything that starts with space is a lose
		}else if(temp1 == "7" && temp2 == "7" && temp3 == "7"){
			return 100; //only winning condition with starting 7 is all 7s
		}else if(temp1 == "BAR" && temp2 == "BAR" && temp3 == "BAR"){
			return 50; //only winning condition with starting BAR is all Bars
		}else if(temp1 == "cherries" && temp2 == "cherries" && temp3 == "cherries"){
			return 30; //all cherries option		
		}else if(temp1 == "cherries" && temp2 == "cherries"){
			return 15; //case of first 2 strings being cherries
		}else if(temp1 == "cherries"){
			return 5; //all other cherry cases covered except only in first place
		}else{
			return 0; //all other cases are covered so anything left is 0x
		}
	}
	
	
	 public static void display(TripleString thePull, int winnings){
		  String resultString = TripleString.toString(thePull);
		  System.out.println(resultString);
		 
		 if(winnings==0){
			 System.out.println("Sorry, you lost that one.\n");
			 numPulls += 1; //either you lose and pull count goes up
		 }else{
			 System.out.println("Congrats, you won $" + winnings + "!\n");
			 saveWinnings(winnings);
			 numPulls += 1; //or you win and pull count does up as well
		 }
		 
	 }
	
	static boolean saveWinnings(int winnings){
		pullWinnings[numPulls] =winnings;
		return true;
	}
	
	public static String displayWinnings(){
		System.out.print("Individual Wins: ");
		int total = 0;
		for(int i=0;i<numPulls;i++){
			total += pullWinnings[i];
			System.out.print(pullWinnings[i] + " ");
		}
		return ("\nTotal Amount Won: $" + total );
	}
	
	private boolean validString( String str ){
	  if (str instanceof String && str.length() < MAX_LEN) {
	    return true;
	  }else{
		  return false;
	  }
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
    public String getString1()
    {
      return string1;
    }
    public String getString2()
    {
      return string2;
    }
    public String getString3()
    {
      return string3;
    }
}
}

	
