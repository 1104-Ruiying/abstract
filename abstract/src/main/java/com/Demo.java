package com;


import java.util.Enumeration;

public class Demo {

  public static void main(String[] args) {
    Cock cock = new Cock();
    Hen hen = new Hen();
    ChildChicken childChicken = new ChildChicken();

  cock.getCount(100);
  hen.getCount(100);
  childChicken.getCount(100);

  }
}