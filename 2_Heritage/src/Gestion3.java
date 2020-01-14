import vehicule.*;

public class Gestion3 {
   public static void main(String[] argv) {
      Voiture v = new Voiture("MaVoiture", 3, 5);
      Camion c = new Camion("MonCamion", 35);

      v.afficher();
      v.avancer();

      c.afficher();
      c.avancer();
   }
}