

public class IntegerKey implements Key {
	private int key;
	public IntegerKey(int i) { key = i; }
	public int getInt() { return key; }
	public boolean equals(Key k) {
		return key == ((IntegerKey)k).getInt();
	}
	public String toString() {
		return Integer.toString(key); 
	}
}
