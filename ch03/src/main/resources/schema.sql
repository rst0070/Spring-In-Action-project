create table if not exists class_room (
    class_number int primary key
)

create table if not exists student (
    id identity(1,1),
    name varchar(20) not null,
    email varchar(50) not null
)

alter table student
    add foreign key (class_room) references class_room(class_number);

create table if not exists class_room_students (
    class_room int not null,
    student int not null
)

alter table class_room_students
    add foreign key (class_room) references class_room(class_number);
    
alter table class_room_students
    add foreign key (student) references student(id);