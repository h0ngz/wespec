package controller.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.vo.*;
import model.dao.AccountDao;


/**
 * ������/�̷� ��� ���� Ŭ����
 * @since 2014.11.02
 * @author wespec.co.kr
 **/

@WebServlet(urlPatterns = {"/login","/join", "/logout"})
public class AccountService extends HttpServlet{	
	private static final long serialVersionUID = -8567273307264010369L;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html; charset=euc-kr");
		request.setCharacterEncoding("euc-kr");	
		String requestURL = request.getRequestURI().substring(request.getContextPath().length());
		String nextPage = "";
		
	
		if(requestURL.equals("/login")) 
		{			
	 		if(ExceptionService.isLogin(request))	 		
	 			ExceptionService.printAlert(request, response, "�̹� �α��� �Ǿ��ֽ��ϴ�.","/view");
	 		
			nextPage = "/skin/module/login.jsp";			
		}
		else if(requestURL.equals("/logout")) 
		{	
			if(!ExceptionService.isLogin(request))			
				ExceptionService.printAlert(request, response, "�α������� �����̽��ϴ�.","/login");
						
			nextPage = "/skin/module/logout.jsp";			
		}
		else if(requestURL.equals("/join")) 		
			nextPage = "/skin/module/join.jsp";		
		
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);
			
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		
		String memberId = request.getParameter("memberId");
		String memberPw = request.getParameter("memberPw");
		
		AccountDao accountDao = new AccountDao();
		Member member = accountDao.select(memberId);
		
		if( member !=null  && member.getMemberPassword().equals(memberPw))
		{	
			HttpSession session = request.getSession();
			session.setAttribute("memberId",memberId);
			session.setAttribute("memberGroup",member.getMemberGroup());
			response.sendRedirect(request.getContextPath() + "/List");
		}
		else 
			ExceptionService.printAlert(request, response, "���� ������ �ùٸ��� �ʽ��ϴ�. Ȯ���� �ٽ� �Է����ּ���.");
		
	}
}
