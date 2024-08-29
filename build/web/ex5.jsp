<%-- 
    Document   : ex1
    Created on : Sep 30, 2022, 9:52:40 AM
    Author     : Asus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ex5</title>
        <style>
            table.main {
                width:100%;
                height:600px;
                border:1px solid black;
            }

            table.main #logo{
                background:Blue;
                width:15%;
                height:15%;
            }
            table.main #banner{
                width:85%;
                height:15%;
            }
            table.main #menu1{
                background:Red;
                width:15%;
                height:70%;
                font-size:22;
                text-align:top
            }
            table.main #content1{
                background:yellow;
                width:85%;
                height:70%;
            }
            table.main #footer1{
                background:green;
                width:100%;
                height:15%;
                font-size:25
            }

        </style>
    </head>
    <body>
        <table class='main'>
            <tr>
                <td id='logo'><img src='images/logo.jpg' width='150px'></td>
                <td id='banner' background='images/banner2.jpg'></td>
            <button><a href="Ex_Servlet.jsp">Home</a></button>
        </tr>

        <tr>
            <td id='menu1'>
                <ul>
                    <li><a href="ex1.jsp">Exercise 1</a></li>
                    <li><a href="ex2.jsp">Exercise 2</a></li>
                    <li><a href="ex3.jsp">Exercise 3</a></li>
                    <li><a href="ex4.jsp">Exercise 4</a></li>
                    <li><a href="ex5.jsp">Exercise 5</a></li>
                    <li><a href="ex6.jsp">Exercise 6</a></li>
                </ul>
            </td>
            <td id='content1' >
                <form action="ex5" method="post"  style="margin:auto; text-align: center">
                    Nhap doan van  <br><textarea  name="nhap doan van" rows="5" cols="80" >${dv}</textarea><br>
                    Tong so ky tu <input value="${demkytu}" style="background-color: azure"/><br>
                    -----------------------------<br>
                    Nhap vi tri <input name="nhap vi tri" value="${vt}"/><br><br>
                    Ky tu tuong ung <input value="${kytutuongung}" style="background-color: azure"/><br>
                    -----------------------------<br>
                    Nhap chuoi <input value="${nc}" name="nhap chuoi"/><br><br>
                    Vi tri tuong ung <input value="${vitrituongung}" style="background-color: azure"/><br>
                    -----------------------------<br>
                    Nhap vi tri can tach tu <input value="${tu}" name="tu"/>
                    Den <input value="${den}" name="den"/><br>
                    Ket qua <input value="${sub}" style="background-color: azure"/><br>

                    <input type="submit" value="nhap">
                    <input type="reset" value="thoat">
                </form>
            </td>
        </tr>

        <tr id='footer1'>
            <td colspan='2' align='center'>@Copyright by Your fullname</td>	
        </tr>
    </table>
</body>
</html>
