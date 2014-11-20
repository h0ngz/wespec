<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/head.jsp" flush="false" />

<div class="row">
	<div class="col-md-12">
		<div class="row">
			<form action="<%=rootPath%>/register" method="post" class="form-inline" name="profile">
				<input type="hidden" name="param" value="p" />
				<!-- ������ ���� ���� -->
				<div class="col-md-3">
					<!--  �̹��� ����Ʈ  -->
					<div id="effect-6" class="effects clearfix">
						<div class="img">
							<img src="${profile.profilePhotoURL}" alt="">
							<div class="overlay">
								<a href="#" class="expand" data-toggle="modal" data-target="#photoModal"><span class="glyphicon glyphicon-camera"></span></a> <a class="close-overlay hidden">x</a>
							</div>
						</div>
					</div>
					<!-- �̹�������Ʈ�� -->
				</div>
				<!--  ������ ���� -->
				<div class="col-md-9">
					<div class="panel panel-default">
						<div class="panel-body">
							<h2>${profile.profileName}</h2>
							<input type="text" name="engName" value="${profile.profileEngName}" placeholder="�����̸�" /> /
							<input type="text" name="chiName" value="${profile.profileChiName}" placeholder="�����̸�"/>
						</div>
					</div>

					<table class="table table-hover">
						<tr>
							<td class="active">�г�</td>
							<td class="">
							<select name="grade">
								<option value="1" <c:if test="${profile.profileGrade eq 1}">selected</c:if>>1</option> 
								<option value="2" <c:if test="${profile.profileGrade eq 2}">selected</c:if>>2</option> 
								<option value="3" <c:if test="${profile.profileGrade eq 3}">selected</c:if>>3</option> 
								<option value="4" <c:if test="${profile.profileGrade eq 4}">selected</c:if>>4</option> 	
							</select>
								�г�
							</td>
							<td class="active">�й�</td>
							<td>${profile.memberId}</td>
						</tr>
						<tr>
							<td class="active">�������</td>
							<td><input type="text" name="birth" value="${profile.profileBirth}" readonly /></td>
							<td class="active">������</td>
							<td><input type="text" name="address" value="${profile.profileAddress}"/></td>
						</tr>
						<tr>
							<td class="active">����ó</td>
							<td class=""><input type="text" name="phone"
								value="${profile.profilePhone}" /></td>
							<td class="active">�̸���</td>
							<td><input type="text" name="email" value="${profile.profileEmail}" /></td>
						</tr>
						<tr>
							<td class="active">Ȱ�� SNS</td>
							<td colspan="3"><button title="Ȱ�� SNS �߰� �� ����" type="button" class="btn btn-danger btn-xs" data-toggle="modal" data-target="#snsModal">SNS �߰� �� ����</button></td>
						</tr>
					</table>
					<div class="col-md-12">
						<div class="col-md-3"></div>
						<div class="col-md-6">
							<button type="button" class="btn btn-primary btn-lg btn-block"
								onClick="submit()">������ ���</button>
						</div>
						<div class="col-md-3"></div>
					</div>

				</div>
			</form>
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
						<th class="col-md-3">������</th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_certificate').toggle()" title="�ڰ��� �߰�">�߰�</label>
						</th>
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
									<td class="col-md-3">${certificate.certificateOrg}</td>
									<td class="col-md-2">${certificate.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=certificate&tableNo=${certificate.regNo}');">����</button></td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_certificate">
					<form action="<%=rootPath%>/register?param=s1" class="form-inline" role="form" name="certificate" method="post">
					<table class="table table-hover">
                		<tr>
                			<td class="col-md-2">
	                			<input type="text" id="tooltip" class="form-control" name="certificateDate_year" size="5" maxlength="4" title="��)2014">
	                			<span style="vertical-align:bottom" >&nbsp;.&nbsp;</span>
	                			<input type="text" id="tooltip" class="form-control" name="certificateDate_month" size="3" maxlength="2" title="��)09">
                			</td>
                     		<td class="col-md-2"><input type="text" class="form-control" name="certificateName" title="��) ��ǻ��Ȱ��ɷ�"/></td>
                      		<td class="col-md-2"><input type="text" class="form-control" name="certificateGrade" title="��) 1��"/></td>
				      		<td class="col-md-3"><input type="text" class="form-control" name="certificateOrg" title="��) ���ѻ��ȸ�Ǽ�"/></td>
				      		<td class="col-md-2"><select name="publicScope" class="form-control"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����">�����</option></select></td>
				      		<td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
                		</tr> 
                	</table>
                	</form>
				</div>
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
						<th class="col-md-3">�������</th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_language_exam').toggle()" title="���дɷ� �߰�">�߰�</label>
						</th>
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
									<td class="col-md-3">${language.languageExamOrg}</td>
									<td class="col-md-2">${language.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=language_exam&tableNo=${language.regNo}');">����</button></td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_language_exam">
					<form action="<%=rootPath%>/register?param=s2" class="form-inline" role="form" name="language_exam" method="post">
					<table class="table table-hover">
                		<tr>                			
                			<td class="col-md-2"><SELECT class="form-control " Name="languageName" onChange="BuildCats(this.selectedIndex,language_exam);"><OPTION Value="">------<OPTION Value="����">����<OPTION Value="�Ͼ�">�Ͼ�<OPTION Value="�߱���">�߱���</Select></td>
			                <td class="col-md-2"><SELECT class="form-control" Name="languageExamName"><OPTION Value="">-------</Select></td>
			                <td class="col-md-2"><div class="input-group"><input type="text" class="form-control" name="languageExamGrade" /><div class="input-group-btn"><SELECT class="form-control" Name="languageExamGradeOption"><OPTION Value="��">��<OPTION Value="��">��</Select></div></div></td>
						    <td class="col-md-3"><input type="text" class="form-control" name="languageExamOrg" title="��) �ѱ���������ȸ" /></td>
						    <td class="col-md-2"><select class="form-control" name="publicScope"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����" >�����</option></select></td>
						    <td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
                		</tr> 
                	</table>
                	</form>
				</div>
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
						<th class="col-md-3">�������</th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_award').toggle()" title="������� �߰�">�߰�</label>
						</th>
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
									<td class="col-md-3">${award.awardOrg}</td>
									<td class="col-md-2">${award.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=award&tableNo=${award.regNo}');">����</button></td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_award">
					<form action="<%=rootPath%>/register?param=s3" class="form-inline" role="form" name="award" method="post">
					<table class="table table-hover">
                		<tr>                			
                			<td class="col-md-2"><input type="text" class="form-control" name="awardDate_year" size="5" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >&nbsp;.&nbsp;</span><input type="text" class="form-control" name="awardDate_month" size="3" maxlength="2"></td>
               				<td class="col-md-4"><input type="text" class="form-control" name="awardSubject" style="width:100%;" title="��) 2014 ������â�ǰ����� �ֿ����" /></td>
			      			<td class="col-md-3"><input type="text" class="form-control" name="awardOrg" title="��) KT&G"/></td>
			      			<td class="col-md-2"><select name="publicScope" class="form-control"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����">�����</option></select></td>
			      			<td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
						</tr> 
                	</table>
                	</form>
				</div>
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
						<th class="col-md-3">�Ⱓ</th>
						<th class="col-md-4">������</th>
						<th class="col-md-2">���</th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_training').toggle()" title="����/���� �߰�">�߰�</label>
						</th>
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
									<td class="col-md-3">${training.trainingPeriod}</td>
									<td class="col-md-4">${training.trainingName}</td>
									<td class="col-md-2">${training.trainingOrg}</td>
									<td class="col-md-2">${training.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=training&tableNo=${training.regNo}');">����</button></td>
							
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_training">
					<form action="<%=rootPath%>/register?param=s4" class="form-inline" role="form" name="training" method="post">
					<table class="table table-hover">
                		<tr>                			
                			<td class="col-md-3"><input type="text" class="form-control" name="trainingPeriod_year1" size="4" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >&nbsp;.&nbsp;</span><input type="text" class="form-control" name="trainingPeriod_month1" size="2" maxlength="2"> <span style="vertical-align:middle" >&nbsp;~&nbsp;</span><input type="text" class="form-control" name="trainingPeriod_year2" size="4" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >&nbsp;.&nbsp;</span><input type="text" class="form-control" name="trainingPeriod_month2" size="2" maxlength="2"></td> 
			                <td class="col-md-4"><input type="text" class="form-control" name="trainingName" style="width:100%;" title="��) û�������ī���� ������ �м� ������ ����"/></td>
						    <td class="col-md-2"><input type="text" class="form-control" name="trainingOrg" title="��) ���뵿��"/></td>
						    <td class="col-md-2"><select name="publicScope"  class="form-control"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����">�����</option></select></td>
						    <td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
                		</tr> 
                	</table>
                	</form>
				</div>
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
						<th class="col-md-3">�Ⱓ</th>
						<th class="col-md-3">������Ʈ��</th>
						<th class="col-md-3">���ø�ũ</th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_portfolio').toggle()" title="��Ʈ������ �߰�">�߰�</label>
						</th>
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
									<td class="col-md-3">${portfolio.portfolioName}</td>
									<td class="col-md-3">${portfolio.portfolioLink}</td>
									<td class="col-md-2">${portfolio.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=portfolio&tableNo=${portfolio.regNo}');">����</button></td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_portfolio">
					<form action="<%=rootPath%>/register?param=s5" class="form-inline" role="form" name="portfolio" method="post">
					<table class="table table-hover">
                		<tr>                			
                			<td class="col-md-3"><input type="text" class="form-control" name="portfolioPeriod_year1" size="4" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >&nbsp;.&nbsp;</span><input type="text" class="form-control" name="portfolioPeriod_month1" size="2" maxlength="2"> <span style="vertical-align:middle" >&nbsp;~&nbsp;</span><input type="text" class="form-control" name="portfolioPeriod_year2" size="4" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >&nbsp;.&nbsp;</span><input type="text" class="form-control" name="portfolioPeriod_month2" size="2" maxlength="2"></td>
			                <td class="col-md-3"><input type="text" class="form-control" name="portfolioName" style="width:100%" title="��) ������ �̷°��� �ý��� ������"/></td>
						    <td class="col-md-3"><input type="text" class="form-control" name="portfolioLink" style="width:100%" title="��) http://wespec.co.kr"/></td>
						    <td class="col-md-2"><select name="publicScope" class="form-control"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����">�����</option></select></td>
						    <td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
						</tr> 
                	</table>
                	</form>
				</div>
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
						<th class="col-md-3"></th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_programming_language').toggle()" title="����Ʈ���� ���ߴɷ�">�߰�</label>
						</th>
					</tr>
					<c:choose>
						<c:when test="${ empty spec.programmingLanguages }">
							<tr>
								<td align="center" colspan="6">��ϵ� ������ �����ϴ�.</td>
							</tr>
						</c:when>
						<c:otherwise>
							<c:forEach var="programmingLanguage" items="${spec.programmingLanguages}">
								<tr>
									<td class="col-md-2">${programmingLanguage.languageName}</td>
									<td class="col-md-2">${programmingLanguage.languageLevel}</td>
									<td class="col-md-2"></td>
									<td class="col-md-3"></td>
									<td class="col-md-2">${programmingLanguage.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=programming_language&tableNo=${programmingLanguage.regNo}');">����</button></td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_programming_language">
					<form action="<%=rootPath%>/register?param=s6" class="form-inline" role="form" name="programming_language" method="post">
					<table class="table table-hover">
                		<tr>                			
                			<td class="col-md-2"><input type="text" class="form-control" name="languageName" class="form-control"/></td>
		                  	<td class="col-md-2"><select name="languageLevel" class="form-control"><option value="��">��</option><option value="��">��</option><option value="��">��</option></select></td>
		                  	<td class="col-md-2"></td>
					      	<td class="col-md-3"></td>
					      	<td class="col-md-2"><select name="publicScope" class="form-control"><option value="��ü����">��ü����</option><option value="��������" >��������</option><option value="�����">�����</option></select></td>
					      	<td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
			     		</tr> 
                	</table>
                	</form>
				</div>
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
						<th class="col-md-2">�б���</th>
						<th class="col-md-2">����</th>
						<th class="col-md-2">����</th>
						<th class="col-md-2">��������</th>
						<th class="col-md-1 text-right">
							<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_academic').toggle()" title="�з»��� �߰�">�߰�</label>
						</th>
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
									<td class="col-md-3">${academic.academicPeriod}</td>
									<td class="col-md-2">${academic.academicName}</td>
									<td class="col-md-2">${academic.academicMajor}</td>
									<td class="col-md-2">${academic.academicState}</td>
									<td class="col-md-2">${academic.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����"
											type="button" class="btn btn-default btn-xs"onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=academic&tableNo=${academic.regNo}');">����</button></td>
								</tr>
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</table>
				<div class="collapse" id="add_academic">
					<form action="<%=rootPath%>/register?param=s7" class="form-inline" role="form" name="academic" method="post">
					<table class="table table-hover">
                		<tr>                			
                			<td class="col-md-3"><input type="text" class="form-control" name="academicPeriod_year1" size="4" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >.&nbsp;</span><input type="text" class="form-control" name="academicPeriod_month1" size="2" maxlength="2"><span style="vertical-align:middle" >&nbsp;~&nbsp;</span><input type="text" class="form-control" name="academicPeriod_year2" size="4" maxlength="4" title="��)2014"><span style="vertical-align:bottom" >.&nbsp;</span><input type="text" class="form-control" name="academicPeriod_month2" size="2" maxlength="2"></td>
          					<td class="col-md-2"><input type="text" class="form-control" name="academicName" style="width:100%" title="��) ��������б�"/></td>
               				<td class="col-md-2"><input type="text" class="form-control" name="academicMajor" style="width:100%" title="��) �ι���"/></td>
			     			<td class="col-md-2"><select name="academicState" class="form-control"><option value="����">����</option><option value="����">����</option><option value="����" >����</option><option value="����">����</option></select></td>
			    			<td class="col-md-2"><select name="publicScope" class="form-control"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����">�����</option></select></td>
			  				<td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>
                		</tr> 
                	</table>
                	</form>
				</div>
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
							<th class="col-md-2">����</th>
							<th class="col-md-2">���</th>
							<th class="col-md-2">����</th>
							<th class="col-md-2">��������</th>
							<th class="col-md-1 text-right">
								<label class="btn btn-primary btn-xs" onClick="javascript:$('#add_military').toggle()" title="�������� ���">�߰�</label>
							</th>
						</tr>
						<c:choose>
							<c:when test="${ spec.military.isRegister() }">
								<tr>
									<td class="col-md-3">${spec.military.militaryPeriod}</td>
									<td class="col-md-2">${spec.military.militaryGroup}</td>
									<td class="col-md-2">${spec.military.militaryRank}</td>
									<td class="col-md-2">${spec.military.militaryWork}</td>
									<td class="col-md-2">${spec.military.publicScope}</td>
									<td class="col-md-1 text-right"><button title="�׸� ����" type="button" class="btn btn-default btn-xs" onClick="javascript:delete_confirm('<%=rootPath%>/delete?tableName=military&tableNo=${spec.military.regNo}');">����</button></td>
								</tr>
							</c:when>
							<c:otherwise>
								<tr>
									<td align="center" colspan="6">��ϵ� ���������� �����ϴ�.</td>
								</tr>
							</c:otherwise>
						</c:choose>
					</table>
					<div class="collapse" id="add_military">
					<form action="<%=rootPath%>/register?param=s8" class="form-inline" role="form" name="military" method="post">
					<table class="table table-hover">
                		<tr>  
                			<td class="col-md-3">
                				<input type="text" class="form-control" name="militaryPeriod_year1" size="4" maxlength="4" title="��)2014">
                				<span style="vertical-align:bottom" >&nbsp;.&nbsp;</span>
                				<input type="text" class="form-control" name="militaryPeriod_month1" size="2" maxlength="2">
                				<span style="vertical-align:middle" >&nbsp;~&nbsp;</span>
                				<input type="text" class="form-control" name="militaryPeriod_year2" size="4" maxlength="4" title="��)2014">
                				<span style="vertical-align:bottom" >&nbsp;.&nbsp;</span>
                				<input type="text" class="form-control" name="militaryPeriod_month2" size="2" maxlength="2">
                			</td>
							<td class="col-md-2"><input type="text" class="form-control" name="militaryGroup" title="��) ����"/></td>
							<td class="col-md-2"><input type="text" class="form-control" name="militaryRank" title="��) ����"/></td>
							<td class="col-md-2"><input type="text" class="form-control" name="militaryWork" title="��) ����"/></td>
							<td class="col-md-2"><select name="publicScope" class="form-control"><option value="��ü����">��ü����</option><option value="��������">��������</option><option value="�����">�����</option></select></td>
							<td class="col-md-1 text-right"><button title="�׸����" type="button" class="btn btn-primary btn-xs" onClick="submit()">���</button></td>              			
						</tr> 
                	</table>
                	</form>
				</div>					
			</div>
			<!--  section END -->
			</c:if>					
		<!--  �̷¿��� �� -->
	</div>
</div>
        		
<!-- SNS REGISTER Modal -->
<div class="modal fade" id="snsModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
     <form action="<%=rootPath%>/register" role="form" method="post">
      <div class="modal-header"  style="background-color:#efefef;">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title text-center" id="myModalLabel">SNS ��� �� ����</h4>
      </div>
      <div class="modal-body">
      
       		<input type="hidden" name="param" value="sns"/>
       		<table class="table text-right">
       			<tr>
       				<td><h5>���̽��� ( facebook.com /</h5></td>
       				<td><input type="text" class="form-control" name="facebookUrl" placeholder="������" value="${profile.profileSnsFacebook}"/></td>
       				<td><h5>)</h5></td>
       			</tr>       				
       			<tr>
       				<td><h5>Ʈ���� ( twitter.com /</h5></td>
       				<td><input type="text" class="form-control" name="twitterUrl" placeholder="������" value="${profile.profileSnsTwitter}"/></td>
       				<td><h5>)</h5></td>
       			</tr> 
       			<tr>
       				<td><h5>���̹� ��α� ( blog.naver.com /</h5></td>
       				<td><input type="text" class="form-control" name="nBlogUrl" placeholder="������" value="${profile.profileSnsNBlog}"/></td>
       				<td><h5>)</h5></td>
       			</tr> 
       			<tr>
       				<td><h5>�ν�Ÿ�׷� ( instagram.com /</h5></td>
       				<td><input type="text" class="form-control" name="instagramUrl" placeholder="������" value="${profile.profileSnsInstagram}"/></td>
       				<td><h5>)</h5></td>
       			</tr> 
       			<tr>
       				<td><h5>�Һ� ( tumblr.com /</h5></td>
       				<td><input type="text" class="form-control" name="tumblrUrl" placeholder="������" value="${profile.profileSnsTumblr}"/></td>
       				<td><h5>)</h5></td>
       			</tr> 
       			<tr>
       				<td><h5>���ͷ���Ʈ ( pinterest.com /</h5></td>
       				<td><input type="text" class="form-control" name="pinterestUrl" placeholder="������" value="${profile.profileSnsPinterest}"/></td>
       				<td><h5>)</h5></td>	
       			</tr> 
       		</table>       	
       
      </div>
      <div class="modal-footer">	        
        <button type="button" class="btn btn-warning text-center" onClick="submit();">��� �� ���� �Ϸ�</button>
      </div>
      </form>
    </div>
  </div>
</div>

<script>
$('#tooltip').poshytip({
	className: 'tip-yellowsimple',
	showOn: 'focus',
	alignTo: 'target',
	alignX: 'center',
	alignY: 'bottom',
	offsetX: 0,
	offsetY: 5,
	showTimeout: 100
});
</script>

<jsp:include page="/tail.jsp" flush="false" />
