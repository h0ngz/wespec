package model.vo.spec;

import java.util.Date;



public class Portfolio  {
	
	//portfolio ����			
	private String portfolioName;				// ��Ʈ��������
	private String portfolioPeriod;				// ������Ʈ�Ⱓ
	private String portfolioLink;				// ��Ʈ������ ��ũ
	private String portfolioThumbnail;			// ����� �̹��� URL
	private int regNo;							// ��Ϲ�ȣ	
	private String publicScope;					// ��������
	private Date regDate;						// �����
	
	public String getPortfolioName() {
		return portfolioName;
	}
	public String getPortfolioPeriod() {
		return portfolioPeriod;
	}
	public String getPortfolioLink() {
		return portfolioLink;
	}
	public String getPortfolioThumbnail() {
		return portfolioThumbnail;
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
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}
	public void setPortfolioPeriod(String portfolioPeriod) {
		this.portfolioPeriod = portfolioPeriod;
	}
	public void setPortfolioLink(String portfolioLink) {
		this.portfolioLink = portfolioLink;
	}
	public void setPortfolioThumbnail(String portfolioThumbnail) {
		this.portfolioThumbnail = portfolioThumbnail;
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
