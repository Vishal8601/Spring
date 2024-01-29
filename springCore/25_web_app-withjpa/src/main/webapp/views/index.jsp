<!DOCTYPE head PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
</head>
<body>
<h3>Book Details</h3>
<form action="book">
        Book Id : <input type="text" name="id"/>
        <input type="submit" value="search"/>
      </form>
      <hr/>
      
    Book Id : ${book.bookId}<br/>
    Book Name : ${book.bookName}<br/>
    Book Price : ${book.bookPrice}<br/>
</body>
</html>