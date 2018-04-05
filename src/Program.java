import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		float number1, number2, result;
		String choice, menu;
		boolean keepAlive = true;
		System.out.println("Calulator 1.0");
		System.out.println("============================================");
		
		do {
			System.out.print("Enter first number and press enter: ");
			number1 = readNum();
			
			sc.nextLine();
			System.out.print("Enter an operator and press enter: (+, -, * or /)"); 
			choice = readOperator();
			
			System.out.print("Enter second number and press enter: ");
			number2 = readNum(); 
			
			result = calc(number1, number2, choice);
			
			System.out.println("Result: " + result);
			
			// Menu
			sc.nextLine();
			System.out.println("Press 1 and enter to make another calculation or any other key and enter to exit");
			menu = sc.nextLine();

			if (menu.equals("1")) {
				
			}
				
			else {
				keepAlive = false;
			}

		} while (keepAlive);

	}

	public static float calc(float number1, float number2, String choice) 
	{
		float result = 0;
		
		switch (choice) 
		{
		
		case ("+"):
			return result = add(number1, number2);
		

		case ("-"):
			return result = sub(number1, number2);
		

		case ("*"):
			return result = mult(number1, number2);
		
		case ("/"):
			return result = div(number1, number2);	
	
			
		}
		return result;
	}

	public static float readNum() {
		float num = 0;
		boolean whileNoInt = true;

		while (whileNoInt) {
			try {
				num = sc.nextFloat();
				whileNoInt = false;
			}

			catch (Exception e) {
				System.out.println("Enter a valid number");
				sc.nextLine();
			}
		}
		return num;
	}
	
	public static String readOperator() {
		
		String op = null;
		boolean whileNoOp = true;
		
		while (whileNoOp) {
		
			op = sc.nextLine();
			
			switch(op)
			{
			case ("+"):
			
			case ("-"):
	
			case ("*"):
		
			case ("/"):
				whileNoOp = false;
			break;
			
			default:
			System.out.println("Enter a valid operator");
	
			}	
		}
				return op;
		}

	static float add(float x, float y) {
		return (x+y);
	}
	
	static float sub(float x, float y) {
		return (x-y);
	}

	static float mult(float x, float y) {
		return (x*y);
	}

	static float div(float x, float y) {
			return (x/y);
	}
	
}

