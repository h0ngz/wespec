package controller.servlet;

import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dao.SpecDao;

/**
 * ������/�̷� ���� ó�� ����
 * @since 2014.11.02
 * @author wespec.co.kr
 **/

@WebServlet(urlPatterns = {"/delete" , "/Delete", "/DELETE"})
public class DeleteService extends HttpServlet{	
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
			ExceptionService.printAlert(request, response, "�߸��� �����Դϴ�.");
		
		String tableName = request.getParameter("tableName");
		String tableNo = request.getParameter("tableNo");
		
		SpecDao specDao = new SpecDao();
		specDao.deleteSpec(tableName, tableNo);
		
		response.sendRedirect(request.getContextPath()+"/Register");
			
	}
	
}
