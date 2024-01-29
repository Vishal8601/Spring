<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
</head>
<body>
    <a href="/">+Add New Product</a>
    <table border="1">
<thead>
    <tr>
        <th>Sr.No</th>
        <td>Name</td>
         <td>Price</td>
         <td>Quantity</td>  
    </tr>
    </thead>
    <c:foreach item="${products}" var="product" varStatus="index">
        
        <tr>
            <td>${index.count}</td>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>${product.quantity}</td>
        </tr>
        
    </c:foreach>
    <tbody>
    </tbody>
    </table>
</body>
</html>