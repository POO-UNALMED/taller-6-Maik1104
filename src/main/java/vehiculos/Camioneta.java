package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camioneta extends Vehiculo {
	
	static List<Camioneta> camionetas= new ArrayList<Camioneta>();
	private boolean volco;
	private int velocidadMaxima = 90;
	private String traccion = "4X4";
	
	public Camioneta() {camionetas.add(this);}
	
	public Camioneta(String placa,int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setFabricante(fabricante);
		this.volco = volco;
		camionetas.add(this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
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
