package vehicule;

public abstract class Vehicule {
	
	protected String immat;
	
	public Vehicule(String immat) {
		this.immat = immat;
	}
	
	public abstract void afficher();
	public void avancer() {System.out.println("J'avance");}
	
	public String getImmat() {return this.immat;}
	public void setImmat(String immat) {this.immat = immat;}
}
