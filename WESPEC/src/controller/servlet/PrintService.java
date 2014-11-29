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
 * Servlet implementation class PrintService
 */
@WebServlet(urlPatterns = {"/print/*" , "/Print/*", "/PRINT/*"})
public class PrintService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			memberId = memberId.substring(2);
		System.out.println("member id : " + memberId);
		// Profile DAO Ŭ������ �̿��� request�� Profile ��ü �Ǿ� ����
		profile = profileDao.select(memberId);	
		request.setAttribute("profile", profile);
		
		// SpecDAO Ŭ������ �̿��� request�� Spec ��ü �Ǿ� ����
		spec = specDao.selectSpec(memberId);			
		request.setAttribute("spec", spec);	
		
		
		RequestDispatcher requestDispatcher = 
				request.getRequestDispatcher("/skin/module/print.jsp");
		requestDispatcher.forward(request, response);
	}

	

}
