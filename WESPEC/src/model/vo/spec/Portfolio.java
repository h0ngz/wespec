package model.vo.spec;

import java.util.Date;

import model.vo.Spec;

public class Portfolio  {
	
	//portfolio ����			
	private String portfolioName;				// ��Ʈ��������
	private String portfolioPeriod;				// ������Ʈ�Ⱓ
	private String portfolioLink;				// ��Ʈ������ ��ũ
	private String portfolioThumbnail;			// ����� �̹��� URL
	private int regNo;							// ��Ϲ�ȣ	
	private int publicScope;					// ��������
	private Date regDate;						// �����
	
	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	public String getPortfolioPeriod() {
		return portfolioPeriod;
	}
	public void setPortfolioPeriod(String portfolioPeriod) {
		this.portfolioPeriod = portfolioPeriod;
	}
	public String getPortfolioLink() {
		return portfolioLink;
	}
	public void setPortfolioLink(String portfolioLink) {
		this.portfolioLink = portfolioLink;
	}
	public String getPortfolioThumbnail() {
		return portfolioThumbnail;
	}
	public void setPortfolioThumbnail(String portfolioThumbnail) {
		this.portfolioThumbnail = portfolioThumbnail;
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
