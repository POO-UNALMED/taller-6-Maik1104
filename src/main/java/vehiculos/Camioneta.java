package vehiculos;

public class Camioneta extends Vehiculo {
	
	private boolean volco;
	private int velocidadMaxima = 90;
	private String traccion = "4x4";
	
	public Camioneta() {}
	
	public Camioneta(String placa,int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		this.setPlaca(placa);
		this.setPuertas(puertas);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setFabricante(fabricante);
		this.volco = volco;
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
