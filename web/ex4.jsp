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
        <title>Ex4</title>
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
                <form action="ex4" method="post"  style="margin:auto; text-align: center">
                    Nhap mang <input type="text" name="ketqua" value="${kq}"/> <br>
                    Ket qua <input style="width: 150px;" type="text" name="ketqua" value="${display}" readonly/> <br>
                    Chon 
                    <div><input type="radio" name="radio" value="nhap mang" checked onclick="getElementById('1').innerHTML = Date()" /><label>nhap mang</label></div>
                    <div><input type="radio" name="radio" value="in mang" onclick="getElementById('2').innerHTML = Date()" /><label>in mang</label></div>
                    <div><input type="radio" name="radio" value="tong le" onclick="getElementById('3').innerHTML = Date()"/><label>tong le</label></div>
                    <div><input type="radio" name="radio" value="tich chan" onclick="getElementById('4').innerHTML = Date()"/><label>tich chan</label></div>
                    <div><input type="radio" name="radio" value="sap xep" onclick="getElementById('5').innerHTML = Date()"/><label>sap xep</label></div>

                    <input type="submit" value="thuc hien"/>
                    <input type="reset" value="thoat"/>

                    <br>



                </form>
                    nhap mang: <p id="1" value="${radio}">
                    in mang: <p id="2" value="${radio}">
                    tong le: <p id="3" value="${radio}">
                    tich chan: <p id="4" value="${radio}">
                    sap xep: <p id="5" value="${radio}"></p>
            </td>
        </tr>

        <tr id='footer1'>
            <td colspan='2' align='center'>@Copyright by Your fullname</td>	
        </tr>
    </table>






    <script>




    </script>
</body>
</html>
