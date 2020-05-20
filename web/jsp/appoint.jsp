
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>农大图书馆预约系统</title>
    <link href="https://cdn.bootcss.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
       <script type="text/javascript">
           $(document).ready(function(){
               $.ajax({
                   url:"/show/seat",
                   success:function (data) {
                            var html="";
                            console.log(data);
                            for(var i=0;i<data.length;i++){
                                html+=" <tr class=\"info\">"+
                                    "<td>"+data[i].floor+"</td>"+
                                    "<td>"+data[i].wz+"</td>"+
                                    "<td>"+data[i].seatnum+"</td>"+
                                    "<td>"+data[i].temp+"</td>"+
                                    "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                            }
                            $("#seattable").html(html);

                   }
               })
               $("#seattable3").click(function () {
                   $.ajax({
                       url:"/show/seat3",
                       success:function (data) {
                           var html="";
                           console.log(data);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr class=\"info\">"+
                                   "<td>"+data[i].floor+"</td>"+
                                   "<td>"+data[i].wz+"</td>"+
                                   "<td>"+data[i].seatnum+"</td>"+
                                   "<td>"+data[i].temp+"</td>"+
                                   "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                           }
                           $("#seattable").html(html);

                       }
                   })
               })
               $("#seattable4").click(function () {
                   $.ajax({
                       url:"/show/seat4",
                       success:function (data) {
                           var html="";
                           console.log(data);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr class=\"info\">"+
                                   "<td>"+data[i].floor+"</td>"+
                                   "<td>"+data[i].wz+"</td>"+
                                   "<td>"+data[i].seatnum+"</td>"+
                                   "<td>"+data[i].temp+"</td>"+
                                   "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                           }
                           $("#seattable").html(html);

                       }
                   })
               })
               $("#seattable5").click(function () {
                   $.ajax({
                       url:"/show/seat5",
                       success:function (data) {
                           var html="";
                           console.log(data);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr class=\"info\">"+
                                   "<td>"+data[i].floor+"</td>"+
                                   "<td>"+data[i].wz+"</td>"+
                                   "<td>"+data[i].seatnum+"</td>"+
                                   "<td>"+data[i].temp+"</td>"+
                                   "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                           }
                           $("#seattable").html(html);

                       }
                   })
               })
               $("#seattable6").click(function () {
                   $.ajax({
                       url:"/show/seat6",
                       success:function (data) {
                           var html="";
                           console.log(data);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr class=\"info\">"+
                                   "<td>"+data[i].floor+"</td>"+
                                   "<td>"+data[i].wz+"</td>"+
                                   "<td>"+data[i].seatnum+"</td>"+
                                   "<td>"+data[i].temp+"</td>"+
                                   "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                           }
                           $("#seattable").html(html);

                       }
                   })
               })
               $("#seattable7").click(function () {
                   $.ajax({
                       url:"/show/seat7",
                       success:function (data) {
                           var html="";
                           console.log(data);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr class=\"info\">"+
                                   "<td>"+data[i].floor+"</td>"+
                                   "<td>"+data[i].wz+"</td>"+
                                   "<td>"+data[i].seatnum+"</td>"+
                                   "<td>"+data[i].temp+"</td>"+
                                   "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                           }
                           $("#seattable").html(html);

                       }
                   })
               })
               $("#seattable8").click(function () {
                   $.ajax({
                       url:"/show/seat8",
                       success:function (data) {
                           var html="";
                           console.log(data);
                           for(var i=0;i<data.length;i++){
                               html+=" <tr class=\"info\">"+
                                   "<td>"+data[i].floor+"</td>"+
                                   "<td>"+data[i].wz+"</td>"+
                                   "<td>"+data[i].seatnum+"</td>"+
                                   "<td>"+data[i].temp+"</td>"+
                                   "<td>"+"<a href=\"/myappoint/ap?seatnum="+data[i].seatnum+"\">预约</a>"+"</td>"
                           }
                           $("#seattable").html(html);

                       }
                   })
               })

           })

       </script>

</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="navbar navbar-inverse">
                <div class="navbar-inner">
                    <div class="container-fluid">
                        <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a> <a href="#" class="brand">网站名</a>
                        <div class="nav-collapse collapse navbar-responsive-collapse">
                            <ul class="nav">
                                <li class="active">
                                    <a href="#">主页</a>
                                </li>

                                <li>
                                    <a href="#">链接</a>
                                </li>
                                <li>
                                    <a href="#">链接</a>
                                </li>
                                <li class="dropdown">
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">下拉导航1</a>
                                        </li>
                                        <li>
                                            <a href="#">下拉导航2</a>
                                        </li>
                                        <li>
                                            <a href="#">其他</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li class="nav-header">
                                            标签
                                        </li>
                                        <li>
                                            <a href="#">链接1</a>
                                        </li>
                                        <li>
                                            <a href="#">链接2</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                            <ul class="nav pull-right">
                                <li>
                                    <a href="#">右边链接</a>
                                </li>
                                <li class="divider-vertical">
                                </li>
                                <li class="dropdown">
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">下拉菜单<strong class="caret"></strong></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">下拉导航1</a>
                                        </li>
                                        <li>
                                            <a href="#">下拉导航2</a>
                                        </li>
                                        <li>
                                            <a href="#">其他</a>
                                        </li>
                                        <li class="divider">
                                        </li>
                                        <li>
                                            <a href="#">链接3</a>
                                        </li>
                                    </ul>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>

            </div>
            <div class="row-fluid">
                <div class="span2">
                    <ul class="nav nav-list well">
                        <li class="nav-header">
                            <a href="#">首页</a>
                        </li>
                        <li>
                            <a href="/jsp/appoint.jsp">预约中心</a>
                        </li>
                        <li>
                            <a href="/myappoint.jsp">我的预约</a>
                        </li>
                        <li>
                            <a href="/jsp/pmessage.jsp">资料</a>
                        </li>
                        <li>
                            <a href="#">消息</a>
                        </li>
                        <li>
                            <a href="#">留言板</a>
                        </li>
                        <li>
                            <a href="#">设置</a>
                        </li>
                        <li class="divider">
                        </li>
                        <li>
                            <a href="#">帮助</a>
                        </li>
                    </ul>
                </div>
                <div class="span10">
                    <div class="row-fluid">
                        <div class="span6">
                            <ul class="nav nav-tabs">
                                <li class="active">
                                    <a href="#">预约</a>
                                </li>
                                <li>
                                    <a href="#">我的预约</a>
                                </li>
                                <li class="disabled">
                                    <a href="#">信息</a>
                                </li>
                            </ul>
                        </div>
                        <div class="span6">
                            <form class="form-search form-inline">
                                <p style="margin-left:200px;">
                                    <input class="input-medium search-query" type="text" placeholder="请输入查询的座位号 "/><button class="btn" type="submit">查找</button>
                                </p>
                            </form>
                        </div>
                    </div>
                    <div class="row-fluid">
                        <div class="span12">
                            <div class="tabbable" id="tabs-773654">
                                <ul class="nav nav-tabs">
                                    <li class="active">
                                        <a data-toggle="tab" id="seattable2" href="/jsp/appoint.jsp">二层</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab"  id="seattable3">三层</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" id="seattable4">四层</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" id="seattable5" >五层</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" id="seattable6" >六层</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" id="seattable7">七层</a>
                                    </li>
                                    <li>
                                        <a data-toggle="tab" id="seattable8">八层</a>
                                    </li>
                                </ul>
                            </div>
                            <table class="table table-hover table-striped">
                                <thead>
                                <tr>
                                    <th>楼层</th>
                                    <th>位置</th>
                                    <th>座位编号</th>
                                    <th>状态</th>
                                    <th>操作</th>
                                </tr>
                                </thead>
                                <tbody id="seattable">

                                </tbody>
                            </table><hr class="table-hover table-striped" />
                            <p class="table-hover table-striped">
                            </p>
                            <div class="pagination pagination-large pagination-centered">
                                <ul>
                                    <li>
                                        <a href="#">上一页</a>
                                    </li>
                                    <li>
                                        <a href="#">1</a>
                                    </li>
                                    <li>
                                        <a href="#">2</a>
                                    </li>
                                    <li>
                                        <a href="#">3</a>
                                    </li>
                                    <li>
                                        <a href="#">4</a>
                                    </li>
                                    <li>
                                        <a href="#">5</a>
                                    </li>
                                    <li>
                                        <a href="#">下一页</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
