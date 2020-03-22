package com.huang.util;

import org.jasypt.util.text.BasicTextEncryptor;

import javax.swing.plaf.basic.BasicTextAreaUI;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor e = new BasicTextEncryptor();
        e.setPassword("123456!@#");
        String name = e.encrypt("user");
        String password = e.encrypt("123456");
        System.out.println(name+":"+password);

    }
}
