package com.jnshu.daoimpl;

import com.jnshu.dao.HelloRMIService;

public class HelloRMIServiceImpl implements HelloRMIService {
    @Override
    public int getAdd(int a, int b) {
        return a+b;
    }
}
