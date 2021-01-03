

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class prime
 */
@WebServlet("/prime")
public class prime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public prime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		String a= request.getParameter("number");

		int n;
		
		n=Integer.parseInt(a);
		
		if(isPrime(n)) {
			out.print("is prime");
			
		}else {
			out.print("not prime");
		}
	}
	
	static boolean isPrime(int n) {
		if(	n<= 1 ) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0);
		}
		
		return true;		


}

}
