<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>我的收藏</title>
    <!-- Bootstrap -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
 <link href="css/style.css" rel="stylesheet"> 
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    
</head>
<body>
 <div style="width:60%;margin:auto auto;">
         <h1>${sessionScope.user.username}：收藏夹.<a class="btn btn-primary" href="defaultForm" role="button">继续购物</a>
            <a class="btn btn-danger" href="clearcollect" role="button">全选清空</a></h1>
         <br>
         <table class="table table-hover">  
                <tr>
			<th class="thtd">商品图片</th>
			<th class="thtd">商品编号</th>
			<th class="thtd">商品名称</th>
			<th class="thtd">商品价格</th>
			<th class="thtd"><font color="blue">购买</font></th>
			<th class="thtd"><font color="red">取消收藏</font></th>
		    </tr>
		    
           <c:forEach items="${requestScope.collect_list }" var="collect">
		   <c:forEach items="${collect.goods }" var="goods">
			<tr>
				<td><img src="image/${goods.image}"></td>
				<td>${goods.id}</td>
				<td>${goods.goods_name}</td>
				<td>${goods.goods_price}</td>
			<td>
			<a class="btn btn-info" href="saveorder?goods_id=${goods.id}" role="button">购买</a>
		    </td>
		    <td>
			<a class="btn btn-danger" href="removecollect?goods_id=${goods.id}" role="button">取消收藏</a>
		    </td>
		  </tr>
		</c:forEach>	
		</c:forEach>		
        </table>

 </div>
</body>
</html>