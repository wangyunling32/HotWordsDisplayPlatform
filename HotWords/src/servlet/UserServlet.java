package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Userdao;
import bean.Userbean;
public class UserServlet extends BaseServlet {
	
	public void Look(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	{
		String key1=request.getParameter("key1");
		Userdao userdao=new Userdao();
		List<Userbean> list=userdao.getListAll(key1);
		request.getSession().setAttribute("list", list);
		response.sendRedirect(request.getContextPath() + "/result.jsp");
	}
}
