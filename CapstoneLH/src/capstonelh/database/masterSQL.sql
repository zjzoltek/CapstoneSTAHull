

---------------------------------------------
--DROP ALL TABLES--
---------------------------------------------
DROP TABLE Contact;
DROP TABLE Business;
DROP TABLE Inspection_report;
DROP TABLE Loss_Reduction_Program;

DROP TABLE Property;

DROP TABLE Titles_Table;
DROP TABLE Quadrant;
DROP TABLE Zipcode_Table;
DROP TABLE Phone_Type;
DROP TABLE EC_Role;
DROP TABLE Inspector;
DROP TABLE Signator;
DROP TABLE Occupancy_Class_Codes;
DROP TABLE Administration_Codes;
DROP TABLE Permits;
DROP TABLE Inspection_Codes;

-----------------------------------------------------
--CREATE ALL REFERENCE TABLES--
-----------------------------------------------------

CREATE TABLE Titles_Table
(
    Title VARCHAR(32) UNIQUE NOT NULL,

    PRIMARY KEY(Title)
);

CREATE TABLE Quadrant
(
    Quadrant VARCHAR(2) UNIQUE NOT NULL,
    Description VARCHAR(10) NOT NULL,

    PRIMARY KEY(Quadrant)
);

CREATE TABLE Zipcode_Table
(
    Zipcode INT UNIQUE NOT NULL,
    City VARCHAR(12) NOT NULL DEFAULT 'Lees summit',
    State VARCHAR(2) NOT NULL DEFAULT 'MO',
    PRIMARY KEY(Zipcode)
);

CREATE TABLE Phone_Type
(
    Phone_Type VARCHAR(9) UNIQUE NOT NULL DEFAULT 'Cell',

    PRIMARY KEY(Phone_Type)
);

CREATE TABLE EC_Role
(
    EC_Role VARCHAR(4) UNIQUE NOT NULL,
    Description VARCHAR(22) NOT NULL,

    PRIMARY KEY(EC_Role)
);

CREATE TABLE Inspector
(
    Last_Name VARCHAR(16) NOT NULL,
    First_Name VARCHAR(16) NOT NULL,

    PRIMARY KEY(Last_Name,First_Name),
    KEY(First_Name)
);

CREATE TABLE Signator 
(
    Last_Name VARCHAR(16) NOT NULL,
    First_Name VARCHAR(16) NOT NULL,

    PRIMARY KEY(Last_Name,First_Name),
    KEY(First_Name)
);

CREATE TABLE Occupancy_Class_Codes
(
    Occupancy_Code VARCHAR(127) NOT NULL UNIQUE,
    Description VARCHAR(64) NOT NULL,

    PRIMARY KEY(Occupancy_Code)
);

CREATE TABLE Administration_Codes
(
    Admin_Code VARCHAR(7) UNIQUE NOT NULL,
    Description VARCHAR(64) NOT NULL,
					
PRIMARY KEY(Admin_Code)	
);

CREATE TABLE Permits
(
    Permit_Code VARCHAR(11) NOT NULL,
    Description VARCHAR(48) NOT NULL,

    PRIMARY KEY(Permit_Code)
);

CREATE TABLE Inspection_Codes
(
    Inspection_Code  VARCHAR(5) UNIQUE NOT NULL,
    Description VARCHAR(127) NOT NULL,
	
    PRIMARY KEY(Inspection_Code)
);

---------------------------------------------------
--POPULATE REFERENCE TABLES--
---------------------------------------------------

INSERT INTO Titles_Table(Title)
VALUES
('Owner'),
('Co-Owner'),
('General Manager'),
('Shift Manager'),
('Employee'),
('Property Manager');

INSERT INTO Quadrant (Quadrant, Description)
VALUES
('NE', 'NorthEast'),
('NW', 'NorthWest'),
('SE', 'SouthEast'),
('SW', 'SouthWest');

INSERT INTO Zipcode_Table (Zipcode, City,State)
VALUES
(64063, 'Lees Summit','MO'),
(64064, 'Lees Summit','MO'),
(64081, 'Lees Summit','MO'),
(64082, 'Lees Summit','MO'),
(64086, 'Lees Summit','MO');

INSERT INTO Phone_Type(Phone_Type)
VALUES
('Home'),
('Business'),
('Cell');

INSERT INTO EC_Role (EC_Role, Description)
VALUES
('ECN1', 'Emergency Contact #1'),
('ECN2', 'Emergency Contact #2'),
('ECN3', 'Emergency Contact #3');

INSERT INTO Inspector (Last_Name, First_Name)
VALUES
('Adder',             'Ted'),
('Franklin',          'Benjamin'),
('FrankenStein', 'Victor'),
('Jackson',         'Andrew'),
('Prancer',          'Dancer'),
('Blitzen',           'Donner'),
('Vixen',             'Dasher'),
('Deer',              'John'),
('Bledsoe',         'Phillip'),
('Dobson',         'Andrew'),
('Weasley',        'Ron'),
('Malfoy',           'Draco'),
('Pettigrew',      'Peter'),
('Snape',           'Severus'),
('Potter',            'James'),
('Giant',             'Hagrid'),
('Lupin',            'Remus'),
('Sanders',        'Bernie'),
('House Elf',      'Dobby'),
('Madison',        'Billy');


