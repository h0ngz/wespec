package model.vo.spec;

import java.util.Date;



public class Military  {
	//militray ����
	
	private int militaryDone;					// ��&����
	private String militaryReason;				// ���ʻ���
	private String militaryGroup;				// ����
	private String militaryRank;				// ���
	private String militaryWork;				// ����
	private String militaryPeriod;				// �����Ⱓ	
	private int regNo;							// ��Ϲ�ȣ
	private String publicScope;					// ��������
	private boolean isRegister;					// ���� ��Ͽ���
	private Date regDate;						// �����
	private String memberId;					// ����� ID
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public int getMilitaryDone() {
		return militaryDone;
	}
	public String getMilitaryReason() {
		return militaryReason;
	}
	public String getMilitaryGroup() {
		return militaryGroup;
	}
	public String getMilitaryRank() {
		return militaryRank;
	}
	public String getMilitaryWork() {
		return militaryWork;
	}
	public String getMilitaryPeriod() {
		return militaryPeriod;
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
	public void setMilitaryDone(int militaryDone) {
		this.militaryDone = militaryDone;
	}
	public void setMilitaryReason(String militaryReason) {
		this.militaryReason = militaryReason;
	}
	public void setMilitaryGroup(String militaryGroup) {
		this.militaryGroup = militaryGroup;
	}
	public void setMilitaryRank(String militaryRank) {
		this.militaryRank = militaryRank;
	}
	public void setMilitaryWork(String militaryWork) {
		this.militaryWork = militaryWork;
	}
	public void setMilitaryPeriod(String militaryPeriod) {
		this.militaryPeriod = militaryPeriod;
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
	public boolean isRegister() {
		return isRegister;
	}
	public void setRegister(boolean isRegister) {
		this.isRegister = isRegister;
	}
}
