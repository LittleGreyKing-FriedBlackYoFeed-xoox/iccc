<%--
  Created by IntelliJ IDEA.
  User: TCTM
  Date: 2020/3/22
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script src="../../js/jquery/jquery-3.4.1.min.js"></script>
    <script src="../../js/layer-v3.1.1/layer/layer.js"></script>
    <script>
        $('#test').on('click',function () {
            layer.msg("hello");
        });

    </script>
    <div id="test" >
        点我
    </div>
</body>
</html>