INSERT INTO Signator (Last_Name, First_Name)
VALUES
('Smith',             'Andy'),
('Edison',           'Thomas'),
('Doe',               'John'),
('Leroy',             'Jennifer'),
('Party',              'Donner'),
('Cupid',             'Comet'),
('Outlaw',           'Major'),
('Doe',                'Jane'),
('Black',              'Jack'),
('Potter',             'Harry'),
('Granger',         'Hermione'),
('Riddle',            'Tom'),
('Black',             'Sirius'),
('Dumbledore',  'Albus'),
('Potter',            'Lily'),
('Griffin',            'Buckbeak'),
('Weasley',        'Ginny'),
('Killer',              'Zodiac'),
('House Elf',      'Creature'),
('Trump',            'Donald');

INSERT INTO Occupancy_Class_Codes(Occupancy_Code, Description)
VALUES
('A1_Exits','To Get Out'),
('A1_Fire_protection_System','Safety first'),
('A1_Housekeeping', 'Keeping safe area safe'),
('A1_Electrical', 'How Shocking'),
('A1_Misc', 'Anything else noob A1'),
('A1_Hazardous_Materials', 'Bad things are bad'),
('A1_Fire_Protection', 'If you see fire, run'),
('A2_Food_Place', 'Where you get food'),
('A3_Worship', 'Religious places etc.'),
('A4_Indoor_Sports', 'Arenas Courts'),
('A5_OutDoor_Sports', 'OutSide Sports');

INSERT INTO Administration_Codes(Admin_Code,Description)
VALUES
('102.3', 'Change of use or Occupancy'),
('102.4', 'Application of building code'),
('102.5', 'Residential Code'),
('102.10', 'Conflicting Provisions'),
('104.1', 'General Authority'),
('104.3', 'Right of Entry'),
('104.4', 'Identification'),
('104.6.2', 'Inspections '),
('104.10', 'Fire investigations');

INSERT INTO Permits(Permit_Code ,Description)
VALUES
('105.1.2','Types of permits, Operational and Constructional'),
('105.2.2','Inspection Authorized'),
('105.3.1.1','Expiration-Operation'),
('105.3.1.2','Expiration-Construction'),
('105.3.3','Occupancy Prohibited before approval'),
('105.3.5','Posting the permit'),
('105.4.2.1','Fire protection system shop drawings'),
('105.6.1','Aerosol products'),
('105.6.2','Amusement buildings'),
('105.6.3','Aviation Facilities'),
('105.6.4','Carnivals and fairs'),
('105.6.5','Cellulose nitrate films'),
('105.6.6','Combustible dust producing operations'),
('105.6.7','Combustible Fibers'),
('105.6.8','Combustible gases'),
('105.6.9','Covered and open mall buildings'),
('105.6.10','Cryogenic Fluids'),
('105.6.11','Cutting and Welding');

INSERT INTO Inspection_Codes(Inspection_Code, Description)
VALUES
('106.1','Inspection Authority. Inspector is good to go.');

--------------------------------------------
--CREATE PROPERTY TABLE--
-------------------------------------------

CREATE TABLE Property
(
Quadrant VARCHAR(2) NOT NULL,
sNumber INT NOT NULL,
Street VARCHAR(32) NOT NULL,
Suite_Unit INT NOT NULL,
Zipcode INT NOT NULL,
Last_Insp_of_IR DATE NOT NULL,
Last_Insp_of_LR DATE NOT NULL,
Property_ID INT UNIQUE,
Admin_Code VARCHAR(7) NOT NULL,
Occupancy_Code VARCHAR(64) NOT NULL,

PRIMARY KEY(Quadrant, sNumber, Street, Suite_Unit),
KEY(Property_ID),

FOREIGN KEY(Zipcode) REFERENCES Zipcode_Table(ZipCode),
FOREIGN KEY(Admin_Code) REFERENCES Administration_Codes(Admin_Code),
FOREIGN KEY(Occupancy_Code) REFERENCES Occupancy_Class_Codes(Occupancy_Code),
FOREIGN KEY(Quadrant) REFERENCES Quadrant(Quadrant)
);

-----------------------------------------------
--POPULATE PROPERTY TABLE--
-----------------------------------------------

