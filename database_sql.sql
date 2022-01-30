use master
go
drop database proj
go
create database proj
go
use proj
go


create table patient
(
	patientId int identity primary key,
	pname varchar(50) not null,
	pass varchar(12) not null,
	gender varchar(10) not null,
	age int not null,
	email varchar(50) not null,
	phone varchar(12) not null,
)

create table doctor
(
	doctorId int identity primary key,
	email varchar(50) not null,
	pass varchar(12) not null,
	dname varchar(50) not null,
	specialisation varchar(50) not null,
	department varchar(20) not null,
	phNo varchar(13) not null
)

create table department
(
	deptname varchar(50) not null,
)

create table [admin]
(
	adminId varchar(12) primary key,
	email varchar(50) not null,
	pass varchar(12) not null
)
insert into [dbo].admin(adminId,email,pass)
values ('1','admin.mms@gmail.com','Admin321')

create table history
(
	patientId int foreign key references patient(patientId),
	bioData varchar(200) not null,
	allergies varchar(200) not null,
	socioEco varchar(200) not null,
	famHis varchar(200) not null,
	drugHis varchar(200) not null,
	primary key(patientId),
)
--drop table bills
create table bills
(
	billId  int identity not null,
	patientId int foreign key references patient(patientId),
	[address] varchar(50),
	CRC varchar(12),
	pin int,
	amount varchar(50) not null,
	primary key(billId,patientId),
)
create table prescription
(
	prescId int identity primary key,
	patientId int foreign key references patient(patientId),
	doctorname varchar(50) not null,
	amount varchar(50) not null,
	med varchar(50) not null,
	test varchar(50) not null,
)

create table schedule
(
	schId int identity primary key,
	doctorId int foreign key references doctor(doctorId),
	[time] varchar(12) not null,
	[status] varchar(12) not null,
	
)

create table appointment
(
	appointId int identity primary key,
	token varchar(12),
	patientId int foreign key references patient(patientId),
	doctorname varchar(50) not null,
	[time] varchar(12) not null,
)
create table review
(
	patName varchar(50),
	docName varchar(50),
    review varchar(100)
)

alter procedure EnterRev
@patn varchar(50),
@docn varchar(50),
@rev varchar(100)
as
begin
insert into [dbo].review (patName, docName, review)
values(@patn, @docn, @rev)
end
--doctors
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('ayesha@gmail.com','ayesha124','Dr.Ayesha Rizwan','Orthopaedics','Orthopaedics','03398383812') --1
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('maha@gmail.com','maha124','Dr.Maha Anwer','Orthopaedics','Orthopaedics','03398383238') --2
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('lg@gmail.com','lg124','Dr.Lg Sheikh','Orthopaedics','Orthopaedics','03328383238') --8
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('laiba@gmail.com','laiba124','Dr.Laiba Arshad','E N T','E N T','03398383318') --3
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('hassan@gmail.com','hassan124','Dr.Hassan Naeem','E N T','E N T','03348233838') --4
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('hira@gmail.com','hira124','Dr.Hira Ijaz','E N T','E N T','03398381238') --5
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('ahmed@gmail.com','ahmed124','Dr.Ahmed Ijaz','E N T','E N T','03398381238')
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('laraib@gmail.com','laraib124','Dr.Laraib Arshad','Psychiatry','Psychiatry','03391383838') --6
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('hadiya@gmail.com','hadiya123','Dr.Hadiya Kashif','Psychiatry','Psychiatry','03398763838') --9
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('riva@gmail.com','riva123','Dr.Riva Nouman','Psychiatry','Psychiatry','03398763838') --7
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('fatimah@gmail.com','fatimah123','Dr.Fatimah Rashid','Psychiatry','Psychiatry','03398763838') --10
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('ayda@gmail.com','ayda123','Dr.Ayda Anwer','Orthopaedics','Orthopaedics','03398763838')
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('sitara@gmail.com','sitara123','Dr.Sitara Anwer','Orthopaedics','Orthopaedics','03398763838')
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('taneer@gmail.com','taneer123','Dr.Taneer Nouman','Orthopaedics','Orthopaedics','03398763838')
insert [dbo].doctor(email,pass,dname,specialisation,department,phNo)
values ('shaiggan@gmail.com','shaiggan123','Dr.Muhammad Shaiggan','Orthopaedics','Orthopaedics','03398763838')


