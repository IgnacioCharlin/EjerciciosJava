package TrabajoPractico3;

public class Persona {
	int documento;
	int edad;
	String sexo;
	public Persona(int documento, int edad, String sexo) {
		this.documento = documento;
		this.edad = edad;
		this.sexo = sexo;
	}
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
