<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%-- /* ���� Path ���� �� �⺻�� ���� */ --%>
<%
	// Basic Path 
	String rootPath = request.getContextPath();
	String skinPath =  rootPath + "/skin";
	String modulePath = rootPath + "/module";
	String imagesPath = skinPath + "/images";

	String uploadPath = rootPath + "/file/images";


	// CSS �⺻��.
	String login_display_state = "none";


%>

<%-- /* �α��� ���� Ȯ�� �� DISPLAY ó�� */ --%>
<%				
	String memberId = (String)session.getAttribute("MEMBER_ID");
	boolean login = memberId == null ? false : true;
	
	if(login)
	{		
		login_display_state="inline";
	}
%>