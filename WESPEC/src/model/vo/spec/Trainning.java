package model.vo.spec;

import java.util.Date;

import model.vo.Spec;

public class Trainning  {
	
	//member ����	
	private String trainingName;				// ����/���� ����
	private String trainingPeriod;				// ����/���� �Ⱓ
	private String trainingOrg;					// ����/���� ���
	private int regNo;							// ��Ϲ�ȣ
	private int publicScope;					// ��������
	private Date regDate;						// �����
	
	public String getTrainingName() {
		return trainingName;
	}
	public void setTrainingName(String trainingName) {
		this.trainingName = trainingName;
	}
	public String getTrainingPeriod() {
		return trainingPeriod;
	}
	public void setTrainingPeriod(String trainingPeriod) {
		this.trainingPeriod = trainingPeriod;
	}
	public String getTrainingOrg() {
		return trainingOrg;
	}
	public void setTrainingOrg(String trainingOrg) {
		this.trainingOrg = trainingOrg;
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