/** Example4 starts the application */
public class Example4
{ public static void main(String[] args)
  { Counter4 model = new Counter4(0);
    Drawing drawing = new Drawing(model);
    Frame4 view = new Frame4(model, drawing);
  }
}
