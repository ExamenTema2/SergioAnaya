public class Vehiculo {
	private String matricula;
	private String fabricante;
	private String modelo;

	public Vehiculo(String matricula, String fabricante, String modelo) {
		this.matricula = matricula;
		this.fabricante = fabricante;
		this.modelo = modelo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
