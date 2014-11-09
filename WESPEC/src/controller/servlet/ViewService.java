package controller.servlet;

import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.*;
import model.dao.ProfileDao;
import model.dao.SpecDao;

/**
 * ������/�̷� ��� ���� Ŭ����
 * @since 2014.11.02
 * @author wespec.co.kr
 **/

@WebServlet(urlPatterns = {"/OPEN/*" , "/open/*", "/Open/*"})
public class ViewService extends HttpServlet{	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8567273307264010369L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		
		// �α��� üũ
		if(!ExceptionService.isLogin(request))			
			ExceptionService.printAlert(request, response, "�α������� �����̽��ϴ�.","/login");
		
		SpecDao specDao = new SpecDao();
		Spec spec = new Spec();	
		ProfileDao profileDao = new ProfileDao();
		Profile profile = new Profile();
		
		String memberId = request.getRequestURI().substring(
				request.getContextPath().length() + "/open".length());
		
		// URL : OPEN/�л��̸�   URL�� ���� ó�� 
		if(memberId.length()>2)
			memberId = memberId.substring(1);
		
		// Profile DAO Ŭ������ �̿��� request�� Profile ��ü �Ǿ� ����
		profile = profileDao.select(memberId);	
		request.setAttribute("profile", profile);
		
		// SpecDAO Ŭ������ �̿��� request�� Spec ��ü �Ǿ� ����
		spec = specDao.selectSpec(memberId);			
		request.setAttribute("spec", spec);	
		
		
		RequestDispatcher requestDispatcher = 
				request.getRequestDispatcher("/skin/module/Open.jsp");
		requestDispatcher.forward(request, response);			
	}
}
