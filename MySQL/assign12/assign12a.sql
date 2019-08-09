select t.trainername,f.CourseID, (select coursename from course_details d where d.CourseID=f.CourseID) as 'Course Name' from trainer t, feedback f where t.TrainerID=f.trainerid;

select t.trainername from trainer t, feedback f where t.trainerid=f.trainerid group by f.TrainerID having count(f.CourseID)>1;

select t.trainerid,t.trainername,count(distinct f.CourseID) as 'Number of Course' from trainer t, feedback f where t.trainerid=f.trainerid group by trainerid;

select t.trainerid,t.trainername,(select coursename from course_details d where d.CourseID=f.CourseID) as 'Course Name',(select count(courseid) from batch_schedule b where f.CourseID=b.courseID)as 'Number of times Taught' from trainer t, feedback f where t.trainerid=f.trainerid; 

select BatchName,CourseID,(End_Date-Start_Date) as 'Duration in Days' from batch_schedule;

select f.TrainerID,(select t.trainername from trainer t where t.trainerid=f.TrainerID) as TrainerName,b.CourseID,(select c.coursename from course_details c where c.courseid=f.courseID) as 'CourseName',b.BatchName from batch_schedule b,feedback f where Start_Date<'2008-1-30' and b.BatchName=f.BatchName and b.CourseID=f.CourseID;

select f.trainerid,f.BatchName from feedback f group by(batchname) having count(CourseID)>1 ;

select t.trainername from trainer t, feedback f where t.trainerid=f.trainerid group by f.TrainerID having count(f.CourseID)>=(select count(distinct CourseID) from course_details);




