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

        .form-container {
            background: rgba(255, 255, 255, 0.8);
            border-radius: 12px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            padding: 40px 30px;
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
            font-size: 24px;
        }

        .form-container input[type="text"] {
            width: calc(100% - 20px);
            padding: 12px 10px;
            margin-bottom: 15px;
            border-radius: 8px;
            border: 1px solid #ccc;
            font-size: 16px;
        }

        .form-container input[type="submit"] {
            background: linear-gradient(135deg, #1ebdff, #0080ff);
            color: white;
            border: none;
            border-radius: 8px;
            padding: 12px 0;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s, box-shadow 0.3s, transform 0.3s;
            width: calc(100% - 20px);
            margin-top: 10px;
        }

        .form-container input[type="submit"]:hover {
            background: linear-gradient(135deg, #0080ff, #1ebdff);
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }

        .form-container input[type="submit"]:active {
            transform: translateY(2px);
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }

        .form-container input::placeholder {
            color: #888;
        }

        .error {
            color: #ff4d4f;
            font-size: 14px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Введите код:</h2>
    <form:form action="welcome" modelAttribute="tryToConnect">
        <input type="text" name="tryCode" placeholder="Код">
        <form:errors path="tryCode" cssClass="error"/>

        <input type="submit" value="Готово"/>
    </form:form>
</div>
</body>
</html>
