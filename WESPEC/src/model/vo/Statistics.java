package model.vo;

/* Statistics Value Object */
public class Statistics {
	
	// ��ü PART
	private int totalStudentCount;					// ��ü�л��� (4�г�����)
	private int totalSpecRegCount;					// �̷��� ����� �л��� �� ��
	
	// ������ PART
	
	// ���� PART
	private double avgToeicScore;					// �л��� ��� ���� ����
	private int topmostToeicScore;					// ���� �ְ� ����
	private int totalRegStudentCount_toeic;			// �����׸� ����л� ��
	private String[] toeicKing;						// ���Ϳ� 3��
	private int[] toeicKingScore;					// ���Ϳ� 3���� ����
	private int[] totalRegStudentCountGraph_toeic;	// ������ ����� �л��� �����뺰 ��ǥ
	
	// �ڰ��� PART
	private double avgCertificateCount;				// �л��� ��� �ڰ��� ����
	private int totalRegStudentCount_certificate;	// �ڰ����׸� ����л���
	private String[] certificateKing;				// �ڰ��� �� 3��
	private int[]  certificateKingCount;			// �ڰ��� �� 3���� �ڰ��� ��ϰ���
	private int[] totalRegStudentCountGraph_certi;	// �ڰ����� ����� �л��� 1��~10������ ��ǥ
	
	// ��Ʈ������ PART
	private double avgPortfolioCount;					// �л��� ��� ��Ʈ������ ����
	private int totalRegStudentCount_portfolio;			// ��Ʈ�������� ����� �л��� ��
	private String[] portfolioKing;						// ��Ʈ������ �� 3��
	private int[] portfolioKingCount;					// ��Ʈ������  �� 3���� ��Ʈ������ ����
	private int[] totalRegStudentCountGraph_portfolio; 	// ��Ʈ�������� ����� �л��� 1��~10������ ��ǥ

	// ������� PART
	private double avgAwardCount;					// �л��� ��� ������� ����
	private int totalRegStudentCount_award;			// ��������� ����� �л��� ��
	private int[] totalRegStudentCountGraph_award;	// ��������� ����� �л��� 1��~10������ ��ǥ

	// ����Ʈ����ߴɷ� PART
	private double avgSwAbilityCount;				// �л��� ��� ����Ʈ����ɷ� ����
	private int[] totalRegStudentCountGraph_swAbility;	// ����Ʈ����ߴɷ� ��ϰ��� ��ǥ. 
	private int totalStudentCount_c;				// c��� �����л� ��
	private int totalStudentCount_cpp;				// c++ �����л� ��
	private int totalStudentCount_cSharp;			// c# �����л� ��
	private int totalStudentCount_python;			// ���̽� �����л� ��
	private int totalStudentCount_java;				// �ڹ� �����л� ��
	private int totalStudentCount_jsp;				// jsp �����л� �� 
	private int totalStudentCount_visualBasic;		// vB �����л� ��
	private int totalStudentCount_lisp;				// LISP �����л� ��
	private int totalStudentCount_php;				// PHP�����л� ��
	private int totalStudentCount_asp;				// ASP �����л� ��
	private int totalStudentCount_ruby;				// ��� �����л� ��
	private int totalStudentCount_html;				// html �����л� ��
	private int totalStudentCount_js;				// �ڹٽ�ũ��Ʈ �����л� ��
	private int totalStudentCount_nodeJs;			// nodejs �����л� ��
	private int totalStudentCount_android;			// �ȵ���̵� �����л� ��
	private int totalStudentCount_oracle;			// ����Ŭ �����л� ��
	private int totalStudentCount_swift;			// swift �����л� ��
	private int totalStudentCount_objectiveC;		// ������ƮC �����л� ��
	private int totalStudentCount_delphi; 			// ������ �����л� ��
	
	
	// ���� PART
	private int totalStudentCount_military;			// ��ü ���� ��
	
	// ������
	public Statistics()
	{
		// ����
		toeicKing = new String[3];							//3��
		toeicKingScore = new int[3];						//3��
		totalRegStudentCountGraph_toeic = new int[9];		// 100~900���� 
		
		//�ڰ���
		certificateKing = new String[3];					//3��
		certificateKingCount = new int[3];					//3��
		totalRegStudentCountGraph_certi = new int[11];		// 1��~10�� , 10���̻�
		
		//��Ʈ������
		portfolioKing = new String[3];						//3��
		portfolioKingCount = new int[3];					//3��
		totalRegStudentCountGraph_portfolio = new int[11]; 	// 1��~10�� , 10���̻�
		
		// �������
		totalRegStudentCountGraph_award = new int[11];		// 1��~10�� , 10���̻�
		totalRegStudentCountGraph_swAbility = new int [11];	// 1��~10�� , 10���̻�	
	}

	public int getTotalStudentCount() {
		return totalStudentCount;
	}

	public int getTotalSpecRegCount() {
		return totalSpecRegCount;
	}

