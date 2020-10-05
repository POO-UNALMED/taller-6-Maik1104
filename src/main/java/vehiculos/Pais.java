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
	public static void main (String [ ] args) {
		Pais p1 = new Pais("Ecuador");
		Pais p2 = new Pais("USA");
		Pais p3 = new Pais("Canada");
		
		Fabricante f1 = new Fabricante("Renault", p1);
		Fabricante f2 = new Fabricante("Chevrolet", p1);
		Fabricante f3 = new Fabricante("Tesla", p2);
		Fabricante f4 = new Fabricante("Volvo", p3);
		
		new Camion("SS", "Camion premium", 1000, 100, f1, 3);
		new Camion("AA", "Camion", 1000, 100, f1, 3);
		new Automovil("NN", "Mac 100", 820, 20, f1, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Camioneta("CC", 5, "Ford", 500, 150, f1, true);
		new Automovil("NN", "Mac 100", 820, 20, f2, 4);
		new Camioneta("CC", 5, "Ford", 500, 150, f2, true);
		
		new Camion("SS", "Camion premium", 1000, 100, f3, 3);
		new Camion("AA", "Camion", 1000, 100, f3, 3);
		new Automovil("NN", "Mac 100", 820, 20, f3, 4);
		
		new Camioneta("CC", 5, "Ford", 500, 150, f4, true);
		new Automovil("NN", "Mac 100", 820, 20, f4, 4);
		
		
		System.out.println(Pais.paisMasVendedor().getNombre());
		System.out.println(Fabricante.fabricaMayorventas().getNombre());
	}
	
}
