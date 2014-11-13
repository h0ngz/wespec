<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/head.jsp" flush="false" />

<article>
	<section>
		<div class="row">
			<div class="col-md-6" id="jumbo">
				<div class="jumbotron">
               		<h1>Hello,World!</h1>
               		<p> &nbsp;WESPEC���� ����� �̷��� �����غ�����.</p>
               		<p class="text-center"><a class="btn btn-primary btn-lg" role="button" href="<%=request.getContextPath() %>/Register">������/�̷� ���</a></p>
             	</div>                            
			</div>
			<div class="col-md-6" id="jumbo">
				<div class="jumbotron">
					<!--  prograssbar -->
					<h1>������Ʈ ���൵</h1>
					<div class="progress">
					  <div class="progress-bar progress-bar-success" style="width: 20%">
					    <span class="sr-only">20% Complete (success)</span>
					  </div>
					  <div class="progress-bar progress-bar-warning progress-bar-striped" style="width: 35%">
					    <span class="sr-only">35% Complete (warning)</span>
					  </div>
					  <div class="progress-bar progress-bar-danger" style="width: 30%">
					    <span class="sr-only">30% Complete (danger)</span>
					  </div>
					</div>
					
					
					<p class="text-center"><a class="btn btn-default btn-lg" role="button" href="https://github.com/h0ngz/wespec/commits/master" target="_BLANK">Go Github</a></p>
				</div>
			</div>
		</div>
	</section>

	<section>
		<div class="row">
			<div class="col-md-12">
			<!-- List toggle btn -->         
				<ul class="nav nav-tabs" id="listTab">
                	<li><a href="#tab0" data-toggle="tab">��ü�г�</a></li>
                	<li><a href="#tab4" data-toggle="tab">4�г�</a></li>
                	<li><a href="#tab3" data-toggle="tab">3�г�</a></li>
                	<li><a href="#tab2" data-toggle="tab">2�г�</a></li>
                	<li><a href="#tab1" data-toggle="tab">1�г�</a></li>
              	</ul>

	            <!-- LIST SECTION : jsp �ڵ�� ������ �κ�-->
				<div class="tab-content">
					<!-- ��ü �л� ����Ʈ --> 
					<div class="tab-pane active" id="tab0">
	               		<p>&nbsp;</p> 
	               		<div class="row text-center">	
	               		<c:forEach var="profile" items="${profiles}" varStatus="status">   
							<div class="col-xs-6 col-sm-4 col-md-3"> 					
								<div class="person">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img src="${profile.profilePhotoURL}" class="img-responsive img-rounded" alt="Profile image">
										<h2>${profile.profileName}</h2>
										<h3>${profile.profileGrade}�г�  ${profile.primarySpec}</h3>				
										<span>������ ����&nbsp;&raquo;</span>
									</a>
								</div><!-- /.person -->	
							</div>
						</c:forEach>												
						</div>						
					</div>
					<!-- 4�г� �л� ����Ʈ --> 
					<div class="tab-pane active" id="tab4">
	              		<p>&nbsp;</p>              		
	              		<div class="row text-center">
						<c:forEach var="profile" items="${profiles}">
						<c:if test="${profile.profileGrade eq 4}">
							<div class="col-xs-6 col-sm-4 col-md-3"> 					
								<div class="person">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img src="${profile.profilePhotoURL}" class="img-responsive img-rounded" alt="Profile image">
										<h2>${profile.profileName}</h2>
										<h3>${profile.profileGrade}�г�  ${profile.primarySpec}</h3>				
										<span>������ ����&nbsp;&raquo;</span>
									</a>
								</div><!-- /.person -->	
							</div>
						</c:if>					
						</c:forEach> 
						</div>
					</div>
					
					<!-- 3�г� �л� ����Ʈ --> 
					<div class="tab-pane active" id="tab3">
	              		<p>&nbsp;</p>              		
	              		<div class="row text-center">
						<c:forEach var="profile" items="${profiles}">
						<c:if test="${profile.profileGrade eq 3}">						
							<div class="col-xs-6 col-sm-4 col-md-3"> 					
								<div class="person">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img src="${profile.profilePhotoURL}" class="img-responsive img-rounded" alt="Profile image">
										<h2>${profile.profileName}</h2>
										<h3>${profile.profileGrade}�г�  ${profile.primarySpec}</h3>				
										<span>������ ����&nbsp;&raquo;</span>
									</a>
								</div><!-- /.person -->	
							</div>
						</c:if>					
						</c:forEach> 
						</div>
					</div>
					
					<!-- 2�г� �л� ����Ʈ --> 
					<div class="tab-pane active" id="tab2">
	              		<p>&nbsp;</p>              		
	              		<div class="row text-center">
						<c:forEach var="profile" items="${profiles}">
						<c:if test="${profile.profileGrade eq 2}">
							<div class="col-xs-6 col-sm-4 col-md-3"> 					
								<div class="person">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img src="${profile.profilePhotoURL}" class="img-responsive img-rounded" alt="Profile image">
										<h2>${profile.profileName}</h2>
										<h3>${profile.profileGrade}�г�  ${profile.primarySpec}</h3>				
										<span>������ ����&nbsp;&raquo;</span>
									</a>
								</div><!-- /.person -->	
							</div>					
						</c:if>					
						</c:forEach> 
						</div>
					</div>
					
					<!-- 1�г� �л� ����Ʈ --> 
					<div class="tab-pane active" id="tab1">
	              		<p>&nbsp;</p>              		
	              		<div class="row text-center">
						<c:forEach var="profile" items="${profiles}">
						<c:if test="${profile.profileGrade eq 1}">
							<div class="col-xs-6 col-sm-4 col-md-3"> 					
								<div class="person">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img src="${profile.profilePhotoURL}" class="img-responsive img-rounded" alt="Profile image">
										<h2>${profile.profileName}</h2>
										<h3>${profile.profileGrade}�г�  ${profile.primarySpec}</h3>				
										<span>������ ����&nbsp;&raquo;</span>
									</a>
								</div><!-- /.person -->	
							</div>	
						</c:if>					
						</c:forEach> 
						</div>
					</div>	
					<!--  �л� ����Ʈ ��ü �� -->
					<script>
						  $(function () {
							$('#listTab a:first').tab('show')
						  })
					</script>
	
				</div>              
			</div>
		</div>
	</section>      
</article>
<jsp:include page="/tail.jsp" flush="false" />