package com.blog.mapper;

import com.blog.pojo.Visitor;
import com.blog.pojo.VisitorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VisitorMapper {
    int countByExample(VisitorExample example);

    int deleteByExample(VisitorExample example);

    int deleteByPrimaryKey(Integer vId);

    int insert(Visitor record);

    int insertSelective(Visitor record);

    List<Visitor> selectByExample(VisitorExample example);

    Visitor selectByPrimaryKey(Integer vId);

    int updateByExampleSelective(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByExample(@Param("record") Visitor record, @Param("example") VisitorExample example);

    int updateByPrimaryKeySelective(Visitor record);

    int updateByPrimaryKey(Visitor record);
}