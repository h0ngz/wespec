<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/head.jsp" flush="false" />
${profile.profilePhotoURL}

<%-- �ش� �������� ������ �����̷���.  --%> 
<c:if test="${profile.profileName eq null}">
	<jsp:forward page="/Exception">
		<jsp:param name="ex" value="NotFoundStudent" />
	</jsp:forward>	
</c:if>

<div class="row">
	<div class="col-md-12">
		<div class="row">			
			<!-- ������ ���� ���� -->
			<div class="col-md-3">
				<!--  �̹��� ����Ʈ  -->
				<div id="effect-6" class="effects clearfix">
					<div class="img">
						
						<c:if test="${profile.profilePhotoURL eq null}">
							<img src="<%=imagesPath %>/tumb.jpg" alt="">
						</c:if>
						<c:if test="${profile.profilePhotoURL ne null}">
							<img src="user/upload/${profile.profilePhotoURL}" width="300">
						</c:if>
						
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
					<tr>
						<td class="active">Ȱ�� SNS</td>
						<td colspan="3">
							<c:if test="${profile.profileSnsFacebook ne null && profile.profileSnsFacebook ne ''}">
								<a href="http://facebook.com/${profile.profileSnsFacebook}" target="_blank"><img src="<%=imagesPath%>/icon_facebook.gif"></a>	
							</c:if>
							<c:if test="${profile.profileSnsTwitter ne null && profile.profileSnsTwitter ne ''}">
								<a href="http://twitter.com/${profile.profileSnsTwitter}" target="_blank"><img src="<%=imagesPath%>/icon_twitter.gif"></a>	
							</c:if>
							<c:if test="${profile.profileSnsNBlog ne null && profile.profileSnsNBlog ne ''}">
								<a href="http://blog.naver.com/${profile.profileSnsNBlog}" target="_blank"><img src="<%=imagesPath%>/icon_n_blog.gif"></a>	
							</c:if>
							<c:if test="${profile.profileSnsInstagram ne null && profile.profileSnsInstagram ne ''}">
								<a href="http://instagram.com/${profile.profileSnsInstagram}" target="_blank"><img src="<%=imagesPath%>/icon_instagram.gif"></a>	
							</c:if>
							<c:if test="${profile.profileSnsTumblr ne null && profile.profileSnsTumblr ne ''}">
								<a href="http://tumblr.com/${profile.profileSnsTumblr}" target="_blank"><img src="<%=imagesPath%>/icon_tumblr.gif"></a>	
							</c:if>
							<c:if test="${profile.profileSnsPinterest ne null && profile.profileSnsPinterest ne ''}">
								<a href="http://pinterest.com/${profile.profileSnsPinterest}" target="_blank"><img src="<%=imagesPath%>/icon_pinterest.gif"></a>	
							</c:if>
						
						</td>
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
					<th class="col-md-2">�����</th>
					<th class="col-md-2">�ڰ�����</th>
					<th class="col-md-2">���</th>
					<th class="col-md-2">������</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
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
								<td class="col-md-2">${certificate.certificateDate}</td>
								<td class="col-md-2">${certificate.certificateName}</td>
								<td class="col-md-2">${certificate.certificateGrade}</td>
								<td class="col-md-2">${certificate.certificateOrg}</td>
								<td class="col-md-2">${certificate.publicScope}</td>
								<td class="col-md-2 text-right"></td>
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
					<th class="col-md-2">���</th>
					<th class="col-md-2">�����</th>
					<th class="col-md-2">����(���)</th>
					<th class="col-md-2">�������</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
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
								<td class="col-md-2">${language.languageName}</td>
								<td class="col-md-2">${language.languageExamName}</td>
								<td class="col-md-2">${language.languageExamGrade}</td>
								<td class="col-md-2">${language.languageExamOrg}</td>
								<td class="col-md-2">${language.publicScope}</td>
								<td class="col-md-2 text-right"></td>
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
					<th class="col-md-2">������</th>
					<th class="col-md-4">���󳻿�</th>
					<th class="col-md-2">������</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
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
								<td class="col-md-2">${award.awardDate}</td>
								<td class="col-md-4">${award.awardSubject}</td>
								<td class="col-md-2">${award.awardOrg}</td>
								<td class="col-md-2">${award.publicScope}</td>
								<td class="col-md-2 text-right"></td>
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
					<th class="col-md-2">�Ⱓ</th>
					<th class="col-md-4">������</th>
					<th class="col-md-2">���</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
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
								<td class="col-md-2">${training.trainingPeriod}</td>
								<td class="col-md-4">${training.trainingName}</td>
								<td class="col-md-2">${training.trainingOrg}</td>
								<td class="col-md-2">${training.publicScope}</td>
								<td class="col-md-2 text-right"></td>
						
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
					<th class="col-md-2">�Ⱓ</th>
					<th class="col-md-3">��Ʈ��������</th>
					<th class="col-md-3">��ũ</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
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
								<td class="col-md-2">${portfolio.portfolioPeriod}</td>
								<td class="col-md-3">${portfolio.portfolioName}</td>
								<td class="col-md-3">${portfolio.portfolioLink}</td>
								<td class="col-md-2">${portfolio.publicScope}</td>
								<td class="col-md-2 text-right"></td>
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
					<th class="col-md-2">���(���)��</th>
					<th class="col-md-2">����</th>
					<th class="col-md-2"></th>
					<th class="col-md-2"></th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
				</tr>
				<c:choose>
					<c:when test="${ empty spec.programmingLanguages }">
						<tr>
							<td align="center" colspan="6">��ϵ� ������ �����ϴ�.</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="programmingLanguage"
							items="${spec.programmingLanguages}">
							<tr>
								<td class="col-md-2">${programmingLanguage.languageName}</td>
								<td class="col-md-2">${programmingLanguage.languageLevel}</td>
								<td class="col-md-2"></td>
								<td class="col-md-2"></td>
								<td class="col-md-2">${programmingLanguage.publicScope}</td>
								<td class="col-md-2 text-right"></td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
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
					<th class="col-md-2">���бⰣ</th>
					<th class="col-md-2">�б���</th>
					<th class="col-md-2">����</th>
					<th class="col-md-2">����</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
				</tr>
				<c:choose>
					<c:when test="${ empty spec.academics}">
						<tr>
							<td align="center" colspan="6">��ϵ� �з»����� �����ϴ�.</td>
						</tr>
					</c:when>
					<c:otherwise>
						<c:forEach var="academic" items="${spec.academics}">
							<tr>
								<td class="col-md-2">${academic.academicPeriod}</td>
								<td class="col-md-2">${academic.academicName}</td>
								<td class="col-md-2">${academic.academicMajor}</td>
								<td class="col-md-2">${academic.academicState}</td>
								<td class="col-md-2">${academic.publicScope}</td>
								<td class="col-md-2 text-right"></td>
							</tr>
						</c:forEach>
					</c:otherwise>
				</c:choose>
			</table>
		</div>
		<!-- �з»��� section END -->
		
		<!-- �������� section  -->
		<div class="panel panel-default">
			<!-- Table Name -->
			<div class="panel-heading">	<b>����</b>	</div>
			<!-- Table -->
			<table class="table table-hover" ID="s8">
				<tr>
					<th class="col-md-2">�����Ⱓ</th>
					<th class="col-md-2">����</th>
					<th class="col-md-2">���</th>
					<th class="col-md-2">����</th>
					<th class="col-md-2">��������</th>
					<th class="col-md-2 text-right"></th>
				</tr>
				<c:choose>
					<c:when test="${ spec.military.isRegister() }">
						<tr>
							<td class="col-md-2">${spec.military.militaryPeriod}</td>
							<td class="col-md-2">${spec.military.militaryGroup}</td>
							<td class="col-md-2">${spec.military.militaryRank}</td>
							<td class="col-md-2">${spec.military.militaryWork}</td>
							<td class="col-md-2">${spec.military.publicScope}</td>
							<td class="col-md-2 text-right"></td>
						</tr>
					</c:when>
					<c:otherwise>
						<tr>
							<td align="center" colspan="6">��ϵ� ���������� �����ϴ�.</td>
						</tr>
					</c:otherwise>
				</c:choose>
			</table>					
		</div>
		<!--  section END -->
	</div>
</div>


<jsp:include page="/tail.jsp" flush="false" />
