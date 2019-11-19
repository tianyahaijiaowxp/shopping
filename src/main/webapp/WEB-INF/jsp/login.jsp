<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/17 0017
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.css">
</head>
<body>
<div style="max-width: 40em !important;margin: auto !important;padding-top: 5em !important;padding-bottom: 5em !important;">
    <div class="ui container">
        <div class="ui middle aligned center aligned grid">
            <div class="column">
                <h2 class="ui teal image header">
                    <div class="content">
                        管理后台登录
                    </div>
                </h2>
                <form class="ui large form" method="post" action="login">
                    <div class="ui segment">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="用户名">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="密码">
                            </div>
                        </div>
                        <button class="ui fluid large teal submit button">登   录</button>
                    </div>
                    <!--<div class="ui error mini message"></div>-->
                    <!--<div class="ui mini negative message">-->
                    <!--用户名或密码错误-->
                    <!--</div>-->
                </form>

            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.2/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.js"></script>
</body>
</html>