INSERT INTO Property(Quadrant, sNumber, Street, Suite_Unit, Zipcode, Last_Insp_of_IR, Last_Insp_of_LR, Property_ID, Admin_Code, Occupancy_Code)
VALUES
('SW', 22008,  'State Route P',  0,     64082, '2016-01-16', '2016-01-16', 007, '104.1',    'A5_OutDoor_Sports'),
('SW', 2428,    'Peregrin St.',      931, 64063, '2005-05-05', '2001-12-01', 544, '104.1',    'A1_Misc'), 
('NW', 65432,  'AA',                    0,     64082, '2011-11-19', '2011-09-19', 321, '104.10',   'A1_Hazardous_Materials'),
('NE',  2425,    'Carousel Ct.',     0,     64086, '2010-11-17', '2010-09-25', 255, '102.5',    'A1_Misc'),
('NE',  777,      'Chateau Dr.',      0,     64064, '2011-03-19', '2011-05-19', 139, '104.6.2', 'A3_Worship'),
('SE',  1209,    'Meridian Dr.',      0,     64081, '2007-02-19', '2007-07-19', 075, '102.10',  'A3_Worship'),
('SE',  2425,    'Food Ave.',         120, 64082, '2009-12-20', '2001-01-12', 789, '102.3',    'A1_Electrical'),
('SE',  20001,  'Benjamin Blvd.',  0,    64082, '2006-07-15', '2006-07-29', 215, '104.1',    'A3_Worship'),
('NE',  20321,  'MarcoPolo Pl.',   0,     64081, '2007-01-19', '2007-01-01', 152, '104.1',    'A1_Fire_Protection'),
('NW', 16203,  'Lindsey Ln.',       0,     64063, '2006-07-19', '2006-07-19', 512, '104.3',    'A3_Worship'),
('NW', 22069,  'Ashford Ct.',       619, 64064, '2012-01-09', '2002-10-20', 902, '102.4',    'A1_Housekeeping'),
('SW', 52136,  'Kristens Rd.',      0,     64081, '2005-02-15', '2012-12-19', 236, '102.10',  'A3_Worship'),
('SE',  12358,  'Connors Ln',       0,     64086, '2011-07-17', '2102-02-20', 210, '104.3',    'A2_Food_Place'),
('NE',  772,      'Chateau Dr.',      0,     64063, '1992-09-18', '2009-04-12', 060, '104.4',   'A2_Food_Place'),
('NW', 16205,  'Lindsey Ln.',       0,     64082, '2006-07-18', '2006-07-18', 251, '104.4',   'A1_Fire_Protection'),
('SW', 70253,  'Hotel Blvd.',        420, 64086, '2011-11-21', '2003-05-22', 888, '102.3',    'A5_OutDoor_Sports'),
('SE',  191,      'Nananana Dr.',   0,     64082, '2004-09-14', '2004-10-14', 291, '104.1',    'A4_Indoor_Sports'),
('NW', 21060,  'Benjamin Blvd.', 215, 64082, '2007-11-15', '2007-11-15', 632, '102.5',    'A1_Fire_Protection'),
('SE',  803,      'Yeet St.',             0,     64063, '2010-12-02', '2010-01-04', 482, '104.6.2', 'A1_Hazardous_Materials'),
('SE',  176,      'Nananana Dr.',   631, 64064, '2004-09-15', '2004-10-15', 283, '104.3',    'A4_Indoor_Sports');


------------------------------------------------
--CREATE ALL PRIMARY TABLES--
------------------------------------------------
CREATE TABLE business
(
    Property_ID INT UNIQUE NOT NULL, 
    SName VARCHAR(64) NOT NULL,
    Open_Date DATE NOT NULL,
    Closure_Date DATE NOT NULL,
    Phone VARCHAR(14) NOT NULL,
    Permit_Code VARCHAR(11) NOT NULL,
	
    PRIMARY KEY(Property_ID, SName),
    KEY(SName),
    FOREIGN KEY(Property_ID) REFERENCES Property(Property_ID),
    FOREIGN KEY(Permit_Code) REFERENCES Permits(Permit_Code)
);

