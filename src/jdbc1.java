import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class jdbc1 {
	 public  void print(String username,String password){
	Connection con = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("加载成功");
		con = (Connection) DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/studb", "root", "admin");
		System.out.println("connect创建成功");
		
		
		Statement sta = (Statement) con.createStatement();
		int n = sta.executeUpdate("insert table values ('"+username+ "','"+password+"')");
		if (n > 0) {
			System.out.println("添加成功");
		}
		
		
	} catch (ClassNotFoundException e) {
		System.out.println("没有找到com.mysql.jdbc.Driver");
	} catch (SQLException sqle) {
		System.out.println("连接异常");
	} finally {
		System.out.println("关闭jdbc");
	}
	}
}
