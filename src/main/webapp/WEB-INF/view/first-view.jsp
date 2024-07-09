<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #67d9f8, #4a8cff);
            background-size: 400% 400%;
            animation: gradient 10s ease infinite;
            font-family: Arial, sans-serif;
        }

        @keyframes gradient {
            0% { background-position: 0% 50%; }
            50% { background-position: 100% 50%; }
            100% { background-position: 0% 50%; }
        }

        .button-container {
            text-align: center;
            background: rgba(255, 255, 255, 0.8);
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
            padding: 30px;
        }

        .button-container input {
            background: linear-gradient(135deg, #1ebdff, #0080ff);
            border: none;
            border-radius: 10px;
            color: white;
            cursor: pointer;
            display: block;
            font-size: 18px;
            font-weight: bold;
            margin: 20px 0;
            padding: 15px 20px;
            text-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
            transition: transform 0.3s, box-shadow 0.3s;
            width: 300px;
        }

        .button-container input:hover {
            transform: translateY(-2px);
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.3);
        }

        .button-container input:active {
            transform: translateY(0);
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
        }
    </style>
</head>
<body>
<div class="button-container">
    <input type="button" value="Зарегистрироваться"
           onclick="window.location.href = 'registrationView' "/>
    <input type="button" value="Авторизироваться"
           onclick="window.location.href = 'authorizationView' "/>
</div>
</body>
</html>
