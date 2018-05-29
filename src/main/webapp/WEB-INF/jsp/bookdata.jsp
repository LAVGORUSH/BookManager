<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="fragments/headTag.jsp"/>
</head>
<body>
<jsp:useBean id="book" scope="request" type="com.lavgorush.bookmanager.model.Book"/>
<h1>Book Details</h1>
<table class="tg">
    <tr>
        <th width="80">ID</th>
        <th width="120">Title</th>
        <th width="120">Author</th>
        <th width="120">Price</th>
    </tr>
    <tr>
        <td>${book.id}</td>
        <td>${book.title}</td>
        <td>${book.author}</td>
        <td>${book.price/100}${book.price%100}</td>
    </tr>
</table>
</body>
</html>
