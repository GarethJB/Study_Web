package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/board")
public class BoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//비지니스 로직 : 아이디/패스워드가 일치하는 회원정보를 조회하는 처리
		//주소창을 통해 전달된 파라미터 : request에 있음
		//주소창을 통해 전달된 파라미터 데이터는 모두 문자열
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		//응답할 화면
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h2>게시글내용</h2>");
		out.printf("<div>작성자 : %s</div>", writer);
		out.printf("<div>제목 : %s</div>", title);
		out.printf("<div>내용 : %s</div>", content);
		out.print("hr");
		out.printf("<div>Request : %s</div>", request.getAttribute("request"));
		out.printf("<div>Request no : %d</div>", (Integer)request.getAttribute("no"));
		out.printf("<div>Session : %s</div>", request.getSession().getAttribute("session"));
		out.printf("<div>Application : %s</div>", getServletContext().getAttribute("app"));
		out.print("<div><a href=\"board.html\">뒤로가기</a></div>"); 
		out.print("</body>");
		out.print("</html>");
	}//service
	

}//class
