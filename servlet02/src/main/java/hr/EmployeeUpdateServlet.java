package hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HrDAO;
import dto.EmployeeDTO;

@WebServlet("/employee/employee_update")
public class EmployeeUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HrDAO dao = new HrDAO();
		int employee_id = Integer.parseInt(request.getParameter("id"));
		EmployeeDTO dto = dao.employee_info(employee_id);
		
		
		
		//응답화면연결
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<div><a href='../'>홈으로</a></div>");
		out.print("<div><a href='emp_list'>사원목록</a></div>");
		out.print("<h2>사원정보수정</h2>");
		out.print("<form method=\"post\" action=\"employee_update2\">");
		out.print("<table border='1'>");
		out.printf("<tr><th>성명</th><td><input type=\"text\" name=\"last_name\" placeholder=\"%s\"/>\r\n<input type=\"text\" name=\"first_name\" placeholder=\"%s\"/></td></tr>", dto.getLast_name(), dto.getFirst_name());
		out.printf("<tr><th>이메일</th><td><input type=\"text\" name=\"email\" placeholder=\"%s\"/></td></tr>", dto.getEmail());
		out.printf("<tr><th>업무코드</th><td><input type=\"text\" name=\"job_id\" placeholder=\"%s\"/></td></tr>", dto.getJob_id());
		out.printf("<tr><th>부서코드</th><td><input type=\"text\" name=\"department_id\" placeholder=\"%d\"/></td></tr>", dto.getDepartment_id());
		out.printf("<tr><th>급여</th><td><input type=\"text\" name=\"salary\" placeholder=\"%d\"/></td></tr>", dto.getSalary());
		out.printf("<tr><th colspan='2'><a href='employee_update?id=%d'>수정하기</a></th></tr>", dto.getEmployee_id());
		out.print("</table>");
		out.print("</form>");
		
		out.print("</body></html>");
		

		
	}//service()
}//class
