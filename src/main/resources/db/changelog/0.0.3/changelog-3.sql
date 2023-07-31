create table Client (
  id varchar(255) not null,
  name varchar(50) not null,
  primary key (id)
);

create table "Limit" (
  id varchar(255) not null,
  name varchar(50) not null,
  primary key (id)
);

create table "Transaction" (
  id varchar(255) not null,
  name varchar(50) not null,
  primary key (id)
);