CREATE TABLE Inspection_Report
(
    Property_ID INT NOT NULL,
    Insp_Dt DATE NOT NULL,

    PFA_Number INT NOT NULL, 
    Hazard_Class VARCHAR(8), 	 
    Panel_Fire VARCHAR(8) NOT NULL,  
    Panel_Active VARCHAR(8), 
    Panel_Location VARCHAR(8), 
    Panel_Normal VARCHAR(8), 
    IN_Corrected VARCHAR(8), 
    IN_Violations VARCHAR(8), 
    Comments VARCHAR(355) NOT NULL,
    Inspector_FName VARCHAR(12) NOT NULL,
    Inspector_LName VARCHAR(12) NOT NULL,
    Resp_Sign_FName VARCHAR(12) NOT NULL,
    Resp_Sign_LName VARCHAR(12) NOT NULL,
    Inspection_Code VARCHAR(5) NOT NULL,
    ----------------------------------------------------------------------------
    EDoor_Obstructions VARCHAR(8) NOT NULL,
    EDoor_Locks_Panic_Hardware VARCHAR(8) NOT NULL,
    ESign_Exit_Signs VARCHAR(8) NOT NULL,
    ESign_Emergency_Lights VARCHAR(8) NOT NULL,
    FDoor_Fire_Doors_Maintained_or_closed_fully VARCHAR(8) NOT NULL,
    FDoor_Unapproved_Open_Devices VARCHAR(8) NOT NULL,
    FDoor_Clear_Obstructions VARCHAR(8) NOT NULL,
    Extinguishers_Minimum_2AIOBC VARCHAR(8) NOT NULL,
    Extinguishers_Max_75ft_Travel VARCHAR(8) NOT NULL,
    Extinguishers_Annual_Inspection VARCHAR(8) NOT NULL,
    Extinguisers_Access VARCHAR(8) NOT NULL,
    Electric_Extension_Cords VARCHAR(8) NOT NULL,
    Electric_Multi_Plug_Adapters VARCHAR(8) NOT NULL,
    Electric_Open_Boxes_Switches VARCHAR(8) NOT NULL,
    Electric_Openings_Electrical_Panel VARCHAR(8) NOT NULL,
    Electric_36in_Clearance_Storage VARCHAR(8) NOT NULL,
    Storage_Housekeeping VARCHAR(8) NOT NULL,
    Storage_24in_Below_Ceiling VARCHAR(8) NOT NULL,
    Storage_18in_below_sprinklers VARCHAR(8) NOT NULL,
    Storage_Under_Stairs VARCHAR(8) NOT NULL,
    Storage_Close_Ignition_Source VARCHAR(8) NOT NULL,
    Flammable_704_placards VARCHAR(8) NOT NULL,
    Flammable_MSDS VARCHAR(8) NOT NULL,
    Flammable_Non_Smoking_Signs VARCHAR(8) NOT NULL,
    Gasses_Compressed_Secured VARCHAR(8) NOT NULL,
    Finish_4A403C_Fire_Extinguisher_within_30ft VARCHAR(8) NOT NULL,
    Finish_Approved_Spraybooth VARCHAR(8) NOT NULL,
    Finish_Auto_Extinguishing_Inspected_Annually VARCHAR(8) NOT NULL,
    Finish_Warning_Smoking_Signs VARCHAR(8) NOT NULL,
    Sprinklers_Annual_Service VARCHAR(8) NOT NULL,
    Sprinklers_Date_Service DATE NOT NULL,
    Sprinklers_Access VARCHAR(8) NOT NULL,
    Sprinklers_Standpipe_Sticker_on_Door VARCHAR(8) NOT NULL,
    Sprinklers_Sprinkler_Room_Identified VARCHAR(8) NOT NULL,
    Sprinklers_Riser_Location VARCHAR(8) NOT NULL,
    HES_Service_Within_6_Months VARCHAR(8) NOT NULL,
    HES_Last_Service_Date DATE NOT NULL,
    HES_Access_Remote_Pull VARCHAR(8) NOT NULL,
    HES_Clean VARCHAR(8) NOT NULL,
    HES_K_Class_Extinguisher VARCHAR(8) NOT NULL,
    HES_Nozzle_Condition VARCHAR(8) NOT NULL,
    HES_Filters_Place VARCHAR(8) NOT NULL,
    Occupation_Load VARCHAR(8) NOT NULL,
    Address_Visible_Legible VARCHAR(8) NOT NULL,
    FDA_Mait_Lubrication VARCHAR(8) NOT NULL,
    FDA_Knox_Box_Keys_Current VARCHAR(8) NOT NULL,
    FDA_Knox_Box_Location VARCHAR(8) NOT NULL,
    FDC_Place VARCHAR(8) NOT NULL,
    FDC_Identified VARCHAR(8) NOT NULL,
    FDC_Access_Unobstructed VARCHAR(8) NOT NULL,
    FDC_Location VARCHAR(8) NOT NULL,
    Elevator_keys VARCHAR(8) NOT NULL,
    Propane_Placards VARCHAR(8) NOT NULL,
    Propane_Permit VARCHAR(8) NOT NULL,
    Propane_Impact_Bollards VARCHAR(8) NOT NULL,
    Other_Violations VARCHAR(8) NOT NULL,
    ----------------------------------------------------------------------------
    PRIMARY KEY (Property_ID, Insp_Dt),
    
    FOREIGN KEY(Property_ID) REFERENCES Property(Property_ID),
    FOREIGN KEY(Inspector_FName) REFERENCES Inspector(First_Name),
    FOREIGN KEY(Inspector_LName) REFERENCES Inspector(Last_name),
    FOREIGN KEY(Resp_Sign_FName) REFERENCES Signator(First_Name),
    FOREIGN KEY(Resp_Sign_LName) REFERENCES  SIgnator(Last_name),
    FOREIGN KEY(Inspection_Code) REFERENCES Inspection_Codes(Inspection_Code)
);

CREATE TABLE Loss_Reduction_Program
(
    Property_ID INT NOT NULL,
    LR_dt DATE NOT NULL,
    PFA_Number INT NOT NULL,
    ----------------------------------------------------------------------------
    LRT_Occupancy VARCHAR(8) NULL,
    LRT_Complaint VARCHAR(8) NULL,
    LRT_SemiAnnual VARCHAR(8) NULL,
    LRT_Explosives VARCHAR(8) NULL,
    LRT_Annual VARCHAR(8) NULL,
    LRT_UST VARCHAR(8) NULL,
    LRT_Life_Safety VARCHAR(8) NULL,
    LRT_Post_Incident VARCHAR(8) NULL,
    LRT_Sprinkler VARCHAR(8) NULL,
    LRT_Open_Burning VARCHAR(8) NULL,
    LRT_Hazardous_Materials_Permit VARCHAR(8) NULL,
    LRT_Other VARCHAR(8) NULL,
    LRT_Class VARCHAR(32) NULL,
    LRT_Box VARCHAR(8) NULL,
    LRT_Knox_Box VARCHAR(255) NULL,
    LRT_Knox_Box_location VARCHAR(255) NULL,
    /*LRN_No_Corrections VARCHAR(255) NULL,
    LRN_All_Corrections_Done VARCHAR(255) NULL,*/
    LRN_Last_Inspection DATE NULL,
    LRN_Prevention_Follow_up VARCHAR(4) NOT NULL,
    Inspector_FName VARCHAR(8) NOT NULL,
    Inspector_LName VARCHAR(16) NOT NULL,
    Resp_Sign_FName VARCHAR(8) NOT NULL,
    Resp_Sign_LName VARCHAR(16) NOT NULL,
    Inspection_Code VARCHAR(5) NOT NULL,

    PRIMARY KEY(Property_ID,LR_dt),

    FOREIGN KEY(Property_ID) REFERENCES Property(Property_ID),
    FOREIGN KEY(Inspector_FName) REFERENCES Inspector(First_Name),
    FOREIGN KEY(Inspector_LName) REFERENCES Inspector(Last_Name),
    FOREIGN KEY(Resp_Sign_FName) REFERENCES Signator(First_Name),
    FOREIGN KEY(Resp_Sign_LName) REFERENCES SIgnator(Last_Name),
    FOREIGN KEY(Inspection_Code) REFERENCES Inspection_Codes(Inspection_Code)
);


