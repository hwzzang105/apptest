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
    	System.out.println("��û ����");
    }

	@Override
	public void destroy() {
		System.out.println("��û ����");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("��û �ʱ�ȭ");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("��û ������");
	      // �޴� �ʿ��� ���ڵ������ utf-8�� ������
	      request.setCharacterEncoding("utf-8");
	      // ��������� ���� �����͸� ���� request���� getparameter�� �̿��Ͽ� �����͸� �޾� �ü� �ִ�.
	      // �Է°��� �޴� ���� �ƴ� �±��� value ������ ���� ���״� getparameterValue�� �޴´�.
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
