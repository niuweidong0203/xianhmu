import java.io.IOException;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;


public class jdbc extends HttpServlet {
        public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          String username;
          String password;
          Connection con = null;
		 try{
			   Class.forName("com.mysql.jdbc.Driver");
				System.out.println("���سɹ�"); 
				con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/sydb","root","admin");
				System.out.println("connect�����ɹ�");
				username =request.getParameter("username");
				password =request.getParameter("password");
				 Statement sta=(Statement) con.createStatement();
				 int n=sta.executeUpdate("insert studentdb values('"+username+"','"+password+"')");
				 System.out.println("ע��ɹ�");
		   }catch (ClassNotFoundException e) {
				System.out.println("û���ҵ�com.mysql.jdbc.Drive");
			} catch (SQLException e) {
				System.out.println("�����쳣");
		}
	finally {
				System.out.println("�ر�jdbc");
			}
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
 
		
		   try{
			   Class.forName("com.mysql.jdbc.Driver");
				System.out.println("���سɹ�");  
		   }catch (ClassNotFoundException e) {
				System.out.println("û���ҵ�com.mysql.jdbc.Drive");
 			}
	finally {
				System.out.println("�ر�jdbc");
			}
		 
		 
		
		
	}


	public void print(String username, String password) {
		// TODO Auto-generated method stub
		
	}

}
