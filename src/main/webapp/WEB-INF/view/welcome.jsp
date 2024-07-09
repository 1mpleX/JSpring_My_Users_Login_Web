<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        /* Общие стили */
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: 'Roboto', sans-serif;
        }

        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background: linear-gradient(135deg, #6e45e2, #88d3ce);
            color: white;
            font-family: 'Roboto', sans-serif;
            background-size: cover;
            animation: backgroundAnimation 10s infinite alternate;
        }

        /* Анимация фона */
        @keyframes backgroundAnimation {
            0% {
                background: linear-gradient(135deg, #6e45e2, #88d3ce);
            }
            100% {
                background: linear-gradient(135deg, #3d4e81, #e3e3e3);
            }
        }

        /* Контейнер */
        .container {
            text-align: center;
            padding: 50px;
            background: rgba(0, 0, 0, 0.5);
            border-radius: 15px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .container:hover {
            transform: scale(1.05);
            box-shadow: 0 15px 45px rgba(0, 0, 0, 0.5);
        }

        /* Заголовок */
        h1 {
            font-size: 48px;
            font-weight: bold;
            margin-bottom: 20px;
            letter-spacing: 1px;
            text-transform: uppercase;
            background: linear-gradient(135deg, #88d3ce, #6e45e2);
            -webkit-background-clip: text;
            -webkit-text-fill-color: transparent;
            animation: textAnimation 3s infinite alternate;
        }

        /* Анимация текста */
        @keyframes textAnimation {
            0% {
                background: linear-gradient(135deg, #88d3ce, #6e45e2);
            }
            100% {
                background: linear-gradient(135deg, #ff9a9e, #fad0c4);
            }
        }

        /* Подзаголовок */
        p {
            font-size: 20px;
            margin-bottom: 30px;
            color: #f2f2f2;
            letter-spacing: 0.5px;
        }

        /* Кнопка */
        .btn {
            padding: 15px 30px;
            border: none;
            border-radius: 30px;
            background: linear-gradient(135deg, #6e45e2, #88d3ce);
            color: white;
            font-size: 18px;
            font-weight: bold;
            cursor: pointer;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
            transition: background 0.3s ease, box-shadow 0.3s ease, transform 0.3s ease;
        }

        .btn:hover {
            background: linear-gradient(135deg, #88d3ce, #6e45e2);
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.3);
            transform: translateY(-5px);
        }
    </style>
</head>
<body>
<div class="container">
    <p>Welcome to my platform, ${tryToConnect.tryName}!</p>
    <br>
    <p>by Dubinkin Danila</p>
</div>

</body>
</html>