	public double getAvgToeicScore() {
		return avgToeicScore;
	}

	public int getTopmostToeicScore() {
		return topmostToeicScore;
	}

	public int getTotalRegStudentCount_toeic() {
		return totalRegStudentCount_toeic;
	}

	public String[] getToeicKing() {
		return toeicKing;
	}

	public int[] getToeicKingScore() {
		return toeicKingScore;
	}

	public int[] getTotalRegStudentCountGraph_toeic() {
		return totalRegStudentCountGraph_toeic;
	}

	public double getAvgCertificateCount() {
		return avgCertificateCount;
	}

	public int getTotalRegStudentCount_certificate() {
		return totalRegStudentCount_certificate;
	}

	public String[] getCertificateKing() {
		return certificateKing;
	}

	public int[] getCertificateKingCount() {
		return certificateKingCount;
	}

	public int[] getTotalRegStudentCountGraph_certi() {
		return totalRegStudentCountGraph_certi;
	}

	public double getAvgPortfolioCount() {
		return avgPortfolioCount;
	}

	public int getTotalRegStudentCount_portfolio() {
		return totalRegStudentCount_portfolio;
	}

	public String[] getPortfolioKing() {
		return portfolioKing;
	}

	public int[] getPortfolioKingCount() {
		return portfolioKingCount;
	}

	public int[] getTotalRegStudentCountGraph_portfolio() {
		return totalRegStudentCountGraph_portfolio;
	}

	public double getAvgAwardCount() {
		return avgAwardCount;
	}

	public int getTotalRegStudentCount_award() {
		return totalRegStudentCount_award;
	}

	public int[] getTotalRegStudentCountGraph_award() {
		return totalRegStudentCountGraph_award;
	}

	public double getAvgSwAbilityCount() {
		return avgSwAbilityCount;
	}

	public int[] getTotalRegStudentCountGraph_swAbility() {
		return totalRegStudentCountGraph_swAbility;
	}

	public int getTotalStudentCount_c() {
		return totalStudentCount_c;
	}

	public int getTotalStudentCount_cpp() {
		return totalStudentCount_cpp;
	}

	public int getTotalStudentCount_cSharp() {
		return totalStudentCount_cSharp;
	}

	public int getTotalStudentCount_python() {
		return totalStudentCount_python;
	}

	public int getTotalStudentCount_java() {
		return totalStudentCount_java;
	}

	public int getTotalStudentCount_jsp() {
		return totalStudentCount_jsp;
	}

	public int getTotalStudentCount_visualBasic() {
		return totalStudentCount_visualBasic;
	}

	public int getTotalStudentCount_lisp() {
		return totalStudentCount_lisp;
	}

	public int getTotalStudentCount_php() {
		return totalStudentCount_php;
	}

	public int getTotalStudentCount_asp() {
		return totalStudentCount_asp;
	}

	public int getTotalStudentCount_ruby() {
		return totalStudentCount_ruby;
	}

	public int getTotalStudentCount_html() {
		return totalStudentCount_html;
	}

	public int getTotalStudentCount_js() {
		return totalStudentCount_js;
	}

	public int getTotalStudentCount_nodeJs() {
		return totalStudentCount_nodeJs;
	}

	public int getTotalStudentCount_android() {
		return totalStudentCount_android;
	}

	public int getTotalStudentCount_oracle() {
		return totalStudentCount_oracle;
	}

	public int getTotalStudentCount_swift() {
		return totalStudentCount_swift;
	}

	public int getTotalStudentCount_objectiveC() {
		return totalStudentCount_objectiveC;
	}

