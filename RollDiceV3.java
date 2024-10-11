/* Aarav Goyal
 * 9/27/2024
 * RollDiceV3.java
 * Working on: using Math.random to make a random # from 1 to 6.
 * Rolling the dice will be a method call
 */
 
 public class RollDiceV3{
	 public static void main (String[] args){
	 int rollDi = 0;
	 rollDi = roll();
	 print(rollDi);
		 
	}	 
	
	public static int roll(){
	int rollDie = 0;
	rollDie = (int) (Math.random()*6+1);
	return rollDie;
	}
	public static void print (int diResult){
	 System.out.println("\n\n\nYou Rolled " + diResult);
	 System.out.println("\n\n\n");
	}
 }
