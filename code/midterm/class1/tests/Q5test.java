
class DecryptAnswer {
	public static int getPossibleDecoded(String code, String hint) {
		int i;
		int n_seeds = 0;
		int cnt = 0;
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

public class Q5test {
    public void test(int seed, String original) {
        TranslateTable m = new TranslateTable(seed);
    	String encoded = m.encode(original);
    	String decoded = m.decode(encoded);
        assertTrue(Decrypt.getKeywords(encoded, original) == DecryptAnswer.getKeywords(encoded, original));
    }
    @Test(timeout=5000)
    public void test1() {
		test(10, "hanyang hanyang");
    }
    @Test(timeout=5000)
    public void test2() {
    	test(24, "erica campus");
    }
    @Test(timeout=5000)
    public void test3() {
    	test(2, "hair fair");
    }
    @Test(timeout=5000)
    public void test4() {
    	test(14, "hello world");
    }
    @Test(timeout=5000)
    public void test5() {
    	test(17, "fine wine seller");
    }
}
