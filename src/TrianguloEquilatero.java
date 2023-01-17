package edu.piobaroja.dam1.programacion.trianguloequilatero;

public class TrianguloEquilatero {

	private double lado;
	
	public TrianguloEquilatero() {
		lado=0;
	}
	
	public TrianguloEquilatero(double lado) {
		this.lado=lado;
	}
	
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double getPerimetro() {
		return 3*this.lado;
	}
	
	public double getAltura() {
		return 2*Math.sqrt(3*Math.pow(lado,2));
	}
	
	public double getArea() {
		return lado*getAltura()/2;
	}
	
	public String toString() {
		return "Lado: "+lado+"\n"+
				"Altura: "+getAltura()+"\n"+
				"Perimertro: "+getPerimetro()+"\n"+
				"Area: "+getArea()+"\n";
				
	}
}
