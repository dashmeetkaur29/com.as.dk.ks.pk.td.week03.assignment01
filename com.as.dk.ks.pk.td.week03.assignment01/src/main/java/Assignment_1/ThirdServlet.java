package Assignment_1;

/* Date - 25 January 2022
Author - Dashmeet Kaur
Description - Third Servlet Class, Calculates Minimum, Maximum marks and finds grade according to percentage. Further sends response to jsp page
*/

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
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/ThirdServlet")
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ThirdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();

		// Getting the attributes of session
		String name = (String) session.getAttribute("studName");
		String m1 = (String) session.getAttribute("marks1");
		String m2 = (String) session.getAttribute("marks2");
		String m3 = (String) session.getAttribute("marks3");
		String m4 = (String) session.getAttribute("marks4");
		String m5 = (String) session.getAttribute("marks5");

		// Calculating average, maximum and minimum scores
		int[] marksArr = new int[5];
		marksArr[0] = Integer.parseInt(m1);
		marksArr[1] = Integer.parseInt(m2);
		marksArr[2] = Integer.parseInt(m3);
		marksArr[3] = Integer.parseInt(m4);
		marksArr[4] = Integer.parseInt(m5);

		String avg = (String) session.getAttribute("avg");
		Double avg1 = Double.parseDouble(avg);
		int min = marksArr[0];

		for (int i = 1; i < marksArr.length; i++) {
			if (marksArr[i] < min)
				min = marksArr[i];
		}

		int max = marksArr[0];
		for (int i = 1; i < marksArr.length; i++) {
			if (marksArr[i] > max)
				max = marksArr[i];
		}
		
		//Calculating Grade
		String grade;
		if (avg1>=94){
	         grade = "A+";
		}
		else if (avg1>=87 && avg1<93){
	         grade = "A";
	      }else if(avg1>=70 && avg1<79){
	         grade = "B";
	      }
	      else if(avg1>=80 && avg1<86){
	         grade = "A-";
	      }
	      else if(avg1>=77 && avg1<79){
		         grade = "B+";
		      }
	      else if(avg1>=73 && avg1<76){
		         grade = "B";
		      }
	      else if(avg1>=70 && avg1<72){
		         grade = "B-";
		      }
	      else if(avg1>=67 && avg1<69){
		         grade = "C+";
		      }
	      else if(avg1>=63 && avg1<66){
		         grade = "C";
		      }
	      else if(avg1>=60 && avg1<62){
		         grade = "C-";
		      }
	      else if(avg1>=50 && avg1<59){
		         grade = "D";
		      }
	      else {
	         grade = "F";
	      }

		String msg="";
	      switch(grade) {
	         case "A+" :
	        	 msg = "4.0";
	        	 break;
	         case "A" :
	            msg = "3.7";
	            break;
	         case "A-" :
	        	 msg = "3.5";
		            break; 
	         case "B+" :
	        	 msg = "3.2";
		            break;
	         case "B" :
	        	 msg = "3.0";
		            break;
	         case "C+" :
	        	 msg = "2.7";
		            break;
	         case "C" :
	        	 msg = "2.3";
		            break;
	         case "C-" :
	        	 msg = "1.7";
		            break;
	         case "D" :
	        	 msg = "1.0";
	        	 break;
	         case "F" :
	        	 msg = "0.0";
		            break;
	         default :
	         System.out.println("Invalid grade");
	      }
	      
		session.setAttribute("name", name);
		session.setAttribute("minMarks", min);
		session.setAttribute("maxMarks", max);
		session.setAttribute("avgMarks", avg);
		session.setAttribute("grade", grade);
		session.setAttribute("msg", msg);
		response.sendRedirect( request.getContextPath() + "/final.jsp");

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
