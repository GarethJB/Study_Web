package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.EmployeeDTO;

@WebServlet("/select")
public class EmployeeListView extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<EmployeeDTO> list = (ArrayList<EmployeeDTO>)request.getAttribute("list");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<div><a href='./'>홈으로</a></div>");
		out.print("<div><a href='front.html'>front controller패턴</a></div>");
		out.print("<h2>command 패턴 실습결과 - 조회</h2>");
		out.print("<div><a href='employee/new.html'>사원등록</a></div>");
		out.print("<table border='1'>");
		out.print("<tr><th>사번></th><th>사원명</th><th>부서</th><th></th><th></th></tr>");
		for(EmployeeDTO dto : list ) {			
			out.printf("<tr><td>%d</td><td>%s</td><td>%d</td><td><a href='update.do?employee_id=%d'>삭제</a></td><td><a href='delete.do?employee_id=%d'>삭제</a></td></tr>"
					, dto.getEmployee_id()
					, dto.getName()
					, dto.getDepartment_id()
					, dto.getEmployee_id());
		}//for
		out.print("</table>");
		out.print("</bdoy>");
		out.print("</html>");
	}//service()

}//class
