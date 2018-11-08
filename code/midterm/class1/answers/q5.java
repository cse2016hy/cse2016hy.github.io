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

class Decrypt {
	public static int getPossibleDecoded(String code, String hint) {
		int i;
		int n_seeds = 0;
		for (i = 0; i < 27; i++) {
			TranslateTable m = new TranslateTable(i);
			String decoded = m.decode(code);
			int index = decoded.indexOf(hint);
			if (index > -1) {
				n_seeds++; 
			}
		}
		return n_seeds;
	}
	public static int getKeywords(String code, String plaintext) {
		int i,j,k;
		int result = 0; 
		String[] hints = new String[plaintext.length() * plaintext.length()];
		int n_hints = 0; 
		for (i = 0; i < plaintext.length(); i++) {
			for (j = i + 1; j <= plaintext.length(); j++) {
				String hint = plaintext.substring(i, j); 			
				if (getPossibleDecoded(code, hint) == 1) {
					for (k = 0; k < n_hints; k++) {
						if (hints[k] != null && hints[k].equals(hint))
							break;
					}
					if (k == n_hints) {
						result++;
						hints[n_hints++] = hint;
					}
				}
			}
		}
		return result;
	}
	
}

public class TranslateString {
    public static void main(String[] args) {
    	TranslateTable m = new TranslateTable(4);
    	String original = "haha";
    	String encoded = m.encode(original);
    	System.out.println(Decrypt.getKeywords(encoded, original));
    }
}

