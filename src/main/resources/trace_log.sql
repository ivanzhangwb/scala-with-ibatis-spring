CREATE TABLE trace_log (
	pkid bigint unsigned not null AUTO_INCREMENT comment '物理主键',
	user_id varchar(32)  CHARACTER SET ascii NOT NULL COMMENT 'user表主键',
	ip varchar(15)  COMMENT '访问的IP来源',
	access_mode varchar(50)  COMMENT '浏览器类型',
	access_time datetime NOT NULL COMMENT '访问时间',
	gmt_create  datetime NOT NULL COMMENT '创建时间',
	gmt_modified datetime NOT NULL COMMENT '修改时间',
	PRIMARY KEY (pkid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT '记录用户的访问历史';
