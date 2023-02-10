public abstract class KeyCoder extends Coder {
	
	protected static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	protected String key;
	
	public KeyCoder()
	{
		key = null;
	}
	
	public KeyCoder(String key)
	{
		setKey(key);
	}
	
	public String getKey()
	{
		return key;
	}
	
	public void setKey(String key)
	{
		this.key = generateKey(key);
	}
	
	public String generateKey(String line)
	{
		line = justLetters(line);
		String key = "";
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if (key.indexOf(ch) == -1)		// check if ch is in key already
				key += ch;
		}
		for(int i=25; i>=0; i--) {
			char ch = ALPHABET.charAt(i);
			if (key.indexOf(ch) == -1)
				key += ch;
		}
		
		return key;
	}

}
