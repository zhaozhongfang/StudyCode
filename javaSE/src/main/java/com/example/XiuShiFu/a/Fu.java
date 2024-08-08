package com.example.XiuShiFu.a;

public class Fu {

    private int a = 1;

    int b = 2;

    protected int c = 3;

    public int d = 4;

    private void test1() {
        System.out.println("private");
    }

    void test2() {
        System.out.println("default");
    }

    protected void test3() {
        System.out.println("protected");
    }

    public void test4() {
        System.out.println("public");
    }
}
