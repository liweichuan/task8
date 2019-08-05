package com.jnshu.daoimpl;

import com.jnshu.dao.IHELLO;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


/**
 * 接口的实现类同时要实现Serializable接口，这里继承UnicastRemoteObject也是间接
 * 实现Serializable接口，同时，因为构造方法需要抛出RemoteException，所以不能缺省
 * 使用隐含的无参构造方法，而应该自己显式定义构造方法。
 */

public class HelloImpl extends UnicastRemoteObject implements IHELLO {
    private static final long servialVersionUID =1961558474342609777L;
    public HelloImpl() throws RemoteException{
        super();
    }

    @Override
    public String sayHello(String name){
        return "Hello"+name;
    }

    @Override
    public int sum(int a, int b){
        return a+b;
    }
}
