package model.vo.spec;

import java.util.Date;

import model.vo.Spec;

public class ProgrammingLanguage {
	
	//language ����
	private String languageName;			// ���α׷��־�� ��
	private String languageLevel;			// ���α׷��־�� ����
	private int regNo;						// ��Ϲ�ȣ
	private int publicScope;				// ��������
	private Date regDate;					// �����
	
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	public String getLanguageLevel() {
		return languageLevel;
	}
	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
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
