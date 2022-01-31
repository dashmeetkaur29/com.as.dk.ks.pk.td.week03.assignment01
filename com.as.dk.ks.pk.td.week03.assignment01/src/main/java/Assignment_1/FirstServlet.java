/** Date - 24-01-2022
Author - Ayush Kumar Singh
Description - Login form that accepts username and password and does validation at First Servelet 
			  and forwards response to another Servlet

*/
package Assignment_1;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public FirstServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String uname = request.getParameter("userName");
			String upass = request.getParameter("password");
			if(uname.compareToIgnoreCase("student")==0 && upass.compareToIgnoreCase("student")==0 )
			{
				HttpSession session = request.getSession();
				session.setAttribute("uname", uname);
				RequestDispatcher rd=request.getRequestDispatcher("/marksForm.jsp");  
		        rd.forward(request, response);  
//				out.print("Welcome " + uname);
//				HttpSession session = request.getSession();
//				session.setAttribute("uname", uname);

				out.print("<a href='SecondServlet'>visit</a>");
			}
			else
			{
				out.println("Username or Password is incorrect. <br> Please enter the correct username and password!");
				out.println("<br><br> Username Hint : student <br>  Password Hint : student");
		        RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");  
		        rd.include(request, response); 
			}



			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
