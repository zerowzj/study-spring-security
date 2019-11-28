<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="p" uri="http://www.company.com/tag" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
</head>
<body>
<h3 class="page-title">
    <small style="font-size:15px;">权限管理 >> 新增角色</small>
</h3>
<div class="row">
    <div class="col-md-12 ">
        <div class="portlet light ">
            <div class="portlet-body form">
                <form class="form-horizontal" action="/admin/add" role="form">
                    <div class="form-body">
                        <div class="form-group">
                            <label class="col-md-3 control-label">角色名称</label>
                            <div class="col-md-3">
                                <input type="text" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-3 control-label">状态</label>
                            <div class="col-md-9">
                                <div class="radio-list">
                                    <label class="radio-inline">
                                        <div class="radio">
                                            <span>
                                                <input type="radio" name="optionsRadios" value="option1">
                                            </span>
                                        </div>
                                        启用
                                    </label>
                                    <label class="radio-inline">
                                        <div class="radio">
                                            <span>
                                                <input type="radio" name="optionsRadios" value="option2"
                                                       checked="checked">
                                            </span>
                                        </div>
                                        停用
                                    </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-md-3 control-label">角色描述</label>
                            <div class="col-md-5">
                                <textarea class="form-control" rows="6"></textarea>
                            </div>
                        </div>
                    </div>
                    <div class="form-actions">
                        <div class="row">
                            <div class="col-md-offset-3 col-md-9">
                                <button type="submit" class="btn green">注册</button>
                                <button type="reset" class="btn red">重置</button>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>