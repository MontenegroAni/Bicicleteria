import java.util.ArrayList;
import java.util.List;

public class Bicicleteria {
	private List<Bicicleta> bicicletas;
	private float ganancias;
	private int cantidadDeVentas;

	public Bicicleteria(List<Bicicleta> bicicletas, float ganancias, int cantidadDeVentas){
		this.bicicletas= new ArrayList<>();
		this.ganancias= ganancias;
		this.cantidadDeVentas= cantidadDeVentas; 
	}

	public void addBicicleta(Bicicleta nuevaBici){
		this.bicicletas.add(nuevaBici);
	}

	public void venderBicicleta(Bicicleta bicicleta){
		this.bicicletas.remove(bicicleta);
		cantidadDeVentas++;
		ganancias= ganancias + bicicleta.getPrecio();
	}

	public Bicicleta buscarBicicleta(String nroDeSerie){
		for(Bicicleta b : bicicletas){
			if(nroDeSerie.equals(b.getNroDeSerie())){
				return b;
			}
		}
		return null;
	}

}
