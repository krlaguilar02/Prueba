package wasdev.sample.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wasdev.sample.logica.Estudiante;

/**
 * Servlet implementation class controladorRegistro
 */
@WebServlet(name ="controladorRegistro" ,urlPatterns = "/controladorRegistro")
public class controladorRegistro extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladorRegistro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre=request.getParameter("nombre");
		String carne=request.getParameter("carnet");
		String apellidos = request.getParameter("apellidos");
		String fecha = request.getParameter("fecha");
		String email = request.getParameter("email");
		String id = request.getParameter("identificacion");
		Estudiante estudiante = new Estudiante (nombre, apellidos, carne,id,fecha, email);
		
		System.out.println(estudiante.toString());
		System.out.println(nombre);		


		response.getWriter().print(estudiante.toString());
	}

}
