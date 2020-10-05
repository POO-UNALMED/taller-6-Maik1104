package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {

	private static List<Fabricante> fab= new ArrayList<Fabricante>();
	private String nombre;
	public Pais pais;
	public int cantVe;
	
	public Fabricante() {}
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fab.add(this);
	}
	
	
	public static Fabricante fabricaMayorVentas() {
		int aux = 0;
		int p = 0;
		for (int i=0;i<fab.size();i++) {
			if (fab.get(i).cantVe>aux) {
				aux = fab.get(i).cantVe;
				p = i;
			}
		}
		return fab.get(p);
	}
	
	
	
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
}
