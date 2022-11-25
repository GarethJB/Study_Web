package employee.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Command;
import dao.HrDAO;

public class EmployeeDelete implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int emp_id = Integer.parseInt(request.getParameter("employee_id"));
		
		HrDAO dao = new HrDAO();
		dao.employee_delete(emp_id);
	}//execute()

}//class
