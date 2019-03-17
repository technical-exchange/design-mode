package com.designmode.study.designmode.adpaterpattern.client;

import com.designmode.study.designmode.adpaterpattern.adapter.AdapterClient;
import com.designmode.study.designmode.adpaterpattern.adapter.UsbAdapter;

/**
 * @ClassName ClientTest
 * @Description:TODO
 * @Author TANGHJ
 * @Date 2019/3/17 13:01
 * @Version 1.0
 **/
public class ClientTest {
public static void main (String[]args){
    /**
     * 类适配器
     */
    UsbAdapter adapter = new  UsbAdapter();
     adapter.usb2();
    /**
     * 接口适配器
     *
     */
    AdapterClient client = new AdapterClient();
    client.test1();
}
}
