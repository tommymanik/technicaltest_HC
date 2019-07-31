# technicaltest_HC


This project was done by tommy manik to complete technical tests from Home Credit.
if you successfully run this project in your local, you can create a new user by calling the API URL as below
http://localhost:8080/user/create
POST
request body :
  {
	"name":"yourName",
	"country":"Indonesia",
	"userRole":
			{
				"roleId":"R3",
				"roleName":"UserC"
			}
			
}

and if you want to create 3 groups of users, you can do it by calling the API URL as below
http://localhost:8080/user/9
GET

Response :
{
    "Modules": [
        {
            "moduleName": "PROMOCARD",
            "moduleOrder": "1"
        },
        {
            "moduleName": "FLASHCART",
            "moduleOrder": "3"
        },
        {
            "moduleName": "CATEGORYCARD",
            "moduleOrder": "2"
        },
        {
            "moduleName": "NEWSCARD",
            "moduleOrder": "5"
        },
        {
            "moduleName": "HISTORYCARD",
            "moduleOrder": "4"
        }
    ]
}
