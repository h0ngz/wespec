package model.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* Statistics Value Object */
public class Statistics {
	
	// ��ü PART
	private int totalStudentCount;						// ��ü�л��� (4�г�����)
	private int totalSpecRegCount;						// �̷��� ����� �л��� �� ��
	private double totalRegRatio;						// �̷µ�Ϸ�
	
	// ������ PART
	
	// ���� PART
	private int avgToeicScore;						 	// �л��� ��� ���� ����
	private int topmostToeicScore;						// ���� �ְ� ����
	private int totalRegStudentCount_toeic;				// �����׸� ����л� ��
	public List<String> toeicKingName;					// ���Ϳ� 3��
	public List<Integer> toeicKingScore;				// ���Ϳ� 3���� ����
	public List<String> toeicKingId;					// ���Ϳ� 3���� ����
	public List<String> toeicKingPhoto;					// ���Ϳ� 3���� ����
	public List<Integer> distributionMap_toeic;			// ������ ����� �л��� �����뺰 ��ǥ
	
	// �ڰ��� PART
	private double avgCertificateCount;					// �л��� ��� �ڰ��� ����
	private int totalRegStudentCount_certificate;		// �ڰ����׸� ����л���
	public List<String> certificateKingName;			// �ڰ��� �� 3���� �̸�
	public List<Integer>  certificateKingCount;			// �ڰ��� �� 3���� �ڰ��� ��ϰ���
	public List<String> certificateKingId;				// �ڰ��� �� 3���� ���̵�
	public List<String> certificateKingPhoto;			// �ڰ��� �� 3���� ����
	public List<Integer> distributionMap_certi;			// �ڰ����� ����� �л��� 1��~10������ ��ǥ
	
	// ��Ʈ������ PART
	private double avgPortfolioCount;					// �л��� ��� ��Ʈ������ ����
	private int totalRegStudentCount_portfolio;			// ��Ʈ�������� ����� �л��� ��
	public List<String> portfolioKingName;				// ��Ʈ������ �� 3���� �̸�
	public List<String> portfolioKingId;				// ��Ʈ������ �� 3���� ���̵�
	public List<String> portfolioKingPhoto;				// ��Ʈ������ �� 3���� ����
	public List<Integer> portfolioKingCount;			// ��Ʈ������  �� 3���� ��Ʈ������ ����
	public List<Integer> distributionMap_portfolio; 	// ��Ʈ�������� ����� �л��� 1��~10������ ��ǥ

	// ������� PART
	private double avgAwardCount;						// �л��� ��� ������� ����
	private int totalRegStudentCount_award;				// ��������� ����� �л��� ��
	public List<String> awardKingName;					// ������� �� 3���� �̸�
	public List<String> awardKingId;					// ������� �� 3���� ���̵�
	public List<String> awardKingPhoto;					// ������� �� 3���� ����
	public List<Integer> awardKingCount;				// �������  �� 3���� ������� ����
	public List<Integer> distributionMap_award;			// ��������� ����� �л��� 1��~10������ ��ǥ

	// ����Ʈ����ߴɷ� PART
	private double avgSwAbilityCount;									// �л��� ��� ����Ʈ����ɷ� ����
	public List<Integer> distributionMap_swAbility;						// ����Ʈ����ߴɷ� ��ϰ��� ��ǥ. 
	public HashMap<String, Integer> totalRegStudentCountMap_SWAbility; 	// ����, �����л���
	public HashMap<String, Integer> swAbilityRank; 						// ��ȣ ����, �����л���
	
	
	// ���� PART
	private int totalStudentCount_military;			// ��ü ���� ��
	
	// ������
	public Statistics()
	{
		// ����
		toeicKingId = new ArrayList<String>();
		toeicKingName = new ArrayList<String>();
		toeicKingPhoto = new ArrayList<String>(); 					//3��
		toeicKingScore = new ArrayList<Integer>();					//3��
		distributionMap_toeic= new ArrayList<Integer>();			// 100~900���� 
		
		//�ڰ���
		certificateKingName = new ArrayList<String>();	
		certificateKingPhoto = new ArrayList<String>();	
		certificateKingId = new ArrayList<String>();	
		certificateKingCount = new ArrayList<Integer>();			
		distributionMap_certi = new ArrayList<Integer>();			
		
		//��Ʈ������
		portfolioKingName = new ArrayList<String>();	
		portfolioKingId = new ArrayList<String>();
		portfolioKingPhoto = new ArrayList<String>();
		portfolioKingCount = new ArrayList<Integer>();						
		distributionMap_portfolio = new ArrayList<Integer>();	 	
		
		// �������
		awardKingName = new ArrayList<String>();
		awardKingId = new ArrayList<String>();
		awardKingPhoto = new ArrayList<String>();
		awardKingCount = new ArrayList<Integer>();		
		distributionMap_award = new ArrayList<Integer>();			
		// ����Ʈ���� ���ߴɷ�
		distributionMap_swAbility = new ArrayList<Integer>();		
		totalRegStudentCountMap_SWAbility = new HashMap<String, Integer>();
		swAbilityRank = new HashMap<String, Integer>();
	}

