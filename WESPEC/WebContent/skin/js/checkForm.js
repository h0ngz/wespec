/**
 *  �̷µ�� ��üũ
 */

function Check_Certificate(form)
{
	if(!form.certificateDate_year.value)
	{
		alert('�ڰ��� ��� �⵵�� �Է��ϼ���.');
		form.certificateDate_year.focus();
		return true;
	}
	if(!form.certificateDate_month.value)
	{
		alert('�ڰ��� ��� ���� �Է��ϼ���.');
		form.certificateDate_month.focus();
		return true;
	}
	if(!form.certificateName.value)
	{
		alert('�ڰ������� �Է��ϼ���.');
		form.certificateName.focus();
		return true;
	}		
	if(!form.certificateOrg.value)
	{
		alert('�ڰ��� �������� �Է��ϼ���.');
		form.certificateOrg.focus();
		return true;
	}			
	form.submit();
}

function Check_LanguageExam(form)
{
	if(!form.languageName.value)
	{
		alert('�� �����ϼ���.');
		form.languageName.focus();
		return true;
	}
	if(!form.languageExamName.value)
	{
		alert('������� �����ϼ���.');
		form.languageExamName.focus();
		return true;
	}	
	if(!form.languageExamGrade.value)
	{
		alert('��������(���)�� �Է��ϼ���.');
		form.languageExamGrade.focus();
		return true;
	}	
	if(!form.languageExamOrg.value)
	{
		alert('��������� �Է��ϼ���.');
		form.languageExamOrg.focus();
		return true;
	}	
	form.submit();
}
function Check_Award(form)
{
	if(!form.awardDate_year.value)
	{
		alert('����⵵�� �Է��ϼ���');
		form.awardDate_year.focus();
		return true;
	}
	if(!form.awardDate_month.value)
	{
		alert('���� ���� �Է��ϼ���');
		form.awardDate_month.focus();
		return true;
	}	
	if(!form.awardSubject.value)
	{
		alert('���󳻿��� �Է��ϼ���');
		form.awardSubject.focus();
		return true;
	}
	if(!form.awardOrg.value)
	{
		alert('��������� �Է��ϼ���');
		form.awardOrg.focus();
		return true;
	}				
	form.submit();
}
function Check_Training(form)
{
	if(!form.trainingPeriod_year1.value) 
	{
		alert('����/���� �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.trainingPeriod_year1.focus();
		return true;
	}
	if(!form.trainingPeriod_month1.value) 
	{
		alert('����/���� �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.trainingPeriod_month1.focus();
		return true;
	}
	if(!form.trainingPeriod_year2.value) 
	{
		alert('����/���� �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.trainingPeriod_year2.focus();
		return true;
	}
	if(!form.trainingPeriod_month2.value) 
	{
		alert('����/���� �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.trainingPeriod_month2.focus();
		return true;
	}
	if(!form.trainingName.value)
	{
		alert('����/���� ���� ��Ȯ�� �Է��ϼ���.');
		form.trainingName.focus();
		return true;
	}	
	if(!form.trainingOrg.value)
	{
		alert('����/���� ����� ��Ȯ�� �Է��ϼ���.');
		form.trainingOrg.focus();
		return true;
	}	
	form.submit();
}
function Check_Portfolio(form)
{
	if(!form.portfolioPeriod_year1.value)
	{
		alert('������Ʈ �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.portfolioPeriod_year1.focus();
		return true;
	}
	if(!form.portfolioPeriod_month1.value)
	{
		alert('������Ʈ �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.portfolioPeriod_month1.focus();
		return true;
	}
	if(!form.portfolioPeriod_year2.value)
	{
		alert('������Ʈ �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.portfolioPeriod_year2.focus();
		return true;
	}
	if(!form.portfolioPeriod_month2.value)
	{
		alert('������Ʈ �Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.portfolioPeriod_month2.focus();
		return true;
	}
	if(!form.portfolioName.value)
	{
		alert('������Ʈ �̸��� �Է��ϼ���.');
		form.portfolioName.focus();
		return true;
	}	
	form.submit();
}
function Check_Academic(form)
{
	if(!form.academicPeriod_year1.value)
	{
		alert('���бⰣ�� ��Ȯ�� �Է��ϼ���.');
		form.academicPeriod_year1.focus();
		return true;
	}
	if(!form.academicPeriod_month1.value)
	{
		alert('���бⰣ�� ��Ȯ�� �Է��ϼ���.');
		form.academicPeriod_month1.focus();
		return true;
	}
	if(!form.academicPeriod_year2.value)
	{
		alert('���бⰣ�� ��Ȯ�� �Է��ϼ���.');
		form.academicPeriod_year2.focus();
		return true;
	}
	if(!form.academicPeriod_month2.value)
	{
		alert('���бⰣ�� ��Ȯ�� �Է��ϼ���.');
		form.academicPeriod_month2.focus();
		return true;
	}
	if(!form.academicName.value)
	{
		alert('�б����� �Է��ϼ���.');
		form.academicName.focus();
		return true;
	}	
	form.submit();
}

function Check_Military(form)
{
	if(!form.militaryPeriod_year1.value)
	{
		alert('�����Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.militaryPeriod_year1.focus();
		return true;
	}
	if(!form.militaryPeriod_month1.value)
	{
		alert('�����Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.militaryPeriod_month1.focus();
		return true;
	}
	if(!form.militaryPeriod_year2.value)
	{
		alert('�����Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.militaryPeriod_year2.focus();
		return true;
	}
	if(!form.militaryPeriod_month2.value)
	{
		alert('�����Ⱓ�� ��Ȯ�� �Է��ϼ���.');
		form.militaryPeriod_month2.focus();
		return true;
	}
	if(!form.militaryGroup.value)
	{
		alert('������ ��Ȯ�� �Է��ϼ���.');
		form.militaryGroup.focus();
		return true;
	}	
	if(!form.militaryRank.value)
	{
		alert('����� �Է��ϼ���.');
		form.militaryRank.focus();
		return true;
	}	
	if(!form.militmilitaryWorkaryRank.value)
	{
		alert('������ �Է��ϼ���.');
		form.militaryWork.focus();
		return true;
	}	
	form.submit();
}