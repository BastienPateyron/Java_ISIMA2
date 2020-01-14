package vehicule;

public class Voiture extends Vehicule {
   private Integer couleur;
   private Integer places;

   public Voiture(String immat, int couleur, int places)
   {
      super(immat);
      this.couleur = couleur;
      this.places = places;
   }
   
   public void afficher() {System.out.println("Je suis la Voiture: " + getImmat());}
//   public void avancer() {System.out.println("J'avance");}
}