package model.vo.spec;

import java.util.Date;


public class Training  {
	
	//member ����	
	private String trainingName;				// ����/���� ����
	private String trainingPeriod;				// ����/���� �Ⱓ
	private String trainingOrg;					// ����/���� ���
	private int regNo;							// ��Ϲ�ȣ
	private String publicScope;					// ��������
	private Date regDate;						// �����
	private String memberId;					// ����� ID
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTrainingName() {
		return trainingName;
	}
	public String getTrainingPeriod() {
		return trainingPeriod;
	}
	public String getTrainingOrg() {
		return trainingOrg;
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
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public void setTrainingPeriod(String trainingPeriod) {
		this.trainingPeriod = trainingPeriod;
	}
	public void setTrainingOrg(String trainingOrg) {
		this.trainingOrg = trainingOrg;
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