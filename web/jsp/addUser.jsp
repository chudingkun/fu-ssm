
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <small>新增用户</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="/ssm/addUserReal" method="post">
        <div class="form-group">
            <label for="userid">用户id</label>
            <input type="text" name="id" class="form-control" id="userid" required >
        </div>
        <div class="form-group">
            <label for="username">用户名称</label>
            <input type="text" name="name" class="form-control" id="username"  required>
        </div>
        <div class="form-group">
            <label for="userpwd">用户密码</label>
            <input type="text" name="password" class="form-control" id="userpwd"  required>
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>




</div>
</body>
</html>
