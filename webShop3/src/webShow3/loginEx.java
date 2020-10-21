package webShow3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginEx
 */
@WebServlet("/login")
public class loginEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginEx() {
    	System.out.println("요청 들어옴");
    }

	@Override
	public void destroy() {
		System.out.println("요청 종료");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("요청 초기화");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("요청 진행중");
	      // 받는 쪽에서 인코딩기법을 utf-8로 변경함
	      request.setCharacterEncoding("utf-8");
	      // 상대측에서 보낸 데이터를 받은 request에서 getparameter를 이용하여 데이터를 받아 올수 있다.
	      // 입력값을 받는 것이 아닌 태그의 value 값으로 받을 경우네는 getparameterValue로 받는다.
	      // request.getParameter("HTML_NAME")
	      String ID = request.getParameter("m_id");
	      String PW = request.getParameter("m_pw");
	      String[] subject = request.getParameterValues("subject");
	      System.out.println("ID: "+ID);
	      System.out.println("PW: "+PW);
	      for(String str:subject) {
	         System.out.println("lang: "+str);
	      }  

	}

}
