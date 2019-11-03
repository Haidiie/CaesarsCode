
public class Cipher {
	private int[] key;
	
	
	public Cipher(int arr[]) {
		this.key = arr;
	}
	
	public String code(String in) {
		return crypt (in);
	}
	
	public String uncode(String in) {
		return uncrypt (in);
	}

	
	
	private String crypt(String text) {

		String svar = "";
		for(int i = 0; i<text.length(); i++) {
			
			
			char c = (char)(text.charAt(i) + key[i%key.length]);
			if (c > 'z')
				svar+=	(char)(text.charAt(i) + key[i%key.length] -26);
			else
				svar+= (char)(text.charAt(i) + key[i%key.length]);
		}
		return svar.toString();
	}
	
	
	private String uncrypt(String text) {

		String svar = "";
		for(int i = 0; i<text.length(); i++) {
			
			
			char c = (char)(text.charAt(i) - key[i%key.length]);
			if (c < 'a')
				svar+=	(char)(text.charAt(i) - key[i%key.length] +26);
			else
				svar+= (char)(text.charAt(i) - key[i%key.length]);
		}
		return svar.toString();
	}
	
}
