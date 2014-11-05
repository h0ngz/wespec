package model.vo;


import model.vo.spec.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Spec {
	
	//spec ����
	private int spec_change_point;							//������� : 1-�߰�, 2-����
	public Date spec_last_change_date;						//������ ������
	public Certificate certificate;
	public Award award;
	public Academic academic;
	public Portfolio portfolio;
	public Training training;
	public ProgrammingLanguage programmingLanguage;
	public Language language;
	public Military military;								//��������
	
	public List <Certificate> certificates;					//�ڰ��� ����Ʈ
	public List <Language> languages;						//���дɷ� ����Ʈ
	public List <Award> awards;								//������� ����Ʈ
	public List <Academic> academics;						//�з»��� ����Ʈ
	public List <Portfolio> portfolios;						//��Ʈ������ ����Ʈ
	public List <Training> trainings;						//�������� ����Ʈ
	public List <ProgrammingLanguage> programmingLanguages;	//��ȣ���α׷��־�� ����Ʈ
	public List <Military> militarys;


	
	public Spec() {
		this.certificate = new Certificate();
		this.award = new Award();
		this.language = new Language();
		this.academic = new Academic();
		this.portfolio = new Portfolio();
		this.training = new Training();
		this.programmingLanguage = new ProgrammingLanguage();		
		this.military = new Military();
		
		this.certificates = new ArrayList <Certificate>();
		this.languages = new ArrayList <Language>();
		this.awards = new ArrayList <Award>();
		this.academics = new ArrayList <Academic>();
		this.portfolios = new ArrayList <Portfolio>();
		this.trainings = new ArrayList <Training>();		
		this.programmingLanguages = new ArrayList <ProgrammingLanguage>();	
		this.militarys = new ArrayList<Military>();
	}



	public int getSpec_change_point() {
		return spec_change_point;
	}



	public void setSpec_change_point(int spec_change_point) {
		this.spec_change_point = spec_change_point;
	}



	public Date getSpec_last_change_date() {
		return spec_last_change_date;
	}



	public void setSpec_last_change_date(Date spec_last_change_date) {
		this.spec_last_change_date = spec_last_change_date;
	}



	public Certificate getCertificate() {
		return certificate;
	}



	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}



	public Award getAward() {
		return award;
	}



	public void setAward(Award award) {
		this.award = award;
	}



	public Academic getAcademic() {
		return academic;
	}



	public void setAcademic(Academic academic) {
		this.academic = academic;
	}



	public Portfolio getPortfolio() {
		return portfolio;
	}



	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}



	public Training getTraining() {
		return training;
	}



	public void setTraining(Training training) {
		this.training = training;
	}



	public ProgrammingLanguage getProgrammingLanguage() {
		return programmingLanguage;
	}



	public void setProgrammingLanguage(ProgrammingLanguage programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}



	public Language getLanguage() {
		return language;
	}



	public void setLanguage(Language language) {
		this.language = language;
	}



	public Military getMilitary() {
		return military;
	}



	public void setMilitary(Military military) {
		this.military = military;
	}



	public List<Certificate> getCertificates() {
		return certificates;
	}



	public void setCertificates(List<Certificate> certificates) {
		this.certificates = certificates;
	}



	public List<Language> getLanguages() {
		return languages;
	}



	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}



	public List<Award> getAwards() {
		return awards;
	}



	public void setAwards(List<Award> awards) {
		this.awards = awards;
	}



	public List<Academic> getAcademics() {
		return academics;
	}



	public void setAcademics(List<Academic> academics) {
		this.academics = academics;
	}



	public List<Portfolio> getPortfolios() {
		return portfolios;
	}



	public void setPortfolios(List<Portfolio> portfolios) {
		this.portfolios = portfolios;
	}



	public List<Training> getTrainings() {
		return trainings;
	}



	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}



	public List<ProgrammingLanguage> getProgrammingLanguages() {
		return programmingLanguages;
	}



	public void setProgrammingLanguages(
			List<ProgrammingLanguage> programmingLanguages) {
		this.programmingLanguages = programmingLanguages;
	}



	public List<Military> getMilitarys() {
		return militarys;
	}



	public void setMilitarys(List<Military> militarys) {
		this.militarys = militarys;
	}	
	
	
}
