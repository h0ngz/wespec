<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

<SCRIPT language="JavaScript">


//�� �з��� ���� �迭
Cats=new Array(4);
Cats[0]="------";	//�⺻��
Cats[1]=new Array(5);	//����
Cats[2]=new Array(2);	//�Ͼ�
Cats[3]=new Array(3);	//�߱���


//����
Cats[1][0]="����";
Cats[1][1]="����";
Cats[1][2]="�ܽ�";
Cats[1][3]="����";	//��
Cats[1][4]="���̿���";

//�Ͼ�
Cats[2][0]="JPT";	// ��
Cats[2][1]="JLPT";	// ��

//�߱���
Cats[3][0]="HSK";	// ��
Cats[3][1]="BCT";	// ��
Cats[3][2]="CPT";	// ��


//Ư�� ä���� �����ϸ� �ش� ī�װ��� ����
function BuildCats(num)
{

	//�ش� ä���� ���� ī�װ� �迭 ���̸�ŭ �ݺ�
	for(i=0;i<Cats[num].length;i++)
	{
		//ī�װ��� �ش��ϴ� �޺��ڽ��� ���� ä��
		this.form.languageExamName.options[i]=new Option(Cats[num][i],Cats[num][i]);
		
	}
	//select ����Ʈ ���� ����
	this.form.languageExamName.length=Cats[num].length;
}
<div class="form-group"><div class="input-group"><span><SELECT class="form-control" Name="languageExamGradeOption"><OPTION Value="��">��<OPTION Value="��">��</Select></span></div>
<div class="row">
	<div class="col-lg-6">
  		<div class="input-group">
  			<input type="text" class="form-control" name="languageExamGrade" />
    		<div class="input-group-btn">
	      		<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-expanded="false">Action <span class="caret"></span></button>
	      		<ul class="dropdown-menu dropdown-menu-right" role="menu">
	        		<li><a href="#">Action</a></li>
	       			<li><a href="#">Another action</a></li>
			        <li><a href="#">Something else here</a></li>
			        <li class="divider"></li>
			        <li><a href="#">Separated link</a></li>
	      		</ul>
    		</div>
  		</div>
	</div>
</div>