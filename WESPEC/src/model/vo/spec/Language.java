package model.vo.spec;

import java.util.Date;

import model.vo.Spec;

public class Language extends Spec{
	
	//language ����					
	private String languageName;				// ���
	private String languageExamName;			// ������ ��
	private String languageExamGrade;			// ������ ��� �� ����
	private String languageExamOrganization;	// ���� ���
	private int regNo;							// ��Ϲ�ȣ	
	private int publicScope;					// ��������
	private Date regDate;						// �����
	
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getLanguageExamName() {
		return languageExamName;
	}
	public void setLanguageExamName(String languageExamName) {
		this.languageExamName = languageExamName;
	}
	public String getLanguageExamGrade() {
		return languageExamGrade;
	}
	public void setLanguageExamGrade(String languageExamGrade) {
		this.languageExamGrade = languageExamGrade;
	}
	public String getLanguageExamOrganization() {
		return languageExamOrganization;
	}
	public void setLanguageExamOrganization(String languageExamOrganization) {
		this.languageExamOrganization = languageExamOrganization;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public int getPublicScope() {
		return publicScope;
	}
	public void setPublicScope(int publicScope) {
		this.publicScope = publicScope;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	

}
