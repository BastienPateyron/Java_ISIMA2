package tp1;

public class Bidon {

	public static void main(String[] argv) {
		tests();
	}
	
	
	public static void tests () {
		// Quelques d�clarations pr�alables
		String s1 = "loic";
		String s2 = "loic";
		String s3 = new String("loic");
		String s4 = new String("loic");
		String s5 = s3;
		String s6 = null;

		// Test de l'op�rateur �gal == 
		System.out.print("s1==s2? ");
		System.out.println(s1==s2);
		System.out.print("s1==s3? ");
		System.out.println(s1==s3);
		System.out.print("s3==s4? ");
		System.out.println(s3==s4);
		System.out.print("s5==s3? " );
		System.out.println(s5==s3);

		// Test de la m�thode equals()
		System.out.print("s1.equals(s3)? ");
		System.out.println(s1.equals(s3));
		System.out.print("s1.equals(s6)? ");
		System.out.println(s1.equals(s6));
		System.out.print("s6.equals(s1)? ");
//		System.out.println(s6.equals(s1));
	}
}
