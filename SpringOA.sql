------------------------------------------------
-- Export file for user ZH@ORCL               --
-- Created by excepuio on 2018/6/13, 22:21:17 --
------------------------------------------------

set define off
spool SpringOA.log

prompt
prompt Creating table ADJUSTSALARY
prompt ===========================
prompt
create table ZH.ADJUSTSALARY
(
  adjustsalaryid NUMBER not null,
  userid         NUMBER not null,
  hopesalary     NUMBER not null,
  status         VARCHAR2(255) not null,
  adjusttime     VARCHAR2(255) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.ADJUSTSALARY
  add constraint ADJUSTSALARYID primary key (ADJUSTSALARYID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table ADMIN
prompt ====================
prompt
create table ZH.ADMIN
(
  adminid       NUMBER not null,
  adminpassword VARCHAR2(255) not null,
  adminname     VARCHAR2(255) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.ADMIN
  add constraint ADMINID primary key (ADMINID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table APARTMENT
prompt ========================
prompt
create table ZH.APARTMENT
(
  apartmentid      NUMBER not null,
  apartmentname    VARCHAR2(255) not null,
  apartmentpmid    NUMBER not null,
  apartmentexplain VARCHAR2(255) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.APARTMENT
  add constraint APARTMENTID primary key (APARTMENTID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table APARTMENTUSER
prompt ============================
prompt
create table ZH.APARTMENTUSER
(
  apartmentuserid NUMBER not null,
  apartmentid     NUMBER not null,
  userid          NUMBER not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.APARTMENTUSER
  add constraint APARTMENTUSERID primary key (APARTMENTUSERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table ATTENDANCE
prompt =========================
prompt
create table ZH.ATTENDANCE
(
  attendanceid     NUMBER not null,
  userid           NUMBER not null,
  attendancestatus VARCHAR2(255) not null,
  recordid         NUMBER not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table ZH.ATTENDANCE
  add constraint ATTENDANCEID primary key (ATTENDANCEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table CAR
prompt ==================
prompt
create table ZH.CAR
(
  carid     NUMBER not null,
  carline   VARCHAR2(255),
  driverid  NUMBER,
  carnumber NUMBER,
  carmodel  VARCHAR2(255),
  cartime   VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.CAR
  add constraint CARID primary key (CARID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table CARDRECORD
prompt =========================
prompt
create table ZH.CARDRECORD
(
  recordid   NUMBER not null,
  userid     NUMBER not null,
  recordtime VARCHAR2(255) not null,
  recordip   VARCHAR2(255) not null,
  status     NVARCHAR2(20)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.CARDRECORD
  add constraint RECORDID primary key (RECORDID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table COMPENSATE
prompt =========================
prompt
create table ZH.COMPENSATE
(
  compensateid     NUMBER not null,
  compensatetype   VARCHAR2(255),
  compensateprice  NUMBER,
  userid           NUMBER,
  compensatestatus VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.COMPENSATE
  add constraint COMPENSATEID primary key (COMPENSATEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table CONTRACT
prompt =======================
prompt
create table ZH.CONTRACT
(
  contractid        NUMBER not null,
  contractcontent   VARCHAR2(255),
  contracttype      VARCHAR2(255),
  userid            NUMBER,
  contractbegintime VARCHAR2(255),
  contractendtime   VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.CONTRACT
  add constraint CONTRACTID primary key (CONTRACTID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table EMAIL
prompt ====================
prompt
create table ZH.EMAIL
(
  emailid       NUMBER not null,
  userid        NUMBER,
  emailpassword VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table ZH.EMAIL
  add constraint EMAILID primary key (EMAILID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table EMAILPASSWORDCONFIRM
prompt ===================================
prompt
create table ZH.EMAILPASSWORDCONFIRM
(
  emailpasswordconfirmid NUMBER not null,
  userid                 NUMBER,
  confirmstatus          VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table ZH.EMAILPASSWORDCONFIRM
  add constraint EMAILPASSWORDCONFIRMID primary key (EMAILPASSWORDCONFIRMID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table FINANCE
prompt ======================
prompt
create table ZH.FINANCE
(
  financeid      NUMBER not null,
  apartmentid    NUMBER,
  apartmentmoney NUMBER,
  financemonth   NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255;
alter table ZH.FINANCE
  add constraint FINANCEID primary key (FINANCEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255;

prompt
prompt Creating table FIVERISKSONEGOLD
prompt ===============================
prompt
create table ZH.FIVERISKSONEGOLD
(
  fiverisksonegoldid NUMBER not null,
  userid             NUMBER,
  endowment          NUMBER,
  medical            NUMBER,
  unemployment       NUMBER,
  employment         NUMBER,
  maternity          NUMBER,
  housing            NUMBER,
  paytime            VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.FIVERISKSONEGOLD
  add constraint FIVERISKSONEGOLDID primary key (FIVERISKSONEGOLDID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table INSURANCE
prompt ========================
prompt
create table ZH.INSURANCE
(
  insuranceid      NUMBER not null,
  userid           NUMBER,
  compensatemoney  NUMBER,
  compensatereason VARCHAR2(255),
  compensatestatus VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.INSURANCE
  add constraint INSURANCEID primary key (INSURANCEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table LEAVE
prompt ====================
prompt
create table ZH.LEAVE
(
  leaveid        NUMBER not null,
  leaveuserid    NUMBER,
  leavebegintime VARCHAR2(255),
  leaveendtime   VARCHAR2(255),
  leavetype      VARCHAR2(255),
  leavereason    VARCHAR2(255),
  leavestatus    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.LEAVE
  add constraint LEAVEID primary key (LEAVEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table MAP
prompt ==================
prompt
create table ZH.MAP
(
  mapid      NUMBER not null,
  mapexplain VARCHAR2(255),
  address    VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.MAP
  add constraint MAPID primary key (MAPID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table NOTICE
prompt =====================
prompt
create table ZH.NOTICE
(
  noticeid      NUMBER not null,
  noticecontent VARCHAR2(255) not null,
  noticepower   NUMBER not null,
  noticeorder   NUMBER not null,
  noticetime    VARCHAR2(255) not null
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.NOTICE
  add constraint NOTICEID primary key (NOTICEID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table PROJECT
prompt ======================
prompt
create table ZH.PROJECT
(
  projectid      NUMBER not null,
  projectname    VARCHAR2(255),
  projectcontent VARCHAR2(255),
  projecttime    VARCHAR2(255),
  projectmoney   NUMBER,
  projectpmid    NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.PROJECT
  add constraint PROJECTID primary key (PROJECTID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table PROJECTUSER
prompt ==========================
prompt
create table ZH.PROJECTUSER
(
  projectuserid  NUMBER not null,
  projectid      NUMBER,
  userid         NUMBER,
  projectprocess VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.PROJECTUSER
  add constraint PROJECTUSERID primary key (PROJECTUSERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table SALARY
prompt =====================
prompt
create table ZH.SALARY
(
  salaryid        NUMBER not null,
  userid          NUMBER,
  userbasesalary  NUMBER,
  userattence     NUMBER,
  usercompensate  NUMBER,
  usersubsidy     NUMBER,
  fiveriskonegold NUMBER,
  usergetsalary   NUMBER,
  granttime       VARCHAR2(255),
  salarymonth     VARCHAR2(255)
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.SALARY
  add constraint SALARYID primary key (SALARYID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table USERS
prompt ====================
prompt
create table ZH.USERS
(
  userid        NUMBER not null,
  username      VARCHAR2(255),
  usersex       VARCHAR2(255),
  userphone     VARCHAR2(255),
  useraddress   VARCHAR2(255),
  userapartment VARCHAR2(255),
  useremailid   NUMBER,
  usersalary    NUMBER,
  userpmid      NUMBER,
  userlevel     NUMBER,
  usertime      VARCHAR2(255),
  emailpassword VARCHAR2(255),
  carid         NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.USERS
  add constraint USERID primary key (USERID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating table WORKLOG
prompt ======================
prompt
create table ZH.WORKLOG
(
  logid      NUMBER not null,
  userid     NUMBER,
  logtime    VARCHAR2(255),
  logcontent VARCHAR2(255),
  logstatus  NUMBER
)
tablespace USERS
  pctfree 10
  initrans 1
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );
alter table ZH.WORKLOG
  add constraint LOGID primary key (LOGID)
  using index 
  tablespace USERS
  pctfree 10
  initrans 2
  maxtrans 255
  storage
  (
    initial 64K
    next 1M
    minextents 1
    maxextents unlimited
  );

prompt
prompt Creating sequence ADJUSTSALARY_SEQ
prompt ==================================
prompt
create sequence ZH.ADJUSTSALARY_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 6
increment by 1
nocache;

prompt
prompt Creating sequence ADMIN_SEQ
prompt ===========================
prompt
create sequence ZH.ADMIN_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 2
increment by 1
nocache;

prompt
prompt Creating sequence APARTMENTUSER_SEQ
prompt ===================================
prompt
create sequence ZH.APARTMENTUSER_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 4
increment by 1
nocache;

prompt
prompt Creating sequence APARTMENT_SEQ
prompt ===============================
prompt
create sequence ZH.APARTMENT_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 3
increment by 1
nocache;

prompt
prompt Creating sequence ATTENDANCE_SEQ
prompt ================================
prompt
create sequence ZH.ATTENDANCE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
nocache;

prompt
prompt Creating sequence CARDRECORD_SEQ
prompt ================================
prompt
create sequence ZH.CARDRECORD_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 35
increment by 1
nocache;

prompt
prompt Creating sequence CAR_SEQ
prompt =========================
prompt
create sequence ZH.CAR_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 8
increment by 1
nocache;

prompt
prompt Creating sequence COMPENSATE_SEQ
prompt ================================
prompt
create sequence ZH.COMPENSATE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 7
increment by 1
nocache;

prompt
prompt Creating sequence CONTRACT_SEQ
prompt ==============================
prompt
create sequence ZH.CONTRACT_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 3
increment by 1
nocache;

prompt
prompt Creating sequence EMAILPASSWORDCONFIRM_SEQ
prompt ==========================================
prompt
create sequence ZH.EMAILPASSWORDCONFIRM_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
nocache;

prompt
prompt Creating sequence EMAIL_SEQ
prompt ===========================
prompt
create sequence ZH.EMAIL_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
nocache;

prompt
prompt Creating sequence FINANCE_SEQ
prompt =============================
prompt
create sequence ZH.FINANCE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 1
increment by 1
nocache;

prompt
prompt Creating sequence FIVERISKSONEGOLD_SEQ
prompt ======================================
prompt
create sequence ZH.FIVERISKSONEGOLD_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 4
increment by 1
nocache;

prompt
prompt Creating sequence INSURANCE_SEQ
prompt ===============================
prompt
create sequence ZH.INSURANCE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 3
increment by 1
nocache;

prompt
prompt Creating sequence LEAVE_SEQ
prompt ===========================
prompt
create sequence ZH.LEAVE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 3
increment by 1
nocache;

prompt
prompt Creating sequence MAP_SEQ
prompt =========================
prompt
create sequence ZH.MAP_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 4
increment by 1
nocache;

prompt
prompt Creating sequence NOTICE_SEQ
prompt ============================
prompt
create sequence ZH.NOTICE_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 12
increment by 1
nocache;

prompt
prompt Creating sequence PROJECTUSER_SEQ
prompt =================================
prompt
create sequence ZH.PROJECTUSER_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 4
increment by 1
nocache;

prompt
prompt Creating sequence PROJECT_SEQ
prompt =============================
prompt
create sequence ZH.PROJECT_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 5
increment by 1
nocache;

prompt
prompt Creating sequence SALARY_SEQ
prompt ============================
prompt
create sequence ZH.SALARY_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 33
increment by 1
nocache;

prompt
prompt Creating sequence USERS_SEQ
prompt ===========================
prompt
create sequence ZH.USERS_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 13
increment by 1
nocache;

prompt
prompt Creating sequence WORKLOG_SEQ
prompt =============================
prompt
create sequence ZH.WORKLOG_SEQ
minvalue 1
maxvalue 9999999999999999999999999999
start with 4
increment by 1
nocache;

prompt
prompt Creating trigger ADJUSTSALARY_TEST
prompt ==================================
prompt
CREATE OR REPLACE TRIGGER ZH.AdjustSalary_test
BEFORE INSERT ON AdjustSalary
FOR EACH ROW
BEGIN
  SELECT AdjustSalary_seq.Nextval
  INTO:NEW.AdjustSalaryId  FROM DUAL;
END;
/

prompt
prompt Creating trigger ADMIN_TEST
prompt ===========================
prompt
CREATE OR REPLACE TRIGGER ZH.Admin_test
BEFORE INSERT ON Admin
FOR EACH ROW
BEGIN
  SELECT Admin_seq.Nextval
  INTO:NEW.AdminId  FROM DUAL;
END;
/

prompt
prompt Creating trigger APARTMENTUSER_TEST
prompt ===================================
prompt
CREATE OR REPLACE TRIGGER ZH.APARTMENTUSER_test
BEFORE INSERT ON APARTMENTUSER
FOR EACH ROW
BEGIN
  SELECT APARTMENTUSER_seq.Nextval
  INTO:NEW.APARTMENTUSERID  FROM DUAL;
END;
/

prompt
prompt Creating trigger APARTMENT_TEST
prompt ===============================
prompt
CREATE OR REPLACE TRIGGER ZH.APARTMENT_test
BEFORE INSERT ON APARTMENT
FOR EACH ROW
BEGIN
  SELECT APARTMENT_seq.Nextval
  INTO:NEW.APARTMENTId  FROM DUAL;
END;
/

prompt
prompt Creating trigger ATTENDANCE_TEST
prompt ================================
prompt
CREATE OR REPLACE TRIGGER ZH.ATTENDANCE_test
BEFORE INSERT ON ATTENDANCE
FOR EACH ROW
BEGIN
  SELECT ATTENDANCE_seq.Nextval
  INTO:NEW.ATTENDANCEId  FROM DUAL;
END;
/

prompt
prompt Creating trigger CARDRECORD_TEST
prompt ================================
prompt
CREATE OR REPLACE TRIGGER ZH.CARDRECORD_test
BEFORE INSERT ON CARDRECORD
FOR EACH ROW
BEGIN
  SELECT CARDRECORD_seq.Nextval
  INTO:NEW.RecordId  FROM DUAL;
END;
/

prompt
prompt Creating trigger CAR_TEST
prompt =========================
prompt
CREATE OR REPLACE TRIGGER ZH.CAR_test
BEFORE INSERT ON CAR
FOR EACH ROW
BEGIN
  SELECT CAR_seq.Nextval
  INTO:NEW.CARId  FROM DUAL;
END;
/

prompt
prompt Creating trigger COMPENSATE_TEST
prompt ================================
prompt
CREATE OR REPLACE TRIGGER ZH.COMPENSATE_test
BEFORE INSERT ON COMPENSATE
FOR EACH ROW
BEGIN
  SELECT COMPENSATE_seq.Nextval
  INTO:NEW.COMPENSATEId  FROM DUAL;
END;
/

prompt
prompt Creating trigger CONTRACT_TEST
prompt ==============================
prompt
CREATE OR REPLACE TRIGGER ZH.CONTRACT_test
BEFORE INSERT ON CONTRACT
FOR EACH ROW
BEGIN
  SELECT CONTRACT_seq.Nextval
  INTO:NEW.CONTRACTId  FROM DUAL;
END;
/

prompt
prompt Creating trigger EMAILPASSWORDCONFIRM_TEST
prompt ==========================================
prompt
CREATE OR REPLACE TRIGGER ZH.EMAILPASSWORDCONFIRM_test
BEFORE INSERT ON EMAILPASSWORDCONFIRM
FOR EACH ROW
BEGIN
  SELECT EMAILPASSWORDCONFIRM_seq.Nextval
  INTO:NEW.EMAILPASSWORDCONFIRMId  FROM DUAL;
END;
/

prompt
prompt Creating trigger EMAIL_TEST
prompt ===========================
prompt
CREATE OR REPLACE TRIGGER ZH.EMAIL_test
BEFORE INSERT ON EMAIL
FOR EACH ROW
BEGIN
  SELECT EMAIL_seq.Nextval
  INTO:NEW.EMAILId  FROM DUAL;
END;
/

prompt
prompt Creating trigger FINANCE_TEST
prompt =============================
prompt
CREATE OR REPLACE TRIGGER ZH.FINANCE_test
BEFORE INSERT ON FINANCE
FOR EACH ROW
BEGIN
  SELECT FINANCE_seq.Nextval
  INTO:NEW.FINANCEId  FROM DUAL;
END;
/

prompt
prompt Creating trigger FIVERISKSONEGOLD_TEST
prompt ======================================
prompt
CREATE OR REPLACE TRIGGER ZH.FIVERISKSONEGOLD_test
BEFORE INSERT ON FIVERISKSONEGOLD
FOR EACH ROW
BEGIN
  SELECT FIVERISKSONEGOLD_seq.Nextval
  INTO:NEW.FIVERISKSONEGOLDId  FROM DUAL;
END;
/

prompt
prompt Creating trigger INSURANCE_TEST
prompt ===============================
prompt
CREATE OR REPLACE TRIGGER ZH.INSURANCE_test
BEFORE INSERT ON INSURANCE
FOR EACH ROW
BEGIN
  SELECT INSURANCE_seq.Nextval
  INTO:NEW.INSURANCEId  FROM DUAL;
END;
/

prompt
prompt Creating trigger LEAVE_TEST
prompt ===========================
prompt
CREATE OR REPLACE TRIGGER ZH.Leave_test
BEFORE INSERT ON Leave
FOR EACH ROW
BEGIN
  SELECT Leave_seq.Nextval
  INTO:NEW.LeaveId  FROM DUAL;
END;
/

prompt
prompt Creating trigger MAP_TEST
prompt =========================
prompt
CREATE OR REPLACE TRIGGER ZH.MAP_test
BEFORE INSERT ON MAP
FOR EACH ROW
BEGIN
  SELECT MAP_seq.Nextval
  INTO:NEW.MAPId  FROM DUAL;
END;
/

prompt
prompt Creating trigger NOTICE_TEST
prompt ============================
prompt
CREATE OR REPLACE TRIGGER ZH.NOTICE_test
BEFORE INSERT ON NOTICE
FOR EACH ROW
BEGIN
  SELECT NOTICE_seq.Nextval
  INTO:NEW.NOTICEId  FROM DUAL;
END;
/

prompt
prompt Creating trigger PROJECTUSER_TEST
prompt =================================
prompt
CREATE OR REPLACE TRIGGER ZH.PROJECTUSER_test
BEFORE INSERT ON PROJECTUSER
FOR EACH ROW
BEGIN
  SELECT PROJECTUSER_seq.Nextval
  INTO:NEW.PROJECTUSERID  FROM DUAL;
END;
/

prompt
prompt Creating trigger PROJECT_TEST
prompt =============================
prompt
CREATE OR REPLACE TRIGGER ZH.PROJECT_test
BEFORE INSERT ON PROJECT
FOR EACH ROW
BEGIN
  SELECT PROJECT_seq.Nextval
  INTO:NEW.PROJECTId  FROM DUAL;
END;
/

prompt
prompt Creating trigger SALARY_TEST
prompt ============================
prompt
CREATE OR REPLACE TRIGGER ZH.Salary_test
BEFORE INSERT ON Salary
FOR EACH ROW
BEGIN
  SELECT Salary_seq.Nextval
  INTO:NEW.SalaryId  FROM DUAL;
END;
/

prompt
prompt Creating trigger USERS_TEST
prompt ===========================
prompt
CREATE OR REPLACE TRIGGER ZH.USERS_test
BEFORE INSERT ON USERS
FOR EACH ROW
BEGIN
  SELECT USERS_seq.Nextval
  INTO:NEW.USERId  FROM DUAL;
END;
/

prompt
prompt Creating trigger WORKLOG_TEST
prompt =============================
prompt
CREATE OR REPLACE TRIGGER ZH.WorkLog_test
BEFORE INSERT ON WorkLog
FOR EACH ROW
BEGIN
  SELECT WorkLog_seq.Nextval
  INTO:NEW.LogId  FROM DUAL;
END;
/


spool off
