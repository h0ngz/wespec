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
import model.dao.ProfileDao;
import model.dao.SpecDao;


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
	 			ExceptionService.printAlert(request, response, "�̹� �α��� �Ǿ��ֽ��ϴ�.","/List");
	 		
			nextPage = "/skin/module/login.jsp";			
		}
		else if(requestURL.equals("/logout")) 
		{	
			if(!ExceptionService.isLogin(request))			
				ExceptionService.printAlert(request, response, "�α������� �����̽��ϴ�.","/login");
						
			nextPage = "/skin/module/logout.jsp";			
		}
		else if(requestURL.equals("/join")) 
		{
			if(!ExceptionService.isLogin(request))			
				ExceptionService.printAlert(request, response, "�α������� �����̽��ϴ�.","/login");
			if(!ExceptionService.isAdmin(request))
				ExceptionService.printAlert(request, response, "�����ڸ� �̿��� �� �ִ� ����Դϴ�.","/");
			else insertMember();
			
			nextPage = "/skin/module/join.jsp";		
		}
		
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
			ProfileDao profileDao = new ProfileDao();
		
			String photoUrl = profileDao.selectBySection(memberId, "PROFILE_PHOTO_URL");
			HttpSession session = request.getSession();
			session.setAttribute("memberId",memberId);
			session.setAttribute("memberGroup",member.getMemberGroup());
			session.setAttribute("photoUrl", photoUrl);
			response.sendRedirect(request.getContextPath() + "/List");
		}
		else 
			ExceptionService.printAlert(request, response, "���� ������ �ùٸ��� �ʽ��ϴ�. Ȯ���� �ٽ� �Է����ּ���.");
		
	}
	
	public void insertMember() 
	{
		String[][] stuList = {
				{ "1244009", "����ȯ", "911225", "M" },	
				{ "1244013", "������", "920220", "M" },	
				{ "1244031", "�̼���", "930309", "M" },	
				{ "1444001", "����", "960205", "M" },	
				{ "1444002", "�����", "941201", "M" },	
				{ "1444003", "�輺��", "950718", "M" },	
				{ "1444004", "���ȯ", "950323", "M" },	
				{ "1444005", "�迹��", "951004", "F" },	
				{ "1444006", "��ä��", "950605", "F" },	
				{ "1444020", "������", "950304", "M" },	
				{ "1444008", "������", "941130", "M" },	
				{ "1444009", "�ڻ�", "940420", "M" },	
				{ "1444011", "�ڼ���", "960211", "F" },	
				{ "1444012", "���ؿ�", "940425", "M" },	
				{ "1444013", "������", "951019", "M" },	
				{ "1444014", "����", "951127", "M" },	
				{ "1444015", "������", "950127", "M" },	
				{ "1444016", "������", "950613", "M" },	
				{ "1444017", "�մٿ�", "951204", "F" },	
				{ "1444018", "������", "951025", "M" },	
				{ "1444022", "������", "951129", "M" },	
				{ "1444023", "�̽�ȣ", "951018", "M" },	
				{ "1444024", "������", "950711", "F" },	
				{ "1444025", "������", "950504", "M" },	
				{ "1444026", "����ȣ", "950427", "M" },	
				{ "1444027", "������", "950108", "M" },	
				{ "1444028", "���ֿ�", "950905", "M" },	
				{ "1444029", "�����", "950829", "M" },	
				{ "1444030", "���缺", "950921", "M" },	
				{ "1444031", "������", "950613", "F" },	
				{ "1444032", "����ȯ", "951010", "M" },	
				{ "1444034", "�ּ���", "950411", "M" },	
				{ "1444035", "������", "951013", "M" },	
				{ "1444036", "������", "941224", "F" },	
				{ "1444038", "�ѽµ�", "951010", "M" },	
				{ "1026017", "�̻��", "911025", "M" },	
				{ "1044001", "�Ǽ���", "910926", "M" },	
				{ "1044003", "�輺��", "910403", "M" },	
				{ "1044004", "���ο�", "920212", "M" },	
				{ "1044006", "������", "910710", "M" },	
				{ "1044011", "�ڼ���", "920118", "M" },	
				{ "1044019", "�̽¿�", "910218", "M" },	
				{ "1044024", "������", "910820", "M" },	
				{ "1144014", "����ȣ", "920902", "M" },	
				{ "1144018", "�۹ο�", "920908", "M" },	
				{ "1144022", "���¿�", "920403", "M" },	
				{ "1144023", "�Ӵ���", "921128", "M" },	
				{ "1144025", "������", "920713", "M" },	
				{ "1144026", "������", "930426", "F" },	
				{ "1144029", "�ּ���", "920527", "M" },	
				{ "1244007", "�輱��", "931211", "M" },	
				{ "1244036", "������", "920803", "F" },	
				{ "1301002", "�����", "941228", "F" },	
				{ "1344003", "�迵��", "940630", "M" },	
				{ "1344006", "������", "941101", "M" },	
				{ "1344008", "������", "941024", "M" },	
				{ "1344014", "������", "940318", "F" },	
				{ "1344015", "�����", "931119", "M" },	
				{ "1344017", "���Ϸ�", "940716", "F" },	
				{ "1344021", "�̹�ȯ", "930312", "M" },	
				{ "1344022", "�̽���", "931127", "M" },	
				{ "1344024", "��ȿ��", "900508", "M" },	
				{ "1344026", "������", "930430", "F" },	
				{ "1344032", "���ƿ�", "940623", "M" },	
				{ "1344035", "�ָ���", "941117", "M" },	
				{ "0929344", "����ȣ", "900904", "M" },	
				{ "0829169", "������", "891219", "M" },	
				{ "1023018", "����ȣ", "910904", "M" },	
				{ "1023051", "�չμ�", "910714", "M" },	
				{ "1044005", "������", "920211", "M" },	
				{ "1044012", "�ڿ켮", "910417", "M" },	
				{ "1044014", "����ö", "910329", "M" },	
				{ "1044017", "���¿�", "910814", "M" },	
				{ "1044020", "�̿���", "910402", "M" },	
				{ "1044021", "��Ǫ��", "910920", "M" },	
				{ "1044022", "�ӿ���", "910808", "F" },	
				{ "1044023", "������", "910530", "M" },		
				{ "1244004", "�����", "930821", "F" },	
				{ "1244006", "�輱��", "931023", "F" },	
				{ "1244010", "������", "930702", "F" },	
				{ "1244011", "������", "940112", "F" },	
				{ "1244014", "������", "930805", "F" },	
				{ "1244019", "������", "911202", "M" },	
				{ "1244020", "�۴���", "930915", "F" },	
				{ "1244027", "�̰���", "920909", "F" },	
				{ "1244033", "������", "900815", "M" },	
				{ "1244039", "������", "940201", "F" },	
				{ "1244040", "Ȳ���", "930719", "M" },	
				{ "1444301", "������", "920331", "F" },	
				{ "1444302", "������", "901211", "M" },	
				{ "0729081", "ȫ�ٿ�", "880508", "M" },	
				{ "0929051", "��ȣ��", "910314", "M" },	
				{ "0929053", "�ȼ�ȣ", "901227", "M" },	
				{ "0929088", "������", "900610", "M" },	
				{ "0929149", "Ȳ�¿�", "910104", "M" },	
				{ "0929208", "������", "910213", "M" },	
				{ "0929240", "������", "910211", "M" },	
				{ "0929285", "��ٽ�", "910218", "M" },	
				{ "1244001", "����", "920327", "F" },	
				{ "1444021", "����", "950728", "M" },	
				{ "1444007", "�뼳", "960106", "F" }
			};
		SpecDao specDao = new SpecDao();
		ProfileDao profileDao = new ProfileDao();
		AccountDao accountDao = new AccountDao();
		int [] stud_grade = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3};

		for(int i=0; i<stuList.length; i++)
		{				
			accountDao.insertMember(stuList[i][0], stuList[i][2]);
			profileDao.insertMember(stuList[i][0], stuList[i][1], stuList[i][3], stud_grade[i], stuList[i][2]);
			specDao.insertMember(stuList[i][0]);			
		}
		
		
			
	}
}
