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
import model.vo.spec.*;
import model.dao.ProfileDao;
import model.dao.SpecDao;

/**
 * 프로필/이력 등록 서블릿 클래스
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
		request.setCharacterEncoding("euc-kr");
		
		SpecDao specDao = new SpecDao();
		ProfileDao profileDao = new ProfileDao();
		Profile profile = new Profile();
		Spec spec = new Spec();	
		
		// 로그인 체크
		if(!ExceptionService.isLogin(request))			
			ExceptionService.printAlert(request, response, "로그인하지 않으셨습니다.","/login");
				
		HttpSession session = request.getSession(false);
		String memberId = (String)session.getAttribute("memberId");			
	
		profile = profileDao.select(memberId);			
		request.setAttribute("profile", profile);	
				
		spec = specDao.selectSpec(memberId);			
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
			
		String param = request.getParameter("param");		
		SpecDao specDao = new SpecDao();
		ProfileDao profileDao = new ProfileDao();
		
		// 로그인 체크
		if(!ExceptionService.isLogin(request))			
			ExceptionService.printAlert(request, response, "잘못된 접근입니다.","/login");
				
		HttpSession session = request.getSession(false);
		String memberId = (String)session.getAttribute("memberId");		
	
		
		if(param.equals("p")){ 	// 프로필
			Profile profile = new Profile();
			profile.setMemberId(memberId);
			profile.setProfileChiName(request.getParameter("chiName")); 
			profile.setProfileEngName(request.getParameter("engName")); 
			profile.setProfileAddress(request.getParameter("address")); 
			profile.setProfileBirth(request.getParameter("birth"));
			profile.setProfilePhone(request.getParameter("phone"));
			profile.setProfileEmail(request.getParameter("email"));
			profile.setProfileGrade(Integer.parseInt(request.getParameter("grade")));
			
			/* 아직 미구현..
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
		else if(param.equals("s1"))	// 자격증
		{
			Certificate certificate = new Certificate();
			certificate.setCertificateDate(request.getParameter("certificateDate"));
			certificate.setCertificateName(request.getParameter("certificateName"));
			certificate.setCertificateGrade(request.getParameter("certificateGrade"));
			certificate.setCertificateOrg(request.getParameter("certificateOrg"));
			certificate.setPublicScope(request.getParameter("publicScope"));
			certificate.setMemberId(memberId);
			specDao.insert(certificate);					
		}
		else if(param.equals("s2"))	// 어학능력
		{			
			 Language language = new Language();
			 language.setMemberId(memberId);
			 language.setLanguageName(request.getParameter("languageName"));
			 language.setLanguageExamName(request.getParameter("languageExamName"));
			 language.setLanguageExamGrade(request.getParameter("languageExamGrade"));
			 language.setLanguageExamOrg(request.getParameter("languageExamOrg"));
			 language.setPublicScope(request.getParameter("publicScope"));
			 
			 specDao.insert(language);
		}
		else if(param.equals("s3")) // 수상실적
		{
			Award award = new Award();
			award.setMemberId(memberId);
			award.setAwardDate(request.getParameter("awardDate"));
			award.setAwardSubject(request.getParameter("awardSubject"));
			award.setAwardOrg(request.getParameter("awardOrg"));
			award.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(award);
		}
		else if(param.equals("s4")) // 교육 및 연수
		{
			Training trainning = new Training();
			trainning.setMemberId(memberId);
			trainning.setTrainingName(request.getParameter("trainingName"));
			trainning.setTrainingPeriod(request.getParameter("trainingPeriod"));
			trainning.setTrainingOrg(request.getParameter("trainingOrg"));
			trainning.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(trainning);
		}
		else if(param.equals("s5")) // 포트폴리오
		{
			Portfolio portfolio = new Portfolio();
			portfolio.setMemberId(memberId);
			portfolio.setPortfolioName(request.getParameter("portfolioName"));
			portfolio.setPortfolioPeriod(request.getParameter("portfolioPeriod"));
			portfolio.setPortfolioLink(request.getParameter("portfolioLink"));
			portfolio.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(portfolio);
		}
		else if(param.equals("s6")) // 선호프로그래밍 랭귀지
		{
			ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
			programmingLanguage.setMemberId(memberId);
			programmingLanguage.setLanguageName(request.getParameter("languageName"));
			programmingLanguage.setLanguageLevel(request.getParameter("languageLevel"));
			programmingLanguage.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(programmingLanguage);
		}
		else if(param.equals("s7")) // 학력사항
		{
			Academic academic = new Academic();
			academic.setMemberId(memberId);
			academic.setAcademicName(request.getParameter("academicName"));
			academic.setAcademicMajor(request.getParameter("academicMajor"));
			academic.setAcademicPeriod(request.getParameter("academicPeriod"));
			academic.setAcademicState(request.getParameter("academicState"));
			academic.setPublicScope(request.getParameter("publicScope"));
			 
			specDao.insert(academic);
		}
		else if(param.equals("s8")) // 병역
		{
			Military military = new Military();
			military.setMemberId(memberId);
			military.setMilitaryPeriod(request.getParameter("militaryPeriod"));
			military.setMilitaryGroup(request.getParameter("militaryGroup"));
			military.setMilitaryRank(request.getParameter("militaryRank"));
			military.setMilitaryWork(request.getParameter("militaryWork"));
			military.setPublicScope(request.getParameter("publicScope"));
			military.setRegister(true);			 
			specDao.insert(military);
		}
		else		
			ExceptionService.printAlert(request, response, "잘못된 접근입니다.","/Register");
						
		
		if(param.equals("p") || param.equals("p_sns") || param.equals("p_photo"))			
			ExceptionService.printAlert(request, response, "회원님의 프로필이 정상적으로 변경되었습니다","/Register");
					
				
		response.sendRedirect(request.getContextPath() +"/Register");		
	}
}
