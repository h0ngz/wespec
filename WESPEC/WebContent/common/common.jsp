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
%>

<%-- /* �α��� ���� Ȯ�� �� DISPLAY ó�� */ --%>
<%				
	String memberId = (String)session.getAttribute("memberId");
	boolean login = memberId == null ? false : true;
	String photoUrl = (String)session.getAttribute("photoUrl");
	String memberGroup = (String)session.getAttribute("memberGroup");
%>
<%-- /* ���� ���� ����  */ --%>
<%
	String tooltip_year ="<strong>�⵵�� �Է��ϼ��� (���� 4�ڸ�)</strong><br>��) 2014";
	String tooltip_month ="<strong>���� �Է��ϼ��� (���� 2�ڸ�)</strong><br>��) 05";
%>

<%--/* ����Ʈ����ߴɷ� üũ�ڽ�����Ʈ */ --%>
<%	
	String[] languageList = {
			"C",			"C++",			"Python",			"Java",
			"Visual Basic",	"Lisp",			"PHP",				"ASP",
			"JSP",			"C#",			"Ruby",				"HTML",
			"Javascript",	"Node.js",		"Android",			"Oracle",
			"Swift",		"Objective-C"
			};
%>

<%--/* ��Ű���� */ --%>
<%	
	Cookie[] cookies = request.getCookies();
	String rememberId = "";
	
	if(cookies!=null)
	{
		for(int i=0; i<cookies.length; i++)
		{
			if(cookies[i].getName().equals("rememberId"))
				rememberId = cookies[i].getValue();
		}
	}
%>