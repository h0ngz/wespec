package model.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.JdbcUtil;
import model.vo.spec.*;
import model.vo.Spec;
import model.vo.Statistics;
public class SpecDao {		
	
	private Spec spec = null;

	
	/********************************************************************************
	 *																				* 
	 *																				*  
	 * 																				* 
	 * 						       SELECT PART										* 
	 *																				* 
	 * 																				* 
	 ********************************************************************************/
	
	// �л� ������ ���� �˻�
	public List<Spec> select() {	
		List<Spec> specs = new ArrayList<Spec>();
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;		
		
		String query = "SELECT * FROM SPEC";
		
		try {				
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);		
			rs = pstmt.executeQuery();	
			
			while(rs.next())
			{						
				Spec spec = new Spec();	
				spec.setMemberId(rs.getString("MEMBER_ID"));
				spec.setSpec_last_change_date(rs.getTimestamp("SPEC_LAST_CHANGE_DATE"));
				spec.setSpec_change_point(rs.getInt("SPEC_CHANGE_POINT"));
				spec.setMemberId(rs.getString("SPEC_CHANGE_LOCATION"));
				specs.add(spec);
				this.spec=null;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}	
		return specs;				
	}
	
	
	// �л� ���� �˻� (���� �޼ҵ�)
	public Spec selectSpec(String memberId) {
		
		this.spec = new Spec();	
		
		this.selectByAcademic(memberId);
		this.selectByCertificate(memberId);
		this.selectByLanguage(memberId);
		this.selectByMilitary(memberId);
		this.selectByPortfolio(memberId);
		this.selectByProgrammingLanguage(memberId);
		this.selectByTraining(memberId);
		this.selectByAward(memberId);	
		
		return spec;		
	}
		
