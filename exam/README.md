# HRMS Services

# DataBase Connection
 create schema name as test
username - "postgress"
password - "123"

# Api Url
http://localhost:9112/exam-service/swagger-ui/index.html#/employee-controller/saveEmployeeDetails
end point : /employee/save

# Sample

{
"empId": "3fa85f64-5717-4562-b3fc-2c963f66afa6",
"fullName": "Sarath",
"designation": "Developer",
"mobile": "9995944187",
"email": "s@gmail.com",
"dateOfBirth": "02-07-2023"
}

# (Story)
/************************/
1. Create a HRMS service with the following fields:
- empid (UUID)
- fullname (string)
- designation (string)
- mobile (string)
  -email(string)
- dateOfBirth (Date)

2. Data Validations:
- full name cannot be empty
- designation cannot be empty
- email cannot be empty
- mobile cannot be empty
- dateOfBirth should be a paste date
  