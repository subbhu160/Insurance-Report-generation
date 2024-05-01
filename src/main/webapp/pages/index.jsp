<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="C" %>
<html>
<head>
  
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Reports App</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
      <body style="background-color:black">
</head>
<body>

<div class=" container p-3 mb-2 bg-dark text-white">
 
  <h3 Class="pt-3 pb-3 ">Report application</h3>
   
   <form:form action="search" modelAttribute="search" method="POST">
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
         <td class="btn btn-secondary"><a href="/">Reset</a></td>
         <td><input type="submit" value="Serach" class=" btn btn-danger"/></td>
       </tr>
     </table>
   </form:form>
 
  
   <hr><hr>
   
   
    <table class="table  table-striped table-hover">
    <thead>
       <tr> 
         <th>Index</th>
         <th>CitizenId</th>
         <th>CitizenName</th>
         <th>Gender</th>
         <th>PlanName</th>
         <th>PlanStatus</th>
         <th>PlanStartDate</th>
         <th>PlanEndDate</th>
         <th>BenefitAmt</th>
         <th></th>
       </tr>
     </thead>
     
     <tbody>
         <C:forEach items="${plans}" var="plan" varStatus="index">
           <tr>
             <td>${index.count}</td>
             <td>${plan.citizenId}</td>
             <td>${plan.citizenName}</td>
             <td>${plan.gender}</td>
             <td>${plan.planName}</td>
             <td>${plan.planStatus}</td>
             <td>${plan.planStartDate}</td>
             <td>${plan.planEndDate}</td>
             <td>${plan.benefitAmt}</td>
           </tr>
         </C:forEach>
         <tr>
         <C:if test="${empty plans}">
           <td colspan="9" style="text-align: center "> No records found </td>
         </C:if>
         </tr>
       </tbody>
       
    </table>
   
  Export :<a href="">excel</a>  <a href="">pdf</a>
  
 </div> 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
 

</body>
</html>