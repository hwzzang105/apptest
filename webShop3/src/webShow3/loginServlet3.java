package webShow3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginServlet3
 */
/* @WebServlet("/login3") */
public class loginServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet3() {
        
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		
	}

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		
		String id = req.getParameter("m_id");
		String pw = req.getParameter("m_pw");
		
		System.out.println("ID: "+id);
	    System.out.println("PW: "+pw);
	    
	    res.setContentType("text/html;charset=utf-8");
	    PrintWriter out = res.getWriter(); //html�� �ؽ�Ʈ�� �Ǿ� �ִ� �����͸� �귯���� ��������� �ʿ��� Ŭ����
	    
	    if(id != null && (id.length() != 0)) {
	    	if(id.contentEquals("admin")) {
	    		out.print("<html>");
	    		out.print("<body>");
	    		out.print("<h2>�����ڷ� �α��� �Ͽ����ϴ�.</h2>");
	    		out.print("</body>");
	    		out.print("</html>");
	    	}else {
	    		out.print("<html>");
	    		out.print("<body>");
	    		out.print("<h2>"+id+"���� �α��� �Ͽ����ϴ�.</h2>");
	    		out.print("</body>");
	    		out.print("</html>");
	    	}
	    }else {
	    	out.print("<html>");
    		out.print("<body>");
    		out.print("<h3>���̵�� ��й�ȣ�� �Է��ϼ���.</h2>");
    		out.print("<a href='http:/localhost:8090/webShop3/input3.html'> �α���â�����̵�</a>");
    		out.print("</body>");
    		out.print("</html>");
	    }
		
	}

}
