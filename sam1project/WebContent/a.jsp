<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	jsp 테스트
	<br>
	<%
	String id = request.getParameter("id");
	String size = request.getParameter("size");
	System.out.println("id : " + id);
	String[] tel = request.getParameterValues("tel");

	String sTel ="";
	if(tel == null){
		sTel ="입력값없음";
	}else{
		for(int i=0; i < tel.length; i++){
		sTel += tel[i];
		}
	}

%>
	id :
	<%= id %><br> size :
	<%= size %><br> sTel :
	<%= sTel %><br>


</body>
</html>