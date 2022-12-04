# Student-Database-System
STUDENT DATABASE MANAGEMENT SYSTEM


Description of project:
Project Student database management system mainly deals with the maintaining of personal information of student and also to make marksheet of student. The user can manipulate and access the data from database. From this project we can maintain progress of student

Our application contains three pages in first page it contains option three options
1)Student personal information
2)Student’s marksheet 
3) Database
In the first page user can choose any one of the option as his need each option has unique purpose
[refer readme.pdf]
On clicking on student personal Info we can see this page

[refer readme.pdf]
We need to enter the details in page 2 by clicking insert the data will store in database
Creating table in database Syntax:
SQL> create table studentdetails(NAME VARCHAR2(10),HALLTICKET VARCHAR2(10),SSC_MARKS float
,PHONENUMBER int ,constraint sd primary key(HALLTICKET));

[refer readme.pdf]
In this table we can store phone_number , sscmarks , in student personal table, the user can access personal information of each student by entering unique Hallticket number in page 3 database
 
On clicking the student marks we can see this page:

[refer readme.pdf]


We need to enter the details in this page:

 
After enter the details we need to click on result button we will get results

[refer readme.pdf]

By clicking on Save(button) details will be stored in database
->creating table to store marksheet
Syntax:

create table marksheet(HALLTICKET varchar2(12),NAME varchar2(10),SANSKRIT int ,ENG int,MATH1 int,MATH2 int ,PHY int ,CHEM int ,TOTAL int ,GRADE varchar2(2),STASTUS varchar2(12));
 
On clicking database option it will take to 3rd page :

On this we need to enter Hallticket number
On clicking Login_result it will show particular student marks information

 
On clicking Login_personal_info it will show particular student personal information



On clicking delete it will details of particular student details from database

 
From these Application we can make student database of personal details like phonenumber ,ssc marks,name .we can also make student progress report consisting of each subject individual marks ,total marks ,grade and pass or fail status .
 

