<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- �ش� �������� ������ �����̷���.  --%> 
<c:if test="${profile.profileName eq null}">
	<jsp:forward page="/Exception">
		<jsp:param name="ex" value="NotFoundStudent" />
	</jsp:forward>	
</c:if>

<!DOCTYPE html>
<html lang="kr">
  <head>
    <meta charset="euc-kr">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>WESPEC in Software</title>
    <!-- Bootstrap -->
    <link href="<%=skinPath %>/css/bootstrap.min.css" rel="stylesheet">
    <style>
    	th { background:transprent; background-color:red;}
    
    </style>
</head>
<body>	
			<div style="text-align:center;"><h1 style="border-bottom:1px solid #000;">�̷¼�</h1></div>
		     
		     <table class="table table-bordered">
		        <tr>
		          <td rowspan="5"><img src="${profile.profilePhotoURL}" width="300" height="400"></td>
		          <th width="120">�̸�</th><td colspan="3">${profile.profileName}</td>
		        </tr>
		        <tr>
		          <th width="120">�ѹ�</th><td>${profile.profileChiName}</td>
		          <th width="120">����</th><td>${profile.profileEngName}</td>
		        </tr>
		        <tr>
		          <th width="120">�������</th><td>${profile.profileBirth}</td>
		          <th width="120">������</th><td>${profile.profileAddress}</td>
		        </tr>
		        <tr>
		          <th width="120">����ó</th><td>${profile.profilePhone}</td>
		          <th width="120">�̸���</th><td>${profile.profileEmail}</td>
		        </tr>  
		     </table>	   
		
		
		    <h4>�з»���</h4>
		     <table class="table table-bordered">
		        <tr>
		          <th width="160">���бⰣ</th>
		          <th width="200">�б���</th>
		          <th width="80">����</th>
		          <th width="80">��������</th>
		        </tr>
		        <c:forEach var="academic" items="${spec.academics}">
		          <tr>
		            <td>${academic.academicPeriod}</td>
		            <td>${academic.academicName}</td>
		            <td>${academic.academicMajor}</td>
		            <td>${academic.academicState}</td>
		          </tr>
		        </c:forEach>
		     </table>
		     
		    
		
		     <h4> �ڰ� �� ����</h4>
		     <table class="table table-bordered">
		        <tr>
		          <th>�����</th>
		          <th>�ڰ���(����)�� �� ���</th>
		          <th>������</th>
		        </tr>
		        <c:forEach var="certificate" items="${spec.certificates}">
		          <tr>
		            <td>${certificate.certificateDate}</td>
		            <td>${certificate.certificateName} ${certificate.certificateGrade}</td>
		            <td>${certificate.certificateOrg}</td>
		          </tr>
		        </c:forEach> 
		     </table>
		     
		
		
		
		     <h4>���дɷ�</h4>
		     <table class="table table-bordered">
		        <tr>
		          <th>���</th>
		          <th>�����</th>
		          <th>����(���)</th>
		          <th>�������</th>
		        </tr>
		        <c:forEach var="language" items="${spec.languages}">
		          <tr>
		            <td>${language.languageName}</td>
		            <td>${language.languageExamName}</td>
		            <td>${language.languageExamGrade}</td>
		            <td>${language.languageExamOrg}</td>
		          </tr> 
		        </c:forEach>  
		     </table>
		     
		
		
		
		     <h4>���� �� ����Ȱ��</h4>
		     <table class="table table-bordered">
		        <tr>
		          <th width="160">�Ⱓ</th>
		          <th width="300">������(��������)</th>
		          <th >���</th>
		        </tr>
		        <c:forEach var="training" items="${spec.trainings}">
		          <tr>
		            <td>${training.trainingPeriod}</td>
		            <td>${training.trainingName}</td>
		            <td>${training.trainingOrg}</td>
		          </tr>
		        </c:forEach>
		      </table>
		       
		
		
		
		      <h4>�������</h4>
		     <table class="table table-bordered">
		        <tr>
		          <th width="120">��������</th>
		          <th width="300">���󳻿�</th>
		          <th>������</th>
		        </tr>
		        <c:forEach var="award" items="${spec.awards}">
		          <tr>
		            <td>${award.awardDate}</td>
		            <td>${award.awardSubject}</td>
		            <td>${award.awardOrg}</td>
		          </tr>
		        </c:forEach>
		      </table>
		      		
		
		
		
		      <h4>������Ʈ ����</h4>
		     <table class="table table-bordered">
		        <tr>
		          <th width="160">�Ⱓ</th>
		          <th width="300">������Ʈ��</th>
		          <th>���ø�ũ</th>
		        </tr>
		        <c:forEach var="portfolio" items="${spec.portfolios}">
		          <tr>
		            <td>${portfolio.portfolioPeriod}</td>
		            <td>${portfolio.portfolioName}</td>
		            <td>${portfolio.portfolioLink}</td>
		          </tr>
		        </c:forEach>
		      </table>
		       	


<script>
 window.print();
 </script>
	
  </body>
</html>

