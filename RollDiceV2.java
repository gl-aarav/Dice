/* Aarav Goyal
 * 9/27/2024
 * RollDiceV2.java
 * Working on: using Math.random to make a random # from 1 to 6.
 * Rolling the dice will be a method call
 */
 
 public class RollDiceV2{
	 public static void main (String[] args){
	 int RollDi = 0;
	 rollDi = roll();
	 System.out.println("\n\n\nYou Rolled " + RollDi);
	 System.out.println("\n\n\n");
		 
	}	 
	
	public static int roll(){
	int RollDie = 0;
	RollDie = (int) (Math.random()*6+1);
		
	}
 }
