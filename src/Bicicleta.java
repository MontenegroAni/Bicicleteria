
public class Bicicleta {
	private String nroDeSerie;
	private String modelo;
	private int a�o;
	private float precio;

	public Bicicleta(String nroDeSerie, String modelo, int a�o, float precio){
		this.nroDeSerie= nroDeSerie;
		this.modelo= modelo;
		this.a�o= a�o;
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
