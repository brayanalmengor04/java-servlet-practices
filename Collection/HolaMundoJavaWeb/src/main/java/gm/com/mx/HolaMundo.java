package gm.com.mx;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

// Nombre del servlets
@WebServlet("/Servlet") //http:8080/HolaMundoJavaWeb/Servlet asi se mostraria en lla web 
public class HolaMundo extends HttpServlet{
    
    @Override                //eL MTODO DOGET peticion - Respuesta  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        response.setContentType("text/html;charset=UTF-8"); // El tipo de respuesta HTML 
        var salida = response.getWriter();
        salida.print("Hola mundo salida del servlets a la web");
    }
}
