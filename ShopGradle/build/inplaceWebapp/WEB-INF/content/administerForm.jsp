<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />


<title>管理员界面</title>

<meta name="description" content="Source code generated using layoutit.com">
    <meta name="author" content="LayoutIt!">


<!--图标样式-->

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<style>
.thtd{
        color:coral;
        font-family:华文细黑;
        font-size: 16px;
        padding: 5px 15px;
        }
        table {
	border-collapse: collapse;
	border-spacing: 0;
	border-left: 1px solid #888;
	border-top: 1px solid #888;
	background: #efefef;
}
th, td {
	border-right: 1px solid #888;
	border-bottom: 1px solid #888;
	padding: 5px 15px;
}

th {
	font-weight: bold;
	background: #ccc;
}
    </style>



<!--主要样式-->

<link rel="stylesheet" type="text/css" href="css/style.css" />



<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>

<script type="text/javascript">

$(function(){

    $('.tree li:has(ul)').addClass('parent_li').find(' > span').attr('title', 'Collapse this branch');

    $('.tree li.parent_li > span').on('click', function (e) {

        var children = $(this).parent('li.parent_li').find(' > ul > li');

        if (children.is(":visible")) {

            children.hide('fast');

            $(this).attr('title', 'Expand this branch').find(' > i').addClass('icon-plus-sign').removeClass('icon-minus-sign');

        } else {

            children.show('fast');

            $(this).attr('title', 'Collapse this branch').find(' > i').addClass('icon-minus-sign').removeClass('icon-plus-sign');

        }

        e.stopPropagation();

    });

});

</script>



</head>

<body>


<div class="container-fluid">
	<div class="row-fluid">
		<div class="span6"  >
		
<div class="tree well">

<ul>

	<li>

		<span><i class="icon-folder-open"></i> Parent</span> <a href="">Goes somewhere</a>

		<ul>

			<li>

				<span><i class="icon-minus-sign"></i> Child</span> <a href="">Goes somewhere</a>

				<ul>

					<li>

						<span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>

					</li>

				</ul>

			</li>

			<li>

				<span><i class="icon-minus-sign"></i> Child</span> <a href="">Goes somewhere</a>

				<ul>

					<li>

						<span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>

					</li>

					<li>

						<span><i class="icon-minus-sign"></i> Grand Child</span> <a href="">Goes somewhere</a>

						<ul>

							<li>

								<span><i class="icon-minus-sign"></i> Great Grand Child</span> <a href="">Goes somewhere</a>

								<ul>

									<li>

										<span><i class="icon-leaf"></i> Great great Grand Child</span> <a href="">Goes somewhere</a>

									</li>

									<li>

										<span><i class="icon-leaf"></i> Great great Grand Child</span> <a href="">Goes somewhere</a>

									</li>

								 </ul>

							</li>

							<li>

								<span><i class="icon-leaf"></i> Great Grand Child</span> <a href="">Goes somewhere</a>

							</li>

							<li>

								<span><i class="icon-leaf"></i> Great Grand Child</span> <a href="">Goes somewhere</a>

							</li>

						</ul>

					</li>

					<li>

						<span><i class="icon-leaf"></i> Grand Child</span> <a href="">Goes somewhere</a>

					</li>

				</ul>

			</li>

		</ul>

	</li>

	<li>

		<span><i class="icon-folder-open"></i> Parent2</span> <a href="">Goes somewhere</a>

		<ul>

			<li>

				<span><i class="icon-leaf"></i> Child</span> <a href="">Goes somewhere</a>

			</li>

		</ul>

	</li>

</ul>

</div>

</div>
		<div class="span6" >
		<div style="width:80%;margin:auto auto;">
		<table class="table table-hover" >
		<tr>
                <td width="200px" class="thtd">商品图片</td>
                <td class="thtd">商品编号</td>
                <td class="thtd">商品名称</td>
                <td class="thtd">商品详情</td> 
                <td class="thtd">商品价格</td>
                <td class="thtd">商品数量</td>
                <td class="thtd">商品发货</td>
               
          </tr>  
            <c:forEach items="${requestScope.order_list}" var="order">
            <c:forEach items="${order.goods }" var="goods">      
            <tr>
                <td><img src="image/${goods.image}"></td>
                <td>${goods.goods_id}</td>
                <td>${goods.goods_name}</td> 
                
                <td><font color="red">￥${goods.remark}</font></td>
                <td>${goods.goods_price}</td>
                <td>${goods.amount}</td>
                
                         
               	
			<td><a class="btn btn-info" href="begin?goods_id=${goods.goods_id}" role="button"></a>发货</td> 
			 
			 
               
            </tr>
            </c:forEach>
            </c:forEach>
        </table>
        </div>
		</div>
	</div>
</div>


 <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>


</body>

</html>