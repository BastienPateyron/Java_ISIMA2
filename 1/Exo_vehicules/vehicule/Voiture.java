package vehicule;

public class Voiture {
   private String immat;
   private Integer couleur;
   private Integer places;

   public Voiture(String imat, int couleur, int places)
   {
      this.immat = imat;
      this.couleur = couleur;
      this.places = places;
   }
   public void afficher() {System.out.println("Je suis la Voiture: " + immat);}
   public void avancer() {System.out.println("J'avance");}
}