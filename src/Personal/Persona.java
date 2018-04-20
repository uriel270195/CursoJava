package Personal;

public class Persona {
	
	private String Nombre,apellidos;
	private int edad;
	private char sexo;
	public void setPersona(String nombre,String ap,int edad,char sexo) {
		this.Nombre=nombre;
		apellidos=ap;
		this.edad=edad;
		this.sexo=sexo;
	}
	public String getNom() {
		return Nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public char getSexo() {
		return sexo;
	}
}