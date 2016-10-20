package ServletHTML;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ServletRectangulo", urlPatterns = {"/ServletRectangulo"})
public class ServletRectangulo extends HttpServlet {
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse respons)
			throws ServletException, IOException {
		Float lado1 = Float.parseFloat(request.getParameter("ld1"));
		Float lado2 = Float.parseFloat(request.getParameter("ld2"));
                String button = request.getParameter("boton");
                float resultado = 0f;
		if (button.equals("area")) {
			 resultado = lado1*lado2;
                         respons.setContentType("text/html");
                         PrintWriter out = new PrintWriter(respons.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>RectanguloArea</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>El resultado es "  + resultado + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
		} else if (button.equals("perimetro")) {
                         resultado = lado1+lado1+lado2+lado2;
                         respons.setContentType("text/html");
                         PrintWriter out = new PrintWriter(respons.getOutputStream());
                         out.println("<!DOCTYPE html>");
                            out.println("<html>");
                            out.println("<head><title>RectanguloPerimetro</title></head>");
                            out.println("<body>");
                            out.println("<h1><center>El resultado es "  + resultado + "</center></h1>");
                            out.println("</body></html>");
                            out.close();
                }
	}
}

