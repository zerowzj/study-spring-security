<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%
        String baseUrl = request.getContextPath();
    %>
    <title>角色列表</title>
    <link rel="stylesheet" type="text/css" href="<%=baseUrl%>/static/jstree/themes/default/style.min.css"/>
</head>
<body>
<form id="_form" action="#" method="post">
    <div id="jstree">
    </div>
    <input type="submit" value="提交">
</form>
<script type="text/javascript" src="<%=baseUrl%>/static/jstree/jstree.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        //
        var data = ${tree};
        var jsTree = $('#jstree').jstree({
            'plugins': ["checkbox", "changed"],
            'core': {
                'data': data
            }
        });
        jsTree.on("ready.jstree", function (e, data) {
            data.instance.open_all();
        });
        //
        $("#_form").submit(function () {
            var formParam = $("#_form").serialize();
            alert(formParam);
            $.ajax({
                type: 'post',
                url: '/role/confFun',
                data: formParam,
                cache: false,
                dataType: 'json',
                success: function (data) {
                    alert(data);
                }
            });
        });
    });
</script>
</body>
</html>