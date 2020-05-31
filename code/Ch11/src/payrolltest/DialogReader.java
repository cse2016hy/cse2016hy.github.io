package payrolltest;

import javax.swing.JOptionPane;

public class DialogReader {
	public String readString(String prompt) { 
		String input = JOptionPane.showInputDialog(prompt);
	    return input;
	}
	public int readInt(String prompt) { 
		int input = -1;
		input = new Integer( readString(prompt).trim() ).intValue();
		return input; 
	}
}
