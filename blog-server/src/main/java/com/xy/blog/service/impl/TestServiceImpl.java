package com.xy.blog.service.impl;

import com.xy.blog.dao.Test1Mapper;
import com.xy.blog.dao.TestMapper;
import com.xy.blog.doman.Test;
import com.xy.blog.doman.Test1;
import com.xy.blog.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName TestServiceImpl
 * @Description
 * @Author Liusg
 * @Date 2019/5/4
 * @Version 1.0
 **/
@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper mapper;

    @Resource
    private Test1Mapper mapper1;
    @Override
    public List<Test>  selectAll(){
        List<Test> tests = mapper.selectAll();
        return  tests;
    }

    @Override
    public int insertAll(List<Test1> list) {
         return mapper1.insertBatch(list);

    }

    @Override
    public int saveTest1(Test1 test1) {
        return mapper1.insert(test1);
    }


}