CREATE TABLE Contact
(
    Property_ID INT UNIQUE NOT NULL,
    Bus_Name VARCHAR(64) NOT NULL,
    First_Name VARCHAR(8) NOT NULL,
    Last_Name VARCHAR(16) NOT NULL,
    Title VARCHAR(32) NOT NULL,
    Address VARCHAR(64) NOT NULL,
    City VARCHAR(16) NOT NULL,
    State VARCHAR(2) NOT NULL,
    Zipcode INT NOT NULL, 
    Phone VARCHAR(14) NOT NULL,
    Phone_Type VARCHAR(14) NOT NULL,
    EC_Role VARCHAR(8) NOT NULL,

    PRIMARY KEY(Property_ID, Bus_Name),

   FOREIGN KEY(Property_ID) REFERENCES Property(Property_ID),
   FOREIGN KEY(Bus_Name) REFERENCES business(SName),
   FOREIGN KEY(Title) REFERENCES Titles_Table(Title),
   FOREIGN KEY(Zipcode) REFERENCES Zipcode_Table(Zipcode),
   FOREIGN KEY(Phone_Type) REFERENCES Phone_Type(Phone_Type),
   FOREIGN KEY(EC_Role) REFERENCES EC_Role(EC_Role)
);

----------------------------------------------------
--POPULATE ALL PRIMARY TABLES--
----------------------------------------------------
INSERT INTO business (Property_ID, SName, Open_Date, Closure_Date, Phone, Permit_Code)
VALUES
(007, 'Burger King',      '2015-09-12', '2015-09-30',   '(816)-923-5660', '105.1.2'),
(544, 'Dairy Queen',     '2005-05-21', '2005-05-29',   '(910)-450-4017', '105.2.2'),
(321, 'Jack in the Box', '1997-06-09', '1997-06-15',   '(816)-787-8787', '105.3.1.1'),
(255, 'Wendys',               '1990-01-01', '1990-01-19',   '(242)-212-1212', '105.3.1.2'),
(139, 'McDonalds',        '1991-02-02', '1991-02-26',   '(816)-111-1111', '105.3.3'),
(075, 'Subway',                 '1992-03-03', '1992-03-31',   '(816)-222-2222', '105.3.5'),
(789, 'Taco Bell',              '1993-04-04', '1993-05-01',   '(816)-333-3333', '105.4.2.1'),
(215, 'Papa Johns',          '2006-05-05', '2006-05-18',   '(816)-555-5555', '105.6.1'),
(152, 'Pizza Hut',                '2003-06-16', '2003-06-30',   '(816)-666-6666', '105.6.2'),
(512, 'Bob Evans',              '2001-07-27', '2001-08-21',   '(816)-777-7777', '105.6.3'),
(902, 'Chipotlette',          '1998-08-08', '1998-09-20',   '(816)-888-8888', '105.6.4'),
(236, 'Steak n Shake',   '1999-09-09', '1999-09-11',   '(816)-999-9999', '105.6.5'),
(210, 'Pizza Street',          '2009-10-12', '2009-11-12',   '(816)-101-0101', '105.6.6'),
(060, 'Arbys',                      '2002-11-11', '2003-01-17',   '(910)-454-5454', '105.6.7'),
(251, 'Hardys',                    '2012-12-23', '2012-12-24',   '(910)-363-6333', '105.6.8'),
(888, 'KFC',                           '2004-01-08', '2006-02-13',   '(242)-848-4844', '105.6.9'),
(291, 'Wal Mart',               '2010-03-13', '2012-04-14',   '(242)-154-8765', '105.6.10'),
(632, 'Price Chopper',  '2014-05-25', '2015-06-10',   '(816)-762-8943', '105.6.11'),
(482, 'Hy Vee',                    '2013-07-29', '2013-08-27',   '(816)-000-0000', '105.1.2'),
(283, 'Daily Bugle',       '2011-09-16', '2011-10-20',   '(816)-010-2030', '105.2.2');

