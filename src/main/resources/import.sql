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


insert into House(id)values (1)
insert into House(id)values (2)
insert into House(id)values (3)
insert into House(id)values (4)


insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (1,'Wall1','Description Wall1',10,1,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (2,'Wall2','Description Wall2',10,1,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (3,'Wall3','Description Wall3',10,1,1,5,8)
insert into Wall(id, name, description, price,external_wall_Id,category,width,height)values (4,'Wall1','Description Wall4',10,2,1,5,8)


insert into Foundation(id, name, description, price,category)values (1,'Foundation1','Description Foundation1',10,5)

insert into Roof(id, name, description, price,category)values (1,'Roof1','Description Roof1',10,4)

insert into Window(id, name, description, price, typeOfOpening, withCurtain,external_window_Id,category)values (1,'Window1','Description Window1',10,1,true,1,2)
insert into Window(id, name, description, price, typeOfOpening, withCurtain,external_window_Id,category)values (2,'Window2','Description Window2',10,1,true,2,2)

insert into Door(id, name, description, price, typeOfOpening,external_door_Id,category)values (1,'Door1','Description Door1',10,1,1,3)


insert into Product(PROD_ID,name, description, HOUSE_ID,isBasicDesign) values (1, 'Duplex','This is the description of the house_style Duplex',1,true)
insert into Product(PROD_ID,name, description, HOUSE_ID,isBasicDesign) values (2, 'Green','This is the description of the house_style Green',2,true)
insert into Product(PROD_ID,name, description, HOUSE_ID,isBasicDesign) values (3, 'Town House','This is the description of the house_style Twon House',3,true)
insert into Product(PROD_ID,name, description, HOUSE_ID,isBasicDesign) values (4, 'Multiple Section','This is the description of the house_style Multiple Section',4,true)

