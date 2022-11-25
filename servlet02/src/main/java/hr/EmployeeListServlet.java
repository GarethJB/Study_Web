package hr;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/employee/emp_list")
public class EmployeeListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");		
		out.print("<div><a href='../'>홈으로</a></div>");
		out.print("<div><a href='index.html'>사원목록</a></div>");
		out.print("<hr>");
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		out.print("<h2>사원목록<h2>");
		out.print("<table border='1'>");
		out.print("<tr><th>사번</th><th>사원명</th><th>부서코드</th><th>급여</th><th>입사일자</th></tr>");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","0000");
			String sql
			= "SELECT * "
			+ "FROM employees ";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				out.printf("<tr><td><a href='emp_info?id=%d'>%d</a></td><td>%s</td><td>%d</td><td>%d</td><td>%s</td></tr>"
						, rs.getInt("employee_id") , rs.getInt("employee_id"), rs.getString("last_name") + " " + rs.getString("first_name"), rs.getInt("department_id"), rs.getInt("salary"), rs.getString("hire_date"));
			}//while
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(rs != null) {try {rs.close();} catch(Exception e) {}}
			if (rs != null) {try {ps.close();} catch(Exception e) {}}
			if (conn != null) {try {conn.close();} catch(Exception e) {}}
			try {conn.close();} catch(Exception e) {}
		}//finally
		out.print("<table>");
		out.print("</table>");
		out.print("</html>");
	}//service()

}//
