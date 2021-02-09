/**
 * Classe définissant une Ligne pour le TD00 de COO, question 5.1.
 *
 * @author Nicolas Ferrayé, groupe 1A
 * @version 1.0 du 09/02/2021
 */


 public class Ligne {

	private Point a;
	private Point b;

	// Méthodes

	/* -------- GET ------- */
	public Point getA() {
		return this.a;
	}

	public Point getB() {
		return this.b;
	}
	/* -------- GET ------- */


	/* -------- SET ------- */
	public void setACarthesien(double pfX, double pfY) {
		this.a.setX(pfX);
		this.a.setY(pfY);
	}

	public void setAPolaire(double pfRho, double pfTheta) {
		this.a.setRho(pfRho);
		this.a.setTheta(pfTheta);
	}

	public void setBCarthesien(double pfX, double pfY) {
		this.b.setX(pfX);
		this.b.setY(pfY);
	}

	public void setBPolaire(double pfRho, double pfTheta) {
		this.b.setRho(pfRho);
		this.b.setTheta(pfTheta);
	}
	/* -------- SET ------- */

}