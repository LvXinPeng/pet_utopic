<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
    <head>

        <meta charset="utf-8">
        <title>Fullscreen Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/supersized.css">
        <link rel="stylesheet" href="css/login.css">

    </head>

    <body>

    <div class="jq22-container" style="padding-top:100px">
        <div class="login-wrap">
            <div class="login-html">
                <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">登录</label>
                <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">注册</label>
                <div class="login-form">
                	<form action="login.do" method="post">
                    <div class="sign-in-htm">
                    	<span style="color: red">${message}</span>
                        <div class="group">
                            <label for="user" class="label">用户名</label>
                            <input id="user" name="username" type="text" class="input">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">密码</label>
                            <input id="pass" name="password" type="password" class="input" data-type="password">
                        </div>
                        <div class="group">
                            <input id="check" type="checkbox" class="check" checked>
                            <label for="check"><span class="icon"></span> 记住我</label>
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="login">
                        </div>
                        </form>
                        <div class="hr"></div>
                        <div class="foot-lnk">
                            <a href="#forgot">忘记密码？</a>
                        </div>
                    </div>
                    <div class="sign-up-htm">
                    <form action="register.do" method="post">
                        <div class="group">
                            <label for="user" class="label">用户名</label>
                            <input id="user" name="username" type="text" class="input">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">密码 </label>
                            <input id="pass" name="password" type="password" class="input" data-type="password">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">确认密码</label>
                            <input id="pass" type="password" class="input" data-type="password">
                        </div>
                        <div class="group">
                            <label for="pass" class="label">邮箱</label>
                            <input id="pass" name="email" type="text" class="input">
                        </div>
                        <div class="group">
                            <input type="submit" class="button" value="注册">
                        </div>

						</form>
                    </div>
                </div>
            </div>
        </div>
    </div>


        <!-- Javascript -->
        <script src="js/jquery-1.8.2.min.js"></script>
        <script src="js/supersized.3.2.7.min.js"></script>
        <script src="js/supersized-init.js"></script>
        <script src="js/scripts.js"></script>

    </body>

</html>

