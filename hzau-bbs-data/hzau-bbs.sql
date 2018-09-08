USE hzau_bbs;

DROP TABLE user;

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
enable TINYINT not null default '1'
comment '是否有效，1 有效；0 无效',
update_time timestamp not null default CURRENT_TIMESTAMP  on update current_timestamp
comment '更新时间',
create_time timestamp not null default CURRENT_TIMESTAMP
comment '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO user (username, number, email, mobile, enable) VALUES ('王成', '2014317200212', 'wangcheng10@xiaomi.com', '17764224396', 1)