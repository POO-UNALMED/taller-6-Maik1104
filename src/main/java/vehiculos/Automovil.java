package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	private int puertas = 4;
	private int velocidadMaxima = 100;
	private String traccion = "FWD";
	
	public Automovil(){cantidadVehiculos++;}
	
	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		this.setPlaca(placa);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setFabricante(fabricante);
		this.puestos = puestos;
		cantidadVehiculos++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
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
