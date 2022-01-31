package Assignment_1;

/* Date - 25 January 2022
Author - Dashmeet Kaur
Description - Second Servelet Class, Accepts marks in all subjects, calculates average and displays grade schema.
*/

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public SecondServlet() {
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
			String studName = request.getParameter("studName");
			int marks1 = Integer.parseInt( request.getParameter("sub1Marks"));
			int marks2 = Integer.parseInt( request.getParameter("sub2Marks"));
			int marks3 = Integer.parseInt( request.getParameter("sub3Marks"));
			int marks4 = Integer.parseInt( request.getParameter("sub4Marks"));
			int marks5 = Integer.parseInt( request.getParameter("sub5Marks"));
			
			
			//Performing average on marks
			double avg = (marks1 + marks2 + marks3 + marks4 + marks5)/5;
			
			//Setting the session attributes
			HttpSession session = request.getSession();
			session.setAttribute("studName", studName);
			session.setAttribute("marks1", Integer.toString(marks1));
			session.setAttribute("marks2", Integer.toString(marks2));
			session.setAttribute("marks3", Integer.toString(marks3));
			session.setAttribute("marks4", Integer.toString(marks4));
			session.setAttribute("marks5", Integer.toString(marks5));
			session.setAttribute("avg", Double.toString(avg));
			
			//Showing the average marks and grade point as output 
			out.print("<body bgcolor=#6abadeba;>");
			out.print("<h2 style='color :orange; margin-top:30px; margin-left:10px;'>Welcome "+studName+"</h2>");
			out.print("<br><br> <p style='margin-left:10px; font-size:26px;'>The average of the marks is : " + Double.toString(avg) + "</p><br><br>");
			out.print("<table style= 'background-color:pink; margin-left:10px; margin-top:10px;'>"
					+ "<tr><th>  PERCENTAGE  </th> <th>  LETTER GRADE  </th>	<th>  GRADE POINT  </th></tr>"
					+ "<tr><td> 94-100 </td> <td> A+ </td> <td> 4.0 </td></tr>"
					+ "<tr><td> 87-93 </td> <td>  A </td> <td> 3.7 </td></tr>"
					+ "<tr><td> 80-86 </td> <td>  A- </td> <td> 3.5 </td></tr>"
					+ "<tr><td> 77-79 </td> <td>  B+ </td> <td> 3.2 </td></tr>"
					+ "<tr><td> 73-76 </td> <td>  B </td> <td> 3.0 </td></tr>"
					+ "<tr><td> 70-72 </td> <td>  B- </td> <td> 2.7 </td></tr>"
					+ "<tr><td> 67-69 </td> <td>  C+ </td> <td> 2.3 </td></tr>"
					+ "<tr><td> 63-66 </td> <td>  C </td> <td> 2.0 </td></tr>"
					+ "<tr><td> 60-62 </td> <td>  C- </td> <td> 1.7 </td></tr>"
					+ "<tr><td> 50-59 </td> <td>  D </td> <td> 1.0 </td></tr>"
					+ "<tr><td> 0-49 </td> <td>   F </td> <td> 0.0 </td></tr>"
					+ "</table> <br><br><br> ");
			

			out.print("<a style= 'margin-left:10px;' href='ThirdServlet'>Click here to get more details on your marks</a>");
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
