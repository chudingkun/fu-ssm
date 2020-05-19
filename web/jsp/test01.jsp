<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 引入 Bootstrap -->
<html>
<head>
    <title>Title</title>
<link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>书籍列表 —— 显示所有书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-4 column">
            <a class="btn btn-primary" href="${pageContext.request.contextPath}/ssm/addUser">新增</a>
        </div>
        <div class="col-md-4 column">
            <form action="/ssm/querrygo" method="post" style="float: right" class="form-inline">
                <input type="text" name="queryid" placeholder="请输入查询的id" class="form-control">
                <input type="submit" value="查询" class="btn btn-default">
            </form>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>密码</th>
                    <th></th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="user" items="${list}">
                    <tr>
                        <td>${user.getId()}</td>
                        <td>${user.getName()}</td>
                        <td>${user.getPassword()}</td>
                        <td>
                            <a href="${pageContext.request.contextPath}/ssm/updata?id=${user.getId()}">更改</a> |
                            <a href="${pageContext.request.contextPath}/ssm/delete/?id=${user.getId()}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>
