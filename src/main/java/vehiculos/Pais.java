package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	
	
	private static List<Pais> paises= new ArrayList<Pais>();
	private String nombre;
	public int cantV;

	public Pais() {	}
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static Pais paisMasVendedor() {
		int aux = 0;
		int p = 0;
		for (int i=0;i<paises.size();i++) {
			if (paises.get(i).cantV>aux) {
				aux = paises.get(i).cantV;
				p = i;
			}
		}
		return paises.get(p);
	}
		
}
