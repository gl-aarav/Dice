/* Aarav Goyal
 * 9/27/2024
 * RollDice.java
 * Working on: using Math.random to make a random # from 1 to 6.
 * Rolling the dice will be a method call
 */
 import java.util.Scanner;
 
 public class RollDiceV4{
	 static int sides = 0;
	 public static void main (String[] args){
Scanner in = new Scanner (System.in);
	 System.out.print("\n\n\nEnter the number of sides: ");
	 sides = in.nextInt();
	 int rollDi = 0;
	 rollDi = roll();
	 print(rollDi);
		 
	}	 
	
	public static int roll(){
	int rollDie = 0;
	rollDie = (int) (Math.random()*sides+1);
	return rollDie;
	}
	public static void print (int diResult){
	 System.out.println("\n\nYou Rolled " + diResult);
	 System.out.println("\n\n\n");
	}
 }
