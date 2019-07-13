<html>
<head>
<title>Login Page</title>
</head>
<body>
<% 
String name=(String)session.getAttribute("username"); 
if(name!=null){
	out.print("Hello User: You have entered the name: "+name); 

}else {
	out.print("<a href="+"/login"+" >Please login</a>"); 

}


%> 

    <form action="/add-todo" method="POST">
        Description : <input name="desc" type="text" /> <input type="submit" value="add" />
    </form>
</body>
</html>