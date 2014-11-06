package model.vo.spec;

import java.util.Date;


public class Academic {
	
	//academic ����	
	private String academicName;			// �б���
	private String academicMajor;			// ����
	private String academicPeriod;			// ���бⰣ
	private String academicState;			// ���� : { ����, ����, ���� }
	private String academicScore;			// ����
	private int regNo;						// ��Ϲ�ȣ
	private String publicScope;				// ��������
	private Date regDate;					// �����
	
	public String getAcademicName() {
		return academicName;
	}
	public void setAcademicName(String academicName) {
		this.academicName = academicName;
	}
	public String getAcademicMajor() {
		return academicMajor;
	}
	public void setAcademicMajor(String academicMajor) {
		this.academicMajor = academicMajor;
	}
	public String getAcademicPeriod() {
		return academicPeriod;
	}
	public void setAcademicPeriod(String academicPeriod) {
		this.academicPeriod = academicPeriod;
	}
	public String getAcademicState() {
		return academicState;
	}
	public void setAcademicState(String academicState) {
		this.academicState = academicState;
	}
	public String getAcademicScore() {
		return academicScore;
	}
	public void setAcademicScore(String academicScore) {
		this.academicScore = academicScore;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public String getPublicScope() {
		return publicScope;
	}
	public void setPublicScope(String publicScope) {
		this.publicScope = publicScope;
	}
	

	

}
