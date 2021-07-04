package com.company;

class NewString {

    private Integer a;

    public NewString(int a) {
        this.a = a;

    }

    public Integer getA(){

        return a;

    }

    public class ToString {

        public static void main(String args[]) {
            NewString damnString = new NewString(20);
            System.out.println("Object toString: "+ damnString);
        }
    }
}
