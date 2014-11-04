package model.vo.spec;

import java.util.Date;

import model.vo.Spec;

public class Award extends Spec {
	
	//award ����
	private String awardDate;				// ������
	private String awardSubject;			// ���󳻿�
	private String awardOrganization;		// ������
	private int regNo;						// ��Ϲ�ȣ
	private int publicScope;				// ��������
	private Date regDate;					// �����
	
	public String getAwardDate() {
		return awardDate;
	}
	public void setAwardDate(String awardDate) {
		this.awardDate = awardDate;
	}
	public String getAwardSubject() {
		return awardSubject;
	}
	public void setAwardSubject(String awardSubject) {
		this.awardSubject = awardSubject;
	}
	public String getAwardOrganization() {
		return awardOrganization;
	}
	public void setAwardOrganization(String awardOrganization) {
		this.awardOrganization = awardOrganization;
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
