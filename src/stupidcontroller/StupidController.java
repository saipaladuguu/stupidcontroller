package stupidcontroller;

import java.util.Scanner; 

public class StupidController
{
	private String myName; 
	private Scanner inputReader; 
	
	public StupidController()
	{
		myName = "Sai Paladugu";
		inputReader = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("this program is less stupid");
		System.out.println(myName);
		askQuestions();
	}
	
	private void askQuestions()
	{
		System.out.println("How was your day?");
		String input = inputReader.nextLine();
		System.out.println("Oh, you said "+ input + " about your day");
	
		System.out.println("My next question is this: What is the best type of food");
		String foodInput = inputReader.next();
		System.out.println("Ok, you typed this: " + foodInput);
	

		System.out.println("My next question is this: Do you like play Video Games?");
		String gameInput = inputReader.next();
		System.out.println("Ok, you typed this: " + gameInput);
		
		System.out.println("My next question is this:Do you play any sports?");
		String sportInput = inputReader.next();
		System.out.println("Ok, you typed this: " + sportInput);
		
		System.out.println("My next question is this: What school do you go to?");
		String schoolInput = inputReader.next();
		System.out.println("Ok, you typed this: " + schoolInput);
		
		System.out.println("My next question is this: Are you good at math?");
		String mathInput = inputReader.next();
		System.out.println("Ok, you typed this: " + mathInput);
		
		System.out.println("My next question is this: What is 5+5?");
		float mathnumberInput = inputReader.nextFloat();
		System.out.println("Ok, you typed this: " + mathnumberInput);
		
		
		System.out.println("");
		String someInput = inputReader.next();
		System.out.println("Ok you typed this: " + someInput);
		
		System.out.println("fgdfghghduifgdiufhhg");
		String some1Input = inputReader.nextInt();
		System.out.println("Ok you typed this: " + some1Input);
		
		
		
	}
	}
