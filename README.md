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
<br/>
Retrive data from following API's you have to use authorization token for every following apis for header of request.
<br/>
Bearer take update Jwt token from above mentioned authentication API. 
<br/>
Ex: <br/>
Authorization: Bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJUZXN0VXNlciIsImV4cCI6MTY3MDExNDgzMywiaWF0IjoxNjcwMDc4ODMzfQ.SQOUKJLGfT_q9oCtq5EBTQgnG-p2AVljGd2hx-iVSUs

<br/>
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
