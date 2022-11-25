package hr;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.HrDAO;
import dto.EmployeeDTO;

@WebServlet("/employee/emp_insert")
public class EmployeeInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//비지니스 로직 : 화면에서 입력한 정보를 DB에 저장
		
		//1. 화면에서 입력한 정보를 수집
		//2. DB연결 → 저장처리 메소드 호출
		EmployeeDTO dto = new EmployeeDTO();
		dto.setLast_name(request.getParameter("last_name"));
		dto.setFirst_name(request.getParameter("first_name"));
		dto.setEmail(request.getParameter("email"));
		dto.setJob_id(request.getParameter("job_id"));
		int dept = Integer.parseInt(request.getParameter("department_id"));
		dto.setDepartment_id(dept);
		dto.setSalary(Integer.valueOf(request.getParameter("salary")));
		//응답화면 연결
		
		//DB연결
		HrDAO dao = new HrDAO();
		dao.employee_insert(dto);
		
		// 응답화면 연결
		// 1.forward : 요청하는 주소가 그대로 유지
		// 2.redirect : 
//		RequestDispatcher rd = request.getRequestDispatcher("emp_list");
//		rd.forward(request, response);
		response.sendRedirect("emp_list");
		
	}//service()

}//class
