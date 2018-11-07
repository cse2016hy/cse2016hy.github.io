/**  CelsiusToFahrenheit converts an input Celsius value to Fahrenheit.
  *    output: the degrees Fahrenheit, a double */
public class CelsiusToFahrenheit0
{ public static void main(String[] args)
  { int c;                                // a declaration of  c
    c = 20;                               // an assignment to  c
    double f = ((9.0/5.0) * c) + 32;      // an initialization of  f
    System.out.println("For Celsius degrees " + c + ",");
    System.out.println("Degrees Fahrenheit = " + f); 
  }
}

