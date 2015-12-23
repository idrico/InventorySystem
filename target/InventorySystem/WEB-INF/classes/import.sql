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


--
insert into Category(id,name) values (1,'Walls')
insert into Category(id,name) values (2,'Windows')
insert into Category(id,name) values (3,'Doors')
insert into Category(id,name) values (4,'Roofs')
insert into Category(id,name) values (5,'Foundations')

insert into House(id,houseStyle)values (1,1)
insert into House(id,houseStyle)values (2,2)
insert into House(id,houseStyle)values (3,3)
insert into House(id,houseStyle)values (4,4)
insert into House(id,houseStyle)values (5,5)


insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (1,'Wall1','Description Wall1',10,1,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (2,'Wall2','Description Wall2',10,1,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (3,'Wall3','Description Wall3',10,1,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (4,'Wall4','Description Wall4',10,2,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (5,'Wall5','Description Wall5',10,3,1,5,8)

insert into Foundation(id, name, description, price,category)values (1,'Foundation1','Description Foundation1',10,5)
insert into Foundation(id, name, description, price,category)values (2,'Foundation2','Description Foundation2',10,5)
insert into Foundation(id, name, description, price,category)values (3,'Foundation2','Description Foundation3',10,5)
insert into Foundation(id, name, description, price,category)values (4,'Foundation2','Description Foundation4',10,5)


insert into Roof(id, name, description, price,category)values (1,'Roof1','Description Roof1',10,4)
insert into Roof(id, name, description, price,category)values (2,'Roof2','Description Roof2',10,4)
insert into Roof(id, name, description, price,category)values (3,'Roof3','Description Roof3',10,4)


insert into Window(id, name, description, price, typeOfOpening, withCurtain,external_window_Id,category)values (1,'Window1','Description Window1',10,1,true,1,2)
insert into Window(id, name, description, price, typeOfOpening, withCurtain,external_window_Id,category)values (2,'Window2','Description Window2',10,1,true,2,2)

insert into Door(id, name, description, price, typeOfOpening,external_door_Id,category)values (1,'Door1','Description Door1',10,1,1,3)


insert into Product(PROD_ID, HOUSE_ID,name,isBasicDesign,price,timeToComplete) values (1,1,'Model1',true,100,CURRENT_DATE())
insert into Product(PROD_ID, HOUSE_ID,name,isBasicDesign,price,timeToComplete) values (2,2,'Model2',true,90,CURRENT_DATE())
insert into Product(PROD_ID, HOUSE_ID,name,isBasicDesign,price,timeToComplete) values (3,3,'Model3',true,110,CURRENT_DATE())
insert into Product(PROD_ID, HOUSE_ID,name,isBasicDesign,price,timeToComplete) values (4,4,'Model4',true,85,CURRENT_DATE())
insert into Product(PROD_ID, HOUSE_ID,name,isBasicDesign,price,timeToComplete) values (5,5,'Model5',true,99,CURRENT_DATE())

