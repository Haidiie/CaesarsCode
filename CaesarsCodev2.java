
public class CaesarsCodev2 {

	public static void main(String[] args) {
		Cipher c1 = new Cipher(new int[]{1,2,3});
		
		String test = c1.code("xyzabc");
		String test1 = c1.uncode("yacbdf");
		System.out.println(test);
		System.out.println(test1);

	}

}
