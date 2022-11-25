package command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;

public class CommandUser implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// ★ ④ DAO에서 요청에 맞는 로직 호출 ★
		// 비지니스 로직
		UserDAO dao = new UserDAO();
		String name = dao.select_name();
		int money = dao.select_money();
		
		// ★ ⑤ 조회해온 정보를 attribute에 담는다 ★
		// 조회해온 정보를 화면에서 출력할 수 있도록
		// request 에 attribute 로 데이터를 담는다.
		request.setAttribute("name", name);
		request.setAttribute("money", money);
		

	}

}
