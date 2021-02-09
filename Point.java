/**
 * Classe définissant un Point pour le TD00 de COO, question 3.
 *
 * @author Nicolas Ferrayé, groupe 1A
 * @version 1.0 du 03/02/2021 au 09/02/2021
 */


 public class Point {

	// Coordonnées cartésiennes
	private double x;
	private double y;

	// Distance à l'origine
	private double rho;

	// Angle avec l'axe horizontal
	private double theta;

	// Méthodes

	/* -------- GET ------- */
	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getRho() {
		return this.rho;
	}

	public double getTheta() {
		return this.theta;
	}
	/* -------- GET ------- */


	/* -------- SET ------- */
	public void setX(double pfX) {
		this.x = pfX;
	}

	public void setY(double pfY) {
		this.y = pfY;
	}

	public void setRho(double phRho) {
		this.rho = pfRho;
	}

	public void setTheta(double pfTheta) {
		this.theta = pfTheta;
	}
	/* -------- SET ------- */


	// ROTATION
	public void rotate(double pfValeur) {
		this.theta = (this.rotate + pfValeur);
	}

	// TRANSLATION
	public void translate(double pfX, double pfY) {
		this.x = pfX;
		this.y = pfY;
	}

	// SCALE

}