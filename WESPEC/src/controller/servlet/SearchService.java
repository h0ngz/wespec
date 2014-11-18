package controller.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.servlet.ExceptionService;
import model.dao.ProfileDao;
import model.dao.SpecDao;
import model.vo.*;

/**
 * Servlet implementation class SearchService
 */
@WebServlet(urlPatterns = {"/Search" , "/search"})
public class SearchService extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchService() {
        super();      
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		
		// �α��� üũ
		if(!ExceptionService.isLogin(request))			
			ExceptionService.printAlert(request, response, "�α������� �����̽��ϴ�.","/login");
		
		String searchTarget = new String(request.getParameter("s_name").getBytes("8859_1"),"KSC5601");	
		//��Ŭ���� ver
		//String searchTarget = request.getParameter("s_name");
		
		ProfileDao profileDao = new ProfileDao();
		String studentId = profileDao.selectByName(searchTarget);
				
		response.sendRedirect(request.getContextPath() + "/Open/" + studentId);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		
		// �α��� üũ
		if(!ExceptionService.isLogin(request))			
			ExceptionService.printAlert(request, response, "�α������� �����̽��ϴ�.","/login");
		
		SpecDao specDao = new SpecDao();
		ProfileDao profileDao = new ProfileDao();		
		List<String> members = new ArrayList<String>();
		String nextPage = "/skin/module/list.jsp";
		
		String[] chkbox = request.getParameterValues("s_chk");		
		//������ �����ϴ� ��ü�л� ����Ʈ �̱�.
		members = specDao.selectHaveSpecByAll();
		
		try{
			if(chkbox!=null)
			{
				for(int i=0; i<chkbox.length; i++)
				{
					if(chkbox[i].equals("haveCertificate"))
					{
						members = specDao.selectHaveSpecByMemberId(members, "CERTIFICATE");
					}
					if(chkbox[i].equals("haveAward"))
					{
						members = specDao.selectHaveSpecByMemberId(members, "AWARD");
					}
					if(chkbox[i].equals("havePortfoilo"))
					{
						members = specDao.selectHaveSpecByMemberId(members, "PORTFOLIO");
					}
					if(chkbox[i].equals("haveTraining"))
					{
						members = specDao.selectHaveSpecByMemberId(members, "TRAINING");
					}
					if(chkbox[i].equals("haveService"))
					{
						//�̱���
					}
					if(chkbox[i].equals("haveClub"))
					{
						//�̱���
					}
					if(chkbox[i].equals("haveLanguageExam"))
					{	
						String languageExamName = request.getParameter("languageExamName");
						String languageGrade = request.getParameter("languageGrade") + request.getParameter("languageExamGradeOption");
						members = specDao.selectHaveSpecByMemberId(members, "Language_Exam" , languageExamName, languageGrade);
					}		
				}
			}
		} catch(Exception ex) 	{  nextPage = "/Exception?ex=NotFoundStudent";	}
		// �л� ����Ʈ�� ���� (���ü�����) ������ ����Ʈ ��������.
		List <Profile> profiles = new ArrayList<Profile>();	
		profiles = profileDao.selectByMemberId(members);	
		
		// �˻����� ���� �˺� �۾�.
		if(request.getParameter("gender").equals("M"))
		{
			for(int i=0; i<profiles.size(); i++)
			{				
				if(profiles.get(i).getProfileGender().equals("F"))
				{	
					profiles.remove(i);
					
				}
			}
		}
		else if(request.getParameter("gender").equals("F"))
		{
			for(int i=0; i<profiles.size(); i++)
			{		
				if(profiles.get(i).getProfileGender().equals("M"))
				{	
					profiles.remove(i);
				}
			}
		}
		
		// Profile DAO Ŭ������ �̿��� request�� Profiles ��ü �Ǿ� ����		
		request.setAttribute("profiles", profiles);		
		
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(nextPage);
		requestDispatcher.forward(request, response);	

	}
}
