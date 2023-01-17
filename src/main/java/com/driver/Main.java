package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        obj.setName("abc");
        String asd = obj.getName();
        System.out.println(asd);
        //'name' has private access in 'com.driver.RWOnly'
    }


}
