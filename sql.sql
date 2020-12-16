/*
Navicat MySQL Data Transfer

Source Server         : 退班监听
Source Server Version : 50721
Source Host           : 10.167.2.16:33067
Source Database       : human

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2020-12-16 17:49:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for off_class_monitor
-- ----------------------------
DROP TABLE IF EXISTS `off_class_monitor`;
CREATE TABLE `off_class_monitor` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `bill_code` varchar(100) DEFAULT NULL COMMENT '申请单号',
  `student_code` varchar(32) DEFAULT NULL COMMENT '学生号',
  `student_name` varchar(32) DEFAULT NULL COMMENT '学生姓名',
  `old_card_code` varchar(32) DEFAULT NULL COMMENT '原听课证号',
  `school_id` int(11) DEFAULT NULL COMMENT '学校ID',
  `class_code` varchar(32) DEFAULT NULL COMMENT '原班级号',
  `teacher_code` varchar(200) DEFAULT NULL,
  `teacher_name` varchar(200) DEFAULT NULL,
  `teacher_email` varchar(300) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '申请时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `bill_state` int(2) DEFAULT NULL COMMENT '退班状态:1已提交 2 已完成 3 已取消',
  `message` varchar(1000) DEFAULT NULL,
  `follow_status` int(2) DEFAULT '0' COMMENT '教师跟进状态（0未处理,1挽退,2确认退班,3 48小时未操作）',
  `progress` varchar(32) DEFAULT NULL COMMENT '当前进度',
  `progressmemo` varchar(32) DEFAULT NULL COMMENT '进度描述',
  `operator` varchar(32) DEFAULT NULL COMMENT '申请人',
  `submit_time` timestamp NULL DEFAULT NULL COMMENT '老师跟进时间',
  `img_url` varchar(300) DEFAULT NULL,
  `apply_time` timestamp NULL DEFAULT NULL COMMENT '退班申请时间',
  `dept_code` varchar(50) DEFAULT NULL COMMENT '部门编号',
  `dept_name` varchar(50) DEFAULT NULL COMMENT '部门名称',
  `follow_email` varchar(32) DEFAULT NULL COMMENT '跟进人邮箱',
  `follow_name` varchar(32) DEFAULT NULL COMMENT '跟进人姓名',
  `subject_code` varchar(32) DEFAULT NULL COMMENT '退班的科目',
  `subject_name` varchar(32) DEFAULT NULL COMMENT '退班的科目',
  `quarter_code` varchar(32) DEFAULT NULL COMMENT '科目所在季度',
  `quarter_name` varchar(32) DEFAULT NULL COMMENT '科目所在季度名称',
  `begin_class_date` varchar(32) DEFAULT NULL COMMENT '班级开课时间',
  `old_student_flag` varchar(16) DEFAULT NULL COMMENT '老生标识：0为新生 ，1为老生 ',
  `teacher_identity` varchar(16) DEFAULT NULL COMMENT '教师身份：0为班级教师 ，1为咨询师',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=78 DEFAULT CHARSET=utf8 COMMENT='退班监控表';




INSERT INTO `human`.`off_class_monitor` (`id`, `bill_code`, `student_code`, `student_name`, `old_card_code`, `school_id`, `class_code`, `teacher_code`, `teacher_name`, `teacher_email`, `create_time`, `update_time`, `bill_state`, `message`, `follow_status`, `progress`, `progressmemo`, `operator`, `submit_time`, `img_url`, `apply_time`, `dept_code`, `dept_name`, `follow_email`, `follow_name`, `subject_code`, `subject_name`, `quarter_code`, `quarter_name`, `begin_class_date`, `old_student_flag`, `teacher_identity`) VALUES ('1', 'QSTA-112212', 'HF143442', '王贺', 'PP202009290006', '25', 'PP20200929', 'TC1940', '汪金宇', 'wanghe29@xdf.cn', '2020-11-25 13:30:00', '2020-11-26 16:12:36', '1', 'cfvsdvsfvsdfs', '2', '提交申请', '', '', '2020-12-10 18:15:19', 'http://hrms-img.oss-cn-shanghai.aliyuncs.com/teacher/library/1607595318749.jpg,http://hrms-img.oss-cn-shanghai.aliyuncs.com/teacher/library/1607595318954.jpg', '2020-12-01 10:21:30', 'DPHF015-1', '英联邦项目部-1', 'wanghe29', '王贺', '2', '数学', '4', '寒假', NULL, NULL, NULL);
INSERT INTO `human`.`off_class_monitor` (`id`, `bill_code`, `student_code`, `student_name`, `old_card_code`, `school_id`, `class_code`, `teacher_code`, `teacher_name`, `teacher_email`, `create_time`, `update_time`, `bill_state`, `message`, `follow_status`, `progress`, `progressmemo`, `operator`, `submit_time`, `img_url`, `apply_time`, `dept_code`, `dept_name`, `follow_email`, `follow_name`, `subject_code`, `subject_name`, `quarter_code`, `quarter_name`, `begin_class_date`, `old_student_flag`, `teacher_identity`) VALUES ('2', 'QSTA-112233', 'HF143455', '李四', 'PP202009290011', '25', 'PP20200911', 'TC1940', '汪金宇', 'wanghe29@xdf.cn', '2020-11-25 12:59:00', '2020-11-26 16:12:36', '1', 'test', '2', '提交申请', '', '', '2020-12-10 17:52:48', '', '2020-12-01 10:21:30', 'DPHF015-1', '英联邦项目部-1', 'wanghe29', '王贺', '1', '语文', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `human`.`off_class_monitor` (`id`, `bill_code`, `student_code`, `student_name`, `old_card_code`, `school_id`, `class_code`, `teacher_code`, `teacher_name`, `teacher_email`, `create_time`, `update_time`, `bill_state`, `message`, `follow_status`, `progress`, `progressmemo`, `operator`, `submit_time`, `img_url`, `apply_time`, `dept_code`, `dept_name`, `follow_email`, `follow_name`, `subject_code`, `subject_name`, `quarter_code`, `quarter_name`, `begin_class_date`, `old_student_flag`, `teacher_identity`) VALUES ('3', 'QSTA-112211', 'HF143441', 'test1', 'PP202009290006', '25', 'PP20200929', 'TC1940', '汪金宇', 'wanghe29@xdf.cn', '2020-11-25 13:30:00', '2020-11-26 16:12:36', '1', 'genjin', '0', '提交申请', '', '', '2020-12-07 15:39:12', 'http://hrms-img.oss-cn-shanghai.aliyuncs.com/teacher/library/1607326725782.jpg,http://hrms-img.oss-cn-shanghai.aliyuncs.com/teacher/library/1607326736290.jpg,http://hrms-img.oss-cn-shanghai.aliyuncs.com/teacher/library/1607326744198.jpg', '2020-11-24 12:59:00', 'DPHF015', '英联邦项目部', 'wanghe29', '王贺', '3', '英语', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `human`.`off_class_monitor` (`id`, `bill_code`, `student_code`, `student_name`, `old_card_code`, `school_id`, `class_code`, `teacher_code`, `teacher_name`, `teacher_email`, `create_time`, `update_time`, `bill_state`, `message`, `follow_status`, `progress`, `progressmemo`, `operator`, `submit_time`, `img_url`, `apply_time`, `dept_code`, `dept_name`, `follow_email`, `follow_name`, `subject_code`, `subject_name`, `quarter_code`, `quarter_name`, `begin_class_date`, `old_student_flag`, `teacher_identity`) VALUES ('4', 'QSTA-112212', 'HF143442', 'test2', 'PP202009290006', '25', 'PP20200929', 'TC1940', '汪金宇', 'wanghe29@xdf.cn', '2020-11-25 13:30:00', '2020-11-26 16:12:36', '1', '', '0', '提交申请', '', '', '2020-12-01 10:34:46', '', '2020-11-24 12:59:00', 'DPHF015', '英联邦项目部', NULL, NULL, '14', '全科', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `human`.`off_class_monitor` (`id`, `bill_code`, `student_code`, `student_name`, `old_card_code`, `school_id`, `class_code`, `teacher_code`, `teacher_name`, `teacher_email`, `create_time`, `update_time`, `bill_state`, `message`, `follow_status`, `progress`, `progressmemo`, `operator`, `submit_time`, `img_url`, `apply_time`, `dept_code`, `dept_name`, `follow_email`, `follow_name`, `subject_code`, `subject_name`, `quarter_code`, `quarter_name`, `begin_class_date`, `old_student_flag`, `teacher_identity`) VALUES ('5', 'QSTA-112213', 'HF143443', 'test3', 'PP202009290006', '25', 'PP20200929', 'TC1940', '汪金宇', 'wanghe29@xdf.cn', '2020-11-25 13:30:00', '2020-11-26 16:12:36', '1', 'haodeba', '0', '提交申请', '', '', '2020-12-01 10:48:13', 'http://hrms-img.oss-cn-shanghai.aliyuncs.com/teacher/library/1606790892477.png', '2020-11-24 12:59:00', 'DPHF015', '英联邦项目部', NULL, NULL, '2', '数学', NULL, NULL, NULL, NULL, NULL);
