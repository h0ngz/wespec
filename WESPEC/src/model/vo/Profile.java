package model.vo;

import java.sql.Date;

public class Profile {
	
	private String memberId;			// �л� ���̵�
	private String profileChiName;		// �л� �ѹ� �̸�
	private String profileEngName;		// �л� ���� �̸�
	private String profileAdress;		// �л� ������
	private String profileBirth;		// �л� �������
	private String profilePhone;		// �л� �޴��� ��ȣ
	private String profileEmail;		// �л� �̸����ּ�
	private String profileSns;			// �л� ��� SNS
	private String profileSnsFacebook;	// �л� ���̽��� �ּ�
	private String profileSnsTwitter;	// �л� Ʈ���� �ּ�
	private String profileSnsNBlog;		// �л� ���̹���α� �ּ�
	private String profileSnsInstagram;	// �л� �ν�Ÿ�׷� �ּ�
	private String profileSnsTumblr;	// �л� �Һ� �ּ�
	private String profileSnsPinterest;	// �л� ���ͷ���Ʈ �ּ�	
	private String profilePhotoURL;		// �л� ������ ���� URL
	private Date profileRegistration;	// ������ �����.
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getProfileChiName() {
		return profileChiName;
	}
	public void setProfileChiName(String profileChiName) {
		this.profileChiName = profileChiName;
	}
	public String getProfileEngName() {
		return profileEngName;
	}
	public void setProfileEngName(String profileEngName) {
		this.profileEngName = profileEngName;
	}
	public String getProfileAdress() {
		return profileAdress;
	}
	public void setProfileAdress(String profileAdress) {
		this.profileAdress = profileAdress;
	}
	public String getProfileBirth() {
		return profileBirth;
	}
	public void setProfileBirth(String profileBirth) {
		this.profileBirth = profileBirth;
	}
	public String getProfilePhone() {
		return profilePhone;
	}
	public void setProfilePhone(String profilePhone) {
		this.profilePhone = profilePhone;
	}
	public String getProfileEmail() {
		return profileEmail;
	}
	public void setProfileEmail(String profileEmail) {
		this.profileEmail = profileEmail;
	}
	public String getProfileSns() {
		return profileSns;
	}
	public void setProfileSns(String profileSns) {
		this.profileSns = profileSns;
	}
	public String getProfileSnsFacebook() {
		return profileSnsFacebook;
	}
	public void setProfileSnsFacebook(String profileSnsFacebook) {
		this.profileSnsFacebook = profileSnsFacebook;
	}
	public String getProfileSnsTwitter() {
		return profileSnsTwitter;
	}
	public void setProfileSnsTwitter(String profileSnsTwitter) {
		this.profileSnsTwitter = profileSnsTwitter;
	}
	public String getProfileSnsNBlog() {
		return profileSnsNBlog;
	}
	public void setProfileSnsNBlog(String profileSnsNBlog) {
		this.profileSnsNBlog = profileSnsNBlog;
	}
	public String getProfileSnsInstagram() {
		return profileSnsInstagram;
	}
	public void setProfileSnsInstagram(String profileSnsInstagram) {
		this.profileSnsInstagram = profileSnsInstagram;
	}
	public String getProfileSnsTumblr() {
		return profileSnsTumblr;
	}
	public void setProfileSnsTumblr(String profileSnsTumblr) {
		this.profileSnsTumblr = profileSnsTumblr;
	}
	public String getProfileSnsPinterest() {
		return profileSnsPinterest;
	}
	public void setProfileSnsPinterest(String profileSnsPinterest) {
		this.profileSnsPinterest = profileSnsPinterest;
	}
	public String getProfilePhotoURL() {
		return profilePhotoURL;
	}
	public void setProfilePhotoURL(String profilePhotoURL) {
		this.profilePhotoURL = profilePhotoURL;
	}
	public Date getProfileRegistration() {
		return profileRegistration;
	}
	public void setProfileRegistration(Date profileRegistration) {
		this.profileRegistration = profileRegistration;
	}
}