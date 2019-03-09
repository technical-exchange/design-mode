package com.designmode.study.designmode.abstractfactory;

/**
 * @ClassName Client
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/9 22:19
 * @Version 1.0  还需要优化 后面会将其优化
 **/
public class Client {

    public static  void main (String [] args){
        Computer computer = new Computer() ;
        computer.create();
    }
}
