package model.vo;

public class Member {
	
	private String memberId;		// ���� ���̵�
	private String memberPassword;	// ���� �н�����
	private String memberName;		// �л� �̸�
	private char memberGroup;		// ���� �׷� : S-�л� , P-����, A-������
	private int memberGrade;		// �л� �г�
	private int memberHit;			// �л� �� ������ ��Ƚ��
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberPassword() {
		return memberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public char getMemberGroup() {
		return memberGroup;
	}
	public void setMemberGroup(char memberGroup) {
		this.memberGroup = memberGroup;
	}
	public int getMemberGrade() {
		return memberGrade;
	}
	public void setMemberGrade(int memberGrade) {
		this.memberGrade = memberGrade;
	}
	public int getMemberHit() {
		return memberHit;
	}
	public void setMemberHit(int memberHit) {
		this.memberHit = memberHit;
	}
	
	


}