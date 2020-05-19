<%--
  Created by IntelliJ IDEA.
  User: fuhao666
  Date: 2020-05-18
  Time: 0:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ERROR</title>

    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $.ajax({
                url:"/show/message",
                success:function (data) {
                    var html="";
                    for(var i=0;i<data.length;i++){
                        html+="<tr>"+
                            "<td>"+i+"</td>"+
                            "<td>"+data[i].messagetext+"</td>"+
                            "<td>"+data[i].messagetime+"</td>"+
                            "<td>"+"Default"+"</td>"+
                            "</tr>";
                    }
                    $("#messagetable").html(html);
                }
            })
            $.ajax({
                url:"/show/news",
                success:function (data) {
                    var html="";
                    for(var i=0;i<data.length;i++){
                        html+="<tr>"+
                            "<td>"+i+"</td>"+
                            "<td>"+data[i].news+"</td>"+
                            "<td>"+data[i].origin+"</td>"+
                            "<td>"+data[i].origin+"</td>"+
                            "</tr>";
                    }
                    $("#newstable").html(html);
                }
            })
        });
    </script>
</head>

<body>
<h1>ERROR!!!!!!</h1>
</body>
</html>
