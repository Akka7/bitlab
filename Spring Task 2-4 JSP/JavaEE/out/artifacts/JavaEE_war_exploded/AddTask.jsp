<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TaskAddition</title>
    <%@include file="head.jsp" %>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-12">
            <nav class="navbar navbar-expand-lg bg-dark navbar-dark">
                <div class="container-fluid">
                    <a class="navbar-brand"> New Task </a>
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
                        </ul>
                    </div>
                </div>
            </nav>
            <form action="/Addition" method='post'>
                <div class="mb-3">
                    <label for="exampleFormControlInput1" class="form-label">Name:</label>
                    <input class="form-control" id="exampleFormControlInput1" name="T_name">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Description:</label>
                    <input class="form-control" id="exampleFormControlTextarea1" rows="3" name="T_desc">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">DeadLine:</label>
                    <input class="form-control" id="Date" type="date" name="TDate">
                </div>
                <div class="mb-3">
                    <label for="exampleFormControlTextarea1" class="form-label">Complete:</label>
                    <select class="form-select form-select-sm" aria-label=".form-select-sm example" name="YN">
                        <option  value="Yes">YES</option>
                        <option  value="No">NO</option>
                    </select>
                </div>
                <div class="d-grid gap-2 d-md-flex justify-content-md-end mt-3">
                    <button class="btn btn-primary" value="add" name="button">Add</button>
                    <button class="btn btn-outline-secondary" name="button" value="back">Back</button>
                </div>
            </form>
        </div>
    </div>
</div>
<%@include file="Footer.jsp" %>
</body>
</html>
