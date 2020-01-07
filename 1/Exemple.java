// import java.util.StringTokenizer;

public class Exemple {
   public static void main(String[] argv) {
      exo1();
      test1();
      exo2(argv);
   }

   public static void exo1()
   {
      // Quelques déclarations préalables
      String s1 = "loic";
      String s2 = "loic";
      String s3 = new String("loic");
      String s4 = new String("loic");
      String s5 = s3;
      String s6 = null;

      // Test de l'opérateur égal ==
      System.out.print("s1==s2? ");
      System.out.println(s1 == s2);
      System.out.print("s1==s3? ");
      System.out.println(s1 == s3);
      System.out.print("s3==s4? ");
      System.out.println(s3 == s4);
      System.out.print("s5==s3? ");
      System.out.println(s5 == s3);

      // Test de la méthode equals()
      System.out.print("s1.equals(s3)? ");
      System.out.println(s1.equals(s3));
      System.out.print("s1.equals(s6)? ");
      System.out.println(s1.equals(s6));
      // System.out.print("s6.equals(s1)? ");
      // System.out.println(s6.equals(s1));
   }

   public static void exo2(String[] argv)
   {
      for(String item : argv)
      {
         System.out.println(item);
      }
   }

   public static void test1()
   {
      // Dans une regex: '\s' correspond à un espace
      // Comme le '\' est interprété dans une string, on doit l'échapper
      String[] resultat = "je suis une très grande chaine !".split("\\s");
      for(String item : resultat)
      {
         System.out.println(item);
      }
   }
}