	public int getTotalStudentCount() {
		return totalStudentCount;
	}

	public int getTotalSpecRegCount() {
		return totalSpecRegCount;
	}

	public double getTotalRegRatio() {
		return totalRegRatio;
	}

	public int getAvgToeicScore() {
		return avgToeicScore;
	}

	public int getTopmostToeicScore() {
		return topmostToeicScore;
	}

	public int getTotalRegStudentCount_toeic() {
		return totalRegStudentCount_toeic;
	}

	public List<String> getToeicKingName() {
		return toeicKingName;
	}

	public List<Integer> getToeicKingScore() {
		return toeicKingScore;
	}

	public List<String> getToeicKingId() {
		return toeicKingId;
	}

	public List<String> getToeicKingPhoto() {
		return toeicKingPhoto;
	}

	public List<Integer> getDistributionMap_toeic() {
		return distributionMap_toeic;
	}

	public double getAvgCertificateCount() {
		return avgCertificateCount;
	}

	public int getTotalRegStudentCount_certificate() {
		return totalRegStudentCount_certificate;
	}

	public List<String> getCertificateKingName() {
		return certificateKingName;
	}

	public List<Integer> getCertificateKingCount() {
		return certificateKingCount;
	}

	public List<String> getCertificateKingId() {
		return certificateKingId;
	}

	public List<String> getCertificateKingPhoto() {
		return certificateKingPhoto;
	}

	public List<Integer> getDistributionMap_certi() {
		return distributionMap_certi;
	}

	public double getAvgPortfolioCount() {
		return avgPortfolioCount;
	}

	public int getTotalRegStudentCount_portfolio() {
		return totalRegStudentCount_portfolio;
	}

	public List<String> getPortfolioKingName() {
		return portfolioKingName;
	}

	public List<String> getPortfolioKingId() {
		return portfolioKingId;
	}

	public List<String> getPortfolioKingPhoto() {
		return portfolioKingPhoto;
	}

	public List<Integer> getPortfolioKingCount() {
		return portfolioKingCount;
	}

	public List<Integer> getDistributionMap_portfolio() {
		return distributionMap_portfolio;
	}

	public double getAvgAwardCount() {
		return avgAwardCount;
	}

	public int getTotalRegStudentCount_award() {
		return totalRegStudentCount_award;
	}

	public List<String> getAwardKingName() {
		return awardKingName;
	}

	public List<String> getAwardKingId() {
		return awardKingId;
	}

	public List<String> getAwardKingPhoto() {
		return awardKingPhoto;
	}

	public List<Integer> getAwardKingCount() {
		return awardKingCount;
	}

	public List<Integer> getDistributionMap_award() {
		return distributionMap_award;
	}

	public double getAvgSwAbilityCount() {
		return avgSwAbilityCount;
	}

	public List<Integer> getDistributionMap_swAbility() {
		return distributionMap_swAbility;
	}

	public HashMap<String, Integer> getTotalRegStudentCountMap_SWAbility() {
		return totalRegStudentCountMap_SWAbility;
	}

	public HashMap<String, Integer> getSwAbilityRank() {
		return swAbilityRank;
	}

	public int getTotalStudentCount_military() {
		return totalStudentCount_military;
	}

	public void setTotalStudentCount(int totalStudentCount) {
		this.totalStudentCount = totalStudentCount;
	}

	public void setTotalSpecRegCount(int totalSpecRegCount) {
		this.totalSpecRegCount = totalSpecRegCount;
	}

	public void setTotalRegRatio(double totalRegRatio) {
		this.totalRegRatio = totalRegRatio;
	}

	public void setAvgToeicScore(int avgToeicScore) {
		this.avgToeicScore = avgToeicScore;
	}

	public void setTopmostToeicScore(int topmostToeicScore) {
		this.topmostToeicScore = topmostToeicScore;
	}

