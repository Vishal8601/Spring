<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<html>
<head>
</head>
<body>
<h3>Product Info</h3>
    <p>
        <font color="green">${msg}</font>
    </p>
<form:form action="product" modelAttribute="p" method="post">
    
    <table>
        <tr>
            <td>Name:</td>
            <td>
                <form:input path="name"/>
            </td>
          </tr>
        <tr>
            <td>Price:</td>
            <td>
                <form:input path="price"/>
            </td>
        </tr>
        <tr>
            <td>Quantity:</td>
            <td>
                <form:input path="quantity"/>
            </td>
        </tr>
           <tr> 
            <td>
                <input type="button" value="save">  
            </td>
       
        </tr>
    </table>
    </form:form>
    <a href="product">View Product</a>
</body>
</html>