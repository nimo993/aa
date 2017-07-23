<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>购物车</title>

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
 <div id="cart" class="container-fluid ">
 <div class="col-md-12">
     <div style="width:60%;margin:auto auto;" class="row">
         <h1>${sessionScope.user.username}：购物车.<a class="btn btn-primary" href="mainshop" role="button">继续购物</a>
            <a class="btn btn-danger" href="clear" role="button">清空购物车</a></h1>
           
         <br>
         <table class="table">
                
                <tr>
			<th class="thtd">商品图片</th>
			<th class="thtd">商品编号</th>
			<th class="thtd">商品名称</th>
			<th class="thtd">商品价格</th>
			<th class="thtd">商品数量</th>
			<th class="thtd"><font color="blue">购买</font></th>
			<th class="thtd"><font color="black">增加数量</font></th>
			<th class="thtd"><font color="black">减少数量</font></th>
			<th class="thtd"><font color="red">删除</font></th>
		    </tr>
		    
           <c:forEach items="${requestScope.cart_list }" var="cart">
		   <c:forEach items="${cart.goods }" var="goods">
			<tr>
				<td><img src="image/${goods.image}"></td>
				<td>${goods.id}</td>
				<td>${goods.goods_name}</td>
				<td>${goods.goods_price}</td>
				<td>${cart.count } </td>
			<td>
		<!--  	<a class="btn btn-warning" href="saveorder?goods_id=${goods.id}&count=${cart.count}&user_id=${sessionScope.user.id}&address=${sessionScope.user.address}" role="button">立即购买</a> --> 
			    <form action="saveorder" method="post">
			  <input type="hidden" value="${goods.id}" name="goods_id">
			<input type="hidden" value="${sessionScope.user.id }" name="user_id">
			<input type="hidden" value="${sessionScope.user.address }" name="address">
			 <input type="hidden" value="${cart.count }" name="count">
			 <input type="hidden" value="待发货" name="state">
			 <input type="submit" value="立即购买">
			 </form>
		    </td>
		    <td>
			<a class="btn btn-warning" href="addcart?goods_id=${goods.id}" role="button">增加数量</a>
		    </td>
		    <td>
			<a class="btn btn-warning" href="reduce?goods_id=${goods.id}" role="button">减少数量</a>
		    </td>
		    <td>
			<a class="btn btn-danger" href="remove?goods_id=${goods.id}" role="button">删除</a>
		    </td>
		  </tr>
		</c:forEach>
		
		</c:forEach>		
        </table>
       </div> 
     </div>
 </div>
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>