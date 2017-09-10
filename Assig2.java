import java.util.*;   
import java.lang.Math;
import java.io.File;

//notes - get mutators and accessors into Assig2 class, turn tabs into spaces

public class Assig2 {
	static Scanner user_input = new Scanner( System.in );
	
	static int getBet(){
		int bet;
		System.out.println("Enter a bet between 0 and 100.");
		bet = user_input.nextInt();
		while(bet<0 || bet >100){
			System.out.println("Enter a bet between 0 and 100.");
			bet = user_input.nextInt();	
		}
		  return bet;
	}
	
	static TripleString pull(){
		/*
		 * 
		 */
	}
	
   public static void main(String[] args) {
	  TripleString t = new TripleString(); 
      String a = "a"; 
	  t.setString1(a); //test 
	  getBet();
	  System.out.println(t.bar);
	  /*
	  int getBet()
	  This prompts the user for input and returns the bet amount as a functional return.  
	  It should validate the amount before it returns and insist on a legal bet (0 < bet < 100)
	  until it gets one from the user.  
	  It must return the legal value to the client and not take any other action besides getting the legal amount.
	   */
	  
	 
	}
  


}
class TripleString{
	private String string1;
	private String string2;
	private String string3;
	
	String bar= "BAR";
	String cherries = "cherries";
	String seven="7";
	
	public static final int MAX_LEN = 20;
	
	static final int MAX_PULLS=40;
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