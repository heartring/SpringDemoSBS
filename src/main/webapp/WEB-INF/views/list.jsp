<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/4/23 0023
  Time: 上午 12:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>员工列表</title>
    <%-- 可在请求域中获取项目名 --%>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>

    <%-- web 路径:
            1. 不以 / 开始的相对路径,找资源,以当前资源的路径为基准,经常容易出问题
            2. 以 /开始的相对路径,找资源,以服务器的路径为基准(http://localhost:3306):
                 需要加上项目名 http://localhost:3306/crud
     --%>

 <%--引入jQuery , bootstrap 依赖于jQuery  --%>
    <script type="text/javascript" src="${APP_PATH}/static/js/jquery-1.12.4.min.js"></script>
<%--引入样式 --%>
    <link href="${APP_PATH}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
<%--    映入js --%>
    <script src="${APP_PATH}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%-- 搭建显示页面 --%>
    <div class="container">
        <%-- 标题 --%>
        <div class="row">
            <div class="col-md-12">
                <h1>SSM-CRUD</h1>
            </div>
        </div>
            <%-- 按钮 --%>
        <div class="row">
            <div class="col-md-4 col-md-offset-8">
                <button class="btn btn-primary">新增</button>
                <button class="btn btn-danger ">删除</button>
            </div>
        </div>
            <%-- 显示表格数据 --%>
        <div class="row">
            <div class="col-md-12">
                <table class="table table-hover">
                    <tr>
                        <th>ID</th>
                        <th>empName</th>
                        <th>gender</th>
                        <th>email</th>
                        <th>deptName</th>
                        <th>操作</th>
                    </tr>
                    <tr>
                        <th>ID</th>
                        <th>empName</th>
                        <th>gender</th>
                        <th>email</th>
                        <th>deptName</th>
                        <th>
                            <button class="btn btn-primary btn-sm">
                                <span class="glyphicon glyphicon-pencil"></span>
                                编辑</button>
                            <button class="btn btn-danger btn-sm">
                                <span class="glyphicon glyphicon-remove"></span>
                                删除</button>
                        </th>
                    </tr>
                </table>
            </div>
        </div>
            <%-- 显示分页信息 --%>
        <div class="row">
            <%-- 分页描述 --%>
            <div class="col-md-6"></div>
            <%-- 分页条信息 --%>
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">
                        <li><a href="#">首页</a></li>
                        <li>
                            <a href="#" aria-label="Previous">
                                <span aria-hidden="true">&laquo;</span>
                            </a>
                        </li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                            <a href="#" aria-label="Next">
                                <span aria-hidden="true">&raquo;</span>
                            </a>
                        </li>
                        <li><a href="#">末页</a></li>
                    </ul>
                </nav>
            </div>
        </div>

    </div>




</body>
</html>
