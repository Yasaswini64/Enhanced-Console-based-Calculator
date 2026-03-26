
import java.util.Scanner;
import java.util.InputMismatchException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n;
		BigDecimal num1 = BigDecimal.ZERO;
		BigDecimal num2 = BigDecimal.ZERO;
		
		do {
			System.out.println("\t-----  Welcome  -----");
			System.out.println("\nAvaliable Operations :");
			System.out.println("-----------------------------");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Square Root");
			System.out.println("6. Power");
			System.out.println("7. Temperature Conversion");
			System.out.println("8. Currency Conversion");
			System.out.println("9. Exit");
			
			System.out.println("-----------------------------------------");
			System.out.print("Enter Your Choice : ");
			
			
			try {
			    n = sc.nextInt();
			
			if (n>=1 && n<=4) {
			//try {
			System.out.print("\nEnter First number : ");
			 num1 = sc.nextBigDecimal();
			
			System.out.print("Enter Second number : ");
			 num2 = sc.nextBigDecimal();
			System.out.println("-----------------------------------------");

			
			//}catch(InputMismatchException e) {
				//System.out.println("Enter valid numbers");
				//System.out.println("Do not Enter Alphabets or Unique Symbols");
				
			//}
			}
			
			switch(n) {
			
			case 1:
				System.out.println("Result: " + num1.add(num2));
				System.out.println("-----------------------------------------");

				
				break;
				
			case 2:
				System.out.println("Result: " + num1.subtract(num2));
				System.out.println("-----------------------------------------");

				break;
				
			 case 3:
			     System.out.println("Result: " + num1.multiply(num2));
			     System.out.println("-----------------------------------------");

			     break;
			 case 4:
			        if (num2.compareTo(BigDecimal.ZERO) == 0) {
			            System.out.println("Cannot divide by zero!");
			        } else {
			            System.out.println("Result: " + num1.divide(num2, 2, RoundingMode.HALF_UP));
			        }
					System.out.println("-----------------------------------------");

			        break;
			 case 5:
				 	System.out.print("Enter number: ");
				 	double num = sc.nextDouble();
				
				 	if (num < 0) {
				        System.out.println("Cannot find Square Root of Negative numbers");
				 	} else {
				        System.out.println("Result: " + Math.sqrt(num));
				    }
				 	System.out.println("-----------------------------------------");

				    break;
			 case 6:
                 	System.out.print("Enter Base number: ");
                 	double base = sc.nextDouble();
                 	
                 	System.out.print("Enter Exponent number: ");
                 	double exp = sc.nextDouble();
                 	
                 	System.out.println("\n-----------------------------------------");
                 	System.out.println("Result: " + Math.pow(base, exp));
                 	System.out.println("-----------------------------------------");

                 break;
                
			 case 7:
                 	System.out.println("1. Celsius to Fahrenheit Converter");
                 	System.out.println("2. Fahrenheit to Celsius Converter");
                 	int tempChoice = sc.nextInt();

                 	if (tempChoice == 1) {
                 		System.out.print("Enter Celsius: ");
                 		double c = sc.nextDouble();
                 		double f = (c * 9 / 5) + 32;
                 		System.out.println("Fahrenheit: " + f);
                 	} else if (tempChoice == 2) {
                 		System.out.print("Enter Fahrenheit: ");
                 		double f = sc.nextDouble();
                 		double c = (f - 32) * 5 / 9;
                 		System.out.println("Celsius: " + c);
                 	} else {
                 		System.out.println("Invalid choice!");
                 	}
                 	System.out.println("-----------------------------------------");

                 break;
			  case 8:
                  	System.out.print("Enter amount in INR: ");
                  	BigDecimal inr = sc.nextBigDecimal();

                  // Example static rate
                  	BigDecimal rate = new BigDecimal("0.012"); 
                  	BigDecimal usd = inr.multiply(rate);

                  	System.out.println("USD: " + usd.setScale(2, RoundingMode.HALF_UP));
                  	System.out.println("-----------------------------------------");
                  break;

              case 9:
    					System.out.println("-----------------------------------------");
    					System.out.println("\t\tExit");
    					System.out.println("-----------------------------------------");     
                  break;

              default:
                  	System.out.println("Invalid choice");
                  	System.out.println("Enter Valid Choice ");
			  		} 
			}catch (InputMismatchException e) {
			  			System.out.println("-----------------------------------------");
	                System.out.println("*Invalid input* \nPlease enter correct numbers \nDo not Include ALPHABESTS and SPECIAL SYMBOLS");
					System.out.println("-----------------------------------------");

	                sc.nextLine(); // clear buffer
	                n = 0;
	            }

	        } while (n != 9);

	        sc.close();
		
		
	}

}