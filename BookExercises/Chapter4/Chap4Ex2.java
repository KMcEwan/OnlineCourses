import acm.program.*;

public class Chap4Ex2 extends ConsoleProgram
{
	public void run()
	{
		for(int i = 1; i<=10; i++)	
		{
			println("This old man, he played " + i);
			println("He played knick-knack on my ");
			switch(i) {
				case 1: println("thumb");
				break;
				
				case 2: println("shoe");
				break;
				
				case 3: println("knee");
				break;
				
				case 4: println("door");
				break;
				
				case 5: println("hive");
				break;
				
				case 6: println("sticks");
				break;
				
				case 7: println("heaven");
				break;
				
				case 8: println("pate");
				break;
				
				case 9: println("spine");
				break;
				
				case 10: println("shin");
				break;
				
				default: println("error");
				break;				
				
			}

			println("With a knick-kanck, paddy-whack,");
			println("Give your dog a bone.");
			println("This old man came rolling home");
		}
	}
	
	
}