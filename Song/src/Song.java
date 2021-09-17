/*
 * Isayiah Lim
 * 9/16/2021
 * APCSA Period 2
 * Song Project
 * 
 * This program prints out the "Star Trekkin" song by The Firm from 1987.
 */
public class Song
{
	
	//main method, prints out the whole song
	public static void main(String[] args)
	{
		//First verse
		bottomFour();
		
		//Second verse
		bottomSix();

		//Third verse
		bottomEight();
		
		//Fourth verse
		bottomTen();
		
		//Fifth verse
		wholeVerse();
		
		//Conclusion
		bottomTwo();
	}
	
	//prints out the last two lines of every verse: Star Trekkin' across the universe...
	public static void bottomTwo()
    {
    	System.out.print("Star Trekkin' across the universe, ");
    	System.out.println("On the Starship Enterprise under Captain Kirk.");
    	System.out.print("Star Trekkin' across the universe, ");
    	System.out.println("Only going forward 'cause we can't find reverse.");
    }
	
	//prints out the whole first verse (There's Klingons... Star Trekkin...) and two empty spaces
	public static void bottomFour()
	{
		System.out.println("There's Klingons on the starboard bow, starboard bow, starboard bow;");
		System.out.println("there's Klingons on the starboard bow, starboard bow, Jim.");
		bottomTwo();
		System.out.println("");
		System.out.println("");	
	}
	
	//prints the second verse (It's life, Jim... + First Verse)
	public static void bottomSix() 
	{
		System.out.print("It's life, Jim, but not as we know it, ");
		System.out.println("not as we know it, not as we know it;");
		System.out.println("it's life, Jim, but not as we know it, not as we know it, Captain.");
		bottomFour();
	}
	
	//prints out the third verse (It's worse than that... + Previous)
	public static void bottomEight()
	{
		System.out.println("It's worse than that, he's dead, Jim, dead, Jim, dead, Jim;");
		System.out.println("it's worse than that, he's dead, Jim, dead, Jim, dead.");
		bottomSix();
	}
	
	//prints out the fourth verse (We come in Peace... + Previous)
	public static void bottomTen()
	{
		System.out.println("We come in peace, shoot to kill, shoot to kill, shoot to kill;");
		System.out.println("we come in peace, shoot to kill, shoot to kill, men.");
		bottomEight();
	}
	
	//prints out the fifth verse, with every line included (Ye cannot... + Previous)
	public static void wholeVerse()
	{
		System.out.print("Ye cannot change the laws of physics, ");
		System.out.println("laws of physics, laws of physics;");
		System.out.println("ye cannot change the laws of physics, laws of physics, Jim.");
		bottomTen();
	}
}
