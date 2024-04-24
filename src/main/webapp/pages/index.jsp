<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
 <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Reports App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
 
</head>
<body>
 <div class="container"  >
  <h3 Class="pt-3 pb-3">Report application</h3>
   
   <form:form action="" modelAttribute="search" method="Post">
     <table>
       <tr>
          <td>Plan Name:</td>
          <td>
              <form:select path="planName">
                  <form:option value="">-select-</form:option>
                  <form:options items="${name}"/>
               </form:select>
            
          </td>
          
          <td>Plan Status:</td>
          <td>
              <form:select path="planStatus">
                  <form:option value="">-select-</form:option>
                  <form:options items="${status}"/>
               </form:select>
            
          </td>
          <td>Gender:</td>
          <td>
                 <form:select path="gender">
                 <form:option value="">-select-</form:option>
                 <form:option value="Male">Male</form:option>
                 <form:option value="Fe-Male">Fe-Male</form:option>
                </form:select>
            
          </td>
       </tr>
        <tr>
            <td> StartDate :</td>
            <td><form:input path="startDate" type="date" date-date-formate="mm/dd/yyyy"/>
            
            </td>
            <td> EndDate :</td>
            <td><form:input path="endDate" type="date" date-date-formate="mm/dd/yyyy"/>
            
            </td>
       </tr>
       <tr>
         <td><input type="submit" value="Serach" class=" btn btn-danger"/></td>
       </tr>
     </table>
   </form:form>
 
  
   <hr><hr>
   
  Export :<a href="">excel</a>  <a href="">pdf</a>
  </div> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 

</body>
</html>