# test-lendo
Public api processing and authentication

# Get Authentication token
Method : Post 
URL : http://localhost:8090/auth

Request Body : {
                   "username": "TestUser",
                   "password": "TestPassword"
               }
               
Header : Content-Type:application/json



+++++++++++++++++++++++++++APIs  +++++++++++++++++++++++
Retrive data from following API's you have to use authorization token for every following apis for header of request.

Authorization:Bearer take update Jwt token from aout mentioned api

#User
http://localhost:8090/user/getAll 
<br/>

# Post
http://localhost:8090/post/getAll
<br/>
http://localhost:8090/post/getByUserId/3907

# Comments
http://localhost:8090/comment/getAll
<br/>
http://localhost:8090/comment/getByPostId/1881
