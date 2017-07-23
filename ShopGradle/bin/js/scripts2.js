<span style="white-space:pre">        </span>$(function () {  
                                  
                // 实例化树菜单  
                $("#tree").tree({  
                    url:'getNodesById.do?id=1',//请求路径，id为根节点的id  
                    onLoadSuccess:function(node,data){  
                         var tree = $(this);  
                         if(data){  
                             $(data).each(function(index,d) {  
                                 if (this.state=='closed') {  
                                     tree.tree('expandAll');  
                                 }  
                             });  
                         }  
                    }  
                      
                });  