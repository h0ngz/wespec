<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>���� ���ε�</title>
</head>
<body>

<h3>���� ���ε� POST ��û: Multipart ���ڵ�</h3>
<p>
�Է����� method�� POST���� �����ϰ�,<br>
enctype �Ӽ��� ���� multipart/form-data�� �����մϴ�.
</p>
<form action="FileUpload" method="post" enctype="multipart/form-data">
����: <input type="file" name="photo"><br> 
����: <textarea name="description" cols="50" rows="3"></textarea><br>
      <input type="submit" value="�߰�"><br>
</form> 
</body>
</html>