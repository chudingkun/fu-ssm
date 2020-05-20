<%--
  Created by IntelliJ IDEA.
  User: fuhao666
  Date: 2020-05-19
  Time: 4:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $.ajax({
                url:"/show/pmsg",
                success:function (data) {
                    $("#num").html(data.num)
                    var name=data.realname;
                    $("#realname").html(data.realname)
                    $("#realname2").val(name)
                    $("#ppassword").val(data.password)
                    $("#psex").val(data.sex)
                    $("#ptel").val(data.tel)
                    $("#pclassname").val(data.classname)
                    $("#pyuanxi").val(data.yuanxi)
                }
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
                        <a data-target=".navbar-responsive-collapse" data-toggle="collapse" class="btn btn-navbar"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></a> <a href="#" class="brand">预约系统</a>
                        <div class="nav-collapse collapse navbar-responsive-collapse">
                            <ul class="nav">
                                <li class="active">
                                    <a href="#">主页</a>
                                </li>
                                <li>
                                    <a href="#">预约</a>
                                </li>
                                <li>
                                    <a href="#">消息</a>
                                </li>
                                <li class="dropdown">
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">其他<strong class="caret"></strong></a>
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
                                    <a href="#">安徽农业大学</a>
                                </li>
                                <li class="divider-vertical">
                                </li>
                                <li class="dropdown">
                                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">系统设置<strong class="caret"></strong></a>
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
                            <a href="/jsp/index.jsp">首页</a>
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
                        <div class="span12">
                            <div class="row-fluid">
                                <div class="span12">
                                    <ul class="breadcrumb">
                                        <li>
                                            <a href="http://">个人中心</a> <span class="divider">/ <a href="http://">资料</a></span>
                                        </li>
                                        <li>
                                            <span class="divider">/详细</span>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                            <div class="row-fluid">
                                <div class="span1">
                                </div>
                                <div class="span2">
                                    <img alt="140x140" src="../img/fh.gif" class="img-circle" />
                                </div>
                                <div class="span9">
                                    <blockquote>
                                        ID：
                                        <p style="font-weight: 900;color:cornflowerblue" id="num">

                                        </p> <small> <cite></cite></small>
                                    </blockquote>
                                    <blockquote>
                                        姓名：
                                        <p style="font-weight: 900;color:cornflowerblue" id="realname">

                                        </p> <small>学生 <cite>在线</cite></small>
                                    </blockquote>
                                </div>
                            </div>
                            <br/>
                            <div class="row-fluid">
                                <div class="span3">
                                </div>
                                <br/>
                                <div class="span6">
                                    <fieldset class="form-inline">
                                        <form action="/changemsg" method="post">
                                            <div class="form-group">
                                                <label for="prealname2">姓名:  </label>
                                                <input type="text" name="realname" class="form-control"  id="prealname2" required>
                                            </div>  <br/>
                                            <div class="form-group">
                                                <label for="psex">性别:  </label>
                                                <input type="text" name="sex" class="form-control"  id="psex"  required>
                                            </div>  <br/>
                                            <div class="form-group">
                                                <label for="ppassword">密码:  </label>
                                                <input type="password" name="password" class="form-control"  id="ppassword"  required>
                                            </div>  <br/>
                                            <div class="form-group">
                                                <label for="ptel">电话:  </label>
                                                <input type="text" name="tel" class="form-control"  id="ptel"  required>
                                            </div>  <br/>
                                            <div class="form-group">
                                                <label for="pclassname">班级：</label>
                                                <input type="text" name="classname" class="form-control"  id="pclassname"  required>
                                            </div>  <br/>
                                            <div class="form-group">
                                                <label for="pyuanxi">学院：</label>
                                                <input type="text" name="yuanxi" class="form-control"  id="pyuanxi"  required>
                                            </div>  <br/>
                                            <button type="submit" class="btn btn-default">Submit</button>
                                        </form>
                                    </fieldset>
                                </div>
                                <div class="span3">
                                </div>
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
