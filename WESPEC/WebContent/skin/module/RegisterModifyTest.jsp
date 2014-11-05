<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import="model.vo.Spec" %>

<%
	
%>
<jsp:include page="/head.jsp" flush="false"/>


<div class="row">
  <div class="col-md-12">
    <div class="row">
      <!--  ������ ���� ���� -->
      <form action="<%=rootPath %>/test" method="post" name="profile">
      <div class="col-md-3">
      
	      <!--  �̹��� ����Ʈ  -->
	      <div id="effect-6" class="effects clearfix">
	            <div class="img">
	                <img src="<%= imagesPath%>/tumb.jpg" alt="">
	                <div class="overlay">
	                    <a href="#" class="expand">+</a>
	                    <a class="close-overlay hidden">x</a>
	                </div>
	            </div>
	      </div><!-- �̹�������Ʈ�� -->
      
     
        	
      </div>
      <!--  ������ ���� -->
      <div class="col-md-9">       
       <div class="panel panel-default">
		  <div class="panel-body">
		    <h2>ȫ�ٿ�</h2>
		    
		    <input type="text" name="engName" value="Hong Paul"/> / 
		    <input type="text" name="chiName" value="��ٿ�"/>
		  </div>
		</div>
		
		<table class="table table-hover">
		  <tr>
		    <td class="active">�г�</td>
		    <td class="">
		    <select>
		    	<option value="1">1</option>
		    	<option value="2">2</option>
		    	<option value="3" selected>3</option>
		    	<option value="4">4</option>
		    </select>
		    		�г�
		    </td>
		 	<td class="active">�й�</td>
		 	<td>0729081</td>
		  </tr>	
		  <tr>
		    <td class="active">����ó</td>
		    <td class=""><input type="text" name="phone" value="010-8985-5334"/></td>
		 	<td class="active">�̸���</td>
		 	<td><input type="text" name="email"  value="h0ngz@naver.com"/></td>
		  </tr>	
		   <tr>
		    <td class="active">SNS</td>
		    <td colspan="3">dddddddddd</td>		 	
		  </tr>		 	
		</table>
		<div class="col-md-12">
			<div class="col-md-3"></div>
			<div class="col-md-6">			
				<button type="button" class="btn btn-primary btn-lg btn-block" onClick="submit()">������ ���</button>
			</div>
			<div class="col-md-3"></div>			
		</div>
		
      </div>
      </form>	
    </div> <!--  ������ ���� �� -->
  	
    <hr> <!--  ��輱 -->
    <!--  �̷� ���� -->
    
	<form action="<%=rootPath %>/test" name="spec" method="post" >
    <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>�ڰ���</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s1">	  	
		 <tr>
		   <th class="col-md-2">�����</th>
		   <th class="col-md-2">�ڰ�����</th>
		   <th class="col-md-2">���</th>
		   <th class="col-md-2">������</th>
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="�ڰ��� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s1()">�߰�</button></th>
		 </tr>
		 <c:choose>
			<c:when test="${spec.certificates}==null">
			<tr>
				<td align="center" colspan="6">��ϵ� �ڰ����� �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="certificate" items="${spec.certificates}" >
					 <tr>
					   <td class="col-md-2">${certificate.certificateDate}</td>
					   <td class="col-md-2">${certificate.certificateName}</td>	
					   <td class="col-md-2">${certificate.certificateGrade}</td>	
					   <td class="col-md-2">${certificate.certificateOrg}</td>						  		
					   <td class="col-md-2">${certificate.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		  </c:choose>
      </table>		  
	</div>  <!--  section END -->
	
	
	

	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>���� �ɷ�</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s2">	  	
		 <tr>
		   <th class="col-md-2">���</th>
		   <th class="col-md-2">�����</th>
		   <th class="col-md-2">����(���)</th>
		   <th class="col-md-2">�������</th>
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="���дɷ� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s2()">�߰�</button></th>
		 </tr>
		 <c:choose>
			<c:when test="${spec.languages}==null">
			<tr>
				<td align="center" colspan="6">��ϵ� ���дɷ��� �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="language" items="${spec.languages}" >
					 <tr>
					   <td class="col-md-2">${language.languageName}</td>
					   <td class="col-md-2">${language.languageExamName}</td>	
					   <td class="col-md-2">${language.languageExamGrade}</td>	
					   <td class="col-md-2">${language.languageExamOrg}</td>						  		
					   <td class="col-md-2">${language.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		  </c:choose>
      </table>		  
	</div>  <!--  section END -->
	
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>�������</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s3">	  	
		 <tr>
		   <th class="col-md-2">������</th>
		   <th class="col-md-4">���󳻿�</th>
		   <th class="col-md-2">������</th>		  
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="������� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s3()">�߰�</button></th>
		 </tr>
	 	 <c:choose>
			<c:when test="${spec.awards}==null">
			<tr>
				<td align="center" colspan="5">��ϵ� ���󳻿��� �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="award" items="${spec.awards}" >
					 <tr>
					   <td class="col-md-2">${award.awardDate}</td>
					   <td class="col-md-4">${award.awardSubject}</td>	
					   <td class="col-md-2">${award.awardOrg}</td>						  		
					   <td class="col-md-2">${award.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		  </c:choose>
      </table>		  
	</div>  <!--  section END -->
	
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>����/����</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s4">	  	
		 <tr>
		   <th class="col-md-2">�Ⱓ</th>
		   <th class="col-md-4">������</th>
		   <th class="col-md-2">���</th>		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="����/���� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s4()">�߰�</button></th>
		 </tr>
	 	 <c:choose>
			<c:when test="${spec.trainings}==null">
			<tr>
				<td align="center" colspan="5">��ϵ� ����/���� ������ �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="training" items="${spec.trainings}" >
					 <tr>
					   <td class="col-md-2">${training.trainingPeriod}</td>
					   <td class="col-md-4">${training.trainingName}</td>	
					   <td class="col-md-2">${training.trainingOrg}</td>						  		
					   <td class="col-md-2">${training.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		  </c:choose>
      </table>		  
	</div>  <!--  section END -->
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>��Ʈ������</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s5">	  	
		 <tr>
		   <th class="col-md-2">�Ⱓ</th>
		   <th class="col-md-3">��Ʈ��������</th>
		   <th class="col-md-3">��ũ</th>		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="��Ʈ������ �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s5()">�߰�</button></th>
		 </tr>
	 	 <c:choose>
			<c:when test="${spec.portfolios}==null">
			<tr>
				<td align="center" colspan="5">��ϵ� ��Ʈ�������� �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="portfolio" items="${spec.portfolios}" >
					 <tr>
					   <td class="col-md-2">${portfolio.portfolioPeriod}</td>
					   <td class="col-md-3">${portfolio.portfolioName}</td>	
					   <td class="col-md-3">${portfolio.portfolioLink}</td>						  		
					   <td class="col-md-2">${portfolio.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		  </c:choose>
      </table>		  
	</div>  <!--  section END -->
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>����Ʈ���� ���� �ɷ�</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s6">	  	
		 <tr>
		   <th class="col-md-2">���(���)��</th>
		   <th class="col-md-2">����</th>	
		   <th class="col-md-2"></th>	
		   <th class="col-md-2"></th>		  		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="���ߴɷ� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s6()">�߰�</button></th>
		 </tr>
	 	 <c:choose>
			<c:when test="${spec.programmingLanguages}==null">
			<tr>
				<td align="center" colspan="6">��ϵ� ������ �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="programmingLanguage" items="${spec.programmingLanguages}" >
					 <tr>
					   <td class="col-md-2">${programmingLanguage.languageName}</td>
					   <td class="col-md-2">${programmingLanguage.languageLevel}</td>	
					   <td class="col-md-2"></td>	
					   <td class="col-md-2"></td>		
					   <td class="col-md-2">${programmingLanguage.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		  </c:choose>
      </table>		  
	</div>  <!--  section END -->
	
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>�з� ����</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s7">	  	
		 <tr>
		   <th class="col-md-2">���бⰣ</th>
		   <th class="col-md-2">�б���</th>	
		   <th class="col-md-2">����</th>	
		   <th class="col-md-2">����</th>		  		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="�з� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s7()">�߰�</button></th>
		 </tr>
		 <c:choose>
			<c:when test="${spec.academics}==null">
			<tr>
				<td align="center" colspan="6">��ϵ� �з»����� �����ϴ�.</td>
			</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="academic" items="${spec.academics}" >
					 <tr>
					   <td class="col-md-2">${academic.academicPeriod}</td>
					   <td class="col-md-2">${academic.academicName}</td>	
					   <td class="col-md-2">${academic.academicMajor}</td>	
					   <td class="col-md-2">${academic.academicState}</td>		
					   <td class="col-md-2">${academic.publicScope}</td>
					   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>		
      </table>		  
	</div>  <!--  section END -->
	 
	 <!--  section  -->
  	<div class="panel panel-default">
	  <!-- Table Name -->
	  <div class="panel-heading"><b>����</b></div>	
	  <!-- Table -->
	   <table class="table table-hover" ID="s8">	  	
		 <tr>
		   <th class="col-md-2">�����Ⱓ</th>
		   <th class="col-md-2">����</th>	
		   <th class="col-md-2">���</th>	
		   <th class="col-md-2">����</th>		  		   
		   <th class="col-md-2">��������</th>
		   <th class="col-md-2 text-right"><button title="���� �߰�" type="button" class="btn btn-primary btn-xs" onclick="addItem_s8()">�߰�</button></th>
		 </tr>
			<c:choose>
				<c:when test="${spec.military.publicScope>0}">
					<tr>
						   <td class="col-md-2">${spec.military.militaryPeriod}</td>
						   <td class="col-md-2">${spec.military.militaryGroup}</td>	
						   <td class="col-md-2">${spec.military.militaryRank}</td>	
						   <td class="col-md-2">${spec.military.militaryWork}</td>		
						   <td class="col-md-2">${spec.military.publicScope}</td>
						   <td class="col-md-2 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs">����</button></td>
					</tr>				
				</c:when>
				<c:otherwise>
					<tr>
						<td align="center" colspan="6">��ϵ� ���������� �����ϴ�.</td>
					</tr>	
				</c:otherwise>
			</c:choose>					 
      </table>		  
	</div>  <!--  section END -->
	
	 </form>
  </div>
</div>

<jsp:include page="/tail.jsp" flush="false" />
