

/** Example4 starts the application */
public class Example4
{ public static void main(String[] args)
  { Counterl model = new Counterl(0);
    Drawing drawing = new Drawing(model);
    Frame4 view = new Frame4(model, drawing);
  }
}


