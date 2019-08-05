package com.jnshu.dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
  * 远程对象接口必须扩展为Remote接口，接口中所有的方法必须声明抛出RemoteException异常。
  * 这是因为远程方法总是存在失败的可能，所以java编程语言要求每一次远程方法的调用都必须捕获RemoteException,
  * 并且指明当调用不成功时应执行的相应处理操作。
  */
public interface IHELLO extends Remote {
    public String sayHello(String name)throws RemoteException;
    public int sum(int a,int b)throws RemoteException;
}
