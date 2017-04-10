package com.blog.mapper;

import com.blog.pojo.UserOauth;
import com.blog.pojo.UserOauthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOauthMapper {
    int countByExample(UserOauthExample example);

    int deleteByExample(UserOauthExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(UserOauth record);

    int insertSelective(UserOauth record);

    List<UserOauth> selectByExample(UserOauthExample example);

    UserOauth selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") UserOauth record, @Param("example") UserOauthExample example);

    int updateByExample(@Param("record") UserOauth record, @Param("example") UserOauthExample example);

    int updateByPrimaryKeySelective(UserOauth record);

    int updateByPrimaryKey(UserOauth record);
}