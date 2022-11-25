package employee.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.Command;
import dao.HrDAO;

public class EmployeeUpdate implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		HrDAO dao = new HrDAO();
		int emp_id = Integer.getInteger(request.getParameter("employee_id"));
		dao.employee_update(0);
	}//execute()

}//class
