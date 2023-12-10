<%@ page import="java.util.List" %>
<%@ page import="model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="css/home.css">
</head>
<body>
<div class="container">
    <img src="img/Picture1.png" alt="avatar user" class="user-avt">
    <div class="list-friend">
        <h1 class="list-friend-title">Danh sách bạn bè</h1>
        <div class="friends">
            <%
                List<User> list = (List<User>) request.getAttribute("users");
                for (User user : list) {
            %>
            <div class="friend"><%=user.getName()%>
            </div>
            <%}%>
        </div>
    </div>
    <div class="btn-group">
        <div class="btn-find-friend btn">Tìm phòng</div>
        <div class="btn-find-room btn">Chọn phòng</div>
        <div class="btn-create-room btn" onclick="createRoom()">Tạo Phòng</div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/js/general.js"></script>
</body>
</html>
