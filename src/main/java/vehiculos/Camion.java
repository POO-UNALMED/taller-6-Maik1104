package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo {

	static List<Camion> camiones= new ArrayList<Camion>();
	private int ejes;
	private int puertas = 2;
	private int velocidadMaxima = 80;
	private String traccion = "4X2";
	
	public Camion() {camiones.add(this);}
	
	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		this.setPlaca(placa);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setFabricante(fabricante);
		this.ejes = ejes;
		camiones.add(this);}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
}
