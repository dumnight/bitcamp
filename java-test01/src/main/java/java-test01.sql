drop table ex_book;


create table ex_book (
    no int not null,
    title varchar(100) not null,
    publisher varchar(50) not null,
    pubdt varchar(50) not null,
    price int not null,
    conts text
);

alter table ex_book
    add constraint primary key (no);

alter table ex_book
    modify column no int not null auto_increment;
    
alter table ex_book
    add fulltext (title);

alter table ex_book
    add constraint unique (title);    


/*게시글 첨부 파일명을 저장할 테이블을 정의한다 */
    create table ex_file2 (
    no int not null,
    filename varchar(255) not null,
    fno int not null
);
alter table ex_file2
    add constraint primary key (no);

alter table ex_file2
    modify column no int not null auto_increment;
    
alter table ex_file2
    add constraint foreign key (fno) references ex_book(no);
    
    
    /* ex_file 테이블에 Cascade 기능을 적용하기 */
/* => 먼저 foreign key에 대한 constraint 이름을 알아낸다.*/
show create table ex_file2;

/* => 기존의 등록된 외부키 constraint를 제거한다. */
alter table ex_file2
  drop foreign key ex_file2_ibfk_1;

alter table ex_file2
  add constraint foreign key (fno) references ex_book(no) on delete cascade;
  

    
    