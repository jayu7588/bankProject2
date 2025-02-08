<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Form</title>
    <style>
    *
    {
    color:orange;
    }
        table {
            width: 50%;
            border-collapse: collapse;
            margin: 20px 0;
            font-size: 18px;
            text-align: left;
        }
        th, td {
            padding: 10px;
            border: 1px solid black;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>

    <h2>Enter Employee Details</h2>

    <form method="post" action="">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="id">ID:</label>
        <input type="number" id="id" name="id" required><br><br>
        
        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary" required><br><br>
        
        <input type="submit" value="Submit">
    </form>

    <%
      
       // get the parameters in string format 
        String idParam = request.getParameter("id");
        String salaryParam = request.getParameter("salary");
        String name = request.getParameter("name");

        
        // check the inputes are null or not if they are null then move to the catch block ()
        if (idParam != null && salaryParam != null && name != null) {
            try {
                int id = Integer.parseInt(idParam);
                int salary = Integer.parseInt(salaryParam);
    %>

    <h2>Employee Details</h2>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Salary</th>
        </tr>
        <tr>
            <td><%= id %></td>
            <td><%= name %></td>
            <td><%= salary %></td>
        </tr>
    </table>

    <%
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Invalid input! Please enter numeric values for ID and Salary.</p>");
            }
        }
    %>

</body>
</html>
