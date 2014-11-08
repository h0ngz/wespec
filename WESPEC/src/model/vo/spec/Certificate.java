package model.vo.spec;

import java.util.Date;


public class Certificate {
	
	// certificate ����	
	private String certificateName;				// �ڰ��� ��
	private String certificateDate;				// �ڰ��� �����
	private String certificateGrade;			// �ڰ��� ���
	private String certificateOrg;				// ���
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
	public String getCertificateName() {
		return certificateName;
	}
	public String getCertificateDate() {
		return certificateDate;
	}
	public String getCertificateGrade() {
		return certificateGrade;
	}
	public String getCertificateOrg() {
		return certificateOrg;
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
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}
	public void setCertificateGrade(String certificateGrade) {
		this.certificateGrade = certificateGrade;
	}
	public void setCertificateOrg(String certificateOrg) {
		this.certificateOrg = certificateOrg;
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
