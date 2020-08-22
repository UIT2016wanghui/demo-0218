package com.atguigu.test00218.demo0218.mapper;

import com.atguigu.test00218.demo0218.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

// mapper 泛型 表示当前mapper 要操作实体类
// 数据访问层
public interface UserInfoMapper extends Mapper<UserInfo> {

}
