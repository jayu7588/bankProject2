<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="./servlet1" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="id">ID:</label>
        <input type="text" id="id" name="id" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required><br><br>
        
        <input type="submit" value="Submit">
    </form>

</body>
</html>



