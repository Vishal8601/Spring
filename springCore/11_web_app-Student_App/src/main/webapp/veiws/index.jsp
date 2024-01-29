<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>
<head>
</head>
<body>


  <h3>Student Enquiry  Form </h3>
    <p>
        <font color='green'>${msg}</font>
    </p>
 <form:form action="save" modelAttribute="student" method="post">
   
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><form:input path="email"/></td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td><form:radiobutton path="gender" value="M"/>Male
                <form:radiobutton path="gender" value="F"/>Female
            </td>
        </tr>
        <tr>
            <td>Course:</td>
            <td>
                <form:select path="course">
                <form:option value="">--Select--</form:option>
                <form:options items="${courses}"/>
                </form:select>
            </td>
        </tr>
        
        <tr>
            <td>Timing</td>
            <td>
                <form:checkbox path="timing" value="morning"/>Morning
                <form:checkbox path="timing" value="afternoon"/>Afternoon
                <form:checkbox path="timing" value="Evening"/>Evening
            </td>
        </tr>
        
        <tr>
            <td></td>
            <td><input type="submit" value="save"/></td>
            
        </tr>
    </table>
 </form:form>

</body>
</html>