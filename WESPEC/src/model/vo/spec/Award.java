package model.vo.spec;

import java.util.Date;

public class Award  {
	
	//award ����
	private String awardDate;				// ������
	private String awardSubject;			// ���󳻿�
	private String awardOrg;				// ������
	private int regNo;						// ��Ϲ�ȣ
	private String publicScope;				// ��������
	private Date regDate;					// �����
	
	public String getAwardDate() {
		return awardDate;
	}
	public String getAwardSubject() {
		return awardSubject;
	}
	public String getAwardOrg() {
		return awardOrg;
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
	public void setAwardDate(String awardDate) {
		this.awardDate = awardDate;
	}
	public void setAwardSubject(String awardSubject) {
		this.awardSubject = awardSubject;
	}
	public void setAwardOrg(String awardOrg) {
		this.awardOrg = awardOrg;
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
