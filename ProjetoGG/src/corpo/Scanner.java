package corpo;

import java.io.IOException;

public class Scanner {
	static java.util.Scanner read = new java.util.Scanner(System.in);
	public static String ler()
	{
		return read.next();
	}
	public static void pressToContinue() 
	{
	  try 
	  {
		System.in.read();
	  } catch (IOException e) 
	  {
		e.printStackTrace();
	  }
	}
	

}