	public int getTotalStudentCount_delphi() {
		return totalStudentCount_delphi;
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

	public void setAvgToeicScore(double avgToeicScore) {
		this.avgToeicScore = avgToeicScore;
	}

	public void setTopmostToeicScore(int topmostToeicScore) {
		this.topmostToeicScore = topmostToeicScore;
	}

	public void setTotalRegStudentCount_toeic(int totalRegStudentCount_toeic) {
		this.totalRegStudentCount_toeic = totalRegStudentCount_toeic;
	}

	public void setToeicKing(String[] toeicKing) {
		this.toeicKing = toeicKing;
	}

	public void setToeicKingScore(int[] toeicKingScore) {
		this.toeicKingScore = toeicKingScore;
	}

	public void setTotalRegStudentCountGraph_toeic(
			int[] totalRegStudentCountGraph_toeic) {
		this.totalRegStudentCountGraph_toeic = totalRegStudentCountGraph_toeic;
	}

	public void setAvgCertificateCount(double avgCertificateCount) {
		this.avgCertificateCount = avgCertificateCount;
	}

	public void setTotalRegStudentCount_certificate(
			int totalRegStudentCount_certificate) {
		this.totalRegStudentCount_certificate = totalRegStudentCount_certificate;
	}

	public void setCertificateKing(String[] certificateKing) {
		this.certificateKing = certificateKing;
	}

	public void setCertificateKingCount(int[] certificateKingCount) {
		this.certificateKingCount = certificateKingCount;
	}

	public void setTotalRegStudentCountGraph_certi(
			int[] totalRegStudentCountGraph_certi) {
		this.totalRegStudentCountGraph_certi = totalRegStudentCountGraph_certi;
	}

	public void setAvgPortfolioCount(double avgPortfolioCount) {
		this.avgPortfolioCount = avgPortfolioCount;
	}

	public void setTotalRegStudentCount_portfolio(int totalRegStudentCount_portfolio) {
		this.totalRegStudentCount_portfolio = totalRegStudentCount_portfolio;
	}

	public void setPortfolioKing(String[] portfolioKing) {
		this.portfolioKing = portfolioKing;
	}

	public void setPortfolioKingCount(int[] portfolioKingCount) {
		this.portfolioKingCount = portfolioKingCount;
	}

	public void setTotalRegStudentCountGraph_portfolio(
			int[] totalRegStudentCountGraph_portfolio) {
		this.totalRegStudentCountGraph_portfolio = totalRegStudentCountGraph_portfolio;
	}

	public void setAvgAwardCount(double avgAwardCount) {
		this.avgAwardCount = avgAwardCount;
	}

	public void setTotalRegStudentCount_award(int totalRegStudentCount_award) {
		this.totalRegStudentCount_award = totalRegStudentCount_award;
	}

	public void setTotalRegStudentCountGraph_award(
			int[] totalRegStudentCountGraph_award) {
		this.totalRegStudentCountGraph_award = totalRegStudentCountGraph_award;
	}

	public void setAvgSwAbilityCount(double avgSwAbilityCount) {
		this.avgSwAbilityCount = avgSwAbilityCount;
	}

	public void setTotalRegStudentCountGraph_swAbility(
			int[] totalRegStudentCountGraph_swAbility) {
		this.totalRegStudentCountGraph_swAbility = totalRegStudentCountGraph_swAbility;
	}

	public void setTotalStudentCount_c(int totalStudentCount_c) {
		this.totalStudentCount_c = totalStudentCount_c;
	}

	public void setTotalStudentCount_cpp(int totalStudentCount_cpp) {
		this.totalStudentCount_cpp = totalStudentCount_cpp;
	}

	public void setTotalStudentCount_cSharp(int totalStudentCount_cSharp) {
		this.totalStudentCount_cSharp = totalStudentCount_cSharp;
	}

	public void setTotalStudentCount_python(int totalStudentCount_python) {
		this.totalStudentCount_python = totalStudentCount_python;
	}

	public void setTotalStudentCount_java(int totalStudentCount_java) {
		this.totalStudentCount_java = totalStudentCount_java;
	}

	public void setTotalStudentCount_jsp(int totalStudentCount_jsp) {
		this.totalStudentCount_jsp = totalStudentCount_jsp;
	}

	public void setTotalStudentCount_visualBasic(int totalStudentCount_visualBasic) {
		this.totalStudentCount_visualBasic = totalStudentCount_visualBasic;
	}

	public void setTotalStudentCount_lisp(int totalStudentCount_lisp) {
		this.totalStudentCount_lisp = totalStudentCount_lisp;
	}

	public void setTotalStudentCount_php(int totalStudentCount_php) {
		this.totalStudentCount_php = totalStudentCount_php;
	}

	public void setTotalStudentCount_asp(int totalStudentCount_asp) {
		this.totalStudentCount_asp = totalStudentCount_asp;
	}

	public void setTotalStudentCount_ruby(int totalStudentCount_ruby) {
		this.totalStudentCount_ruby = totalStudentCount_ruby;
	}

	public void setTotalStudentCount_html(int totalStudentCount_html) {
		this.totalStudentCount_html = totalStudentCount_html;
	}

	public void setTotalStudentCount_js(int totalStudentCount_js) {
		this.totalStudentCount_js = totalStudentCount_js;
	}

	public void setTotalStudentCount_nodeJs(int totalStudentCount_nodeJs) {
		this.totalStudentCount_nodeJs = totalStudentCount_nodeJs;
	}

	public void setTotalStudentCount_android(int totalStudentCount_android) {
		this.totalStudentCount_android = totalStudentCount_android;
	}

	public void setTotalStudentCount_oracle(int totalStudentCount_oracle) {
		this.totalStudentCount_oracle = totalStudentCount_oracle;
	}

	public void setTotalStudentCount_swift(int totalStudentCount_swift) {
		this.totalStudentCount_swift = totalStudentCount_swift;
	}

	public void setTotalStudentCount_objectiveC(int totalStudentCount_objectiveC) {
		this.totalStudentCount_objectiveC = totalStudentCount_objectiveC;
	}

	public void setTotalStudentCount_delphi(int totalStudentCount_delphi) {
		this.totalStudentCount_delphi = totalStudentCount_delphi;
	}

	public void setTotalStudentCount_military(int totalStudentCount_military) {
		this.totalStudentCount_military = totalStudentCount_military;
	}	
}
