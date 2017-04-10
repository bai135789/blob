package com.blog.mapper;

import com.blog.pojo.ColumnArticle;
import com.blog.pojo.ColumnArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ColumnArticleMapper {
    int countByExample(ColumnArticleExample example);

    int deleteByExample(ColumnArticleExample example);

    int deleteByPrimaryKey(Short articleId);

    int insert(ColumnArticle record);

    int insertSelective(ColumnArticle record);

    List<ColumnArticle> selectByExampleWithBLOBs(ColumnArticleExample example);

    List<ColumnArticle> selectByExample(ColumnArticleExample example);

    ColumnArticle selectByPrimaryKey(Short articleId);

    int updateByExampleSelective(@Param("record") ColumnArticle record, @Param("example") ColumnArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") ColumnArticle record, @Param("example") ColumnArticleExample example);

    int updateByExample(@Param("record") ColumnArticle record, @Param("example") ColumnArticleExample example);

    int updateByPrimaryKeySelective(ColumnArticle record);

    int updateByPrimaryKeyWithBLOBs(ColumnArticle record);

    int updateByPrimaryKey(ColumnArticle record);
}