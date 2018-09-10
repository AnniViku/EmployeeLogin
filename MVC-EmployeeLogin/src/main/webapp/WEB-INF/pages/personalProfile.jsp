<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    <h1 style="color:red;text-align:center">Personal Data</h1>
    
    <style>
       table, th, td {
        border: 1px solid black;
   }
</style>


    <table style="width:100%">
    <tr>
    <th>Id</th><th>UserName</th><th>Address</th><th>PhoneNo</th><th>ProjectDetails</th>
    </tr>
    <tr>
    <td>${details.id}</td><td>${details.userName}</td><td>${details.address}</td><td>${details.phoneNo}</td><td>${details.projectDetails}</td>
    </tr>
    </table>