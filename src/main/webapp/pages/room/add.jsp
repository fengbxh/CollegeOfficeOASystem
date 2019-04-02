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
            <label for="L_teId" class="layui-form-label">
                <span class="we-red">*</span>房间名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teId" name="teId" lay-verify="required" autocomplete="off" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teName" class="layui-form-label">
                <span class="we-red">*</span>房间类型
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teName" name="teName" lay-verify="required" autocomplete="off"
                       class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_teAge" class="layui-form-label">
                <span class="we-red">*</span>房间号
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teAge" name="teAge" lay-verify="required" autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_teBirthday" class="layui-form-label">
                <span class="we-red">*</span>楼层
            </label>
            <div class="layui-input-inline">
                <input class="layui-input"
                       lay-verify="required"
                       name="teBirthday" id="L_teBirthday">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_tePhone" class="layui-form-label">
                <span class="we-red">*</span>楼名
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_tePhone" name="tePhone" lay-verify="required|phone" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_education" class="layui-form-label">
                <span class="we-red">*</span>使用面积（平方米）
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_education" name="education"
                       lay-verify="required" autocomplete="" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_graduateSchool" class="layui-form-label">
                <span class="we-red">*</span>校区
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_graduateSchool" name="graduateSchool" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_speciality" class="layui-form-label">
                <span class="we-red">*</span>学院
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_speciality" name="speciality" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_teEmail" class="layui-form-label">
                <span class="we-red">*</span>钥匙管理员
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_teEmail" name="teEmail" autocomplete="off" class="layui-input">
            </div>

        </div>
        <div class="layui-form-item">
            <label for="L_officePhone" class="layui-form-label">
                <span class="we-red">*</span>房门数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_officePhone" name="officePhone" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_postalAddress" class="layui-form-label">
                <span class="we-red">*</span>面积单元
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_postalAddress" name="postalAddress" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_otherContact" class="layui-form-label">
                <span class="we-red">*</span>预留单元
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_otherContact" name="otherContact" lay-verify="required" autocomplete=""
                       class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_seniorTalentProject" class="layui-form-label">
                <span class="we-red">*</span>门牌数量
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_seniorTalentProject" name="seniorTalentProject" lay-verify="required"
                       autocomplete="" class="layui-input">
            </div>
        </div>
        <div class="layui-form-item">
            <label for="L_socialSecurityId" class="layui-form-label">
                <span class="we-red">*</span>备注
            </label>
            <div class="layui-input-inline">
                <input type="text" id="L_socialSecurityId" name="teacheroccupationalinfo.socialSecurityId"
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
                url: "/teacher/addTeacher",
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
