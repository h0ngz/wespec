package model.vo.spec;

import java.util.Date;


public class ProgrammingLanguage {
	
	//language ����
	private String languageName;			// ���α׷��־�� ��
	private String languageLevel;			// ���α׷��־�� ����
	private int regNo;						// ��Ϲ�ȣ
	private String publicScope;				// ��������
	private Date regDate;					// �����
	private String memberId;				// ����� ID
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public String getLanguageLevel() {
		return languageLevel;
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
	public void setLanguageLevel(String languageLevel) {
		this.languageLevel = languageLevel;
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
