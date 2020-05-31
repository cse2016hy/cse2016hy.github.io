package payrolltest;

public class Payroll {
	private static void processPayroll(String in, String out) {
		PayrollReader reader = new PayrollReader(in);
		PayrollWriter writer = new PayrollWriter(out);
		while(reader.getNextRecord()) {
			int pay = reader.hoursOf() * reader.payrateOf();
			writer.printCheck(reader.nameOf(), pay);
		}
		reader.close(); writer.close();
	}
	public static void main(String[] args) {
		DialogReader starter = new DialogReader();
	    String in_name = starter.readString("Please type input payroll name:");
	    String out_name = starter.readString("Please type output payroll name:");
	    if ( in_name != null  &&  out_name != null )
	       { processPayroll(in_name, out_name); }
	    System.out.println("finished");
	}
}
