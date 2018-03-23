DROP TABLE "objects";
DROP TABLE "parameters";
DROP TABLE "types";
DROP TABLE "attributes";
DROP TABLE "grants";
DROP TABLE "roles";

CREATE TABLE "types" (
  "type_id" NUMBER(20,0) NOT NULL,
  "parent_id" NUMBER(20,0) NOT NULL ,
  "position"  VARCHAR2(20) NOT NULL,
  CONSTRAINT "type_pk" PRIMARY KEY ("type_id"),
  CONSTRAINT "types_types_fk" FOREIGN KEY ("parent_id") REFERENCES "types"
) ;
CREATE TABLE "objects" (
  "id" NUMBER(20,0) NOT NULL ,
  "type_id" NUMBER(20,0) NOT NULL ,
  "name" VARCHAR2(100) NOT NULL ,
  CONSTRAINT "objects_pk" PRIMARY KEY ("id"),
  CONSTRAINT "objects_type_fk" FOREIGN KEY ("type_id") REFERENCES "types"
) ;
CREATE TABLE "attributes" (
  "attributes_id" NUMBER(20,0) NOT NULL ,
  "type_id" NUMBER(20,0) NOT NULL,
  "experience"  VARCHAR2(20) NOT NULL ,
  CONSTRAINT "attributes_pk" PRIMARY KEY ("attributes_id"),
  CONSTRAINT "attributes_types_fk" FOREIGN KEY ("type_id") REFERENCES "types"
) ;
CREATE TABLE "parameters" (
  "id" NUMBER(20,0) NOT NULL ,
  "attributes_id" NUMBER(20,0) NOT NULL ,
  "birthday" DATE NOT NULL ,
  "passport" VARCHAR2(20),
  CONSTRAINT "parameters_pk" PRIMARY KEY ("id"),
  CONSTRAINT "parameters_objects_fk" FOREIGN KEY ("id") REFERENCES "objects",
  CONSTRAINT "parameters_attributes_fk" FOREIGN KEY ("attributes_id") REFERENCES "attributes"
) ;
CREATE TABLE "roles" (
  "roles_id"   NUMBER(20, 0) NOT NULL,
  "type_of_role" VARCHAR2(100) NOT NULL,
  CONSTRAINT "roles_pk" PRIMARY KEY ("roles_id")
);
CREATE TABLE "grants" (
  "roles_id"   NUMBER(20, 0) NOT NULL,
  "types_id"   NUMBER(20, 0),
  "id" NUMBER(20, 0),
  "read"      NUMBER(1, 0)  NOT NULL,
  "write"     NUMBER(1, 0)  NOT NULL,
  CONSTRAINT "grants_pk" PRIMARY KEY ("roles_id", "types_id", "id"),
  CONSTRAINT "grants_roles_fk" FOREIGN KEY ("roles_id") REFERENCES "roles",
  CONSTRAINT "grants_types_fk" FOREIGN KEY ("types_id") REFERENCES "types",
  CONSTRAINT "grants_objects_fk" FOREIGN KEY ("id") REFERENCES "objects"
);

Insert into "types" values (1,1, 'assistant');
Insert into "types" values (2,2, 'confident worker');
Insert into "types" values (3,3, 'manager');

Insert into "objects" values (1,1,'Chandler Bing');
Insert into "objects" values (2,1, 'Fibie Buffe');
Insert into "objects" values (3,1, 'Raychel Green');
Insert into "objects" values (4,2, 'Monica Geller');
Insert into "objects" values (5,2, 'Ross Geller');
Insert into "objects" values (6,3, 'Joy Tribiany');

Insert into "attributes" values (1,1,'1-3 years');
Insert into "attributes" values (2,2,'4-10 years');
Insert into "attributes" values (3,3,'more than 10 years');

Insert into "parameters" values (1,1,to_date('1993-04-06','yyyy/mm/dd'),'DC434555');
Insert into "parameters" values (2,1,to_date('1986-10-03','yyyy/mm/dd'),'MO445566');
Insert into "parameters" values (3,1,to_date('1997-03-10','yyyy/mm/dd'),'DP987665');
Insert into "parameters" values (4,2,to_date('1993-11-11','yyyy/mm/dd'),'DC333555');
Insert into "parameters" values (5,2,to_date('1984-04-12','yyyy/mm/dd'),'LK654437');
Insert into "parameters" values (6,3,to_date('1993-04-06','yyyy/mm/dd'),'DO235689');

Insert into "roles" values (1, 'admin');
Insert into "roles" values (2, 'user');