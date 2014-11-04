package model.vo.spec;

import java.util.Date;

import model.vo.Spec;


public class Certificate extends Spec{
	
	// certificate ����	
	private String certificateName;				// �ڰ��� ��
	private String certificateDate;				// �ڰ��� �����
	private String certificateGrade;			// �ڰ��� ���
	private String certificateOrganization;		// ���
	private int regNo;							// ��Ϲ�ȣ
	private int publicScope;					// ��������
	private Date regDate;						// �����
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getCertificateDate() {
		return certificateDate;
	}
	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}
	public String getCertificateGrade() {
		return certificateGrade;
	}
	public void setCertificateGrade(String certificateGrade) {
		this.certificateGrade = certificateGrade;
	}
	public String getCertificateOrganization() {
		return certificateOrganization;
	}
	public void setCertificateOrganization(String certificateOrganization) {
		this.certificateOrganization = certificateOrganization;
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
