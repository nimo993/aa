<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>登录页面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
     <script src="js/jquery.cookie.js" type="text/javascript"></script>
    
   
  </head>
  <body>

    <div class="container-fluid " id="container">
	<div class="row">
		<div class="col-md-8">
			<form class="form-horizontal" role="form" action="login" method="post">
				<div class="form-group">
					 
					<label for="inputEmail3" class="col-sm-2 control-label">
						E-mail:
					</label>
					<div class="col-sm-10">
						<input type="email" name="loginname" class="form-control" id="loginname">
			
					</div>
				</div>
				<div class="form-group">
					 
					<label for="inputPassword3" class="col-sm-2 control-label">
						Password:
					</label>
					<div class="col-sm-10">
						<input type="password" name="password" class="form-control" id="password">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							 
							<label>
								<input type="checkbox" id="checkbox" >
								<font color="yellow">记住我</font>
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						 
						<input type="submit" class="btn btn-default" value="登录" onclick="Save()">
							
						<a href="register">还没有账号？戳我注册！</a>
						<button type="submit" formaction="find">找回密码</button>
						<div style="text-align:center;"><font color="red">${requestScope.message }</font></div>
					</div>
		
				
				</div>
			</form>
		</div>
		<div class="col-md-4">
		<img alt="Bootstrap Image Preview" src="http://lorempixel.com/140/140/">	
		</div>
	</div>
</div>
   
  </body>
</html>