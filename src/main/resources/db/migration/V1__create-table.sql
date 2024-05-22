CREATE TABLE urls(
    id int not null auto_increment,
    url varchar(255) not null unique,
    short_url varchar(50) not null unique,
    created_at timestamp not null,
    primary key (id)
);