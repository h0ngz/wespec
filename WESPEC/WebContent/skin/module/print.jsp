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
    <link href="<%=skinPath %>/css/style.css" rel="stylesheet" media="screen">
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <!-- css -->
	<link rel="stylesheet" href="<%=skinPath %>/css/style.css" />
	<link rel="stylesheet" href="<%=skinPath %>/css/tip-yellowsimple.css" type="text/css" />    
	<!-- js -->
	<script src="<%=skinPath %>/js/wespec.js"></script>
	<script src="<%=skinPath %>/js/jquery-1.9.1.min.js"></script>
	<script src="<%=skinPath %>/js/modernizr.js"></script>
	<script src="<%=skinPath %>/js/jspatch.js"></script>
	<script src="<%=skinPath %>/js/buildcats.js" charset="utf-8"></script>
	<script src="<%=skinPath %>/js/jquery.poshytip.js"></script>
	<!--  printJs -->
	<script src="<%=skinPath %>/js/printResume.js"></script>
	<!--  collaps -->
	<script src="<%=skinPath %>/js/collaps.js" ></script>
	<%-- jquery.circularise --%>
	<script src="<%=skinPath %>/js/jquery.circularise.js"></script>
	
	
	<script>
	//�̹��� �ѿ��� ��ũ��Ʈ 
	$(document).ready(function(){
	    if (Modernizr.touch) {
	        // show the close overlay button
	        $(".close-overlay").removeClass("hidden");
	        // handle the adding of hover class when clicked
	        $(".img").click(function(e){
	            if (!$(this).hasClass("hover")) {
	                $(this).addClass("hover");
	            }
	        });
	        // handle the closing of the overlay
	        $(".close-overlay").click(function(e){
	            e.preventDefault();
	            e.stopPropagation();
	            if ($(this).closest(".img").hasClass("hover")) {
	                $(this).closest(".img").removeClass("hover");
	            }
	        });
	    } else {
	        // handle the mouseenter functionality
	        $(".img").mouseenter(function(){
	            $(this).addClass("hover");
	        })
	        // handle the mouseleave functionality
	        .mouseleave(function(){
	            $(this).removeClass("hover");
	        });
	    }
	});
	</script>
