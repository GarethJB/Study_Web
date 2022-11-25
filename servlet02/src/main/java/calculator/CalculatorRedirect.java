package calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculator_redirect")
public class CalculatorRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<div><a href='./'>홈으로</a></div>");
		out.print("<div><a href='calculator.html'>계산기화면</a></div>");
		out.print("<h2>계산결과</h2>");
		out.printf("<div>%s</div>", request.getAttribute("calculated"));
//		out.printf("<div>%s</div>", request.getSession("calculated"));
//		out.print("<div>");
//		out.printf("%d %s %d = %d", num1, operator, num2, c.getResult());
//		out.print("</div>");
		out.print("</body>");
		out.print("</html>");
	}//service()

}//class
