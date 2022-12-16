package com.sumanth.interview;

interface Addable {
    int add10(int a);
}

public class LambdaExpressionExample {

    public static void main(String[] args) {
        Addable d = new Addable() {
            public int add10(int a) {
                return (a + 10);
            }
        };
    }

    private static int add(int a){
        return a+10;
    }
}
