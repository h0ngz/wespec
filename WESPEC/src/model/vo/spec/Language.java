package model.vo.spec;

import java.util.Date;

public class Language {
	
	//language ����					
	private String languageName;				// ���
	private String languageExamName;			// ������ ��
	private String languageExamGrade;			// ������ ��� �� ����
	private String languageExamOrg;				// ���� ���
	private int regNo;							// ��Ϲ�ȣ	
	private String publicScope;					// ��������
	private Date regDate;						// �����
	
	public String getLanguageName() {
		return languageName;
	}
	public String getLanguageExamName() {
		return languageExamName;
	}
	public String getLanguageExamGrade() {
		return languageExamGrade;
	}
	public String getLanguageExamOrg() {
		return languageExamOrg;
	}
	public int getRegNo() {
		return regNo;
	}
	public String getPublicScope() {
		return publicScope;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public void setLanguageExamName(String languageExamName) {
		this.languageExamName = languageExamName;
	}
	public void setLanguageExamGrade(String languageExamGrade) {
		this.languageExamGrade = languageExamGrade;
	}
	public void setLanguageExamOrg(String languageExamOrg) {
		this.languageExamOrg = languageExamOrg;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public void setPublicScope(String publicScope) {
		this.publicScope = publicScope;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
