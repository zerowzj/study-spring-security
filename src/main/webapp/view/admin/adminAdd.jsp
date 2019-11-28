<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="p" uri="http://www.company.com/tag" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
</head>
<body>
<div class="breadcrumbs ace-save-state" id="breadcrumbs">
    <ul class="breadcrumb">
        <li>
            <i class="ace-icon fa fa-home home-icon"></i>
            <a href="#">用户管理</a>
        </li>
        <li class="active">新增用户</li>
    </ul>
</div>

<div class="page-content">
    <div class="page-header">

    </div>
    <div class="row">
        <div class="col-xs-12">
            <form class="form-horizontal" action="/admin/add" method="post">
                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">用户名</label>
                    <div class="col-sm-9">
                        <input type="text" placeholder="用户名" class="col-xs-10 col-sm-3">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">密码</label>
                    <div class="col-sm-9">
                        <input type="password" placeholder="密码" class="col-xs-10 col-sm-3">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-sm-3 control-label no-padding-right">所属角色</label>
                    <div class="col-sm-9">
                        <select class="col-xs-10 col-sm-3">
                            <option value="">请选择</option>
                            <option value="AL">Alabama</option>
                        </select>
                    </div>
                </div>

                <div class="clearfix form-actions">
                    <div class="col-md-offset-3 col-md-9">
                        <button class="btn btn-info" type="submit">
                            <i class="ace-icon fa fa-check bigger-110"></i>
                            Submit
                        </button>
                        &nbsp; &nbsp; &nbsp;
                        <button class="btn" type="reset">
                            <i class="ace-icon fa fa-undo bigger-110"></i>
                            Reset
                        </button>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>