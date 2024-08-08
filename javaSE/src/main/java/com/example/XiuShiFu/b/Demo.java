package com.example.XiuShiFu.b;

import com.example.XiuShiFu.a.AZi;
import org.junit.Test;

public class Demo {


    @Test
    public void test1() {
        AZi aZi = new AZi();
        aZi.test4();
        int d = aZi.d;


        BZi bZi = new BZi();
        int d1 = bZi.d;
        //关于protected的两个细节：
        //若子类和父类在同一个包中，子类可以访问父类的protected成员，也可访问父类对象的protected的成员
        //若子类和父类不在同一包中，子类可以访问父类的protected成员，不能访问父类对象的protected的成员
//        bZi.c;
        bZi.test4();
    }

}
