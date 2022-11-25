package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.CommandUser;
import command.CommandUserAll;

@WebServlet("*.ju")
// ★ ① 컨트롤러가 요청을 받음 [ 요청 → (*.ju) ] ★
public class ControllerUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ★ ② 요청 uri를 추출함? ★
		String uri = request.getRequestURI();		// /05/user.ju
		String path = request.getContextPath();		// /05 
		uri = uri.substring(path.length());			// /user.ju
		
		if(uri.equals("/user.ju")) {
			// ★ ③ 요청된 주소가 일치하면 비지니스 로직 실행 [ command로 이동 ]★
			// uri 가 /user.ju 와 같다면
			// 비지니스로직 실행
			CommandUser command = new CommandUser();
			command.execute(request, response);
			
			// 응답화면연결 : forward
			// redirect 하는 경우 : DB에 insert, update, delete 하는 요청에 대한 처리를 하는 경우
			RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
			rd.forward(request, response);
		} else if (uri.equals("/userall.ju")) {
			CommandUserAll command = new CommandUserAll();
			command.execute(request, response);
			
			RequestDispatcher rd = request.getRequestDispatcher("userall.jsp");
			rd.forward(request, response);
		}
		
	}

}
