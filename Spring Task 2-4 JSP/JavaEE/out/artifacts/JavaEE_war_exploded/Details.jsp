<%@ page import="kz.bitlab.javaee.db.Task" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <%
                Task task = (Task) request.getAttribute("ttsk");
                if (task != null) {
            %>
            <form action="/TasksDetails" method="post">
                <input type="hidden" name="id" value="<%=task.getId()%>">
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
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Name:</label>
                    <input type="text" class="form-control" id="exampleFormControlInput1" name="nname"
                           value="<%=task.getName()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Description:</label>
                    <input class="form-control" id="exampleFormControlTextarea1" rows="3" name="Descrition"
                           value="<%=task.getDescription()%>">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">DeadLine:</label>
                    <input class="form-control" id="Date" type="date" name="deadline"
                           value="<%=task.getDeadLineDate()%>">
                </div>
                <select class="form-select form-select-sm" aria-label=".form-select-sm example" name="YN">
                    <option <%=task.getCompletness().equals("Yes")?"selected":""%> value="Yes">YES</option>
                    <option <%=task.getCompletness().equals("No")?"selected":""%> value="No">NO</option>
                </select>
                <div class="d-grid gap-2 d-md-flex justify-content-md-end mt-3">
                    <button  class="btn btn-outline-success" name="action" value="save">Save</button>
                    <button  class="btn btn-outline-danger" name="action" value="remove">Remove</button>
                </div>
            </form>
            <%
            } else {
            %>
            <h1 class="text-center">Task not found</h1>
            <%
                }
            %>
        </div>
    </div>
</div>
<%@include file="Footer.jsp" %>
</body>
</html>
