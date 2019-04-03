<%--
  Created by IntelliJ IDEA.
  User: 52721
  Date: 2018/11/5
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>新增房间-WeAdmin Frame型后台管理系统-WeAdmin 1.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <link rel="stylesheet" href="../../static/css/font.css">
    <link rel="stylesheet" href="../../static/css/weadmin.css">
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
    <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="weadmin-body">
    <form class="layui-form" id="addform">
        <div class="layui-form-item">
            <label for="L_roomName" class="layui-form-label">
                <span class="we-red">*</span>房间名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_roomName" name="roomName" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="s_roomTypeId" class="layui-form-label">
                <span class="we-red">*</span>房间类型
            </label>
            <div class="layui-input-inline">
                <select id="s_roomTypeId" name="roomTypeId" lay-filter="aihao">
                    <option value=""></option>
                    <option value="2">普通办公用房</option>
                    <option value="3">校领导办公室</option>
                </select>
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_roomNumber" class="layui-form-label">
                <span class="we-red">*</span>房间号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_roomNumber" name="roomNumber" lay-verify="required" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_floor" class="layui-form-label">
                <span class="we-red">*</span>楼层
            </label>
            <div class="layui-input-inline">
                <input class="layui-input"
                       lay-verify="required"
                       name="floor" id="L_floor">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_buildingName" class="layui-form-label">
                <span class="we-red">*</span>楼名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_buildingName" name="buildingName" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_usageArea" class="layui-form-label">
                <span class="we-red">*</span>使用面积（平方米）
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_usageArea" name="usageArea"
                       lay-verify="required" autocomplete="" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_campus" class="layui-form-label">
                <span class="we-red">*</span>校区
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_campus" name="campus" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_college" class="layui-form-label">
                <span class="we-red">*</span>学院
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_college" name="college" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_keyAdministratorId" class="layui-form-label">
                <span class="we-red">*</span>钥匙管理员
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_keyAdministratorId" name="keyAdministratorId" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_doorCount" class="layui-form-label">
                <span class="we-red">*</span>房门数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_doorCount" name="doorCount" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_areaUnit" class="layui-form-label">
                <span class="we-red">*</span>面积单元
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_areaUnit" name="areaUnit" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_reserveUnit" class="layui-form-label">
                <span class="we-red">*</span>预留单元
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_reserveUnit" name="reserveUnit" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_doorplatesCount" class="layui-form-label">
                <span class="we-red">*</span>门牌数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_doorplatesCount" name="doorplatesCount" lay-verify="required"
                       autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_remarks" class="layui-form-label">
                <span class="we-red">*</span>备注
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_remarks" name="remarks"
                       lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_ok" class="layui-form-label">
            </label>
            <button id="L_ok" class="layui-btn" lay-filter="add" lay-submit="">确定</button>
        </div>
    </form>
</div>
<script src="../../lib/layui/layui.js" charset="utf-8"></script>
<script src="../../static/js/jquery-3.3.1.js"></script>
<script type="text/javascript">
    layui.extend({
        admin: '{/}../../static/js/admin'
    });
    layui.use(['form', 'jquery', 'util', 'admin', 'layer'], function () {
        var form = layui.form,
            $ = layui.jquery,
            util = layui.util,
            admin = layui.admin,
            layer = layui.layer;
        $("#L_ok").click(function () {

            $.ajax({
                type: "POST",
                data: $("#addform").serialize(),
                dataType: "json",
                url: "/room/addRoomInfo",
                success: function (result) {
                    if (result.code == 200) {
                        layer.alert("添加成功", {icon: 6});
                        $("#addform input").val("");
                    }
                    else {
                        layer.alert("添加失败", {icon: 7});
                    }
                }
            });
            return false;
        });
    });


</script>
</body>
</html>
