<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>管理员界面</title>

    <meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">
      <link href="http://www.jq22.com/jquery/bootstrap-3.3.4.css" rel="stylesheet">

    <script src="http://www.jq22.com/jquery/1.11.1/jquery.min.js"></script>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
<script src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
  </head>
 



<body>


<div class="container-fluid">
	<div class="row-fluid">
		<div class="span6"  >
		
<div class="tree well">

<ul>

	<li>

		<span><i class="icon-folder-open"></i> 所有商品</span> <a href="">Goes somewhere</a>

		<ul>

			<li>

				<span><i class="icon-minus-sign"></i> 酒水乳饮</span> <a href="">Goes somewhere</a>

				<ul>

					<li>

						<span><i class="icon-leaf"></i> 酒类</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> RIO鸡尾酒</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>
					<li>

						<span><i class="icon-leaf"></i> 牛奶类</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> 特仑苏</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>
					<li>

						<span><i class="icon-leaf"></i> 矿泉水类</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> 百岁山</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>

				</ul>

			</li>

			<li>

				<span><i class="icon-minus-sign"></i> 生鲜水果</span> <a href="">Goes somewhere</a>

				<ul>

					<li>

						<span><i class="icon-leaf"></i> 生鲜</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> 螃蟹</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>

					<li>

						<span><i class="icon-minus-sign"></i> 水果</span> <a href="">Goes somewhere</a>

						<ul>

							<li>

								<span><i class="icon-minus-sign"></i>桃子</span> <a href="">Goes somewhere</a>

								

							</li>

							

						</ul>

					</li>

					

				</ul>

			</li>
<li>

				<span><i class="icon-minus-sign"></i> 休闲零食</span> <a href="">Goes somewhere</a>

				<ul>

					<li>

						<span><i class="icon-leaf"></i> 薯片</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> 乐事薯片</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>
					<li>

						<span><i class="icon-leaf"></i> 果脯类</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> 猪肉脯</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>
					<li>

						<span><i class="icon-leaf"></i> 主食类</span> <a href="">Goes somewhere</a>
<ul>

							<li>

								<span><i class="icon-minus-sign"></i> 馒头片</span> <a href="">Goes somewhere</a>
</li>
</ul>
					</li>

				</ul>

			</li>

		</ul>

	</li>

	

</ul>

</div>
<a href="orderlist">订单管理</a>
</div>
		<div class="span6" >
		<div style="width:80%;margin:auto ;">
		
		<table class="table " >
		<tr>
                <td width="200px" class="thtd">商品图片</td>
                <td class="thtd">商品编号</td>
                <td class="thtd">商品名称</td>
                <td class="thtd">商品详情</td> 
                <td class="thtd">商品价格</td>
                <td class="thtd">商品数量</td>
               
                 <td class="thtd">删除商品</td>
                  
               
          </tr>  
            <c:forEach items="${requestScope.goods_list}" var="goods">
                 
            <tr>
                <td><img src="image/${goods.image}"></td>
                <td>${goods.id}</td>
                <td>${goods.goods_name}</td> 
                
                <td><font color="red">${goods.remark}</font></td>
                <td>${goods.goods_price}</td>
                <td>${goods.amount}</td>
                
                         
               	
			
			 <td><a class="btn btn-info" href="deletegoods?id=${goods.id}" role="button"></a>删除商品</td> 
			 
               
            </tr>
           
            </c:forEach>
            
            </table>
            <form  action="insertgoods" method="post">
            <table class="table">
        <tr>
           <td>  <input type=file name="image" id="image" onchange="javascript:setImagePreview();"> </td>

           <td>  <input type="text" id="id"  name="id" /></td>
            <td>  <input type="text"  id="goods_name" name="goods_name" /></td>
                
           <td> <input type="text"  id="remark" name="remark" /></td>
                <td><input type="text"  id="goods_price" name="goods_price" /></td>
             <td>   <input type="text" id="amount" name="amount"/><td>
              <td>  <input type="submit" value="添加商品" /> </td>
			</tr></table>
			 </form>
        </div>
		</div>
	</div>
</div>


 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    
 
    <script src="js/scripts.js"></script>


</body>

</html>