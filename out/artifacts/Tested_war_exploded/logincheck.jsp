<%@page import="sloth.zhang.UserDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
<%
    String uname=request.getParameter("name");
    String psw=request.getParameter("psw");
    UserDao ud = new UserDao();
    boolean a = ud.LoginCheck(uname, psw);
    if(a){
        out.print("登陆成功");
        if(request.getParameter("auto")!=null&&request.getParameter("auto").equals("is")){
//在客户端保存用户名和密码
            Cookie c =new Cookie("uname",uname);
            c.setMaxAge(60*60*24);//设置cookie数据有效时长
            response.addCookie(c);//向客户端写数据
            out.print(c.getValue());
            Cookie c1 =new Cookie("psw",psw);
            c1.setMaxAge(60*60*24);//设置cookie数据有效时长
            response.addCookie(c1);//向客户端写数据
        }
    }else{
        out.print("登陆失败");
    }
%>
</body>
</html>