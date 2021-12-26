create table if not exists class_room (
    class_number int primary key
);

create table if not exists student (
    id identity(1,1),
    name varchar(20) not null,
    email varchar(50) not null unique,
    class_number int references class_room(class_number)
);