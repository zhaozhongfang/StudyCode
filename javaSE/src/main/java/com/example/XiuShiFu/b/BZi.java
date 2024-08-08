package com.example.XiuShiFu.b;

import com.example.XiuShiFu.a.Fu;

public class BZi extends Fu {

    public void testt() {
        //若子类和父类不在同一包中，子类可以访问父类的protected成员，不能访问父类对象的protected的成员
        int c = this.c;
        int d = this.d;
        this.test3();
        this.test4();


        Fu fu = new Fu();
        //关于protected的两个细节：
        //若子类和父类在同一个包中，子类可以访问父类的protected成员，也可访问父类对象的protected的成员
        //若子类和父类不在同一包中，子类可以访问父类的protected成员，不能访问父类对象的protected的成员
//        fu.c;
        int d1 = fu.d;
//        fu.test3();
        fu.test4();

    }

}
