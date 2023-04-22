create table Author
(
    authorId            integer not null
        constraint authorId_pk
            primary key autoincrement,
    authorName     varchar(20),
    authorBirthday date,
    authorSex      varchar(2),
    constraint sex_check
        check (authorSex in ('男', '女', '扶他', '未填'))
);

create unique index authorId_index
    on Author (authorId);




create table User
(
    userId          integer not null
        constraint userId_pk
            primary key autoincrement,
    userName     varchar(20),
    userPwd      varchar(20),
    userSex      varchar(2),
    userBirthday date,
    constraint sex_check
        check (userSex in ('男', '女', '扶他', '未填'))
);

create unique index userId_index
    on User (userId);




create table Book
(
    bookId       integer not null
        constraint bookId_pk
            primary key autoincrement,
    bookName     varchar(255),
    bookISBN     varchar(255),
    bookStockNum integer,
    bookLoansNum integer,
    bookPrice    real,
    bookCategory text
);

create unique index bookId_index
    on Book (bookId);




create table BookAuthor
(
    bId integer not null
        constraint BookAuthor_Book_bookId_fk
            references Book,
    aid integer not null
        constraint BookAuthor_Author_authorId_fk
            references Author
);

create unique index BookAuthor_bId_aid_uindex
    on BookAuthor (bId, aid);




create table Borrow
(
    uid       integer not null
        constraint Borrow_User_userId_fk
            references User,
    bid       integer not null
        constraint Borrow_Book_bookId_fk
            references Book,
    borrowNum integer
);

create unique index Borrow_uid_bid_uindex
    on Borrow (uid, bid);

