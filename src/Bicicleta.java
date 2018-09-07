
public class Bicicleta {
	private String nroDeSerie;
	private String modelo;
	private int año;
	private float precio;

	public Bicicleta(String nroDeSerie, String modelo, int año, float precio){
		this.nroDeSerie= nroDeSerie;
		this.modelo= modelo;
		this.año= año;
		this.precio= precio;
	}

	public void setPrecio(float precio){
		this.precio= precio;
	}

	public float getPrecio(){
		return precio;
	}

	public String getNroDeSerie(){
		return nroDeSerie;
	}

}
