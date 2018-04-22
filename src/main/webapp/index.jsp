<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8" %>
<%-- 由index.jsp页面直接跳转emps.jsp 页面 并显示查询到的emp员工列表 --%>
<jsp:forward page="/emps"></jsp:forward>

<%--<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=utf-8">
    <title>index</title>
    &lt;%&ndash; 引入jQuery , bootstrap 依赖于jQuery  &ndash;%&gt;
    <script type="text/javascript" src="static/js/jquery-1.12.4.min.js"></script>
    &lt;%&ndash; 引入样式 &ndash;%&gt;
    <link href="static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet"/>
    &lt;%&ndash; 映入js &ndash;%&gt;
    <script src="static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<h2>Hello World!</h2>
&lt;%&ndash; bootstrap 使用参见 https://v3.bootcss.com/getting-started/ &ndash;%&gt;
<button type="button" class="btn btn-success">按钮</button>

</body>
</html>--%>
