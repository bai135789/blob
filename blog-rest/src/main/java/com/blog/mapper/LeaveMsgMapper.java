package com.blog.mapper;

import com.blog.pojo.LeaveMsg;
import com.blog.pojo.LeaveMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaveMsgMapper {
    int countByExample(LeaveMsgExample example);

    int deleteByExample(LeaveMsgExample example);

    int deleteByPrimaryKey(Integer msgId);

    int insert(LeaveMsg record);

    int insertSelective(LeaveMsg record);

    List<LeaveMsg> selectByExample(LeaveMsgExample example);

    LeaveMsg selectByPrimaryKey(Integer msgId);

    int updateByExampleSelective(@Param("record") LeaveMsg record, @Param("example") LeaveMsgExample example);

    int updateByExample(@Param("record") LeaveMsg record, @Param("example") LeaveMsgExample example);

    int updateByPrimaryKeySelective(LeaveMsg record);

    int updateByPrimaryKey(LeaveMsg record);
}