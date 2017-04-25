package wasdev.sample.controlador;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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
       
	String nombre;
	String carne;
	String apellido;
	String fecha;
	String email;
	String id;
	Estudiante estudiante;
	
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String nombre=request.getParameter("nombre");
		
		 carne=request.getParameter("carnet");
		 apellido = request.getParameter("apellidos");
		 fecha = request.getParameter("fecha");
		 email = request.getParameter("email");
		 id = request.getParameter("identificacion");
		 estudiante = new Estudiante (nombre, apellido, carne,id,fecha, email);
		
		System.out.println(estudiante.toString());
		System.out.println(nombre);	
		request.setAttribute("nombre",nombre);
		request.getRequestDispatcher("Administrador.html");
		//response.getWriter().print(estudiante.toString());
		//response.sendRedirect("Administrador.html");
		
		
		
		/**String ruta = "src/archivo.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(estudiante.toString());
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(estudiante.toString());
        }
        bw.close();**/
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		nombre=request.getParameter("nombre");
		
		 carne=request.getParameter("carnet");
		 apellido = request.getParameter("apellido1");
		 fecha = request.getParameter("fecha");
		 email = request.getParameter("email");
		 id = request.getParameter("identificacion");
		 estudiante = new Estudiante (nombre, apellido, carne,id,fecha, email);
	
		
		if (email != null) {
            request.getSession().setAttribute("email", email);
            response.sendRedirect("InicioSesion.html");
        }
        else {
            request.setAttribute("error", "Unknown user, please try again");
            request.getRequestDispatcher("Administrador.html").forward(request, response);
        }
		//response.getWriter().print(estudiante.toString());
	}

}
