package com.xy.blog.dao;


import com.xy.blog.doman.Test1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface Test1Mapper {
    int deleteByPrimaryKey(Long id);

    int insert(Test1 record);

    int insertSelective(Test1 record);

    Test1 selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test1 record);

    int updateByPrimaryKey(Test1 record);

    int insertBatch(@Param(value = "testList") List<Test1> testList);
}