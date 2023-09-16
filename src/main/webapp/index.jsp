<%@ page import="vn.edu.iuh.fit.repositories.EmployeeRepository" %>
<%@ page import="vn.edu.iuh.fit.models.Employee" %>
<%@ page import="org.joda.time.DateTime" %>
<%@ page import="vn.edu.iuh.fit.enums.EmployeeStatus" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    EmployeeRepository repository = new EmployeeRepository();
    Employee emp = new Employee("teo", new DateTime(2023, 4, 23, 0, 0, 0), "teo@mail.com",
            "2349235", "12 NVB", EmployeeStatus.ACTIVE);
    repository.insertEmp(emp);

    out.print(emp);
%>
</body>
</html>