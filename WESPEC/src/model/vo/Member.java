package model.vo;

public class Member {
	
	private String memberId;		// ���� ���̵�
	private String memberPassword;	// ���� �н�����
	private String memberName;		// �л� �̸�
	private char memberGroup;		// ���� �׷� : S-�л� , P-����, A-������
	private int studentGrade;		// �л� �г�
	private char studentGender;		// �л� ����
	private int studentHit;			// �л� �� ������ ��Ƚ��
	
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
	public int getStudentGrade() {
		return studentGrade;
	}
	public void setStudentGrade(int studentGrade) {
		this.studentGrade = studentGrade;
	}
	public char getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(char studentGender) {
		this.studentGender = studentGender;
	}
	public int getStudentHit() {
		return studentHit;
	}
	public void setStudentHit(int studentHit) {
		this.studentHit = studentHit;
	}

	


}