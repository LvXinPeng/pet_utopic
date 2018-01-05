<%@page import="com.pet_utopic.model.PetForKeep"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>填写信息</title>
    <link href="css/demo.css" rel="stylesheet" type="text/css">
    <!--Framework-->
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="js/jquery-ui.js" type="text/javascript"></script>
</head>
<body>
    
    <section id="getintouch" class="rotateInUpLeft animated">
        <div class="container" style="border-bottom: 0;">
            <h1>
                <span>添加信息</span>
            </h1>
        </div>
        <div class="container">
            <form class="contact" action="../add.do" method="post" id="form" enctype="multipart/form-data">
            <div class="row clearfix">
                <div class="lbl">
                    <label for="name">
                        宠物名</label>
                </div>
               
                <div class="ctrl">
                    <input type="text" id="petName" name="petName" data-required="true" data-validation="text"
                        data-msg="Invalid Name" value="${param.petName }" placeholder="">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        宠物品种</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="variety" id="variety" value="${param.variety }" placeholder="Ex: 阿拉斯加雪撬犬">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        开始时间</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="startDate" id="startDate" value="${param.startDate }" placeholder="Ex: 20171220">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        结束时间</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="endDate" id="endDate" value="${param.endDate }" placeholder="Ex: 20171225">
                </div>
            </div> 
			<div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        价格</label>
                </div>
                <div class="ctrl">
                    <input type="text" name="price" id="price" value="${param.price }" placeholder="Ex: 1000元">
                </div>
            </div>
			<div class="row clearfix">
                <div class="lbl">
                    <label for="subject">
                        宠物照片</label>
                </div>
                <div class="ctrl">
                    <input type="file" name="photo" id="photo" ">
                </div>
            </div>
            <div class="row clearfix">
                <div class="lbl">
                    <label for="message">
                        宠物简介</label>
                </div>
                <div class="ctrl">
                    <textarea id="petInfo"  name="petInfo" rows="6" cols="10" >${param.petInfo }</textarea>
                </div>
            </div>
            <div class="row  clearfix">
                <div class="span10 offset2">
                    <input type="submit" name="submit" id="submit" class="submit" value="确认提交">
                </div>
            </div>
            </form>
        </div>
    </section>
</body>
</html>
