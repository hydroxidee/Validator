package csci201_lab11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Validation")
public class Validation extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
    	//requests
    	String name = request.getParameter("fname");
    	String ssn = request.getParameter("ssn");
    	String email = request.getParameter("email");
    	String month = request.getParameter("bdaymonth");
    	String text = request.getParameter("text");
    	String grade = request.getParameter("grade");
    	String foods = request.getParameter("favoriteFoods");
    	
    	int points = Integer.parseInt(request.getParameter("points"));
    	PrintWriter out = response.getWriter();
    	response.setContentType("application/json");
    	
    	
    	// prints
    	out.println("{");
    	out.println("\"FirstName\":" + "\"" + name+ "\",");
    	out.println("\"SSN\":" + "\"" + ssn + "\",");
    	out.println("\"Email\":" + "\"" + email+ "\",");
    	out.println("\"Birthmonth\":" + "\"" + month+ "\",");
    	out.println("\"Text\":" + "\"" + text+ "\",");
    	out.println("\"Grade\":" + "\"" + grade+ "\",");
    	out.println("\"Favorite Foods\":" + "\"" + foods+ "\",");
    	out.println("\"Points\":"  + String.valueOf(points));
    	out.println("}");
    }
}

