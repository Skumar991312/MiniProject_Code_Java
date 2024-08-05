<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Report Applications</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  </head>
<body>
      <div class="container">
      
      <h2 class="m-3 p-3">Report Application</h2>
     
       <form:form action="searchData" modelAttribute="search" method="POST">
       
       <table>
        <tr>
        
         <td>Plan Name:</td>
       <td>
       <form:select path="planName">
        <form:option value="">-Select-</form:option>
        <form:options items="${names}"/>
        </form:select>
        </td>
        
        <td>Plan Status:</td>
       <td>
       <form:select path="planStatus">
        <form:option value="">-Select-</form:option>
        <form:options items="${status}"/>
        </form:select>
        </td>
       <td>Gender:</td>
       <td>
        <form:select path="gender">
       <form:option value="">-Select-</form:option>
        <form:option value="Male">Male</form:option>
         <form:option value="Fe-male">Fe-male</form:option>
       </form:select>
        </td> 
       
        </tr>
        
       <tr>
      <td>Start Date:</td>
        <td><form:input path="startDate" type="date" data-date-format="yyyy/MM/dd"/><td>
       <td>End Date :</td>
       <td><form:input path="endDate" type="date" data-date-format="yyyy/MM/dd"/></td>
      </tr>
         
        <tr>
        <td><a href="/" class="btn btn-secondary">Reset</a></td>
       <td><input type="submit" value="Search" class="btn btn-primary"></td>
      </tr>
         </table>
        </form:form>
        <hr/>
        
        <table class="table table-striped table-hover">
        <thead>
        <tr>
        <th>Id</th>
        <th>Holder Name</th>
        <th>Gender</th>
        <th>Plan Name</th>
        <th>Plan Status</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>BenefitAmt</th>
        </tr>
        </thead>
        
        <tbody>
       <c:forEach items="${plans}" var="plan" varStatus="index">
         <tr>
         <td>${index.count}</td>
         <td>${plan.citizenName}</td>
         <td>${plan.gender}</td>
         <td>${plan.planName}</td>
         <td>${plan.planStatus}</td>
          <td>${plan.planStartDate}</td>
          <td>${plan.planEndDate}</td>
          <td>${plan.benefitAmt}</td>
        </tr>
        </c:forEach>
        <tr>
        <c:if test="${empty plans}">
         <td colspan="9" style="text-align: center">No Records found</td>
        </c:if>
        </tr>
        </tbody>
        </table>
        
         <hr/>
        Export: <a href="">Excel</a> <a href="">PDF</a>
         
         
        </div>
    
   
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" 
  integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" 
  crossorigin="anonymous">

</script>
</body>
</html>