<%--
  Created by IntelliJ IDEA.
  User: asith
  Date: 2020-08-28
  Time: 13.54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
h2{
    text-decoration-color: white;

}
        body {
            /* The image used */
            background-image: url("back.jpg");
            text-align: center;
            min-height: 380px;

            /* Center and scale the image nicely */
            /*background-position: center;*/
            background-repeat: repeat;
            /*background-size: cover;*/
            /*position: relative;*/
        }

        /* Add styles to the form container */
        .container {
            position: center;
            right: 50px;
            left: 50px;
            margin: 20px;
            max-width: 800px;
            padding: 16px;
            background-color: grey;
        }
    </style>
</head>
<body>

<h2>Withdraw money</h2>
<div class="container">
    <form name="loginForm" method="post" action="/bankapp/withdrawservlet">
        <%--@declare id="withdrawed"--%><%--@declare id="amount"--%>
            <h1>Withdraw money</h1>

            <label for="amount"><b>Bank amount</b></label>
            <input type="text" placeholder="please re-enter your bank amount" name="amount">

        <label for="withdrawed"><b>Withdraw amount</b></label>
        <input type="text" placeholder="Enter withdrawed amount" name="withdrawed">


        <button type="submit" class="btn">Withdraw amount</button>
    </form>
</div>

</body>
</html>
