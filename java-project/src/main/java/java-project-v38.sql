/*게시글 첨부 파일명을 저장할 테이블을 정의한다 */
create table ex_file (
    no int not null,
    filename varchar(255) not null,
    bno int not null
);
alter table ex_file
    add constraint primary key (no);

alter table ex_file
    modify column no int not null auto_increment;
    
alter table ex_file
    add constraint foreign key (bno) references ex_board(no);
    
/* ex_board 와 ex_file 테이블의 데이터를 조인하여 가져오기 */
    
--게시물 데이터만 가져오기    
select no, title, conts, regdt, vwcnt, mno
from ex_board
where no=47;

--게시물을 작성자의 데이터만 가져오기
select no, name, email
from ex_memb
where no=17;

--게시물 첨부파일 데이터만 가져오기
select no, filename
from ex_file
where bno=47;

--게시물 데이터와 작성자 데이터 조인하기
select b.no, b.title, b.conts, b.regdt, b.vwcnt,
       m.no, m.name, m.email
from ex_board as b join ex_memb as m on b.mno=m.no
where b.no=47;

--게시물 데이터와 작성자 데이터와 파일 데이터 조인하기
select b.no, b.title, b.conts, b.regdt, b.vwcnt,
       m.no, m.name, m.email,
       f.no, f.filename
from ex_board as b 
     join ex_memb as m on b.mno=m.no
     left join ex_file as f on b.no=f.bno
where b.no=47;

--ex_file 테이블에 Cascade 기능을 적용하기
--=>먼저 foreign key에 대한 constraint 이름을 알아낸다.
--show create table ex_file

--기존의 등록된 외부키 constraint를 제거한다.
alter table ex_file
    drop foreign key ex_file_ibfk_1;

--cascade 기능이 추가된 외부키 constraint를 등록한다 
alter table ex_file
    add constraint foreign key (bno) references ex_board(no) on delete cascade;




/* 게시글 작성자 컬럼을 추가한다 */
alter table ex_board
    add column mno int not null;
/* 작성자 컬름을 ex_memb 테이블의 no 컬럼을 참조하는 외부키로 설정한다 */
alter table ex_board
    add constraint foreign key (mno) references ex_memb(no);
/* ex_board와 ex_memb 테이블 조인하여 데이터 select 하기 */
--1) 게시판 테이블 데이터 가져오기 
    select no, title, regdt, vwcnt, mno
from ex_board;
--2) 회원 테이블 데이터 가져오기
select no, name
from ex_memb;
--3) 게시판과 회원 테이블의 데이터를 모두 합쳐서 가져오기(파티션 조인)
select b.no, b.title, b.regdt, b.vwcnt, b.mno, m.no, m.name
from ex_board b, ex_memb m;
--4) 게시판의 mno와 회원 테이블의 no가 같은 데이터만 연결하여 가져오기
select b.no, b.title, b.regdt, b.vwcnt, m.no, m.name
from ex_board b join ex_memb m on b.mno=m.no;



/* 성적 정보 테이블 */


drop table ex_score;
drop table ex_board;
drop table ex_memb;
drop table ex_room;


create table ex_score (
    no int not null,
    name varchar(30) not null,
    kor int not null,
    eng int not null,
    math int not null
);

alter table ex_score
    add constraint primary key (no);

alter table ex_score
    modify column no int not null auto_increment;
    
alter table ex_score
    add fulltext (name);
    

create table ex_memb (
    no int not null,
    name varchar(30) not null,
    email varchar(50) not null,
    pwd varchar(100) not null,
    regdt datetime not null
);

alter table ex_memb
    add constraint primary key (no);

alter table ex_memb
    modify column no int not null auto_increment;
    
alter table ex_memb
    add fulltext index (name);
    
alter table ex_memb
    add constraint unique (email);
    
create table ex_board (
    no int not null,
    title varchar(200) not null,
    conts text,
    regdt datetime not null,
    vwcnt int default 0 
);

alter table ex_board
  add constraint primary key (no);

alter table ex_board
  modify column no int not null auto_increment;    
    
    
create table ex_room (
    no int not null,
    loc varchar(20) not null,
    name varchar(20) not null,
    capacity int not null
);    
    
alter table ex_room
    add constraint primary key (no);

alter table ex_room
    modify column no int not null auto_increment;
    
alter table ex_room
    add unique (loc, name);
    
    
    
    
    
    
    
    
    
    
    
    
    
    