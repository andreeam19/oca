package com.test.package1;

import com.test.package2.Access3;

public class Access2 {

    public static void main(String[] args) {
        Access1 a= new Access1();
        System.out.println(a.getHours());
        System.out.println(a. minutes);

        Access3 b= new Access3();
        System.out.println(a.hours);
        System.out.println(a.minutes);

    }

}
