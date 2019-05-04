package com.xy.blog.service;

import com.xy.blog.doman.Test;
import com.xy.blog.doman.Test1;

import java.util.List;

public interface TestService {
    List<Test> selectAll();

    int insertAll(List<Test1> list);

    int saveTest1(Test1 test1);
}

