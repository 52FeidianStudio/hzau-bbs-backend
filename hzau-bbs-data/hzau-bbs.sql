-- refence from https://blog.csdn.net/tianya441523/article/details/48862639
USE hzau_bbs;

drop table user;

create table user (
id bigint(20) primary key auto_increment
comment '主键',
username varchar (20) not null default ''
comment '用户名',
number varchar (15) not null unique
comment '学号',
email varchar (50) not null default ''
comment '邮箱',
mobile varchar (15) not null default ''
comment '手机号码',
enable tinyint not null default 1
comment '是否有效，1 有效；0 无效',
update_time timestamp not null default CURRENT_TIMESTAMP  on update current_timestamp
comment '更新时间',
create_time timestamp not null default CURRENT_TIMESTAMP
comment '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8
COMMENT '用户表';

INSERT INTO user (username, number, email, mobile, enable) VALUES ('王成', '2014317200212', 'wangcheng10@xiaomi.com', '17764224396', 1)

drop table topic;

create table topic(
id bigint(20) primary key auto_increment
comment 'id标志',
class_id int not null default -1
comment '板块分类id',
title varchar(200) not null default ''
comment '标题',
body text not null
comment '内容',
user_id bigint(20) not null default -1
comment '发帖用户id',
enable tinyint not null default 1
comment '帖子是否有效，1 有效；2 无效',
visit_count int not null default 0
comment '帖子访问量',
reply_count int not null default 0
comment '回复量',
last_modified_user_id bigint(20) not null default -1
comment '最后编辑用户id',
last_modified_time timestamp not null default CURRENT_TIMESTAMP
comment '最后编辑时间',
last_replied_user_id bigint(20) not null default -1
comment '最后回复用户id',
last_replied_time timestamp not null default CURRENT_TIMESTAMP
comment '最后回复时间',
is_close tinyint not null default 1
comment '帖子是否关闭 1 不关闭；0 关闭',
create_time timestamp not null default CURRENT_TIMESTAMP
comment '帖子创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8
comment '帖子表';

drop table topic_reply;

create table topic_reply (
id bigint(20) primary key auto_increment
comment 'id标志',
topic_id bigint(20) not null default -1
comment '帖子标识id',
user_id bigint(20) not null default -1
comment '用户标识id',
body text not null
comment '回复内容',
update_time timestamp not null default CURRENT_TIMESTAMP
comment '更新时间',
create_time timestamp not null default CURRENT_TIMESTAMP
comment '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8
comment '帖子回复表';