select* from doctor

--schedules
insert into [dbo].schedule(doctorId,[time],[status]) --ayesha
values(1,'2:00-3:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --maha 
values(2,'2:00-3:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --ayda 
values(12,'3:00-4:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --laiba ENT
values(4,'4:00-5:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --laiba ENT
values(4,'5:00-6:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --hassan ENT 
values(5,'3:00-4:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --hassan ENT
values(5,'4:00-5:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --maha,ortho
values(14,'5:00-6:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --maha,ortho
values(15,'4:00-5:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --maha,ortho
values(2,'4:00-5:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --maha,ortho
values(1,'4:00-5:00','free')
insert into [dbo].schedule(doctorId,[time],[status]) --maha,ortho
values(1,'6:00-7:00','free')

select* from schedule

--patients
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Nabeel','nabeel123','Male',21,'nabeel@gmail.com','03092978654')
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Hanzallah','hanz123','Male',22,'hanzallah@gmail.com','03092123654')
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Wanya','wanya123','Female',21,'wanya@gmail.com','03092978654')
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Mohib','mohib123','Male',21,'mohib@gmail.com','03092978654')
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Eman','eman123','Female',21,'eman@gmail.com','03092978654')
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Subhan','subhan','Male',21,'subhan@gmail.com','03092978654')
insert [dbo].patient(pname,pass,gender,age,email,phone)
values ('Umair','umair123','Male',21,'umair@gmail.com','03092978654')


--history
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (1,'Born on the 10th of August, 2000.','This is my Drug History','Diabetes','No allergies','This is my socio economic history')
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (2,'Born on the 8th of Januray, 1999.','This is my Drug History','Diabetes, Heart Diseases','Pollen allergy','This is my socio economic history')
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (3,'Born on the 24th of December, 2001.','This is my Drug History','Diabetes','No allergies','This is my socio economic history')
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (4,'Born on the 16th of April, 2000.','This is my Drug History','Diabetes','No allergies','This is my socio economic history')
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (5,'Born on the 14th of Februray, 2000.','This is my Drug History','Diabetes','Pollen','This is my socio economic history')
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (6,'Born on the  of 5th September, 2002.','This is my Drug History','Diabetes','No allergies','This is my socio economic history')
insert [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
values (7,'Born on the 18th of October, 2000.','This is my Drug History','Diabetes','Asthma','This is my socio economic history')

--prescription
insert into [dbo].prescription(patientId,doctorname,amount,med,test)--ENT 
values(1,'Dr.Laiba Arshad','panadol 1 tablet everyday, Montelukast 3 everyday','panadol, Montelukast','no test')
insert into [dbo].prescription(patientId,doctorname,amount,med,test)
values(6,'Dr.Ayesha Rizwan','panadol 2 tablets day with a meal','panadol','no test')

insert into [dbo].appointment(token,patientId,doctorname,time)
values(-1,2,'Dr.Maha Anwer',0)
insert into [dbo].appointment(token,patientId,doctorname,time)
values(-1,3,'Dr.Laiba Arshad',0)

select* from patient
select* from history
select* from appointment
select* from schedule
select* from doctor
select* from  review
select *from admin

create procedure ULogin
@email varchar(50),
@password varchar (20),
@found int output
AS
begin
	set @found=0
	IF EXISTS(SELECT * FROM patient WHERE email=@email AND (cast(pass as binary) = cast(@password as binary)))
	begin
		set @found=1
	end
	else IF EXISTS(SELECT * FROM doctor WHERE email=@email AND (cast(pass as binary) = cast(@password as binary)))
	begin
		set @found=2
	end
	else IF EXISTS(SELECT * FROM [admin] WHERE email=@email AND (cast(pass as binary) = cast(@password as binary)))
	begin
		set @found=3
	end
end

create procedure displayDoctor as
begin
	Select * from doctor
end

--book appointment
create procedure appoint
@pid int,
@docname varchar(50),
@found int out
As
BEGIN
begin
	set @found=0
	IF EXISTS(Select dname from doctor where dname=@docname)
	begin 
	set @found=1
	insert into [dbo].appointment(token,patientId,doctorname,time)
	values(-1,@pid,@docname,'0')
	end
end
END

--delete appointment
create procedure deleteApp
@pid int,
@docname varchar(50)
As
BEGIN
begin
	begin 
	delete from [dbo].appointment 
	where patientId=@pid AND doctorname=@docname
	end
end
END


create procedure SignUp
@name varchar(50), 
@email varchar(50),
@pin varchar(20),
@gender varchar(20),
@phoneNum char(12),
@age int,
@bioData varchar(200),
@drugHis varchar(200) ,
@famHis varchar(200) ,
@allergies varchar(200),
@socioEco varchar(200),
@Found int output
AS
BEGIN
begin transaction
save transaction savepoint
	set @Found=0
	begin try
	IF EXISTS(SELECT * FROM patient WHERE email=@email)
	begin 
		set @Found=1 --patient exists already
	end
	else
	begin
		set @Found=2 --add patient
		INSERT into [dbo].patient(pname,pass,gender,age,email,phone)
		VALUES (@name,@pin,@gender,@age,@email,@phoneNum)
		declare @pid int
		set @pid=
		(
			select patientId from patient where pname=@name
		)
		INSERT into [dbo].history(patientId,bioData,drugHis,famHis,allergies,socioEco)
		VALUES (@pid,@bioData,@drugHis,@famHis,@allergies,@socioEco)
	end
	end try
	begin catch 
	if @@trancount>0
	begin 
		rollback transaction savepoint
	end
end catch
commit transaction
END

DECLARE @Outflag int
EXECUTE SignUp
@name='Maarij', 
@email='maarij@gmail.com',
@pin='123',
@gender='M',
@phoneNum='03456789098',
@age=19,
@bioData='this is my biodataa',
@drugHis='this is my drug historyy',
@famHis='this is my famhistt',
@allergies='i dun have allergies',
@socioEco='this is my socioEco hist',
@Found = @Outflag output
SELECT @Outflag


create procedure changeStatus
@schId int
As
BEGIN
	begin
	IF EXISTS (Select schId from schedule where schId=@schId)
	begin
		update schedule set status='booked' 
		where schId=@schId
	end
	end
END

create procedure setToken
@dname varchar(50),
@pId int,
@token int,
@time varchar(12)
As
BEGIN
	begin
	IF EXISTS (Select patientId,doctorname from appointment 
				where patientId=@pId AND doctorname=@dname)
	begin
		update appointment set token=@token
		where patientId=@pId AND doctorname=@dname
	end
	begin
		update appointment set [time]=@time
		where patientId=@pId AND doctorname=@dname
	end
	end
END

--set prescription
create procedure setPresc
@med varchar(50),
@pid int,
@amount varchar(50),
@test varchar(50),
@dname varchar(50)
As
BEGIN
	begin
		insert into prescription(patientId,med,amount,test,doctorname)
		values(@pid,@med,@amount,@test,@dname)
	end
END


--set amount
create procedure setAmount
@amount varchar(50),
@pid int
As
BEGIN
	begin
		
		insert into bills(patientId,amount,pin,CRC,[address])
		values(@pid,@amount,NULL,NULL,NULL)
	end
END

--set payment
create procedure setPayment
@add varchar(50),
@bid int,
@crc varchar(12),
@pin int
As
BEGIN
	begin
		update bills set address=@add
		where billId=@bid
		update bills set pin=@pin
		where billId=@bid
		update bills set crc=@crc
		where billId=@bid
	end
END

--enroll doctor
create procedure enrollDoctor
@name varchar(50), 
@email varchar(50),
@pin varchar(20),
@phoneNum char(12),
@dept varchar(50),
@spec varchar(50),
@Found int output
AS
BEGIN
begin transaction
save transaction savepoint
	set @Found=0
	begin try
	IF EXISTS(SELECT * FROM doctor WHERE email=@email)
	begin 
		set @Found=1 --doc exists already
	end
	else
	begin
		set @Found=2 --add doctor
		INSERT into [dbo].doctor(email,pass,dname,specialisation,department,phNo)
		VALUES (@email,@pin,@name,@spec,@dept,@phoneNum)
	end
	end try
	begin catch 
	if @@trancount>0
	begin 
		rollback transaction savepoint
	end
end catch
commit transaction
END