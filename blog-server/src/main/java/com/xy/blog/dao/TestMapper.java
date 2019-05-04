package com.xy.blog.dao;


import com.xy.blog.doman.Test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//@Mapper
public interface TestMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);

    List<Test> selectAll();
}