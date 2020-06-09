create table CUSTOMER_DETAILS
(
   ID integer AUTO_INCREMENT,
   CUSTOMER_ID varchar(25) not null,
   NAME varchar(50) not null,
   EMAIL varchar(50) not null,
   MOBILE_NUMBER varchar(15) not null,
   NOTIFICATION_PREFERENCE varchar(5) not null,
   primary key(id)
);

insert into CUSTOMER_DETAILS
(CUSTOMER_ID, NAME, EMAIL, MOBILE_NUMBER, NOTIFICATION_PREFERENCE)
values ('001', 'Prasad', 'prasad@g.com', '000000000000', 'SMS');

insert into CUSTOMER_DETAILS
(CUSTOMER_ID, NAME, EMAIL, MOBILE_NUMBER, NOTIFICATION_PREFERENCE)
values ('002', 'Suman Agarwal', 'sumanshaw1193@gmail.com', '+919022310619', 'MAIL');

insert into CUSTOMER_DETAILS
(CUSTOMER_ID, NAME, EMAIL, MOBILE_NUMBER, NOTIFICATION_PREFERENCE)
values ('003', 'Paritosh Agarwal', 'paritosh30sep@gmail.com', '+917875028423', 'SMS');
