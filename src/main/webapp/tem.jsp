<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 16.06.2022
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <h1>${result}</h1>

    <h1><%=request.getParameter("username")%></h1>
    <h1><%=request.getParameter("userage")%></h1>
<%--    <h1>${pageContext.result}</h1>--%>
<%--    <c:forEach var="cookies" items="${cookie}" varStatus="idx">--%>
<%--        <p>index: {idx.index} name: ${cookies.name} : value ${cookies.value}</p>--%>
<%--    </c:forEach>--%>

<%--    Жесткие области видимости страничек этих
контекст сессии???
глобальный контекст??? он самый нижний
есть езе две но я прослушал(--%>
    <h2></h2>

</head>
<body>

</body>
</html>
