import vehicule.*;

public class Gestion3 {
   public static void main(String[] argv) {
      Voiture v = new Voiture("AB CD EF GH", 3, 5);
      Camion c = new Camion();

      v.afficher();
      v.avancer();

      c.afficher();
      c.avancer();
   }
}