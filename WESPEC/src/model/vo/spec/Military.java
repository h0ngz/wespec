package model.vo.spec;

import java.util.Date;

import model.vo.Spec;

public class Military  {
	//militray ����
	
	private int militaryDone;				// ��&����
	private String militaryReason;				// ���ʻ���
	private String militaryGroup;				// ����
	private String militaryRank;				// ���
	private String militaryWork;				// ����
	private String militaryPeriod;				// �����Ⱓ	
	private int regNo;							// ��Ϲ�ȣ
	private int publicScope;					// ��������
	private Date regDate;						// �����
	
	public int isMilitaryDone() {
		return militaryDone;
	}
	public void setMilitaryDone(int militaryDone) {
		this.militaryDone = militaryDone;
	}
	public String getMilitaryReason() {
		return militaryReason;
	}
	public void setMilitaryReason(String militaryReason) {
		this.militaryReason = militaryReason;
	}
	public String getMilitaryGroup() {
		return militaryGroup;
	}
	public void setMilitaryGroup(String militaryGroup) {
		this.militaryGroup = militaryGroup;
	}
	public String getMilitaryRank() {
		return militaryRank;
	}
	public void setMilitaryRank(String militaryRank) {
		this.militaryRank = militaryRank;
	}
	public String getMilitaryWork() {
		return militaryWork;
	}
	public void setMilitaryWork(String militaryWork) {
		this.militaryWork = militaryWork;
	}
	public String getMilitaryPeriod() {
		return militaryPeriod;
	}
	public void setMilitaryPeriod(String militaryPeriod) {
		this.militaryPeriod = militaryPeriod;
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
