Create Table Trainer (
TrainerID integer Primary Key,
TrainerName Varchar(10) Not Null,
EmailID Varchar(10) Unique,
Phone Varchar(10) 
);


Insert into Trainer values (1, 'Abraham', 't1@i.com','9844499901');
Insert into Trainer values (2, 'Boyce', 't2@i.com','9844499902');
Insert into Trainer values (3, 'Camilla', 't3@i.com','9844499903');
Insert into Trainer values (4, 'Davis', 't4@i.com','9844499904');
Insert into Trainer values (5, 'Elsa', 't5@i.com','9844499905');

select * from trainer;

Create Table Course_Details (
 CourseID Char(3)Primary Key,
 CourseName Varchar(50)  Not Null
);


Insert into Course_Details values('GPF', 'Programming Fundamentals');
Insert into Course_Details values('GDB', 'Relational Database Management System');
Insert into Course_Details values('ODB', 'Oracle 9i');
Insert into Course_Details values('OVB', 'Visual Basic');
Insert into Course_Details values('JJA', 'Java');
Insert into Course_Details values('JJE', 'Java JEE1');

select * from course_details;

Create Table Batch_Schedule (
BatchName Varchar(8),
CourseID Char(3)  References Course_Details(CourseID),
Start_Date Date Not Null,
End_Date Date Not Null,
Constraint pk_BS Primary Key (BatchName,CourseID)
); 

Insert into Batch_Schedule values ('Batch1', 'GPF', '2008-1-10', '2008-1-20');
Insert into Batch_Schedule values ('Batch1', 'GDB', '2008-1-21', '2008-1-31');
Insert into Batch_Schedule values ('Batch1', 'ODB', '2008-2-1', '2008-2-20');
Insert into Batch_Schedule values ('Batch1', 'OVB', '2008-2-21', '2008-2-28');
Insert into Batch_Schedule values ('Batch2', 'GPF', '2008-1-10', '2008-1-20');
Insert into Batch_Schedule values ('Batch3', 'GPF', '2008-1-21', '2008-2-1');
Insert into Batch_Schedule values ('Batch3', 'JJA', '2008-2-2', '2008-2-8');
Insert into Batch_Schedule values ('Batch2', 'OVB', '2008-2-2', '2008-2-8');
Insert into Batch_Schedule values ('Batch1', 'JJE', '2008-2-2', '2008-2-8');

select * from batch_schedule;

Create Table FeedBack(
TrainerID integer References Trainer(TrainerID),
CourseID Char(3),
BatchName Varchar(8) ,
FBRate integer Not Null  Check (FBRate between 0 and 5),
Constraint fk_FB_CID_BN Foreign Key (BatchName, CourseID) References Batch_Schedule(BatchName,CourseID),
Constraint pk_FB Primary Key (TrainerID,CourseID,BatchName)
);

Insert into Feedback values (1, 'GPF','Batch1',4.18);
Insert into Feedback values (2, 'GDB','Batch1',4.65);
Insert into Feedback values (3, 'ODB','Batch1',4.51);
Insert into Feedback values (4, 'OVB','Batch1',4.68);
Insert into Feedback values (5, 'GPF','Batch2',4.28);
Insert into Feedback values (1, 'ODB','Batch1',4.28);
Insert into Feedback values (1, 'GDB','Batch1',4.32);
Insert into Feedback values (1, 'OVB','Batch1',4.32);
Insert into Feedback values (1, 'JJE','Batch1',4.32);
Insert into Feedback values (1, 'JJA','Batch3',4.32);

select * from feedback;





