import javax.swing.*;

class TranslateTable {

    private int[] encode;
    private int[] decode;

    public TranslateTable(int seed) {
	    encode = new int[27];
	    decode = new int[27];
	    encode[0] = seed;
	    decode[seed] = 0;
	    for(int i=1; i<27; i++) {
		    int new_code = (encode[i-1]+4) % 27;
		    encode[i] = new_code;
		    decode[new_code] = i;
	    }
    }
    
    private int c2i(char c) {
    	if(c==' ') return 0;
    	if('a'<=c && c<='z') return c-'a'+1;
    	throw new RuntimeException("c2i: invalid character " + c);
    }

    private char i2c(int i) {
    	if(i==0) return ' ';
    	if(0<i && i<27) return (char)('a'+i-1);
    	throw new RuntimeException("i2c: invalid code " + i);
    }
    
    public char encode(char c) {
    	return i2c(encode[c2i(c)]);
    }

    public String encode(String s) {
    	String answer = "";
    	for(int i=0; i<s.length(); i++)
    		answer = answer + encode(s.charAt(i));
    	return answer;
    }

    public char decode(char c) {
    	return i2c(decode[c2i(c)]);
    }

    public String decode(String s) {
    	String answer = "";
    	for(int i=0; i<s.length(); i++)
    		answer = answer + decode(s.charAt(i));
    	return answer;
    }
    
}

public class TranslateString {
    public static void main(String[] args) {
    	TranslateTable m = new TranslateTable(1);
    	String original = JOptionPane.showInputDialog("암호화할 문장을 입력하세요.");
    	String encoded = m.encode(original);
    	String decoded = m.decode(encoded);
    	JOptionPane.showMessageDialog(null, "원본: " + original + "\n암호화: " + encoded + "\n복호화: " + decoded);
    	System.exit(0);
    }
}