INSERT INTO inspection_report(
Property_ID, 
Insp_DT, 
PFA_Number, 
Hazard_Class, 
Panel_Fire, 
Panel_Active, 
Panel_Location, 
Panel_Normal, 
IN_Corrected,
IN_Violations,
Comments, 
Inspector_FName, 
Inspector_LName, 
Resp_Sign_FName, 
Resp_Sign_LName, 
Inspection_Code, 
EDoor_Obstructions, 
EDoor_Locks_Panic_Hardware, 
ESign_Exit_Signs, 
ESign_Emergency_Lights, 
FDoor_Fire_Doors_Maintained_or_closed_fully,  
FDoor_Unapproved_Open_Devices, 
FDoor_Clear_Obstructions, 
Extinguishers_Minimum_2AIOBC, 
Extinguishers_Max_75ft_Travel, 
Extinguishers_Annual_Inspection, 
Extinguisers_Access, 
Electric_Extension_Cords, 
Electric_Multi_Plug_Adapters, 
Electric_Open_Boxes_Switches, 
Electric_Openings_Electrical_Panel, 
Electric_36in_Clearance_Storage, 
Storage_Housekeeping, 
Storage_24in_Below_Ceiling, 
Storage_18in_below_sprinklers, 
Storage_Under_Stairs, 
Storage_Close_Ignition_Source, 
Flammable_704_placards, 
Flammable_MSDS, 
Flammable_Non_Smoking_Signs, 
Gasses_Compressed_Secured, 
Finish_4A403C_Fire_Extinguisher_within_30ft, 
Finish_Approved_Spraybooth, 
Finish_Auto_Extinguishing_Inspected_Annually, 
Finish_Warning_Smoking_Signs, 
Sprinklers_Annual_Service, 
Sprinklers_Date_Service, 
Sprinklers_Access, 
Sprinklers_Standpipe_Sticker_on_Door, 
Sprinklers_Sprinkler_Room_Identified, 
Sprinklers_Riser_Location, 
HES_Service_Within_6_Months, 
HES_Last_Service_Date, 
HES_Access_Remote_Pull, 
HES_Clean, 
HES_K_Class_Extinguisher, 
HES_Nozzle_Condition, 
HES_Filters_Place, 
Occupation_Load,  
Address_Visible_Legible, 
FDA_Mait_Lubrication, 
FDA_Knox_Box_Keys_Current, 
FDA_Knox_Box_Location, 
FDC_Place, 
FDC_Identified, 
FDC_Access_Unobstructed, 
FDC_Location, 
Elevator_keys, 
Propane_Placards, 
Propane_Permit, 
Propane_Impact_Bollards, 
Other_Violations)

