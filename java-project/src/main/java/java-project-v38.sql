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
    
    
    
    
    
    
    
    
    
    
    
    
    
    