<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21.06.2022
  Time: 0:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        *, *:before, *:after {
            box-sizing: border-box;
        }

        html{
            height: 100%;
        }

        body{
            min-height: 100%;
            margin: 40px;
            background: linear-gradient(to right bottom, #FFE4E1, #FFEBCD) no-repeat;
        }

        .textblock{
            display: flex;
            flex-direction: column;
            text-align: center;
        }

        .textblock2{
            display: inline-block;
            padding: 0 20px;
            width: 100%;
        }

        a{
            font-size: 25px;
            text-decoration: none;
            color: #FFA07A;
            padding-left: 30px;
            padding-right: 30px;
            text-align: center;
        }

        h1{
            color: grey;
        }

    </style>
</head>
<body>

<div class="textblock">
    <h1>Are you shuuure? :<</h1>
    <div class="textblock2">
        <a href="">Yup</a>
        <a href="/draft/userpage.jsp">Nah</a>
    </div>
</div>
</body>
</html>
