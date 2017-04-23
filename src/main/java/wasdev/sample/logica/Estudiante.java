package wasdev.sample.logica;

import java.util.Date;

public class Estudiante {
	
	private String nombre;
	private String apellidos;
	private String carnet;
	private String identificacion;
	private Date fechaNacimiento;
	
	/**
	 * 
	 * Constructor de la clase
	 */
	public Estudiante (String pNombre, String pApellidos, String pCarnet, String pID, Date pFechaN){
		nombre = pNombre;
		apellidos = pApellidos;
		carnet = pCarnet;
		identificacion = pID;
		fechaNacimiento = pFechaN;
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
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date pFechaNacimiento) {
		fechaNacimiento = pFechaNacimiento;
	}
	
	
	

}
