<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #00c6ff, #0072ff);
            background-size: 400% 400%;
            animation: gradient 15s ease infinite;
        }

        @keyframes gradient {
            0% { background-position: 0% 50%; }
            50% { background-position: 100% 50%; }
            100% { background-position: 0% 50%; }
        }

        .form-container {
            background: rgba(255, 255, 255, 0.9);
            border-radius: 16px;
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
            padding: 40px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
            font-size: 26px;
            font-weight: 700;
        }

        .form-container input[type="text"],
        .form-container input[type="password"] {
            width: calc(100% - 20px);
            padding: 14px 10px;
            margin-bottom: 15px;
            border-radius: 12px;
            border: 1px solid #ddd;
            font-size: 16px;
            background: rgba(255, 255, 255, 0.8);
            transition: border-color 0.3s, box-shadow 0.3s;
        }

        .form-container input[type="text"]:focus,
        .form-container input[type="password"]:focus {
            border-color: #4d9dff;
            box-shadow: 0 0 8px rgba(77, 157, 255, 0.5);
            outline: none;
        }

        .form-container input[type="submit"] {
            background: linear-gradient(135deg, #0072ff, #00c6ff);
            color: white;
            border: none;
            border-radius: 12px;
            padding: 14px 0;
            font-size: 18px;
            cursor: pointer;
            transition: background 0.3s, box-shadow 0.3s, transform 0.3s;
            width: calc(100% - 20px);
            margin-top: 10px;
        }

        .form-container input[type="submit"]:hover {
            background: linear-gradient(135deg, #00c6ff, #0072ff);
            box-shadow: 0 8px 16px rgba(0, 0, 0, 0.2);
        }

        .form-container input[type="submit"]:active {
            transform: translateY(2px);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }

        .form-container input::placeholder {
            color: #888;
        }

        .error {
            color: #ff4d4f;
            font-size: 14px;
            margin-bottom: 10px;
            text-align: left;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Авторизация</h2>
    <form:form action="welcome" modelAttribute="tryToConnect">
        <input type="text" name="tryName" placeholder="Login/Email">
        <form:errors path="tryName" cssClass="error"/>

        <input type="password" name="tryPassword" placeholder="Password">
        <form:errors path="tryPassword" cssClass="error"/>

        <input type="submit" value="Войти"/>
    </form:form>
</div>
</body>
</html>
