<%@ page import="java.util.ArrayList" %>
<%@ page import="kz.bitlab.javaee.db.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main</title>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
                <div class="container-fluid">
                    <a class="navbar-brand">TASK MANAGER</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                            data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                            aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="navbarSupportedContent">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link" href="/AllTASKS">All Tasks</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="Addition">Add task</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </div>
</div>
<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Date</th>
        <th scope="col">Complete</th>
        <th scope="col">Details</th>
    </tr>
    </thead>
    <tbody class="table-group-divider">
    <%
        ArrayList<Task> tasks = (ArrayList<Task>) request.getAttribute("Zadaniya");
        if (tasks != null) {
            for (Task t : tasks) {
    %>
    <tr>
        <th scope="row"><%=t.getId()%></th>
        <td><%=t.getName()%></td>
        <td><%=t.getDeadLineDate()%></td>
        <td><%=t.getCompletness()%></td>
        <td><a href="/TasksDetails?id=<%=t.getId()%>" class="btn-primary btn-sm">Details</a></td>
    </tr>
    <%
            }
        }
    %>
    </tbody>
</table>
<%@include file="Footer.jsp"%>
</body>
</html>