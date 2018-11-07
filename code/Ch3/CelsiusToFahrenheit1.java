import java.text.*;
/** CelsiusToFahrenheit converts an input Celsius value to Fahrenheit.
  *     input: the degrees Celsius, a program argument, an integer 
  *     output: the degrees Fahrenheit, a double
  */ 
public class CelsiusToFahrenheit1
{ public static void main(String[] args)
  { int c = new Integer(args[0]).intValue(); // args[0] is the program argument
    double f = ((9.0/5.0)*c) + 32; 
    System.out.println("For Celsius degrees " + c + ",");
    DecimalFormat formatter = new DecimalFormat("0.0");
    System.out.println("Degrees Fahrenheit = " + formatter.format(f));
  } 
} 


