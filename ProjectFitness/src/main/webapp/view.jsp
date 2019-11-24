<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW</title>
</head>
<body>
<h1>VIEW</h1>  
<table border="1">  
<tr><th>id<th>Name</th><th>pass</th><th>gender</th><th>email</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach items="${list}" var="list">  
   <tr>
   <td>${list.id}</td>    
   <td>${list.name}</td>  
   <td>${list.pass}</td>  
    <td>${list.gender}</td>  
   <td>${list.email}</td>    
   <td><a href="edit?r=up&id=${list.id}&name=${list.name}&pass=${list.pass}&gender=${list.gender}&email=${list.email}">Edit</a></td>  
   <td><a href="delete?id=${list.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="index">index</a>
  
</body>
</html>