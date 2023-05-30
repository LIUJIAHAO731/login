package jp.co.aforce.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.aforce.beans.Bean;
import jp.co.aforce.dao.Csdao;
import jp.co.aforce.tool.Action;

/**
 * Servlet implementation class Login
 */
@WebServlet("/jp.co.aforce/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
		public class login extends Action {
			public  String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
				HttpSession session = request.getSession();
				
				String login=request.getParameter("login");
				String pass=request.getParameter("pass");
				Csdao dao=new Csdao();
				Bean bean=dao.search(login, pass);
				
			    if(bean!=null) {
			    	session.setAttribute("bean", bean);
			    	return "login-ture.jsp";
			    	
			    }
			    return "login-false.jsp";
				
			}
		}
}
