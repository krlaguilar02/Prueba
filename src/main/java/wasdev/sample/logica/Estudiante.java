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
	/**
	 * 
	 * @return
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * 
	 * @param pApellidos
	 */
	public void setApellidos(String pApellidos) {
		apellidos = pApellidos;
	}
	/**
	 * 
	 * @return
	 */
	public String getCarnet() {
		return carnet;
	}
	/**
	 * 
	 * @param pCarnet
	 */
	public void setCarnet(String pCarnet) {
		carnet = pCarnet;
	}
	/**
	 * 
	 * @return
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * 
	 * @param pIdentificacion
	 */
	public void setIdentificacion(String pIdentificacion) {
		identificacion = pIdentificacion;
	}
	/**
	 * 
	 * @return
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * 
	 * @param pFechaNacimiento
	 */
	public void setFechaNacimiento(String pFechaNacimiento) {
		fechaNacimiento = pFechaNacimiento;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", carnet=" + carnet + ", identificacion="
				+ identificacion + ", fechaNacimiento=" + fechaNacimiento + ", email=" + email + "]";
	}
	
	
	
	

}
