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
        <title>Ex3</title>
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
                <form action="ex3" method="post"  style="margin:auto; text-align: center">
                    Nhap n <input type="text" name="txt" value="${n}"  /> <br>
                    Chon phep toan <select name="select">
                        <option value="Tong n so lien tiep">Tong n so lien tiep</option>
                        <option value="Tinh n!">Tinh n!</option>
                        <option value="In day le">In day le</option>
                        <option value="In day chan">In day chan</option>
                        <option value="Kiem tra so nguyen to">Kiem tra so nguyen to</option>
                    </select><br>
                    Ket qua <input type="text" name="ketqua" readonly value="${display}">
                    <button type="submit">submit</button>
                </form>
            </td>
        </tr>

        <tr id='footer1'>
            <td colspan='2' align='center'>@Copyright by Your fullname</td>	
        </tr>
    </table>
</body>
</html>
