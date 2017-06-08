<%--
  Created by IntelliJ IDEA.
  User: Eraser
  Date: 2017/6/2
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>一个高校OA系统 - Powered By Rubbish Party 407</title>
    <%@ include file="/WEB-INF/view/common/css.jsp"%>
    <%@ include file="/WEB-INF/view/common/script.jsp"%>
    <%@ include file="login/css.jsp"%>
</head>
<body>
    <div class="htmleaf-container">
        <header class="htmleaf-header" style="
    padding-bottom: 70px;
">
            <h1>一个高校OA系统 <span>Powered By Rubbish Party 407</span></h1>
        </header>
        <div class="demo form-bg" style="padding-bottom: 70px;padding-top: 40px;">
            <div class="container">
                <div class="row">
                    <div class="col-md-offset-3 col-md-6">
                        <form class="form-horizontal" id="Sign" >
                            <span class="heading">用户登录</span>
                            <div class="form-group">
                                <input type="email" class="form-control" id="account" placeholder="用户名或电子邮件">
                                <i class="fa fa-user"></i>
                            </div>
                            <div class="form-group help">
                                <input type="password" class="form-control" id="password" placeholder="密　码">
                                <i class="fa fa-lock"></i>
                                <a href="#" class="fa fa-question-circle"></a>
                            </div>
                            <div class="form-group">
                                <div class="main-checkbox">
                                    <input type="checkbox" value="None" id="rememberMe" name="check"/>
                                    <label for="rememberMe"></label>
                                </div>
                                <span class="text">Remember me</span>
                                <button type="button" id="Login" class="btn btn-default">登录</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
<script>
    $("#Login").click(function () {
        var account = $("input[id='account']").val();
        var password = $("input[id='password']").val();
        var rememberMe = $("#rememberMe").prop("checked");

        if (account=="" || password=="") {
            alert("Account or password cannot be null");
        }else{
            $.post({url:"<%=request.getContextPath()%>/Login",
                data:JSON.stringify({account:account,password:password}),
                dataType:"json",
                contentType : 'application/json;charset=utf-8',
                success:function(result){
                    console.log(result);
                    if(result["statusCode"] == 0) {
                        location.href = "/";
                    }else{
                        alert(result["msg"]);
                    }
                }});



        }
    });


</script>
</body>
</html>
