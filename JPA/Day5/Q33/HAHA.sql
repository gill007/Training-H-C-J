CREATE DEFINER=`root`@`localhost` FUNCTION `jobDescription`(jobcode integer) RETURNS varchar(100)
    DETERMINISTIC
BEGIN
declare x varchar(100);
if (jobcode=1)
 THEN set x = "PRESIDENT"; 
elseIF (jobcode=2)
  THEN set x= "MANAGER";
elseif(jobcode=3)
 THEN set x= "SUPERVISOR";
elseif (jobcode=4)
 THEN set x= "ENGINEER";
 END IF;

RETURN (x);
end