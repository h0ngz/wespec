<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/common/common.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/head.jsp" flush="false" />

<article>
	<section>
		<div class="row">
			<div class="col-md-12" id="jumbo">
				<div class="jumbotron">
               		<h1>What is WESPEC</h1>
               		<p>WESPEC���� ����� �̷��� �����غ�����.</p>
               		<p><a class="btn btn-default btn-lg" role="button" href="<%=request.getContextPath() %>/Register">Register</a></p>
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
							<div class="col-sm-6 col-md-3"> 
								<div class="thumbnail">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img data-src="holder.js/100%x180" src="skin/images/tumb.jpg" class="img-responsive img-circle" alt="Responsive image">
									</a>
									<div class="caption">									
										<h3><a href="<%=rootPath %>/Open/${profile.memberId}">${profile.profileName}</a></h3>
										<p>${profile.profileGrade }�г� /${profile.primarySpec }</p>										
									</div>
								</div>
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
							<div class="col-sm-6 col-md-3"> <!-- ���� ��� 1-->
								<div class="thumbnail">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img data-src="holder.js/100%x180" src="skin/images/tumb.jpg" class="img-responsive img-circle" alt="Responsive image">
									</a>
									<div class="caption">									
										<h3><a href="<%=rootPath %>/Open/${profile.memberId}">${profile.profileName}</a></h3>
										<p>${profile.profileGrade }�г� /${profile.primarySpec }</p>								
									</div>
								</div>
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
							<div class="col-sm-6 col-md-3"> <!-- ���� ��� 1-->
								<div class="thumbnail">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img data-src="holder.js/100%x180" src="skin/images/tumb.jpg" class="img-responsive img-circle" alt="Responsive image">
									</a>
									<div class="caption">									
										<h3><a href="<%=rootPath %>/Open/${profile.memberId}">${profile.profileName}</a></h3>
										<p>${profile.profileGrade }�г� /${profile.primarySpec }</p>								
									</div>
								</div>
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
							<div class="col-sm-6 col-md-3"> <!-- ���� ��� 1-->
								<div class="thumbnail">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img data-src="holder.js/100%x180" src="skin/images/tumb.jpg" class="img-responsive img-circle" alt="Responsive image">
									</a>
									<div class="caption">									
										<h3><a href="<%=rootPath %>/Open/${profile.memberId}">${profile.profileName}</a></h3>
										<p>${profile.profileGrade }�г� /${profile.primarySpec }</p>								
									</div>
								</div>
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
							<div class="col-sm-6 col-md-3"> <!-- ���� ��� 1-->
								<div class="thumbnail">
									<a href="<%=rootPath %>/Open/${profile.memberId}">
										<img data-src="holder.js/100%x180" src="skin/images/tumb.jpg" class="img-responsive img-circle" alt="Responsive image">
									</a>
									<div class="caption">									
										<h3><a href="<%=rootPath %>/Open/${profile.memberId}">${profile.profileName}</a></h3>
										<p>${profile.profileGrade }�г� /${profile.primarySpec }</p>									
									</div>
								</div>
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