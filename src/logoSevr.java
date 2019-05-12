import java.io.IOException;

import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




public class logoSevr extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        	
        	String username = request.getParameter("username");
  		     String password = request.getParameter("password");
  		   jdbc1 dh=new jdbc1();
  	        dh.print(username,password);
        response.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.print("欢迎光临！");
		out.println("</HTML>");
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 
		String user = request.getParameter("username");
		String password =request.getParameter("password");
		
		if(user.equals("zzzz")&&password.equals("123")){
			 request.getRequestDispatcher("/CG").forward(request, response);
		}else{
			 response.sendRedirect("/Mysql/SB");  
		}
		
//		request.setCharacterEncoding("UTF-8");//设置输出内容的编码格式
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("  <BODY>");
//	    out.println("  </BODY>");
//		
	}

}
