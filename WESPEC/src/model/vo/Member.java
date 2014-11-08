package model.vo;

import java.sql.Timestamp;

public class Member {
	
	private String memberId;		// ���� ���̵�
	private String memberPassword;	// ���� �н�����
	private String memberGroup;		// ���� �׷� : S-�л� , P-����, A-������
	private Timestamp regDate;		// ������.
	
	public String getMemberId() {
		return memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public String getMemberGroup() {
		return memberGroup;
	}
	public Timestamp getRegDate() {
		return regDate;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public void setMemberGroup(String memberGroup) {
		this.memberGroup = memberGroup;
	}
	public void setRegDate(Timestamp timestamp) {
		this.regDate = timestamp;
	}
}