<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 18.06.2022
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>HomePage</title>

    <link rel="stylesheet" href="assert/css/userpage.css">
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">--%>
<%--    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.bundle.min.js">--%>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body style="text-align: center">
<br><br>

<br><br>

<header class="header">
    <div class="container">
        <div class="header_inner">
            <div class="header_logo">DanyaGram</div>

            <nav class="nav">
                <a class="nav_link" href="#">Main</a>
                <a class="nav_link" href="app_page.jsp">Lol</a>
                <a class="nav_link" href="tem.html">Sing Out</a>
                <p>${name}</p>
            </nav>
        </div>
    </div>
</header>
<h1>Welcome to your page!</h1>
<br><br>
<div class="mainInfo">
    <h1>${name}</h1>
    <h2>${age}</h2>
    <h2>${gender}</h2>
</div>


<%--<div class="center_block">--%>
<%--    <div class="page-content page-container" id="page-content">--%>
<%--        <div class="padding">--%>
<%--            <div class="row container d-flex justify-content-center">--%>
<%--                <div class="col-xl-6 col-md-12">--%>
<%--                    <div class="card user-card-full">--%>
<%--                        <div class="row m-l-0 m-r-0">--%>
<%--                            <div class="col-sm-4 bg-c-lite-green user-profile">--%>
<%--                                <div class="card-block text-center text-white">--%>
<%--                                    <div class="m-b-25">--%>
<%--                                        <c:choose>--%>
<%--                                            <c:when test="${gender=='male'}">--%>
<%--                                             <img src="https://www.clipartmax.com/png/full/42-427582_sign-in-my-profile-icon-png.png" class="img-radius" alt="User-Profile-Image">--%>
<%--                                            </c:when>--%>
<%--                                            <c:otherwise>--%>
<%--                                                <img src="https://www.pinclipart.com/picdir/big/537-5376261_edit-profile-icon-png-clipart.png" class="img-radius" alt="User-Profile_Image">--%>
<%--                                            </c:otherwise>--%>
<%--                                        </c:choose>--%>
<%--                                    </div>--%>
<%--                                    <h6 class="name_USER">${name}</h6>--%>
<%--                                    <p style="font-size: 12px">TMS Student</p>--%>
<%--                                    <i class=" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16"></i>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                            <div class="col-sm-8">--%>
<%--                                <div class="card-block">--%>
<%--                                    <h6 class="m-b-20 p-b-5 b-b-default f-w-600">About You</h6>--%>
<%--                                    <div class="row">--%>
<%--                                        <div class="col-sm-6">--%>
<%--                                            <p class="m-b-10 f-w-600">Age</p>--%>
<%--                                            <h6 class="text-muted f-w-400">${age}</h6>--%>
<%--                                        </div>--%>
<%--                                        <div class="col-sm-6">--%>
<%--                                            <p class="m-b-10 f-w-600">Gender</p>--%>
<%--                                            <h6 class="text-muted f-w-400">${gender}</h6>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                    <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600">User Info</h6>--%>
<%--                                    <div class="row">--%>
<%--                                        <div class="col-sm-6">--%>
<%--                                            <p class="m-b-10 f-w-600">Login</p>--%>
<%--                                            <h6 class="text-muted f-w-400">${login}</h6>--%>
<%--                                        </div>--%>
<%--                                        <div class="col-sm-6">--%>
<%--                                            <p class="m-b-10 f-w-600">Actions</p>--%>
<%--                                           <a class="text-muted f-w-400" href="tem.html">Exit</a>--%>
<%--                                            <a class="text-muted f-w-400" href="/draft/DeleteAccount.jsp">Delete Ac</a>--%>
<%--                                        </div>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</div>--%>
</body>
</html>
