<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <title>书籍详情</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.css">
</head>
<body>

<nav class="ui inverted attached segment">
    <div class="ui container">
        <div class="ui inverted second stackable menu">
            <h2 class="ui teal header item">书籍详情</h2>
            <a href="#" class="m-item item"><i class="mini home icon"></i>主页</a>
            <a href="#" class="m-item item"><i class="mini shopping cart icon"></i>购物车</a>
            <a href="#" class="m-item item"><i class="mini idea icon"></i>订单</a>

            <div class="right m-item m-mobile-hide menu">
                <div class="ui dropdown item">
                    <div class="text">
                        <img class="ui avatar image" src="https://picsum.photos/seed/picsum/100/100">
                        ${user.realName}
                    </div>
                </div>
                <a href="loginPage" class="item">注销</a>
            </div>
        </div>
    </div>
</nav>


<div class="ui grid" style="margin-top: 0px !important;">
    <div class="three wide column">
        <div class="ui vertical fluid tabular menu" style="position: fixed;">
            <a class="item">玄幻 </a>
            <a class="item">武侠 </a>
            <a class="item">仙侠 </a>
            <a class="item">都市 </a>
            <a class="item">历史 </a>
        </div>
    </div>
    <div class="thirteen wide column" style="padding-top: 0px !important;">
        <table class="ui celled padded table">
            <thead>
                <tr>
                    <th>编号</th>
                    <th>书名</th>
                    <th>图片</th>
                    <th>价格</th>
                    <th>描述</th>
                    <th>存数量</th>
                    <th>操作</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                            ${book.id}
                    </td>
                    <td>
                        <h3 class="ui center aligned header">${book.bookName}</h3>
                    </td>
                    <td>
                        <img src="${book.picture}"/>
                    </td>
                    <td>
                        <font color="red"><b>${book.price}元</b></font>
                    </td>
                    <td>
                            ${book.bookDesc}
                    </td>
                    <td>
                        ${book.inventory}
                    </td>
                    <td><a href="addToShoppingCart" target="_self"><button class="ui red basic button">添加购物车</button></a></td>
                </tr>
            </tbody>
        </table>
    </div>
</div>

<script>
</script>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.2/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/semantic-ui/2.2.4/semantic.min.js"></script>
</body>
</html>