	public void setTotalRegStudentCount_toeic(int totalRegStudentCount_toeic) {
		this.totalRegStudentCount_toeic = totalRegStudentCount_toeic;
	}

	public void setToeicKingName(List<String> toeicKingName) {
		this.toeicKingName = toeicKingName;
	}

	public void setToeicKingScore(List<Integer> toeicKingScore) {
		this.toeicKingScore = toeicKingScore;
	}

	public void setToeicKingId(List<String> toeicKingId) {
		this.toeicKingId = toeicKingId;
	}

	public void setToeicKingPhoto(List<String> toeicKingPhoto) {
		this.toeicKingPhoto = toeicKingPhoto;
	}

	public void setDistributionMap_toeic(List<Integer> distributionMap_toeic) {
		this.distributionMap_toeic = distributionMap_toeic;
	}

	public void setAvgCertificateCount(double avgCertificateCount) {
		this.avgCertificateCount = avgCertificateCount;
	}

	public void setTotalRegStudentCount_certificate(
			int totalRegStudentCount_certificate) {
		this.totalRegStudentCount_certificate = totalRegStudentCount_certificate;
	}

	public void setCertificateKingName(List<String> certificateKingName) {
		this.certificateKingName = certificateKingName;
	}

	public void setCertificateKingCount(List<Integer> certificateKingCount) {
		this.certificateKingCount = certificateKingCount;
	}

	public void setCertificateKingId(List<String> certificateKingId) {
		this.certificateKingId = certificateKingId;
	}

	public void setCertificateKingPhoto(List<String> certificateKingPhoto) {
		this.certificateKingPhoto = certificateKingPhoto;
	}

	public void setDistributionMap_certi(List<Integer> distributionMap_certi) {
		this.distributionMap_certi = distributionMap_certi;
	}

	public void setAvgPortfolioCount(double avgPortfolioCount) {
		this.avgPortfolioCount = avgPortfolioCount;
	}

	public void setTotalRegStudentCount_portfolio(int totalRegStudentCount_portfolio) {
		this.totalRegStudentCount_portfolio = totalRegStudentCount_portfolio;
	}

	public void setPortfolioKingName(List<String> portfolioKingName) {
		this.portfolioKingName = portfolioKingName;
	}

	public void setPortfolioKingId(List<String> portfolioKingId) {
		this.portfolioKingId = portfolioKingId;
	}

	public void setPortfolioKingPhoto(List<String> portfolioKingPhoto) {
		this.portfolioKingPhoto = portfolioKingPhoto;
	}

	public void setPortfolioKingCount(List<Integer> portfolioKingCount) {
		this.portfolioKingCount = portfolioKingCount;
	}

	public void setDistributionMap_portfolio(List<Integer> distributionMap_portfolio) {
		this.distributionMap_portfolio = distributionMap_portfolio;
	}

	public void setAvgAwardCount(double avgAwardCount) {
		this.avgAwardCount = avgAwardCount;
	}

	public void setTotalRegStudentCount_award(int totalRegStudentCount_award) {
		this.totalRegStudentCount_award = totalRegStudentCount_award;
	}

	public void setAwardKingName(List<String> awardKingName) {
		this.awardKingName = awardKingName;
	}

	public void setAwardKingId(List<String> awardKingId) {
		this.awardKingId = awardKingId;
	}

	public void setAwardKingPhoto(List<String> awardKingPhoto) {
		this.awardKingPhoto = awardKingPhoto;
	}

	public void setAwardKingCount(List<Integer> awardKingCount) {
		this.awardKingCount = awardKingCount;
	}

	public void setDistributionMap_award(List<Integer> distributionMap_award) {
		this.distributionMap_award = distributionMap_award;
	}

	public void setAvgSwAbilityCount(double avgSwAbilityCount) {
		this.avgSwAbilityCount = avgSwAbilityCount;
	}

	public void setDistributionMap_swAbility(List<Integer> distributionMap_swAbility) {
		this.distributionMap_swAbility = distributionMap_swAbility;
	}

	public void setTotalRegStudentCountMap_SWAbility(
			HashMap<String, Integer> totalRegStudentCountMap_SWAbility) {
		this.totalRegStudentCountMap_SWAbility = totalRegStudentCountMap_SWAbility;
	}

	public void setSwAbilityRank(HashMap<String, Integer> swAbilityRank) {
		this.swAbilityRank = swAbilityRank;
	}

	public void setTotalStudentCount_military(int totalStudentCount_military) {
		this.totalStudentCount_military = totalStudentCount_military;
	}

	
}
