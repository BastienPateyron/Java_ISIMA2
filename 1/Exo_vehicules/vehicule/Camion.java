package vehicule;

public class Camion {
   private String immat;
   private Float capacite;

   public Camion() {}
   public void afficher() {System.out.println("Je suis le Camion: " + immat);}
   public void avancer() {System.out.println("J'avance");}
}