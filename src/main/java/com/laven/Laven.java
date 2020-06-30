package com.laven;

import java.util.Properties;

public class Laven {

    LavenProperties properties = null;

    public Laven(LavenProperties lavenProperties) {
        this.properties = lavenProperties;
    }

    public void print() {
        System.out.println("这是laven打印的东西!  姓名:" + properties.getName() + " 年龄:" + properties.getAge());
    }

    public String info() {
        return "返回信息:  姓名:" + properties.getName() + " 年龄:" + properties.getAge();
    }
}
