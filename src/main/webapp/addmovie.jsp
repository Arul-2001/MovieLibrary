<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>Add Movie</h2>
   
   <form action="savemovie" method="post" enctype="multipart/form-data">
   movieId<input type="text" name="movieid"><br>
   movieName<input type="text" name="moviename"><br>
   moviePrice<input type="text" name="movieprice"><br>
   movieRating<input type="text" name="movierating"><br>
   movieGenre<input type="text" name="moviegenre"><br>
   movieLanguage<input type="text" name="movielanguage"><br>
   movieImage<input type="file" name="movieimage"><br>
   <body style="background-color:pink;">
   <input type="submit">
   
   
   </form>

 


</body>
</html>