	// �з°˻�
	private void selectByAcademic(String memberId) { 		
				
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;		
		
		String query = "SELECT * FROM ACADEMIC WHERE MEMBER_ID = ?";
		
		try {				
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
			
			while(rs.next())
			{			
				Academic academic = new Academic();
				academic.setRegNo(rs.getInt("ACADEMIC_NO"));
				academic.setAcademicPeriod(rs.getString("ACADEMIC_PERIOD"));
				academic.setAcademicName(rs.getString("ACADEMIC_NAME"));	
				academic.setAcademicState(rs.getString("ACADEMIC_STATE"));	
				academic.setAcademicMajor(rs.getString("ACADEMIC_MAJOR"));	
				academic.setPublicScope(rs.getString("ACADEMIC_SCOPE"));
				
				spec.academics.add(academic);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		
	}
	
	// �ڰ����˻�
	private void selectByCertificate(String memberId) { 	
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "SELECT * FROM CERTIFICATE WHERE MEMBER_ID = ?";
		
		try {	
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
			
			while(rs.next())
			{			
				Certificate certificate = new Certificate();
				certificate.setRegNo(rs.getInt("CERTIFICATE_NO"));
				certificate.setCertificateName(rs.getString("CERTIFICATE_NAME"));
				certificate.setCertificateDate(rs.getString("CERTIFICATE_DATE"));	
				certificate.setCertificateGrade(rs.getString("CERTIFICATE_GRADE"));	
				certificate.setCertificateOrg(rs.getString("CERTIFICATE_ORG"));	
				certificate.setPublicScope(rs.getString("CERTIFICATE_SCOPE"));
				
				spec.certificates.add(certificate);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		
	}
	
	// ���дɷ°˻�
	private void selectByLanguage(String memberId) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "SELECT * FROM LANGUAGE_EXAM WHERE MEMBER_ID = ?";
		
		try {	
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
		
			while(rs.next())
			{		
				Language language = new Language();
				language.setRegNo(rs.getInt("LANGUAGE_EXAM_NO"));
				language.setLanguageName(rs.getString("LANGUAGE"));
				language.setLanguageExamName(rs.getString("LANGUAGE_EXAM_NAME"));	
				language.setLanguageExamGrade(rs.getString("LANGUAGE_EXAM_GRADE"));	
				language.setLanguageExamOrg(rs.getString("LANGUAGE_EXAM_ORG"));	
				language.setPublicScope(rs.getString("LANGUAGE_EXAM_SCOPE"));
				
				spec.languages.add(language);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
	}
		
	// �����˻�
	private void selectByMilitary(String memberId) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String query = "SELECT * FROM Military WHERE MEMBER_ID = ?";
		
		try {	
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
		
			while(rs.next())
			{	
				Military military = new Military();
				military.setRegNo(rs.getInt("MILITARY_NO"));
				military.setMilitaryDone(rs.getInt("MILITARY_DONE"));
				military.setMilitaryReason(rs.getString("MILITARY_REASON"));	
				military.setMilitaryGroup(rs.getString("MILITARY_GROUP"));	
				military.setMilitaryRank(rs.getString("MILITARY_RANK"));	
				military.setMilitaryPeriod(rs.getString("MILITARY_PERIOD"));	
				military.setMilitaryWork(rs.getString("MILITARY_WORK"));
				military.setPublicScope(rs.getString("MILITARY_SCOPE"));
				military.setRegister(rs.getBoolean("MILITARY_IS_REG"));
				
				spec.military = military;				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}		
	}
	
	//��Ʈ������ �˻�
	private void selectByPortfolio(String memberId) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String query = "SELECT * FROM portfolio WHERE MEMBER_ID = ?";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
		
			while(rs.next())
			{	
				Portfolio portfolio = new Portfolio();
				portfolio.setRegNo(rs.getInt("PORTFOLIO_NO"));
				portfolio.setPortfolioName(rs.getString("PORTFOLIO_NAME"));
				portfolio.setPortfolioPeriod(rs.getString("PORTFOLIO_PERIOD"));	
				portfolio.setPortfolioLink(rs.getString("PORTFOLIO_LINK"));	
				portfolio.setPortfolioThumbnail(rs.getString("PORTFOLIO_THUMBNAIL"));	
				portfolio.setPublicScope(rs.getString("PORTFOLIO_SCOPE"));
				
				spec.portfolios.add(portfolio);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}		 
	}
	
	//��ȣ���α׷��־�� �˻�
	private void selectByProgrammingLanguage(String memberId) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "SELECT * FROM programming_language WHERE MEMBER_ID = ?";
				
		try {	
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
		
			while(rs.next())
			{		
				ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
				programmingLanguage.setRegNo(rs.getInt("LANGUAGE_NO"));
				programmingLanguage.setLanguageName(rs.getString("LANGUAGE_NAME"));	
				programmingLanguage.setPublicScope(rs.getString("LANGUAGE_SCOPE"));
				
				spec.programmingLanguages.add(programmingLanguage);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
	}
	
	// ����/���� �˻�
	private void selectByTraining(String memberId) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "SELECT * FROM training WHERE MEMBER_ID = ?";
		
		try {	
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
		
			while(rs.next())
			{		
				Training training = new Training();
				training.setRegNo(rs.getInt("TRAINING_NO"));
				training.setTrainingName(rs.getString("TRAINING_NAME"));
				training.setTrainingPeriod(rs.getString("TRAINING_PERIOD"));	
				training.setTrainingOrg(rs.getString("TRAINING_ORG"));				
				training.setPublicScope(rs.getString("TRAINING_SCOPE"));
				
				spec.trainings.add(training);				
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}		
	}
	
	// ���󳻿� �˻�
	private void selectByAward(String memberId) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		
		String query = "SELECT * FROM award WHERE MEMBER_ID = ?";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
		
			while(rs.next())
			{	
				Award award = new Award();
				award.setRegNo(rs.getInt("AWARD_NO"));
				award.setAwardSubject(rs.getString("AWARD_SUBJECT"));
				award.setAwardDate(rs.getString("AWARD_DATE"));	
				award.setAwardOrg(rs.getString("AWARD_ORG"));				
				award.setPublicScope(rs.getString("AWARD_SCOPE"));
				
				spec.awards.add(award);				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}		
	}
	
	//�ֿ佺�� �˻�
	public String selectByMainSpec(String memberId) { 

		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		String mainSpec="";
		
		// �ڰ��� �׸�� ���忡 �߰�
		try {
			String query = "SELECT * FROM CERTIFICATE WHERE MEMBER_ID = ? AND CERTIFICATE_SCOPE = '��ü����'";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
			while(rs.next())
				mainSpec += rs.getString("CERTIFICATE_NAME") + " " + rs.getString("CERTIFICATE_GRADE") + " / ";
		} catch (SQLException e) {			
			e.printStackTrace();		
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		
		
		// ���дɷ� �׸�� ���忡 �߰�
		try {
			String query2 = "SELECT * FROM LANGUAGE_EXAM WHERE MEMBER_ID = ? AND LANGUAGE_EXAM_SCOPE = '��ü����'";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query2);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();			
			while(rs.next())		
				mainSpec += rs.getString("LANGUAGE_EXAM_NAME") + " " + rs.getString("LANGUAGE_EXAM_GRADE") + " / ";
		} catch (SQLException e) {			
			e.printStackTrace();		
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		
		
		// ������� �׸�� ���忡 �߰�
		try {
			String query3 = "SELECT * FROM AWARD WHERE MEMBER_ID = ? AND AWARD_SCOPE = '��ü����'";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query3);
			pstmt.setString(1, memberId);
			rs = pstmt.executeQuery();	
			while(rs.next())
				mainSpec += rs.getString("AWARD_SUBJECT") + " / ";
		} catch (SQLException e) {			
			e.printStackTrace();		
		} 	finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		
		//������ '/' �����.
		if(mainSpec.length()>1)
			mainSpec = mainSpec.substring(0, mainSpec.length()-2);
		return mainSpec;		 
	}
	
	// Ư�� ���̺��� �Է��׸��� �ִ� ȸ�� ����Ʈ�� ����
	public List<String> selectHaveSpecByMemberId(List<String> members, String tableName) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		List<String> newMembers = new ArrayList<String>();
		
		String subQuery = this.makeSubQueryByMembers(members);
		String query = "SELECT DISTINCT MEMBER_ID FROM " + tableName;
		query +=" WHERE " + subQuery;		
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();				
		
			while(rs.next())
			{	
				newMembers.add(rs.getString(1));			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		return newMembers;		
	}
	
	// Ư�� ���̺��� �Է��׸��� �ִ� ȸ�� ����Ʈ�� ����
	public List<String> selectHaveSpecByMemberId(List<String> members, String tableName, String  languageExamName, String languageGrade) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		List<String> newMembers = new ArrayList<String>();
		
		String subQuery = this.makeSubQueryByMembers(members);
		String query = "SELECT DISTINCT MEMBER_ID FROM " + tableName;
		query +=" WHERE " + subQuery;
		query +=" AND (LANGUAGE_EXAM_NAME = ? AND LANGUAGE_EXAM_GRADE > ? ) ";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, languageExamName);
			pstmt.setString(2, languageGrade);		
			rs = pstmt.executeQuery();				
		
			while(rs.next())
			{	
				newMembers.add(rs.getString(1));			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		return newMembers;		
	}
	
	// ������ �����ϴ� ȸ������Ʈ ����.
	public List<String> selectHaveSpecByAll() { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
		List<String> newMembers = new ArrayList<String>();
		
		// �̷��� ��ϵ� ȸ�� ã��.
		String query = "SELECT MEMBER_ID FROM SPEC WHERE SPEC_LAST_CHANGE_DATE IS NOT NULL";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				newMembers.add(rs.getString(1));			
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		return newMembers;		
	}
	

	/********************************************************************************
	 *																				* 
	 *																				*  
	 * 																				* 
	 * 						       INSERT PART										* 
	 *																				* 
	 * 																				* 
	 ********************************************************************************/
	
	// �ڰ��� �߰�.
	public void insert(Certificate certificate) 
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO CERTIFICATE";
			   query += "(MEMBER_ID, CERTIFICATE_NAME, CERTIFICATE_DATE, CERTIFICATE_GRADE, CERTIFICATE_ORG, CERTIFICATE_SCOPE, CERTIFICATE_REG_DATE)";
			   query += "VALUES(?,?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, certificate.getMemberId());
			pstmt.setString(2, certificate.getCertificateName());
			pstmt.setString(3, certificate.getCertificateDate());
			pstmt.setString(4, certificate.getCertificateGrade());
			pstmt.setString(5, certificate.getCertificateOrg());
			pstmt.setString(6, certificate.getPublicScope());
			pstmt.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(certificate.getMemberId(), "CERTIFICATE", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}		
	}	
	
	// �з� �߰�.
	public void insert(Academic academic)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO ACADEMIC";
			   query += "(MEMBER_ID, ACADEMIC_PERIOD, ACADEMIC_NAME, ACADEMIC_STATE, ACADEMIC_MAJOR, ACADEMIC_SCOPE, ACADEMIC_REG_DATE)";
			   query += "VALUES(?,?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, academic.getMemberId());
			pstmt.setString(2, academic.getAcademicPeriod());
			pstmt.setString(3, academic.getAcademicName());
			pstmt.setString(4, academic.getAcademicState());
			pstmt.setString(5, academic.getAcademicMajor());
			pstmt.setString(6, academic.getPublicScope());
			pstmt.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(academic.getMemberId(), "ACADEMIC", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
	}
	
	// ������� �߰�.
	public void insert(Award award)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO AWARD";
			   query += "(MEMBER_ID, AWARD_DATE, AWARD_SUBJECT, AWARD_ORG, AWARD_SCOPE, AWARD_REG_DATE)";
			   query += "VALUES(?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, award.getMemberId());
			pstmt.setString(2, award.getAwardDate());
			pstmt.setString(3, award.getAwardSubject());
			pstmt.setString(4, award.getAwardOrg());	
			pstmt.setString(5, award.getPublicScope());
			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(award.getMemberId(), "AWARD", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
	}
	
	// ���дɷ� �߰�.
	public void insert(Language language)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO LANGUAGE_EXAM";
			   query += "(MEMBER_ID, LANGUAGE, LANGUAGE_EXAM_NAME, LANGUAGE_EXAM_GRADE, LANGUAGE_EXAM_ORG, LANGUAGE_EXAM_SCOPE, LANGUAGE_EXAM_REG_DATE )";
			   query += "VALUES(?,?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, language.getMemberId());
			pstmt.setString(2, language.getLanguageName());
			pstmt.setString(3, language.getLanguageExamName());
			pstmt.setString(4, language.getLanguageExamGrade());	
			pstmt.setString(5, language.getLanguageExamOrg());
			pstmt.setString(6, language.getPublicScope());
			pstmt.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(language.getMemberId(), "LANGUAGE_EXAM", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
	}
	
	// �������. : ��/����, ���ʻ��� �̱���
	public void insert(Military military)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO MILITARY";
			   query += "(MEMBER_ID, MILITARY_PERIOD, MILITARY_GROUP, MILITARY_RANK, MILITARY_WORK, MILITARY_SCOPE, MILITARY_REG_DATE, MILITARY_IS_REG)";
			   query += "VALUES(?,?,?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, military.getMemberId());
			pstmt.setString(2, military.getMilitaryPeriod());
			pstmt.setString(3, military.getMilitaryGroup());
			pstmt.setString(4, military.getMilitaryRank());	
			pstmt.setString(5, military.getMilitaryWork());
			pstmt.setString(6, military.getPublicScope());
			pstmt.setTimestamp(7, new Timestamp(System.currentTimeMillis()));
			pstmt.setBoolean(8, military.isRegister());
			pstmt.executeUpdate();
			this.updateSpec(military.getMemberId(), "MILITARY", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
	}
	
	// ��Ʈ������ �߰� : ����Ϻκ� �̱���
	public void insert(Portfolio portfolio)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO PORTFOLIO"; 
			   query += "(MEMBER_ID, PORTFOLIO_PERIOD, PORTFOLIO_NAME , PORTFOLIO_LINK, PORTFOLIO_SCOPE, PORTFOLIO_REG_DATE)";
			   query += "VALUES(?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, portfolio.getMemberId());
			pstmt.setString(2, portfolio.getPortfolioPeriod());
			pstmt.setString(3, portfolio.getPortfolioName());
			pstmt.setString(4, portfolio.getPortfolioLink());
			pstmt.setString(5, portfolio.getPublicScope());
			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(portfolio.getMemberId(), "PORTFOLIO", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
	}
	
	// ��ȣ ���α׷��� ��� �߰�
	public void insert(ProgrammingLanguage programmingLanguage)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO PROGRAMMING_LANGUAGE";
			   query += "(MEMBER_ID, LANGUAGE_NAME, LANGUAGE_REG_DATE)";
			   query += "VALUES(?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, programmingLanguage.getMemberId());
			pstmt.setString(2, programmingLanguage.getLanguageName());		
			pstmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(programmingLanguage.getMemberId(), "PROGRAMMING_LANGUAGE", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
	}
	
	// ���� / ���� �߰�
	public void insert(Training training)
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	
		
		String query = "INSERT INTO TRAINING";
			   query += "(MEMBER_ID, TRAINING_PERIOD, TRAINING_NAME, TRAINING_ORG, TRAINING_SCOPE, TRAINING_REG_DATE)";
			   query += "VALUES(?,?,?,?,?,?)";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, training.getMemberId());
			pstmt.setString(2, training.getTrainingPeriod());
			pstmt.setString(3, training.getTrainingName());
			pstmt.setString(4, training.getTrainingOrg());
			pstmt.setString(5, training.getPublicScope());
			pstmt.setTimestamp(6, new Timestamp(System.currentTimeMillis()));
			pstmt.executeUpdate();
			this.updateSpec(training.getMemberId(), "TRAINING", 2);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}
		
	}
		
	//ȸ�����Խ� �ʿ���.
	public void insertMember(String studentCode) 
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	

		String query = "INSERT INTO SPEC";
			   query += "(member_id) ";		  
			   query += "values(?)";		
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, studentCode); 		 
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}		
	}	
	
	
	
	/********************************************************************************
	 *																				* 
	 *																				*  
	 * 																				* 
	 * 						       DELETE PART										* 
	 *																				* 
	 * 																				* 
	 ********************************************************************************/
	
	public void deleteSpec(String tableName, String tableNo) 
	{
		PreparedStatement pstmt = null;
		Connection conn = null;	

		//���̺� �÷��� ���� : programming_language ���� �ٸ� ���̺���� ���̺�� + _NO��.
		String tableColName;		
		if(tableName.equals("programming_language"))
			tableColName = "language_no";
		else
			tableColName = tableName + "_no";		
		
		String query = "DELETE FROM " + tableName  ;
			   query += " WHERE " + tableColName + " = " + tableNo;
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}		
	}	
	
	//����Ʈ����ߴɷ� ���� �޼ҵ� : ����� ���� ���� ����� ��Ȱ
	public void deleteByProgrammingLanguage(String memberId) 
	{
		PreparedStatement pstmt = null;
		Connection conn = null;			
		
		String query = "DELETE FROM PROGRAMMING_LANGUAGE";
			   query += " WHERE MEMBER_ID = " + memberId;
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}		
	}
	
	
	
	/********************************************************************************
	 *																				* 
	 *																				*  
	 * 																				* 
	 * 						       UPDATE PART										* 
	 *																				* 
	 * 																				* 
	 ********************************************************************************/
	
	// ��������� ����ɶ����� ���� ��¥�� ������ġ ��� �ϴ� �޼���
	private void updateSpec(String memberId, String changeLocation, int changePoint ) 
	{
		PreparedStatement pstmt = null;
		Connection conn = null;			
		
		String query = "UPDATE SPEC ";
	   	   query += "SET SPEC_CHANGE_LOCATION = ? , SPEC_CHANGE_POINT = ? , SPEC_LAST_CHANGE_DATE = ? ";
	   	   query += "WHERE MEMBER_ID = ? ";
		
		try {			
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, changeLocation);
			pstmt.setInt(2, changePoint);
			pstmt.setTimestamp(3, new Timestamp(System.currentTimeMillis()));
			pstmt.setString(4, memberId);
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt, conn);
		}		
	}	
	/********************************************************************************
	 *																				* 
	 *																				*  
	 * 																				* 
	 * 						       FUNCTION PART									* 
	 *																				* 
	 * 																				* 
	 ********************************************************************************/
	
	// �󼼰˻��� WHERE ���� ������ִ� �޼���
	private String makeSubQueryByMembers(List<String> members)
	{
		String subQuery ="";
		for(int i=0; i < members.size(); i++)
		{
			if(i==0)
				subQuery = "MEMBER_ID = '" + members.get(i) + "' ";
			else
				subQuery += "OR MEMBER_ID = '" + members.get(i) + "' ";
		}
		System.out.println("Maked SubQuery = " + subQuery);
		return subQuery;
	}
	
	
	
	/********************************************************************************
	 *																				* 
	 *																				*  
	 * 																				* 
	 * 						       STATISTICS PART									* 
	 *																				* 
	 * 																				* 
	 ********************************************************************************/
	
	// ��ü PART
	public Statistics statisticsPart_All(Statistics statis) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;
				
		// ��ü�л��� , �̷µ�ϵ� ��ü �л��� �̱�.
		String query = "SELECT COUNT(*), COUNT(SPEC_LAST_CHANGE_DATE) FROM SPEC;";
		
		try {
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.setTotalStudentCount(rs.getInt(1));	
				statis.setTotalSpecRegCount(rs.getInt(2));	
				statis.setTotalRegRatio((double)((int)((double)rs.getInt(2)/(double)rs.getInt(1)*1000))/10);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, pstmt, conn );
		}
		return statis;		
	}

	// ���� PART
	public Statistics statisticsPart_TOEIC(Statistics statis) { 
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
	
		try {
			// ���� �������, �ְ����� , ���� ����л���
			String query = "SELECT AVG(LANGUAGE_EXAM_GRADE), MAX(LANGUAGE_EXAM_GRADE), COUNT(LANGUAGE_EXAM_GRADE) ";
			query += "FROM LANGUAGE_EXAM WHERE LANGUAGE_EXAM_NAME = '����'";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.setAvgToeicScore((int)Math.round(rs.getDouble(1)));
				statis.setTopmostToeicScore(rs.getInt(2));
				statis.setTotalRegStudentCount_toeic(rs.getInt(3));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			// ���Ϳ�  3��.
			String query = "SELECT LANGUAGE_EXAM.MEMBER_ID, PROFILE.PROFILE_NAME, PROFILE.PROFILE_PHOTO_URL, LANGUAGE_EXAM_GRADE FROM LANGUAGE_EXAM , PROFILE  ";
			query +="WHERE LANGUAGE_EXAM.MEMBER_ID = PROFILE.MEMBER_ID AND LANGUAGE_EXAM_NAME ='����'  ";
			query +="GROUP BY LANGUAGE_EXAM.MEMBER_ID ORDER BY LANGUAGE_EXAM_GRADE DESC LIMIT 3";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.toeicKingId.add(rs.getString(1));
				statis.toeicKingName.add(rs.getString(2));
				statis.toeicKingPhoto.add(rs.getString(3));
				statis.toeicKingScore.add(rs.getInt(4));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		//100���� ���� 900�������
		for(int i=1; i<10; i++) {
			try {
				// ���� ���� ��ǥ
				String query = "SELECT COUNT(LANGUAGE_EXAM_GRADE) FROM LANGUAGE_EXAM ";
				query += "WHERE LANGUAGE_EXAM_NAME = '����' AND LANGUAGE_EXAM_GRADE LIKE  ";
				query += "'" + i +"%'";
	
				conn = JdbcUtil.getConnection(conn);
				pstmt = conn.prepareStatement(query);
				rs = pstmt.executeQuery();			
				while(rs.next())
				{	
					statis.distributionMap_toeic.add(rs.getInt(1));
				}		
			} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		}			
		return statis;		
	}
	
	// �ڰ��� PART
	public Statistics statisticsPart_CERTIFICATE(Statistics statis) { 		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;		
		try {
			// �ڰ��� ��� �л���, ��� �ڰ��� ����.
			String query = "select count(distinct member_id), count(*) from  certificate";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.setTotalRegStudentCount_certificate(rs.getInt(1));
				statis.setAvgCertificateCount((double)rs.getInt(2) / (double)rs.getInt(1));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			// �ڰ��� ��  3��.
			String query = "SELECT CERTIFICATE.MEMBER_ID, PROFILE.PROFILE_NAME, PROFILE.PROFILE_PHOTO_URL, COUNT(*) FROM CERTIFICATE, PROFILE  ";
			query +="WHERE CERTIFICATE.member_id = PROFILE.member_id ";
			query +="GROUP BY CERTIFICATE.member_id ORDER BY COUNT(*) DESC LIMIT 3";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.certificateKingId.add(rs.getString(1));
				statis.certificateKingName.add(rs.getString(2));
				statis.certificateKingPhoto.add(rs.getString(3));
				statis.certificateKingCount.add(rs.getInt(4));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		
		try {
			//1�� ���� 10���̻���� �ڰ��� ���� ��ǥ
			String query = "SELECT SUM(CASE cnt WHEN 1 THEN cnt_cnt END) AS '�׸� 1�� ȸ����' , SUM(CASE cnt WHEN 2 THEN cnt_cnt END) AS '�׸� 2�� ȸ����', SUM(CASE cnt WHEN 3 THEN cnt_cnt END) AS '�׸� 3�� ȸ����', SUM(CASE cnt WHEN 4 THEN cnt_cnt END) AS '�׸� 4�� ȸ����', SUM(CASE cnt WHEN 5 THEN cnt_cnt END) AS '�׸� 5�� ȸ����', SUM(CASE cnt WHEN 6 THEN cnt_cnt END) AS '�׸� 6�� ȸ����', SUM(CASE cnt WHEN 7 THEN cnt_cnt END) AS '�׸� 7�� ȸ����', SUM(CASE cnt WHEN 8 THEN cnt_cnt END) AS '�׸� 8�� ȸ����', SUM(CASE cnt WHEN 9 THEN cnt_cnt END) AS '�׸� 9�� ȸ����', SUM(CASE WHEN cnt > 9 THEN cnt_cnt END) AS '�׸� 10�� �̻� ȸ����' FROM (SELECT cnt, IFNULL(COUNT(*), 0) AS cnt_cnt FROM (SELECT COUNT(*) AS cnt ";
			query += "FROM CERTIFICATE GROUP BY MEMBER_ID) c1 GROUP BY cnt) c2;";

			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.distributionMap_certi.add(rs.getInt(1));	 	//�׸��� 1���� �л���
				statis.distributionMap_certi.add(rs.getInt(2));	 	//�׸��� 2���� �л���
				statis.distributionMap_certi.add(rs.getInt(3));	 	//�׸��� 3���� �л���
				statis.distributionMap_certi.add(rs.getInt(4));	 	//�׸��� 4���� �л���
				statis.distributionMap_certi.add(rs.getInt(5));	 	//�׸��� 5���� �л���
				statis.distributionMap_certi.add(rs.getInt(6));	 	//�׸��� 6���� �л���
				statis.distributionMap_certi.add(rs.getInt(7));	 	//�׸��� 7���� �л���
				statis.distributionMap_certi.add(rs.getInt(8));	 	//�׸��� 8���� �л���
				statis.distributionMap_certi.add(rs.getInt(9));	 	//�׸��� 9���� �л���
				statis.distributionMap_certi.add(rs.getInt(10));	//�׸��� 10���̻� �л���
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}		
		return statis;
	}
	
	
	
	// ��Ʈ������ PART
	public Statistics statisticsPart_PORTFOLIO(Statistics statis) { 			
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
	
		try {
			// ��Ʈ������ ��� �л���,��Ʈ������ ��հ���.
			String query = "select count(distinct member_id), count(*) from  PORTFOLIO";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.setTotalRegStudentCount_portfolio(rs.getInt(1));
				statis.setAvgPortfolioCount((double)rs.getInt(2) / (double)rs.getInt(1));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			// ��Ʈ������ ��  3��.
			String query = "SELECT portfolio.MEMBER_ID, PROFILE.PROFILE_NAME, PROFILE.PROFILE_PHOTO_URL, COUNT(*) FROM portfolio, PROFILE   ";
			query +="WHERE PORTFOLIO.member_id = PROFILE.member_id ";
			query +="GROUP BY PORTFOLIO.member_id ORDER BY COUNT(*) DESC LIMIT 3";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.portfolioKingId.add(rs.getString(1));
				statis.portfolioKingName.add(rs.getString(2));
				statis.portfolioKingPhoto.add(rs.getString(3));
				statis.portfolioKingCount.add(rs.getInt(4));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			//1�� ���� 10���̻���� ��Ʈ������ ���� ��ǥ
			String query = "SELECT SUM(CASE cnt WHEN 1 THEN cnt_cnt END) AS '�׸� 1�� ȸ����' , SUM(CASE cnt WHEN 2 THEN cnt_cnt END) AS '�׸� 2�� ȸ����', SUM(CASE cnt WHEN 3 THEN cnt_cnt END) AS '�׸� 3�� ȸ����', SUM(CASE cnt WHEN 4 THEN cnt_cnt END) AS '�׸� 4�� ȸ����', SUM(CASE cnt WHEN 5 THEN cnt_cnt END) AS '�׸� 5�� ȸ����', SUM(CASE cnt WHEN 6 THEN cnt_cnt END) AS '�׸� 6�� ȸ����', SUM(CASE cnt WHEN 7 THEN cnt_cnt END) AS '�׸� 7�� ȸ����', SUM(CASE cnt WHEN 8 THEN cnt_cnt END) AS '�׸� 8�� ȸ����', SUM(CASE cnt WHEN 9 THEN cnt_cnt END) AS '�׸� 9�� ȸ����', SUM(CASE WHEN cnt > 9 THEN cnt_cnt END) AS '�׸� 10�� �̻� ȸ����' FROM (SELECT cnt, IFNULL(COUNT(*), 0) AS cnt_cnt FROM (SELECT COUNT(*) AS cnt ";
			query += "FROM PORTFOLIO GROUP BY MEMBER_ID) c1 GROUP BY cnt) c2;";

			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.distributionMap_portfolio.add(rs.getInt(1));	 	//�׸��� 1���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(2));	 	//�׸��� 2���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(3));	 	//�׸��� 3���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(4));	 	//�׸��� 4���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(5));	 	//�׸��� 5���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(6));	 	//�׸��� 6���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(7));	 	//�׸��� 7���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(8));	 	//�׸��� 8���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(9));	 	//�׸��� 9���� �л���
				statis.distributionMap_portfolio.add(rs.getInt(10));	//�׸��� 10���̻� �л���
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}		
		return statis;
	}
	
	
	// ������� PART
	public Statistics statisticsPart_AWARD(Statistics statis) { 			
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
	
		try {
			// ������� ��� �л���,������� ��հ���.
			String query = "select count(distinct member_id), count(*) from  AWARD";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.setTotalRegStudentCount_award(rs.getInt(1));
				statis.setAvgAwardCount((double)rs.getInt(2) / (double)rs.getInt(1));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			// ������� ��  3��.
			String query = "SELECT AWARD.MEMBER_ID, PROFILE.PROFILE_NAME, PROFILE.PROFILE_PHOTO_URL, COUNT(*) FROM AWARD, PROFILE  ";
			query +="WHERE AWARD.member_id = PROFILE.member_id ";
			query +="GROUP BY AWARD.member_id ORDER BY COUNT(*) DESC LIMIT 3";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.awardKingId.add(rs.getString(1));
				statis.awardKingName.add(rs.getString(2));
				statis.awardKingPhoto.add(rs.getString(3));
				statis.awardKingCount.add(rs.getInt(4));
		
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			//1�� ���� 10���̻���� ������� ���� ��ǥ
			String query = "SELECT SUM(CASE cnt WHEN 1 THEN cnt_cnt END) AS '�׸� 1�� ȸ����' , SUM(CASE cnt WHEN 2 THEN cnt_cnt END) AS '�׸� 2�� ȸ����', SUM(CASE cnt WHEN 3 THEN cnt_cnt END) AS '�׸� 3�� ȸ����', SUM(CASE cnt WHEN 4 THEN cnt_cnt END) AS '�׸� 4�� ȸ����', SUM(CASE cnt WHEN 5 THEN cnt_cnt END) AS '�׸� 5�� ȸ����', SUM(CASE cnt WHEN 6 THEN cnt_cnt END) AS '�׸� 6�� ȸ����', SUM(CASE cnt WHEN 7 THEN cnt_cnt END) AS '�׸� 7�� ȸ����', SUM(CASE cnt WHEN 8 THEN cnt_cnt END) AS '�׸� 8�� ȸ����', SUM(CASE cnt WHEN 9 THEN cnt_cnt END) AS '�׸� 9�� ȸ����', SUM(CASE WHEN cnt > 9 THEN cnt_cnt END) AS '�׸� 10�� �̻� ȸ����' FROM (SELECT cnt, IFNULL(COUNT(*), 0) AS cnt_cnt FROM (SELECT COUNT(*) AS cnt ";
			query += "FROM AWARD GROUP BY MEMBER_ID) c1 GROUP BY cnt) c2;";

			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.distributionMap_award.add(rs.getInt(1));	 	//�׸��� 1���� �л���
				statis.distributionMap_award.add(rs.getInt(2));	 	//�׸��� 2���� �л���
				statis.distributionMap_award.add(rs.getInt(3));	 	//�׸��� 3���� �л���
				statis.distributionMap_award.add(rs.getInt(4));	 	//�׸��� 4���� �л���
				statis.distributionMap_award.add(rs.getInt(5));	 	//�׸��� 5���� �л���
				statis.distributionMap_award.add(rs.getInt(6));	 	//�׸��� 6���� �л���
				statis.distributionMap_award.add(rs.getInt(7));	 	//�׸��� 7���� �л���
				statis.distributionMap_award.add(rs.getInt(8));	 	//�׸��� 8���� �л���
				statis.distributionMap_award.add(rs.getInt(9));	 	//�׸��� 9���� �л���
				statis.distributionMap_award.add(rs.getInt(10));	//�׸��� 10���̻� �л���
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}		
		return statis;
	}
	
	
	// ����Ʈ���� ���� �ɷ� PART
	public Statistics statisticsPart_SWAbility(Statistics statis) { 			
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		Connection conn = null;	
	
		try {
			// ����Ʈ����ߴɷ� ��� ����
			String query = "select count(distinct member_id), count(*) from  programming_language";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.setAvgSwAbilityCount((double)rs.getInt(2) / (double)rs.getInt(1));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			// ��ȣ ���α׷��� ���ߴɷ� �� ���
			String query = "select language_name, count(*) as 'cnt' from programming_language group by language_name ";
			query += "ORDER BY 'cnt' DESC LIMIT 8";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.swAbilityRank.put(rs.getString(1), rs.getInt(2));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			// ����Ʈ����ߴɷ� ���  '���'�� '�����л���'
			String query = " select language_name, IFNULL(count(*),0) from programming_language group by language_name";
			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.totalRegStudentCountMap_SWAbility.put(rs.getString(1), rs.getInt(2));
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}
		
		try {
			//1�� ���� 10���̻���� ����Ʈ����ߴɷ� ��� ���� ��ǥ
			String query = "SELECT SUM(CASE cnt WHEN 1 THEN cnt_cnt END) AS '�׸� 1�� ȸ����' , SUM(CASE cnt WHEN 2 THEN cnt_cnt END) AS '�׸� 2�� ȸ����', SUM(CASE cnt WHEN 3 THEN cnt_cnt END) AS '�׸� 3�� ȸ����', SUM(CASE cnt WHEN 4 THEN cnt_cnt END) AS '�׸� 4�� ȸ����', SUM(CASE cnt WHEN 5 THEN cnt_cnt END) AS '�׸� 5�� ȸ����', SUM(CASE cnt WHEN 6 THEN cnt_cnt END) AS '�׸� 6�� ȸ����', SUM(CASE cnt WHEN 7 THEN cnt_cnt END) AS '�׸� 7�� ȸ����', SUM(CASE cnt WHEN 8 THEN cnt_cnt END) AS '�׸� 8�� ȸ����', SUM(CASE cnt WHEN 9 THEN cnt_cnt END) AS '�׸� 9�� ȸ����', SUM(CASE WHEN cnt > 9 THEN cnt_cnt END) AS '�׸� 10�� �̻� ȸ����' FROM (SELECT cnt, IFNULL(COUNT(*), 0) AS cnt_cnt FROM (SELECT COUNT(*) AS cnt ";
			query += "FROM PROGRAMMING_LANGUAGE GROUP BY MEMBER_ID) c1 GROUP BY cnt) c2;";

			conn = JdbcUtil.getConnection(conn);
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();			
			while(rs.next())
			{	
				statis.distributionMap_swAbility.add(rs.getInt(1));	 	//�׸��� 1���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(2));	 	//�׸��� 2���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(3));	 	//�׸��� 3���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(4));	 	//�׸��� 4���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(5));	 	//�׸��� 5���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(6));	 	//�׸��� 6���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(7));	 	//�׸��� 7���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(8));	 	//�׸��� 8���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(9));	 	//�׸��� 9���� �л���
				statis.distributionMap_swAbility.add(rs.getInt(10));	//�׸��� 10���̻� �л���
			}		
		} catch (SQLException e) {		e.printStackTrace();	} finally {		JdbcUtil.close(rs, pstmt, conn );	}		
		return statis;
	}
}