VALUES
(007, '1997-02-12', 999, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg','Ted', 'Adder',
'Andy', 'Smith', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(544, '1997-02-12', 998, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Benjamin', 'Franklin',
'Thomas', 'Edison', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(321, '1997-02-12', 997, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Victor', 'FrankenStein',
'John', 'Doe', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(255, '1997-02-12', 996, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Andrew', 'Jackson',
'Jennifer', 'Leroy', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(139, '1997-02-12', 995, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Dancer', 'Prancer',
'Donner', 'Party', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(075, '1997-02-12', 994, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Donner', 'Blitzen',
'Comet', 'Cupid', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(789, '1997-02-12', 993, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'John', 'Deer',
'Major', 'Outlaw', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(215, '1997-02-12', 992, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Phillip', 'Bledsoe',
'Jane', 'Doe', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(152, '1997-02-12', 991, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Andrew', 'Dobson',
'Jack', 'Black', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(512, '1997-02-12', 990, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Ron', 'Weasley',
'Harry', 'Potter', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(902, '1997-02-12', 989, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Draco', 'Malfoy',
'Hermione', 'Granger', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(236, '1997-02-12', 987, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Peter', 'Pettigrew',
'Tom', 'Riddle', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(210, '1997-02-12', 986, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Severus', 'Snape',
'Sirius', 'Black', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(060, '1997-02-12', 985, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'James', 'Potter',
'Albus', 'Dumbledore', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(251, '1997-02-12', 984, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Hagrid', 'Giant',
'Lily', 'Potter', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(888, '1997-02-12', 983, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Remus', 'Lupin',
'Buckbeak', 'Griffin', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(291, '1997-02-12', 982, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Bernie', 'Sanders',
'Ginny', 'Weasley', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(632, '1997-02-12', 981, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Dobby', 'House Elf',
'Zodiac', 'Killer', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(482, '1997-02-12', 980, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Billy', 'Madison',
'Creature', 'House Elf', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1'),

(283, '1997-02-12', 979, '1003.6', 'Yes', 'P', 'A', 'P', 'N', 'N', 'dgsgdg', 'Dasher', 'Vixen',
'Donald', 'Trump', '106.1', 'P', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 
'F', 'NA', 'P', 'F',  'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 'P', 'F', 'NA', 
'P', 'F', 'NA',  '1997-07-14', 'P', 'F', 'NA', 'D', 'F', '1997-07-14', 'P', 
'F', 'P', 'F', 'NA', 'P', 'F', 'A', 'F', 'F', 'P', 'D', 'NA', 'NA', 'F', 'P','F', 'F', '1');

INSERT INTO Loss_Reduction_Program(Property_ID,LR_dt,PFA_Number,LRT_Occupancy,LRT_Complaint,LRT_SemiAnnual,LRT_Explosives,
LRT_Annual,LRT_UST,LRT_Life_Safety,LRT_Post_Incident,LRT_Sprinkler,LRT_Open_Burning,LRT_Hazardous_Materials_Permit,LRT_Other,
LRT_Class,LRT_Box,LRT_Knox_Box,LRT_Knox_Box_Location,/*LRN_No_Corrections,LRN_All_Corrections_Done,*/ LRN_Last_Inspection,
LRN_Prevention_Follow_Up,Inspector_FName,Inspector_LName, Resp_Sign_FName, Resp_Sign_LName,Inspection_Code)
VALUES
(007, '2015-03-25', 024, '1', '0', '1', '0', '0', '0', '0', '0', '1', '0', '0', '0', 'A3_Worship', '0', '1', 'A', /*'0', '1',*/ '2015-04-29', '0', 'Ted', 'Adder', 'Andy' , 'Smith', '106.1'),
(544, '2012-05-24', 043, '1', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '0', 'A2_Food_Place', '1', '0', 'NA', /*'0', '1',*/ '1945-05-09',  '1', 'Benjamin', 'Franklin', 'Thomas', 'Edison', '106.1'),
(321, '2012-12-12', 000, '1', '1', '1', '0', '1', '1', '0', '1', '1', '0', '1', '0', 'A1_Exits', '0', '1', 'A', /*'0', '1',*/ '2013-06-16', '0', 'Victor', 'FrankenStein', 'John' , 'Doe', '106.1'),
(255, '2001-01-01', 001, '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 'A1_Fire_protection_System', '1', '1', 'B', /*'1', '1',*/ '1987-09-30', '1', 'Andrew', 'Jackson', 'Jennifer' , 'Leroy', '106.1'),
(139, '2012-02-02', 002, '1', '1', '1', '0', '0', '1', '1', '0', '1', '1', '0', '1', 'A1_Housekeeping', '0', '1', 'C', /*'0', '1',*/ '2000-02-09', '1', 'Dancer', 'Prancer', 'Donner' , 'Party', '106.1'),
(075, '2003-03-03', 003, '1', '1', '1', '1', '0', '1', '0', '1', '1', '0', '1', '0', 'A1_Electrical', '1', '1', 'D', /*'1', '1',*/ '2001-01-01', '1', 'Donner', 'Blitzen', 'Comet' , 'Cupid', '106.1'),
(789, '2004-04-04', 004, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', 'A1_Misc', '1', '1', 'A', /*'1', '1',*/ '2003-06-05', '1', 'Dasher', 'Vixen', 'Major' , 'Outlaw', '106.1'),
(215, '2005-05-05', 005, '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', 'A1_Hazardous_Materials', '0', '1', 'B', /*'0', '1',*/ '2001-09-11', '0', 'John', 'Deer', 'Jane' , 'Doe', '106.1'),
(152, '2006-06-06', 006, '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '0', '1', 'A1_Fire_Protection', '0', '1', 'C', /*'0', '1',*/ '2015-03-24', '0', 'Phillip', 'Bledsoe' , 'Jack', 'Black', '106.1'),
(512, '2007-07-07', 007, '1', '0', '1', '1', '0', '1', '0', '1', '1', '0', '1', '0', 'A2_Food_Place', '1', '1', 'D', /*'0', '1',*/ '2001-09-11', '0', 'Andrew', 'Dobson', 'Harry' , 'Potter', '106.1'),
(902, '2008-08-08', 008, '1', '1', '1', '0', '1', '0', '1', '0', '1', '1', '0', '1', 'A3_Worship', '0', '1', 'A', /*'1', '1',*/ '2005-05-05', '1', 'Ron', 'Weasley', 'Hermione' , 'Granger', '106.1'),
(236, '2009-09-09', 009, '1', '0', '1', '1', '0', '1', '0', '1', '1', '0', '1', '0', 'A4_Indoor_Sports', '1', '1', 'B', /*'0', '1',*/ '2008-08-08', '0', 'Draco', 'Malfoy', 'Tom' , 'Riddle', '106.1'),
(210, '2010-10-10', 010, '1', '1', '1', '0', '1', '0', '1', '0', '1', '1', '0', '1', 'A5_OutDoor_Sports', '0', '1', 'C', /*'1', '1',*/ '2009-09-09', '1', 'Peter', 'Pettigrew', 'Sirius' , 'Black', '106.1'),
(060, '2011-11-11', 011, '1', '0', '1', '1', '0', '1', '0', '1', '1', '0', '1', '0', 'A1_Exits', '1', '1', 'D', /*'0', '1',*/ '2010-10-10', '0', 'Severus', 'Snape', 'Albus' , 'Dumbledore', '106.1'),
(251, '2005-01-23', 012, '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '0', '1', 'A1_Fire_protection_System', '0', '1', 'A', /*'1', '1',*/ '2000-01-23', '1', 'James', 'Potter', 'Lily' , 'Potter', '106.1'),
(888, '1999-06-30', 013, '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', 'A1_Housekeeping', '1', '1', 'B', /*'0', '1',*/ '1997-12-19', '0', 'Hagrid', 'Giant', 'Buckbeak' , 'Griffin', '106.1'),
(291, '2004-05-15', 014, '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '0', '1', 'A1_Electrical', '0', '1', 'C', /*'1', '1',*/ '2001-01-01', '1', 'Remus', 'Lupin', 'Ginny' , 'Weasley', '106.1'),
(632, '1997-11-29', 015, '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', 'A1_Misc', '1', '1', 'D', /*'0', '1',*/ '1995-12-19', '0', 'Bernie', 'Sanders', 'Zodiac' , 'Killer', '106.1'),
(482, '2015-02-25', 016, '1', '1', '1', '1', '0', '1', '0', '1', '1', '1', '0', '1', 'A1_Hazardous_Materials', '0', '1', 'A', /*'1', '1',*/ '2014-01-26', '1', 'Dobby', 'House Elf', 'Creature' , 'House Elf', '106.1'),
(283, '2016-03-26', 017, '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', '1', '0', 'A1_Fire_Protection', '1', '1', 'B', /*'0', '1',*/ '2015-02-28', '0', 'Billy', 'Madison', 'Donald' , 'Trump', '106.1');

INSERT INTO Contact(Property_ID, Bus_Name, First_Name, Last_Name, Title, Address, City, State, ZipCode, Phone, Phone_Type, EC_Role)
VALUES

(007, 'Burger King',     'John',     'Dinkleberg', 'Owner' ,          'State Route P', 'Lees Summit', 'MO', 64063, '(816)-923-5660', 'Business', 'ECN1'),
(544, 'Dairy Queen',     'Jack',     'Black',      'Co-Owner',        'Peregrin St.',  'Lees Summit', 'MO', 64064, '(910)-450-4017', 'Cell',     'ECN1'),
(321, 'Jack in the Box', 'Jayden',   'Smith',      'General Manager', 'AA',            'Lees Summit', 'MO', 64081, '(816)-787-8787', 'Home',     'ECN1'),
(255, 'Wendys',          'Willow',   'Smith',      'Shift Manager',   'Carousel Ct.',  'Lees Summit', 'MO', 64082, '(242)-212-1212', 'Cell',     'ECN1'),
(139, 'McDonalds',       'Mack',     'Donald',     'Employee',        'Chateau Dr.',   'Lees Summit', 'MO', 64086, '(816)-111-1111', 'Business', 'ECN1'),
(075, 'Subway',          'Rhaegar',  'Lightlord',  'Property Manager','Meridian Dr.',  'Lees Summit', 'MO', 64063, '(816)-222-2222', 'Cell',     'ECN1'),
(789, 'Taco Bell',       'Edward',   'Pants',      'Owner',           'Food Ave.',     'Lees Summit', 'MO', 64064, '(816)-333-3333', 'Cell',     'ECN1'),
(215, 'Papa Johns',      'Shangela', 'Royce',      'Co-Owner',        'Benjamin Blvd.','Lees Summit', 'MO', 64081, '(816)-555-5555', 'Home',     'ECN1'),
(152, 'Pizza Hut',       'Ami',      'Yuzuki',     'General Manager', 'MarcoPolo Pl.', 'Lees Summit', 'MO', 64082, '(816)-666-6666', 'Home',     'ECN1'),
(512, 'Bob Evans',       'Olivia',   'Chaucer',    'Shift Manager',   'Lindsey Ln.',   'Lees Summit', 'MO', 64086, '(816)-777-7777', 'Business', 'ECN1'),
(902, 'Chipotlette',     'Zoe',      'Applebottom','Employee',        'Ashford Ct.',   'Lees Summit', 'MO', 64063, '(816)-888-8888', 'Cell',     'ECN1'),
(236, 'Steak n Shake',   'Xavier',   'Xtreme',     'Property Manager','Kristens Rd.',  'Lees Summit', 'MO', 64064, '(242)-848-4844', 'Home',     'ECN1'),
(210, 'Pizza Street',    'Qyle',     'Quincy',     'Owner',           'Connors Ln',    'Lees Summit', 'MO', 64081, '(816)-101-0101', 'Cell',     'ECN1'),
(060, 'Arbys',           'Kandi',    'Kane',       'Co-Owner',        'Chateau Dr.',   'Lees Summit', 'MO', 64082, '(910)-454-5454', 'Business', 'ECN1'),
(251, 'Hardys',          'Rose',     'Treeflower', 'General Manager', 'Lindsey Ln.',   'Lees Summit', 'MO', 64086, '(910)-363-6333', 'Cell',     'ECN1'),
(888, 'KFC',             'Isaac',    'Newton',     'Shift Manager',   'Hotel Blvd.',   'Lees Summit', 'MO', 64063, '(242)-848-4844', 'Home',     'ECN1'),
(291, 'Wal Mart',        'Harriet',  'Haxornova',  'Employee',        'Nananana Dr.',  'Lees Summit', 'MO', 64064, '(242)-154-8765', 'Cell',     'ECN1'),
(632, 'Price Chopper',   'Finley',   'Faust',      'Property Manager','Benjamin Blvd.','Lees Summit', 'MO', 64081, '(816)-762-8943', 'Business', 'ECN1'),
(482, 'Hy Vee',          'Gregor',   'Green',      'Owner',           'Yeet St.',      'Lees Summit', 'MO', 64082, '(816)-000-0000', 'Business', 'ECN1'),
(283, 'Daily Bugle',     'Peter',    'Parker',     'Co-Owner',        'Nananana Dr.',  'Lees Summit', 'MO', 64086, '(816)-010-2030', 'Cell',     'ECN1');

------------------------------------
---------------END---------------
------------------------------------




