<%--
  Created by IntelliJ IDEA.
  User: sdw08
  Date: 2021-06-03
  Time: 오후 3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>메일전송</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <h1 class="display-5 text-center">E-MAIL TEST</h1>
    <form class="align-middle" method="post" action="/emailProc">
        <div class="row mb-3">
            <div class="form-floating mb-3">
                <input type="email" class="form-control" id="from" name="from" placeholder="name@example.com">
                <label for="from">FROM</label>
            </div>
        </div>
        <div class="row mb-3">
            <div class="form-floating mb-3">
                <input type="email" class="form-control" id="to" name="to" placeholder="name@example.com">
                <label for="to">TO</label>
            </div>
        </div>
        <div class="row mb-3">
            <div class="form-floating mb-3">
                <input type="text" class="form-control" id="subject" name="subject" placeholder="subject">
                <label for="subject">SUBJECT</label>
            </div>
        </div>
        <div class="row mb-3">
            <div class="form-floating">
                <textarea class="form-control" placeholder="CONTENTS" id="contents" name="contents" style="height: 300px;"></textarea>
                <label for="contents">CONTENTS</label>
            </div>
        </div>
        <div class="d-grid gap-2 col-6 mx-auto">
            <button class="btn btn-primary" type="submit">submit</button>
        </div>
    </form>
</div>
</body>
</html>
