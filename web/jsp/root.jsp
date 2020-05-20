<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: fuhao666
  Date: 2020-05-19
  Time: 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <link href="https://cdn.bootcss.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script  type="text/javascript">
        $(document).ready(function() {
            $.ajax({
                url: "/root/showstudent",
                success: function (data) {
                    var html = "";
                    console.log(data);
                    for (var i = 0; i < data.length; i++) {
                        html += " <tr class=\"success\">" +
                            "<td>" + data[i].num + "</td>" +
                            "<td>" + data[i].realname + "</td>" +
                            "<td>" + data[i].password + "</td>" +
                            "<td>" + data[i].tel+ "</td>" +
                            "<td>" + data[i].seatnum+ "</td>" +
                            "<td>" + "<a href=\"/root/stuchange?num="+ data[i].num + "\">修改</a>/" +
                                    "<a href=\"/root/studelete?num="+ data[i].num + "\">删除</a>/" +
                                     "<a href=\"/root/studelete?num="+ data[i].num + "\">清空</a>" +
                            "</td>"
                    }
                    $("#stulist").html(html);
                }
            })
            $("#seatlist520").click(function () {
                $.ajax({
                    url: "/root/showseat",
                    success: function (data) {
                        var html1 = "<tr>\n" +
                            "                    <th>楼层</th>\n" +
                            "                    <th>座位号</th>\n" +
                            "                    <th>位置</th>\n" +
                            "                    <th>状态</th>\n" +
                            "                    <th>学号</th>\n" +
                            "                </tr>";
                        var html = "";
                        console.log(data);
                        for (var i = 0; i < data.length; i++) {
                            html += " <tr class=\"success\">" +
                                "<td>" + data[i].floor + "</td>" +
                                "<td>" + data[i].seatnum + "</td>" +
                                "<td>" + data[i].wz + "</td>" +
                                "<td>" + data[i].temp+ "</td>" +
                                "<td>" + data[i].num+ "</td>" +
                                "<td>" + "<a href=\"/root/seatchange?seatnum="+ data[i].seatnum + "\">修改</a>/" +
                                "<a href=\"/root/seatdelete?seatnum="+ data[i].seatnum + "\">删除</a>" +
                                "</td>"
                        }
                        $("#list-head").html(html1);
                        $("#stulist").html(html);
                    }
                })
            })
            $("#gonggaoList").click(function () {
                $.ajax({
                    url: "/root/showmessage",
                    success: function (data) {
                        var html1 = "<tr>\n" +
                            "                    <th>内容</th>\n" +
                            "                    <th>日期</th>\n" +
                            "                </tr>";
                        var html = "";
                        console.log(data);
                        for (var i = 0; i < data.length; i++) {
                            html += " <tr class=\"success\">" +
                                "<td>" + data[i].messagetext + "</td>" +
                                "<td>" + data[i].messagetime + "</td>" +

                                "<td>" + "<a href=\"/root/messagechange?messagetext="+ data[i].messagetext + "\">修改</a>/" +
                                "<a href=\"/root/messagedelete?messagetext="+ data[i].messagetext + "\">删除</a>" +
                                "</td>"
                        }
                        $("#list-head").html(html1);
                        $("#stulist").html(html);
                    }
                })
            })
            $("#newslist").click(function () {
                $.ajax({
                    url: "/root/shownews",
                    success: function (data) {
                        var html1 = "<tr>\n" +
                            "                    <th>内容</th>\n" +
                            "                    <th>来源</th>\n" +
                            "                    <th>时间</th>\n" +
                            "                </tr>";
                        var html = "";
                        console.log(data);
                        for (var i = 0; i < data.length; i++) {
                            html += " <tr class=\"success\">" +
                                "<td>" + data[i].newss + "</td>" +
                                "<td>" + data[i].origin + "</td>" +
                                "<td>" + data[i].time + "</td>" +

                                "<td>" + "<a href=\"/root/newschange?newss="+ data[i].newss + "\">修改</a>/" +
                                "<a href=\"/root/newsdelete?newss="+ data[i].newss + "\">删除</a>" +
                                "</td>"
                        }
                        $("#list-head").html(html1);
                        $("#stulist").html(html);
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
                    <a id="seatlist520">座位表</a>
                </li>
                <li>
                    <a  id="gonggaoList">添加公告</a>
                </li>
                <li>
                    <a  id="newslist">添加新闻</a>
                </li>
                <li>
                    <a href="#">其他</a>
                </li>
                <li class="divider">
                </li>
                <li>
                    <a href="#">帮助</a>
                </li>
            </ul>
        </div>
        <div class="span10">
            <table class="table">
                <thead id="list-head">
                <tr>
                    <th>学号</th>
                    <th>姓名</th>
                    <th>密码</th>
                    <th>电话</th>
                    <th>座位</th>
                </tr>
                </thead>
                <tbody id="stulist">

                </tbody>
            </table>
            <div class="pagination pagination-centered">
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
</body>
</html>
