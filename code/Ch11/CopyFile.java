import java.io.*; import javax.swing.*;

public class CopyFile {
	public static void main(String[] args) throws IOException {
		JFileChooser chooser = new JFileChooser();
		chooser.setDialogTitle("복사할 파일을 선택하세요.");
		int result = chooser.showDialog(null, "Copy");
		if(result != JFileChooser.APPROVE_OPTION) 
			System.exit(0);
		String f = chooser.getSelectedFile().toString();
		BufferedReader infile = new BufferedReader(new FileReader(f));
		PrintWriter outfile = new PrintWriter(new FileWriter(f + ".out"));
		while (infile.ready()) {
			outfile.println(infile.readLine());
		}
		infile.close();
		outfile.close();
	}
}
