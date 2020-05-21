<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script  type="text/javascript">


    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <div class="navbar navbar-inverse">
                <div class="navbar-inner">
                    <div class="container-fluid">
                        <a class="btn btn-navbar" data-target=".navbar-responsive-collapse" data-toggle="collapse"></a> <a class="brand" href="#">预约系统</a>
                        <div class="nav-collapse collapse navbar-responsive-collapse">
                            <ul class="nav">
                                <li class="active">
                                    <a href="#">主管理页面</a>
                                </li>
                                <li>
                                    <a href="#"></a>
                                </li>
                                <li>
                                    <a href="#"></a>
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#"></a>
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
                                    <a href="http://">安徽农业大学</a>
                                </li>
                                <li class="divider-vertical">
                                </li>
                                <li class="dropdown">
                                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">系统设置</a>
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
        </div>
    </div>
    <div class="row-fluid">
        <div class="span2">
            <ul class="nav nav-list">
                <li class="nav-header">
                    <a href="/jsp/root.jsp">学生表</a>
                </li>
                <li>
                    <a href="/jsp/root.jsp">座位表</a>
                </li>
                <li>
                    <a href="/jsp/root.jsp">添加公告</a>
                </li>
                <li>
                    <a href="/jsp/root.jsp">添加新闻</a>
                </li>
                <li>
                    <a href="/jsp/root.jsp">设置</a>
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
                        <div class="span4">
                        </div>
                        <div class="span4">
                            <blockquote>
                                咨询
                                <p style="font-weight: 900;color:cornflowerblue" id="num">
                                </p> <small> <cite></cite></small>
                            </blockquote>
                            <form action="/root/tonewschange" method="post">
                                <div class="form-group">
                                    <label for="newss">内容：  </label>
                                    <textarea type="text" name="newss" class="form-control"  style="width: 60%;height: 10%" id="newss"  required>${news.getNewss()}</textarea>
                                </div>  <br/>
                                <div class="form-group">
                                    <label for="origin">时间：</label>
                                    <input type="text" name="origin" class="form-control"  id="origin" value="${news.getOrigin()}" required>
                                </div>  <br/>
                                <div class="form-group">
                                    <label for="time">时间：</label>
                                    <input type="text" name="time" class="form-control"  id="time" value="${news.getTime()}" required>
                                </div>  <br/>
                                <button type="submit" class="btn btn-default">Submit</button>
                            </form>
                        </div>
                        <div class="span4">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
