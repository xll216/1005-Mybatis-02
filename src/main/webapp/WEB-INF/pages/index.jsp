<%--
  Created by 蓝鸥科技有限公司  www.lanou3g.com.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>起始页</title>

    <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>

    <link href="../../css/demo.css" rel="stylesheet" type="text/css"/>

    <script src="../../scripts/boot.js" type="text/javascript"></script>
</head>
<body>
<h1>文件上传案例</h1>

<form id="upload"
      action="/fileUpload"
      method="post"
      enctype="multipart/form-data">

    图片：<input class="mini-htmlfile"
              name="photo"
              buttonText="选择图片"
              limitType="*.png;*.jpg;*.jpeg"/>
    <br/>
    生日：<input class="mini-datepicker"
              name="birthday"/>
    <br/>
    姓名：<input type="text" name="username">
    <br/>
    <input type="submit" value="上传"/>
</form>

</body>
</html>
