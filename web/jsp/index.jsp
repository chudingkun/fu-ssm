<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>农大图书馆预约系统</title>
    <link href="https://cdn.bootcss.com/bootstrap/2.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/3.4.1/jquery.js"></script>

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
                    <a href="/jsp/index.jsp">主页</a>
                  </li>
                  <li>
                    <a href="/jsp/appoint.jsp">预约</a>
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
                    <a href="https://www.ahau.edu.cn/">安徽农业大学</a>
                  </li>
                  <li class="divider-vertical">
                  </li>
                  <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">欢迎登陆！<p >${realname}</p><strong class="caret"></strong></a>
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
            <ul class="nav nav-list">
              <li class="nav-header">
                <p>
                  <strong><a href="/jsp/index.jsp">首页</a></strong>
                </p>
              </li>
              <li>
                <a href="/jsp/appoint.jsp">预约中心</a>
              </li>
              <li>
                <a href="/mypoint">我的预约</a>
              </li>
              <li>
                <a href="">消息</a>
              </li>
              <li>
                <a href="/person">资料</a>
              </li>
              <li>
                <a href="">留言板</a>
              </li>
              <li>
                <a href="#">设置</a>
              </li>

              <li class="divider"></li>
              <li><a href="/help">帮助</a></li>
            </ul>
          </div>
          <div class="span10">
            <ul class="breadcrumb">
              <li><a href="#">主页</a> <span class="divider">/ <a href="http://“”">设置</a></span></li>
              <li><span class="divider">/</span></li>
              <li class="active">主题</li>
            </ul>
            <div class="carousel slide" id="carousel-115888">
              <ol class="carousel-indicators">
                <li data-slide-to="0" data-target="#carousel-115888"></li>
                <li data-slide-to="1" data-target="#carousel-115888"></li>
                <li data-slide-to="2" data-target="#carousel-115888" class="active"></li>
              </ol>
              <div class="carousel-inner">
                <div class="item">
                  <img alt="" src="../img/1.jpg" />
                  <div class="carousel-caption">
                    <h4>棒球</h4>
                    <p>棒球运动是一种以棒打球为主要特点，集体性、对抗性很强的球类运动项目，在美国、日本尤为盛行。</p>
                  </div>
                </div>
                <div class="item">
                  <img alt="" src="../img/2.jpg" />
                  <div class="carousel-caption">
                    <h4>冲浪</h4>
                    <p>冲浪是以海浪为动力，利用自身的高超技巧和平衡能力，搏击海浪的一项运动。运动员站立在冲浪板上，或利用腹板、跪板、充气的橡皮垫、划艇、皮艇等驾驭海浪的一项水上运动。</p>
                  </div>
                </div>
                <div class="item active">
                  <img alt="" src="../img/3.jpg" />
                  <div class="carousel-caption">
                    <h4>自行车</h4>
                    <p>以自行车为工具比赛骑行速度的体育运动。1896年第一届奥林匹克运动会上被列为正式比赛项目。环法赛为最著名的世界自行车锦标赛。</p>
                  </div>
                </div>
              </div> <a data-slide="prev" href="#carousel-115888" class="left carousel-control">‹</a> <a data-slide="next" href="#carousel-115888" class="right carousel-control">›</a>
            </div>
            <table class="table" id="messagetable">
              <thead>
              <tr>
                <th style="text-align: center">
                  <span style="text-align: center">公告</span></th>
              </tr>
              </thead>
              <c:forEach var="message"  items="${messagelist}">
                <tr>
                  <td><a href=" ">>>></a></td>
                  <td><a href=" ">${message.getMessagetext()}</a></td>
                  <td><a href=" ">${message.getMessagetime()}</a></td>
                </tr>
              </c:forEach>
              </tbody>
            </table>
            <table class="table" id="newstable">
              <thead>
              <tr>
                <th style="text-align: center">新闻资讯</th>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                <th><a href="http://&quot;&quot;">查看更多&gt;</a></th>
              </tr>
              </thead>
              <tbody>
                <c:forEach var="newslist"  items="${newslist}">
                  <tr>
                    <td><a href=" ">>>></a></td>
                    <td><a href=" ">${newslist.getNews()}</a></td>
                    <td><a href=" ">${newslist.getOrigin()}</a></td>
                    <td><a href=" ">${newslist.getTime()}</a></td>
                  </tr>
                </c:forEach>
              </tbody>
            </table>
            <table class="table">
              <thead>
              <tr>

                <th style="text-align: center" >今日楼层值班老师</th>

              </tr>
              </thead>
              <tbody>
              <c:forEach var="teacher"  items="${teachers}">
                <tr>
                  <td><a href=" ">${teacher.getFloor()}</a></td>
                  <td><a href=" ">${teacher.getName()}</a></td>
                  <td><a href=" ">${teacher.getTel()}</a></td>
                  <td><a href=" ">${teacher.getTemp()}</a></td>
                  <td><a href=" ">${teacher.getTime()}</a></td>
                </tr>
              </c:forEach>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  </div>

  </body>
</html>
