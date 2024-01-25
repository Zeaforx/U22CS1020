import java.util.Scanner;
// Ajibade Caleb
// Computer Science
// U22CS1020
class Maincalculator{
    public static void main(String[] args) {
        
        String[] userInfo = userInput();
        
        String firstNumber = userInfo[0];
        String secondNumber = userInfo[1];
        String operator = userInfo[2];
        calculationLogic(operator, firstNumber, secondNumber);
    }

    static void calculationLogic(String operator, String firstNumber, String secondNumber) {
        try {
            float firstNumberInput = Float.valueOf(firstNumber);
            float secondNumberInput = Float.valueOf(secondNumber);

            float calculation;
           
           switch (operator) {
               case "+":
    
                   calculation = firstNumberInput + secondNumberInput;
                   System.out.print(firstNumber + " + " + secondNumber + " = " + calculation);
                   break;
               case "-":
                   calculation = firstNumberInput + secondNumberInput;
                   System.out.print(firstNumber + " + " + secondNumber + " = " + calculation);
                   break;
               case "*":
                   calculation = firstNumberInput + secondNumberInput;
                   System.out.print(firstNumber + " + " + secondNumber + " = " + calculation);
                   break;
               case "/":
                   if (secondNumberInput == 0) {
                   throw new ArithmeticException("Division by zero is not allowed.");
                   
                   }else {
                       calculation = firstNumberInput / secondNumberInput;
                       System.out.print(firstNumber + " / " + secondNumber + " = " + calculation);
    
                   }
                   break;
               
               case "=":
                   boolean equals = firstNumberInput == secondNumberInput;
                   if (equals == true) {
                       
                       System.out.print(firstNumber + " = " + secondNumber );
                   } else {
                       System.out.print(firstNumber + " != " + secondNumber );
    
                   }
                   break;
    
    
               default:
                   throw new IllegalArgumentException("Invalid operator. Use +, -, *, or /");
           }



            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: The number you provided cannot be used");
        }
        
    }
    
     public static String[] userInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Input first number");
        String firstNumber = scanner.nextLine();
        
        System.out.println("Input second number");
        String secondNumber = scanner.nextLine();
        System.out.println("Input operation");
        String operator = scanner.nextLine();
        scanner.close();
        return new String[]{firstNumber, secondNumber, operator};
    }
    
}