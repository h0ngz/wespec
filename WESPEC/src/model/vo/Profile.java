package model.vo;

import java.sql.Date;

public class Profile {
	 
	private String memberId;			// �л� ���̵� : �й�
	private String profileName;			// �л� �̸�
	private int profileGrade;			// �л� �г�
	private String profileGender;		// ���� { ��,��}
	private String profileChiName;		// �л� �ѹ� �̸�
	private String profileEngName;		// �л� ���� �̸�
	private String profileAddress;		// �л� ������
	private String profileBirth;		// �л� �������
	private String profilePhone;		// �л� �޴��� ��ȣ
	private String profileEmail;		// �л� �̸����ּ�
	private String profileSnsFacebook;	// �л� ���̽��� �ּ�
	private String profileSnsTwitter;	// �л� Ʈ���� �ּ�
	private String profileSnsNBlog;		// �л� ���̹���α� �ּ�
	private String profileSnsInstagram;	// �л� �ν�Ÿ�׷� �ּ�
	private String profileSnsTumblr;	// �л� �Һ� �ּ�
	private String profileSnsPinterest;	// �л� ���ͷ���Ʈ �ּ�	
	private String profilePhotoURL;		// �л� ������ ���� URL
	private int hit;					// �л������� ��Ƚ��
	private Date regDate;	// ������ �����.
	
	public String getMemberId() {
		return memberId;
	}
	public String getProfileName() {
		return profileName;
	}
	public int getProfileGrade() {
		return profileGrade;
	}
	public String getProfileGender() {
		return profileGender;
	}
	public String getProfileChiName() {
		return profileChiName;
	}
	public String getProfileEngName() {
		return profileEngName;
	}
	public String getProfileAddress() {
		return profileAddress;
	}
	public String getProfileBirth() {
		return profileBirth;
	}
	public String getProfilePhone() {
		return profilePhone;
	}
	public String getProfileEmail() {
		return profileEmail;
	}
	public String getProfileSnsFacebook() {
		return profileSnsFacebook;
	}
	public String getProfileSnsTwitter() {
		return profileSnsTwitter;
	}
	public String getProfileSnsNBlog() {
		return profileSnsNBlog;
	}
	public String getProfileSnsInstagram() {
		return profileSnsInstagram;
	}
	public String getProfileSnsTumblr() {
		return profileSnsTumblr;
	}
	public String getProfileSnsPinterest() {
		return profileSnsPinterest;
	}
	public String getProfilePhotoURL() {
		return profilePhotoURL;
	}
	public int getHit() {
		return hit;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public void setProfileName(String profileName) {
		this.profileName = profileName;
	}
	public void setProfileGrade(int profileGrade) {
		this.profileGrade = profileGrade;
	}
	public void setProfileGender(String profileGender) {
		this.profileGender = profileGender;
	}
	public void setProfileChiName(String profileChiName) {
		this.profileChiName = profileChiName;
	}
	public void setProfileEngName(String profileEngName) {
		this.profileEngName = profileEngName;
	}
	public void setProfileAddress(String profileAddress) {
		this.profileAddress = profileAddress;
	}
	public void setProfileBirth(String profileBirth) {
		this.profileBirth = profileBirth;
	}
	public void setProfilePhone(String profilePhone) {
		this.profilePhone = profilePhone;
	}
	public void setProfileEmail(String profileEmail) {
		this.profileEmail = profileEmail;
	}
	public void setProfileSnsFacebook(String profileSnsFacebook) {
		this.profileSnsFacebook = profileSnsFacebook;
	}
	public void setProfileSnsTwitter(String profileSnsTwitter) {
		this.profileSnsTwitter = profileSnsTwitter;
	}
	public void setProfileSnsNBlog(String profileSnsNBlog) {
		this.profileSnsNBlog = profileSnsNBlog;
	}
	public void setProfileSnsInstagram(String profileSnsInstagram) {
		this.profileSnsInstagram = profileSnsInstagram;
	}
	public void setProfileSnsTumblr(String profileSnsTumblr) {
		this.profileSnsTumblr = profileSnsTumblr;
	}
	public void setProfileSnsPinterest(String profileSnsPinterest) {
		this.profileSnsPinterest = profileSnsPinterest;
	}
	public void setProfilePhotoURL(String profilePhotoURL) {
		this.profilePhotoURL = profilePhotoURL;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
}