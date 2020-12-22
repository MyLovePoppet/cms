drop database if exists cms;
create database cms;
use cms;
-- 创建管理员表
create table `admin`
(
    `a_name`   varchar(12) not null comment '账号',
    `a_passwd` char(32)    not null comment '密码,md5散列后',
    -- 主键 name
    primary key (`a_name`)
) engine = innodb
  default charset = utf8;

-- admin_测试数据
insert into `admin`(`a_name`, `a_passwd`)
values ('admin', md5('admin'));

-- 学生表
create table `student`
(
    `s_id`      int(10) auto_increment not null comment 'id',
    `s_name`    varchar(10)            not null comment '姓名',
    `s_sex`     char(1)                not null default '男' comment '性别',
    `s_passwd`  char(32)               not null comment '密码,md5散列后',
    `s_class`   varchar(20)                     default null comment '班级',
    `s_major`   varchar(20)                     default null comment '专业',
    `s_college` varchar(20)                     default null comment '学院',
    -- 主键id
    primary key (`s_id`)
) engine = innodb
  default charset = utf8;

insert into `student`(`s_name`, `s_sex`, `s_passwd`, `s_class`, `s_major`, `s_college`)
VALUES ('张三', '男', md5('123456'), '大一(1)班', '计算机', '计软'),
       ('李四', '男', md5('123456'), '大一(1)班', '计算机', '计软'),
       ('王五', '女', md5('123456'), '大一(2)班', '数学', '数学');

-- 创建一个触发器，用于删除student的外键约束
create trigger on_student_delete
    before delete
    on `student`
    for each row
    delete
    from `select_course`
    where `select_course`.`s_id` = OLD.`s_id`;


-- 教师表
create table `teacher`
(
    `t_id`           int(10) auto_increment not null comment 'id',
    `t_name`         varchar(10)            not null comment '姓名',
    `t_passwd`       char(32)               not null comment '密码,md5散列后',
    `t_sex`          char(1)                not null default '男' comment '性别',
    `t_introduction` varchar(1024)                   default null comment '简介',
    -- 主键id
    primary key (`t_id`)
) engine = innodb
  default charset = utf8;

insert into `teacher`(`t_name`, `t_passwd`, `t_sex`, `t_introduction`)
VALUES ('张三老师', md5('123456'), '男', '清华大学博士'),
       ('李四老师', md5('123456'), '女', '北京大学博士');

-- 创建一个触发器，用于删除老师表的外键约束
create trigger on_teacher_delete
    before delete
    on `teacher`
    for each row
    delete
    from `course_schedule`
    where `course_schedule`.`t_id` = OLD.`t_id`;

-- 课程信息表
create table `course`
(
    `c_id`           int(10) auto_increment not null comment 'id',
    `c_name`         varchar(20)            not null comment '课程名',
    `c_introduction` varchar(1024) default null comment '课程介绍',
    `c_major`        varchar(20)   default null comment '所属学院',
    `c_college`      varchar(20)   default null comment '所属专业',
    -- 主键id
    primary key (`c_id`)
) engine = innodb
  default charset = utf8;

insert into `course`(`c_name`, `c_introduction`, `c_major`, `c_college`)
VALUES ('Java程序设计', 'Java程序设计的介绍', '计算机', '计软'),
       ('数学分析', '数学分析的介绍', '数学', '数学');

-- 创建一个触发器，用于course表的删除操作
create trigger on_course_delete
    before delete
    on `course`
    for each row
    -- 删除course_schedule内的记录
    delete
    from `course_schedule`
    where `c_id` = OLD.`c_id`;

-- 课程安排表
create table `course_schedule`
(
    `cs_id`       int(10) not null auto_increment comment '开课记录号',
    `c_id`        int(10) not null comment '课程id,外键',
    `t_id`        int(10) not null comment '教师id,外键',
    `cs_time`     varchar(20) default null comment '上课时间',
    `cs_location` varchar(20) default null comment '上课地点',
    `cs_credits`  int(10)     default null comment '学分',
    `cs_period`   int(10)     default null comment '学时',
    `cs_num`      int(10)     default 0 comment '选课人数',
    -- c_id + t_id为主键
    primary key (`cs_id`),
    unique (`c_id`, `t_id`),
    -- 两个外键约束
    foreign key (`c_id`) references `course` (`c_id`),
    foreign key (`t_id`) references `teacher` (`t_id`)
) engine = innodb
  default charset = utf8;

create trigger on_course_schedule_delete
    before delete
    on `course_schedule`
    for each row
    delete
    from `select_course`
    where `select_course`.`cs_id` = `OLD`.`cs_id`;

insert into `course_schedule`(`c_id`, `t_id`, `cs_time`, `cs_location`, `cs_credits`, `cs_period`)
values (1, 1, '周三上午1,2节', 'A205', 3, 36),
       (1, 2, '周四上午1,2节', 'B205', 3, 36),
       (2, 1, '周一上午1,2节', 'C205', 4, 48),
       (2, 2, '周二上午1,2节', 'D205', 4, 48);


-- 选课结果表
create table `select_course`
(
    `sc_id` int(10) not null auto_increment comment '选课id',
    `s_id`  int(10) not null comment '学生id,外键',
    `cs_id` int(10) not null comment '开课记录号',
    primary key (`sc_id`),
    -- 一个学生一门课只能选一次
    unique (`s_id`, `cs_id`),
    -- 两个外键约束
    foreign key (`s_id`) references `student` (`s_id`),
    foreign key (`cs_id`) references `course_schedule` (`cs_id`)
) engine = innodb
  default charset = utf8;

-- 课程成绩表，得分为-1表示未给分
create table `course_score`
(
    `sc_id`            int(10) not null comment '选课id',
    `normal_score`     int(10) not null default -1 comment '平时得分',
    `final_exam_score` int(10) not null default -1 comment '期末得分',
    `overall_score`    int(10) not null default -1 comment '总评成绩',
    primary key (`sc_id`),
    foreign key (`sc_id`) references `select_course` (`sc_id`)
) engine = innodb
  default charset = utf8;

-- 创建存储过程，使得学生选课后生成成绩表，并更新选课记录表
create procedure update_on_select_course_insert(in scID int)
begin
    -- 更新成绩表
    insert into `course_score` (`sc_id`, `normal_score`, `final_exam_score`, `overall_score`)
    VALUES (scID, -1, -1, -1);
    -- 更新选课记录表
    update `course_schedule`
    set `cs_num`=`cs_num` + 1
    where `cs_id` = scID;
end;
-- 创建触发器
create trigger on_select_course_insert
    after insert
    on `select_course`
    for each row
    call update_on_select_course_insert(NEW.sc_id);

insert into `select_course` (`s_id`, `cs_id`)
VALUES (1, 1),
       (1, 2),
       (2, 3),
       (2, 4),
       (3, 2);

-- 创建一个触发器，在删除选课结果的时候先将课程得分表内的记录删掉
create trigger on_select_course_delete
    before delete
    on `select_course`
    for each row
    delete
    from `course_score`
    where `course_score`.`sc_id` = OLD.`sc_id`;

delete
from select_course
where sc_id = 1;
