<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="model.dao.AccountDao" %>
<%
	AccountDao accountDao = new AccountDao();
	String id = (String)session.getAttribute("memberId");
	accountDao.updatePassword(id,request.getParameter("password"));				
%>
<script>
	alert('���������� ����Ǿ����ϴ�.'); 
	history.go(-1);
</script>
		