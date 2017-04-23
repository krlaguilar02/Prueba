package wasdev.sample.logica;

import java.util.Date;

public class Estudiante {
	
	private String nombre;
	private String apellidos;
	private String carnet;
	private String identificacion;
	private String fechaNacimiento;
	private String email;
	
	/**
	 * 
	 * Constructor de la clase
	 */
	public Estudiante (String pNombre, String pApellidos, String pCarnet, String pID, 
			String pFechaN, String pEmail){
		nombre = pNombre;
		apellidos = pApellidos;
		carnet = pCarnet;
		identificacion = pID;
		fechaNacimiento = pFechaN;
		email = pEmail;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String pNombre) {
		nombre = pNombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String pApellidos) {
		apellidos = pApellidos;
	}
	public String getCarnet() {
		return carnet;
	}
	public void setCarnet(String pCarnet) {
		carnet = pCarnet;
	}
	public String getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(String pIdentificacion) {
		identificacion = pIdentificacion;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String pFechaNacimiento) {
		fechaNacimiento = pFechaNacimiento;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", carnet=" + carnet + ", identificacion="
				+ identificacion + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + "]";
	}
	
	
	
	

}