</head>
<body>
<!-- container START -->  
<div class="container" id="bgWhite">  
	<div class="row">
		<div class="col-md-12">
			<div class="row">			
				<!-- ������ ���� ���� -->
				<div class="col-md-3">
					<!--  �̹��� ����Ʈ  -->
					<div id="effect-6" class="effects clearfix">
						<div class="img">						
								<img src="${profile.profilePhotoURL}">								
						</div>
					</div>
					<!-- �̹�������Ʈ�� -->
				</div>
				<!--  ������ ���� -->
				<div class="col-md-9">
					<div class="panel panel-default">
						<div class="panel-body">
							<h2><c:out value="${profile.profileName}"/></h2>
							<c:out value="${profile.profileEngName}"/> / <c:out value="${profile.profileChiName}"/>
						</div>
					</div>
	
					<table class="table table-bordered">
						<tr>
							<td class="active">�г�</td>
							<td class="">${profile.profileGrade}�г�</td>
							<td class="active">�й�</td>
							<td>${profile.memberId}</td>
						</tr>
						<tr>
							<td class="active">�������</td>
							<td>${profile.profileBirth}</td>
							<td class="active">������</td>
							<td>${profile.profileAddress}</td>
						</tr>
						<tr>
							<td class="active">����ó</td>
							<td class="">${profile.profilePhone}</td>
							<td class="active">�̸���</td>
							<td>${profile.profileEmail}</td>
						</tr>						
					</table>
					<div class="col-md-12">
						<div class="col-md-3"></div>
						<div class="col-md-6">
							
							<!--  ������ ����ֶ� �ڸ�. ����ִ°����� �ǹ���. -->
						</div>
						<div class="col-md-3"></div>
					</div>
				</div>		
			</div>
			<!--  ������ ���� �� -->
			<!--  ��輱 -->
			<hr>
	
			<!--  �̷� ���� -->
		
			<!--  �ڰ��� section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>�ڰ���</b>
				</div>
				<!-- Table -->
				<table class="table table-hover" ID="s1">
					<tr>
						<th class="col-md-3">�����</th>
						<th class="col-md-3">�ڰ�����</th>
						<th class="col-md-3">���</th>
						<th class="col-md-3">������</th>
				
					</tr>
					<c:choose>
						<c:when test="${ empty spec.certificates}">
							<tr>
								<td align="center" colspan="6">��ϵ� �ڰ����� �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="certificate" items="${spec.certificates}">
								<tr>
									<td class="col-md-3">${certificate.certificateDate}</td>
									<td class="col-md-3">${certificate.certificateName}</td>
									<td class="col-md-3">${certificate.certificateGrade}</td>
									<td class="col-md-3">${certificate.certificateOrg}</td>
									
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<!--  section END -->
			<!--  ���дɷ� section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>���� �ɷ�</b>
				</div>
				<!-- Table -->
				<table class="table table-hover" ID="s2">
					<tr>
						<th class="col-md-3">���</th>
						<th class="col-md-3">�����</th>
						<th class="col-md-3">����(���)</th>
						<th class="col-md-3">�������</th>
					
					</tr>
					<c:choose>
						<c:when test="${ empty spec.languages }">
							<tr>
								<td align="center" colspan="6">��ϵ� ���дɷ��� �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="language" items="${spec.languages}">
								<tr>
									<td class="col-md-3">${language.languageName}</td>
									<td class="col-md-3">${language.languageExamName}</td>
									<td class="col-md-3">${language.languageExamGrade}</td>
									<td class="col-md-3">${language.languageExamOrg}</td>
									
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<!--  section END -->
	
			<!--  ������� section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>�������</b>
				</div>
				<!-- Table -->
				<table class="table table-hover" ID="s3">
					<tr>
						<th class="col-md-4">������</th>
						<th class="col-md-4">���󳻿�</th>
						<th class="col-md-4">������</th>
				
					</tr>
					<c:choose>
						<c:when test="${ empty spec.awards}">
							<tr>
								<td align="center" colspan="5">��ϵ� ���󳻿��� �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="award" items="${spec.awards}">
								<tr>
									<td class="col-md-4">${award.awardDate}</td>
									<td class="col-md-4">${award.awardSubject}</td>
									<td class="col-md-4">${award.awardOrg}</td>
									
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<!--  section END -->
	
			<!-- ����/���� section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>����/����</b>
				</div>
				<!-- Table -->
				<table class="table table-hover" ID="s4">
					<tr>
						<th class="col-md-4">�Ⱓ</th>
						<th class="col-md-4">������</th>
						<th class="col-md-4">���</th>
				
					</tr>
					<c:choose>
						<c:when test="${ empty spec.trainings}">
							<tr>
								<td align="center" colspan="5">��ϵ� ����/���� ������ �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="training" items="${spec.trainings}">
								<tr>
									<td class="col-md-4">${training.trainingPeriod}</td>
									<td class="col-md-4">${training.trainingName}</td>
									<td class="col-md-4">${training.trainingOrg}</td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<!--  section END -->
	
			<!-- ��Ʈ������ section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>��Ʈ������</b>
				</div>
				<!-- Table -->
				<table class="table table-hover" ID="s5">
					<tr>
						<th class="col-md-4">�Ⱓ</th>
						<th class="col-md-4">��Ʈ��������</th>
						<th class="col-md-4">��ũ</th>						
					</tr>
					<c:choose>
						<c:when test="${ empty spec.portfolios}">
							<tr>
								<td align="center" colspan="5">��ϵ� ��Ʈ�������� �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="portfolio" items="${spec.portfolios}">
								<tr>
									<td class="col-md-3">${portfolio.portfolioPeriod}</td>
									<td class="col-md-4">${portfolio.portfolioName}</td>
									<td class="col-md-5">${portfolio.portfolioLink}</td>
	
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<!--  section END -->
	
			<!-- ����Ʈ����ߴɷ� section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>����Ʈ���� ���� �ɷ�</b>
				</div>
				<!-- Table -->			
				<table class="table table-hover" ID="s6">
					<tr>
						<td class="col-md-11" style="padding:20px 40px;">						
		    			   	<div class="row">
								<c:forEach var="item" items="<%= languageList %>" varStatus="status">
									<div class="col-md-2 col-sm-3 col-xs-4">								 
										<input id="abl${status.index}" class="css-checkbox" disabled type="checkbox" name="ability" readonly value="${item}" 
											<c:forEach var="pl" items="${spec.programmingLanguages}">
												<c:if test="${pl.languageName eq item}">
														checked  
												</c:if>
											</c:forEach>
									/><label for="abl${status.index}" class="css-label">${item}</label>
									</div>									
								</c:forEach>
								<script>
								
								</script>
							</div>	   					
						</td>
					</tr>				
				</table>
							
			</div>
			<!--  section END -->
	
			<!-- �з»��� section  -->
			<div class="panel panel-default">
				<!-- Table Name -->
				<div class="panel-heading">
					<b>�з� ����</b>
				</div>
				<!-- Table -->
				<table class="table table-hover" ID="s7">
					<tr>
						<th class="col-md-3">���бⰣ</th>
						<th class="col-md-3">�б���</th>
						<th class="col-md-3">����</th>
						<th class="col-md-3">����</th>
					
					</tr>
					<c:choose>
						<c:when test="${ empty spec.academics}">
							<tr>
								<td align="center" colspan="4">��ϵ� �з»����� �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="academic" items="${spec.academics}">
								<tr>
									<td class="col-md-3">${academic.academicPeriod}</td>
									<td class="col-md-3">${academic.academicName}</td>
									<td class="col-md-3">${academic.academicMajor}</td>
									<td class="col-md-3">${academic.academicState}</td>
									
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
			</div>
			<!-- �з»��� section END -->
			<c:if test="${profile.profileGender eq 'M' }">
				<!-- �������� section  -->
				<div class="panel panel-default">
					<!-- Table Name -->
					<div class="panel-heading">	<b>����</b>	</div>
					<!-- Table -->
					<table class="table table-hover" ID="s8">
						<tr>
							<th class="col-md-3">�����Ⱓ</th>
							<th class="col-md-3">����</th>
							<th class="col-md-3">���</th>
							<th class="col-md-3">����</th>
							
						</tr>
						<c:choose>
							<c:when test="${ spec.military.isRegister() }">
								<tr>
									<td class="col-md-3">${spec.military.militaryPeriod}</td>
									<td class="col-md-3">${spec.military.militaryGroup}</td>
									<td class="col-md-3">${spec.military.militaryRank}</td>
									<td class="col-md-3">${spec.military.militaryWork}</td>
									
								</tr>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" colspan="4">��ϵ� ���������� �����ϴ�.</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</table>					
				</div>
				<!--  section END -->
			</c:if>
		</div>
	</div>
</div>
<script>
 window.print();
 </script>
	
	  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<%=skinPath %>/js/bootstrap.min.js"></script>
  </body>
</html>

