package encodedecode;

import javax.swing.JOptionPane;

public class TranslateString {

	public static void main(String[] args) {
		TranslateTable m = new TranslateTable(2);
		String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요. ");
		String encoded = m.encode(original);
		String decoded = m.decode(encoded);
		JOptionPane.showMessageDialog(null, "original " + original + "\n encoded: " + encoded + "\n decoded: " + decoded);
	}

}
