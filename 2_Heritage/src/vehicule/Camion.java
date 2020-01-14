package vehicule;

public class Camion extends Vehicule {
   private Float capacite;

   public Camion(String immat, float capacite) {
	   super(immat);
	   this.capacite = capacite;
   }
   
   public void afficher() {System.out.println("Je suis le Camion: " + getImmat());}
//   public void avancer() {System.out.println("J'avance");}
}