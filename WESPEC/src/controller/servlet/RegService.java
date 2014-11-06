package controller.servlet;

import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.vo.*;
import model.vo.spec.*;
import model.dao.ProfileDao;
import model.dao.SpecDao;

/**
 * ������/�̷� ��� ���� Ŭ����
 * @since 2014.11.02
 * @author wespec.co.kr
 **/

@WebServlet(urlPatterns = {"/register" , "/REGISTER", "/Register"})
public class RegService extends HttpServlet{	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8567273307264010369L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=euc-kr");
		SpecDao specDao = new SpecDao();
		ProfileDao profileDao = new ProfileDao();
		Profile profile = new Profile();
		Spec spec = new Spec();	
		
		profile = profileDao.select("h0ngz");			
		request.setAttribute("profile", profile);	
				
		spec = specDao.selectSpec("h0ngz");			
		request.setAttribute("spec", spec);			
		
		RequestDispatcher requestDispatcher = 
				request.getRequestDispatcher("/skin/module/reg.jsp");
		requestDispatcher.forward(request, response);
			
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=euc-kr");
		request.setCharacterEncoding("euc-kr");
		PrintWriter out = response.getWriter();		
		String param = request.getParameter("param");		
		SpecDao specDao = new SpecDao();
		ProfileDao profileDao = new ProfileDao();
	
		if(param.equals("p")){ 	// ������
			Profile profile = new Profile();
			profile.setMemberId(request.getParameter("memberId"));
			profile.setProfileChiName(request.getParameter("chiName")); 
			profile.setProfileEngName(request.getParameter("engName")); 
			profile.setProfileAddress(request.getParameter("address")); 
			profile.setProfileBirth(request.getParameter("birth"));
			profile.setProfilePhone(request.getParameter("phone"));
			profile.setProfileEmail(request.getParameter("email"));
			profile.setProfileGrade(Integer.parseInt(request.getParameter("grade")));
			
			/* ���� �̱���..
			profile.setProfileSnsFacebook(request.getParameter(""));
			profile.setProfileSnsTwitter(request.getParameter(""));
			profile.setProfileSnsNBlog(request.getParameter(""));
			profile.setProfileSnsInstagram(request.getParameter(""));
			profile.setProfileSnsTumblr(request.getParameter(""));
			profile.setProfileSnsPinterest(request.getParameter(""));
			
			profile.setProfilePhotoURL(request.getParameter(""));			
			*/
			profileDao.update(profile);
		}		
		else if(param.equals("s1"))	// �ڰ���
		{
			Certificate certificate = new Certificate();
			certificate.setCertificateDate(request.getParameter("certificateDate"));
			certificate.setCertificateName(request.getParameter("certificateName"));
			certificate.setCertificateGrade(request.getParameter("certificateGrade"));
			certificate.setCertificateOrg(request.getParameter("certificateOrg"));
			certificate.setPublicScope(request.getParameter("publicScope"));
			
			specDao.insert(certificate);					
		}
		else if(param.equals("s2"))	// ���дɷ�
		{			
			 Language language = new Language();
			 language.setLanguageName(request.getParameter("languageName"));
			 language.setLanguageExamName(request.getParameter("languageExamName"));
			 language.setLanguageExamGrade(request.getParameter("languageExamGrade"));
			 language.setLanguageExamOrg(request.getParameter("languageExamOrg"));
			 language.setPublicScope(request.getParameter("publicScope"));
			 
			 specDao.insert(language);
		}
		else if(param.equals("s3")) // �������
		{
			Award award = new Award();
			award.setAwardDate(request.getParameter("awardDate"));
			award.setAwardSubject(request.getParameter("awardSubject"));
			award.setAwardOrg(request.getParameter("awardOrg"));
			award.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(award);
		}
		else if(param.equals("s4")) // ���� �� ����
		{
			Training trainning = new Training();
			trainning.setTrainingName(request.getParameter("trainingName"));
			trainning.setTrainingPeriod(request.getParameter("trainingPeriod"));
			trainning.setTrainingOrg(request.getParameter("trainingOrg"));
			trainning.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(trainning);
		}
		else if(param.equals("s5")) // ��Ʈ������
		{
			Portfolio portfolio = new Portfolio();
			portfolio.setPortfolioName(request.getParameter("portfolioName"));
			portfolio.setPortfolioPeriod(request.getParameter("portfolioPeriod"));
			portfolio.setPortfolioLink(request.getParameter("portfolioLink"));
			portfolio.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(portfolio);
		}
		else if(param.equals("s6")) // ��ȣ���α׷��� ������
		{
			ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
			programmingLanguage.setLanguageName(request.getParameter("languageName"));
			programmingLanguage.setLanguageLevel(request.getParameter("languageLevel"));
			programmingLanguage.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(programmingLanguage);
		}
		else if(param.equals("s7")) // �з»���
		{
			Academic academic = new Academic();
			
			academic.setAcademicName(request.getParameter("academicName"));
			academic.setAcademicMajor(request.getParameter("academicMajor"));
			academic.setAcademicPeriod(request.getParameter("academicPeriod"));
			academic.setAcademicState(request.getParameter("academicState"));
			academic.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(academic);
		}
		else if(param.equals("s8")) // ����
		{
			Military military = new Military();
			
			military.setMilitaryPeriod(request.getParameter("militaryPeriod"));
			military.setMilitaryGroup(request.getParameter("militaryGroup"));
			military.setMilitaryRank(request.getParameter("militaryRank"));
			military.setMilitaryWork(request.getParameter("militaryWork"));
			military.setPublicScope(request.getParameter("publicScope"));
			military.setRegister(true);			 
			specDao.insert(military);
		}
		else
		{
			/* request�� �����ΰ� �߸��Ǿ��� */
		}				
		
		if(param.equals("p") || param.equals("p_sns") || param.equals("p_photo"))
		{
			String scriptCode = "<script language='javascript'>alert('ȸ������ �������� ���������� ����Ǿ����ϴ�'); location.href='"+ request.getContextPath() +"/Register';</script>";
			out.print(scriptCode);			
			out.flush();
			out.close();			
		}		
		response.sendRedirect(request.getContextPath() +"/Register");		
	}
}
