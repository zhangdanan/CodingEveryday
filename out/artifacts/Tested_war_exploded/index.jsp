<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Insert title here</title>
</head>
<body>
<%
  String uname="";
  String psw="";
  if(request.getCookies()!=null){
//得到cookie数据
  Cookie[] cs=request.getCookies();
  for(Cookie c:cs){
//从cookie中获取用户名
  if(c.getName().equals("uname")){
  uname=c.getValue();
  }
//从cookie中获取密码
  if(c.getName().equals("psw")){
  psw=c.getValue();
  }
  }
  }
  %>
<form action="logincheck.jsp" method="get">
    用户名:<input type="text" name="name" value="<%=uname %>"/><br/>
    密    码:<input type="password" name="psw" value="<%=psw %>"/><br/>
    <input type="checkbox" name="auto" value="is">是否记住密码<br/>
    <input type="submit" value="登录"/>
    </form>
</body>
</html>
