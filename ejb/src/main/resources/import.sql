--
-- JBoss, Home of Professional Open Source
-- Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
-- contributors by the @authors tag. See the copyright.txt in the
-- distribution for a full listing of individual contributors.
--
-- Licensed under the Apache License, Version 2.0 (the "License");
-- you may not use this file except in compliance with the License.
-- You may obtain a copy of the License at
-- http://www.apache.org/licenses/LICENSE-2.0
-- Unless required by applicable law or agreed to in writing, software
-- distributed under the License is distributed on an "AS IS" BASIS,
-- WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
-- See the License for the specific language governing permissions and
-- limitations under the License.
--

-- You can use this file to load seed data into the database using SQL statements

insert into HouseStyle(id, description) values (1, 'Duplex')
insert into HouseStyle(id, description) values (2, 'Green')
insert into HouseStyle(id, description) values (3, 'Town House')
insert into HouseStyle(id, description) values (4, 'Multiple Section')

insert into House(id)values (1)

insert into Wall(id, name, description, price,external_wall_Id)values (1,'Wall1','Description Wall1',10,1)
insert into Wall(id, name, description, price,external_wall_Id)values (2,'Wall2','Description Wall2',10,1)
insert into Wall(id, name, description, price,external_wall_Id)values (3,'Wall3','Description Wall3',10,1)

insert into Foundation(id, name, description, price)values (1,'Foundation1','Description Foundation1',10)

insert into Roof(id, name, description, price,)values (1,'Roof1','Description Roof1',10)

insert into Window(id, name, description, price, typeOfOpening, withCurtain,external_window_Id)values (1,'Window1','Description Window1',10,1,true,1)
insert into Window(id, name, description, price, typeOfOpening, withCurtain,external_window_Id)values (2,'Window2','Description Window2',10,1,true,2)

insert into Door(id, name, description, price, typeOfOpening,external_door_Id)values (1,'Door1','Description Door1',10,1,1)

insert into Product(PROD_ID,name, description, HOUSE_ID) values (1, 'HouseStyle_1','Description HouseStyle_1',1)

insert into ZipCode(id, city, state) values (81027, 'San Felice a Cancello', 'Italy')
insert into ZipCode(id, city, state) values (20133, 'Via Sismondi', 'Italy')
insert into ZipCode(id, city, state) values (20121, 'Via Lomellina', 'Italy')

insert into Customer(id, name, email,phoneNumber,zipCode) values (1, 'Angelo', 'angeloverdicchio@hotmail.it','3391827103',81027)
insert into Customer(id, name, email,phoneNumber,zipCode) values (2, 'Lucia', 'luciableve@hotmail.it','3391827103',20133)
insert into Customer(id, name, email,phoneNumber,zipCode) values (3, 'Francesco', 'francescoverdicchio@hotmail.it','3391827103',20133)


insert into Consultation(id, CUSTOMER_ID) values (1, 1)
insert into Consultation(id, CUSTOMER_ID) values (2, 1)
insert into Consultation(id, CUSTOMER_ID) values (3, 2)
insert into Consultation(id, CUSTOMER_ID) values (4, 3)


insert into CompletedDesign(COMPLETED_DESIGN_ID,CONSULTATION_ID) values (1,1)
insert into CompletedDesign(COMPLETED_DESIGN_ID,CONSULTATION_ID) values (2,1)
insert into CompletedDesign(COMPLETED_DESIGN_ID,CONSULTATION_ID) values (3,2)
insert into CompletedDesign(COMPLETED_DESIGN_ID,CONSULTATION_ID) values (4,3)
insert into CompletedDesign(COMPLETED_DESIGN_ID,CONSULTATION_ID) values (5,4)






