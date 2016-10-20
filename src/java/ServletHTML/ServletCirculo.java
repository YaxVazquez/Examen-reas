package ServletHTML;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletCirculo", urlPatterns = {"/ServletCirculo"})
public class ServletCirculo extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                double radio = Double.parseDouble(request.getParameter("dia"));
                String button = request.getParameter("boton");
                double resultado = 0f;
		if (button.equals("area")) {
			 resultado = 3.1416*radio*radio;
                         response.setContentType("text/html");
                         PrintWriter out = new PrintWriter(response.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>Circulo</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>El resultado es "  + resultado + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
		} else if (button.equals("perimetro")) {
                         resultado = 3.1416*(radio+radio);
                         response.setContentType("text/html");
                         PrintWriter out = new PrintWriter(response.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>Circulo</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>El resultado es "  + resultado + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
                }
	}
}
